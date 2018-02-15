package org.exite;

import com.sun.xml.internal.ws.api.message.Headers;
import com.sun.xml.internal.ws.developer.JAXWSProperties;
import com.sun.xml.internal.ws.developer.WSBindingProvider;
import org.apache.commons.codec.digest.DigestUtils;
import org.exite.edi.soap.*;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.http.HTTPBinding;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

/**
 * Created by levitsky on 08.02.18.
 */
public class SoapExAPI implements ISoapExAPI {

    private Service service;
    private final URL url;
    private final QName qname;

    public SoapExAPI(String login, String pass) throws MalformedURLException
    {
        url = new URL("https://dev.ua.int:8083/soap/exite.wsdl");
        qname = new QName("http://soap.edi.exite.org", "ExiteWsService");
        service = Service.create(url, qname);
        srv = service.getPort(ExiteWs.class);

        /*Map<String, List<String>> headers = new HashMap<>();
        headers.put("Username", Collections.singletonList("mkyong"));
        headers.put("Password", Collections.singletonList("password"));
        headers.put("Content-Type", Collections.singletonList("shit"));
        headers.put("Accept", Collections.singletonList("bull shit"));
        headers.put("User-Agent", Collections.singletonList("The Guy"));

        ((WSBindingProvider)srv).setOutboundHeaders(Headers.create(new QName("User-Agent"), "The Guy"));
        ((BindingProvider)srv).getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, headers);*/

        this.user=new EdiLogin();
        user.setLogin(login);
        user.setPass(DigestUtils.md5Hex(pass));
    }

    private ExiteWs srv;
    private EdiLogin user;

    @Override
    public List<String> getList() throws SoapExAPIException {
        EdiFileList list=srv.getList(user);
        if(list.getErrorCode()!=0)
            throw new SoapExAPIException(list.getErrorMessage());
        return list.getList();
    }

    @Override
    public byte[] getDoc(String fileName) throws SoapExAPIException {
        EdiFile file=srv.getDoc(user, fileName);
        if(file.getErrorCode()!=0)
            throw new SoapExAPIException(file.getErrorMessage());
        return file.getContent();
    }

    @Override
    public String getDocBase64(String fileName) throws SoapExAPIException {
        return Base64.getEncoder().encodeToString(getDoc(fileName));
    }

    @Override
    public boolean archiveDoc(String fileName) throws SoapExAPIException {
        EdiResponse resp=srv.archiveDoc(user, fileName);
        if(resp.getErrorCode()!=0)
            throw new SoapExAPIException(resp.getErrorMessage());
        return resp.getErrorCode()==0;
    }

    @Override
    public boolean sendDoc(String fileName, byte[] content) throws SoapExAPIException {
        EdiResponse resp=srv.sendDoc(user, fileName, content);
        if(resp.getErrorCode()!=0)
            throw new SoapExAPIException(resp.getErrorMessage());
        return resp.getErrorCode()==0;
    }

    @Override
    public boolean sendDocBase64(String fileName, String base64content) throws SoapExAPIException {
        return sendDoc(fileName, Base64.getDecoder().decode(base64content));
    }

    @Override
    public byte[] getZippedDocs(List<String> names) throws SoapExAPIException {
        EdiFile file=srv.getDocuments(user, names);
        if(file.getErrorCode()!=0)
            throw new SoapExAPIException(file.getErrorMessage());
        return file.getContent();
    }

    @Override
    public boolean archiveDocuments(List<String> names) throws SoapExAPIException {
        EdiResponse resp=srv.archiveDocuments(user, names);
        if(resp.getErrorCode()!=0)
            throw new SoapExAPIException(resp.getErrorMessage());
        return resp.getErrorCode()==0;
    }
}
