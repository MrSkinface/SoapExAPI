
package org.exite.edi.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EdiServerImplService", targetNamespace = "http://soap.edi.exite.org/", wsdlLocation = "http://195.191.226.106:8080/soap/?wsdl")
public class EdiServerImplService
    extends Service
{

    private final static URL EDISERVERIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException EDISERVERIMPLSERVICE_EXCEPTION;
    private final static QName EDISERVERIMPLSERVICE_QNAME = new QName("http://soap.edi.exite.org/", "EdiServerImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://195.191.226.106:8080/soap/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EDISERVERIMPLSERVICE_WSDL_LOCATION = url;
        EDISERVERIMPLSERVICE_EXCEPTION = e;
    }

    public EdiServerImplService() {
        super(__getWsdlLocation(), EDISERVERIMPLSERVICE_QNAME);
    }

    public EdiServerImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EDISERVERIMPLSERVICE_QNAME, features);
    }

    public EdiServerImplService(URL wsdlLocation) {
        super(wsdlLocation, EDISERVERIMPLSERVICE_QNAME);
    }

    public EdiServerImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EDISERVERIMPLSERVICE_QNAME, features);
    }

    public EdiServerImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EdiServerImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EdiServer
     */
    @WebEndpoint(name = "EdiServerImplPort")
    public EdiServer getEdiServerImplPort() {
        return super.getPort(new QName("http://soap.edi.exite.org/", "EdiServerImplPort"), EdiServer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EdiServer
     */
    @WebEndpoint(name = "EdiServerImplPort")
    public EdiServer getEdiServerImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap.edi.exite.org/", "EdiServerImplPort"), EdiServer.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EDISERVERIMPLSERVICE_EXCEPTION!= null) {
            throw EDISERVERIMPLSERVICE_EXCEPTION;
        }
        return EDISERVERIMPLSERVICE_WSDL_LOCATION;
    }

}
