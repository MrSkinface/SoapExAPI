package org.exite;

import org.apache.commons.codec.digest.DigestUtils;
import org.exite.edi.soap.*;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;
import java.util.List;

/**
 * Created by levitsky on 08.02.18.
 */
public class SoapExAPI implements ISoapExAPI {

    private Service service;
    private final URL url;
    private final QName qname;

    public SoapExAPI(String login, String pass) throws MalformedURLException
    {
        url = new URL("http://195.191.226.106:8080/soap/?wsdl");
        qname = new QName("http://soap.edi.exite.org/", "EdiServerImplService");
        service = Service.create(url, qname);
        srv = service.getPort(EdiServer.class);
        this.user=new EdiLogin();
        user.setLogin(login);
        user.setPass(DigestUtils.md5Hex(pass));
    }

    private EdiServer srv;
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
    public boolean uploadDoc(String fileName, byte[] content, String remoteFolder) throws SoapExAPIException {
        EdiResponse resp=srv.uploadDoc(user, fileName, content, remoteFolder);
        if(resp.getErrorCode()!=0)
            throw new SoapExAPIException(resp.getErrorMessage());
        return resp.getErrorCode()==0;
    }

    @Override
    public boolean uploadDocBase64(String fileName, String base64content, String remoteFolder) throws SoapExAPIException {
        return uploadDoc(fileName, Base64.getDecoder().decode(base64content), remoteFolder);
    }
}
