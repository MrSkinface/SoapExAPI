
package org.exite.edi.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.exite.edi.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDocResponse_QNAME = new QName("http://soap.edi.exite.org/", "getDocResponse");
    private final static QName _ArchiveDocResponse_QNAME = new QName("http://soap.edi.exite.org/", "archiveDocResponse");
    private final static QName _GetDoc_QNAME = new QName("http://soap.edi.exite.org/", "getDoc");
    private final static QName _GetList_QNAME = new QName("http://soap.edi.exite.org/", "getList");
    private final static QName _GetListResponse_QNAME = new QName("http://soap.edi.exite.org/", "getListResponse");
    private final static QName _SendDocResponse_QNAME = new QName("http://soap.edi.exite.org/", "sendDocResponse");
    private final static QName _ArchiveDoc_QNAME = new QName("http://soap.edi.exite.org/", "archiveDoc");
    private final static QName _SendDoc_QNAME = new QName("http://soap.edi.exite.org/", "sendDoc");
    private final static QName _SendDocContent_QNAME = new QName("", "content");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.exite.edi.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArchiveDoc }
     * 
     */
    public ArchiveDoc createArchiveDoc() {
        return new ArchiveDoc();
    }

    /**
     * Create an instance of {@link SendDoc }
     * 
     */
    public SendDoc createSendDoc() {
        return new SendDoc();
    }

    /**
     * Create an instance of {@link SendDocResponse }
     * 
     */
    public SendDocResponse createSendDocResponse() {
        return new SendDocResponse();
    }

    /**
     * Create an instance of {@link GetList }
     * 
     */
    public GetList createGetList() {
        return new GetList();
    }

    /**
     * Create an instance of {@link GetListResponse }
     * 
     */
    public GetListResponse createGetListResponse() {
        return new GetListResponse();
    }

    /**
     * Create an instance of {@link GetDoc }
     * 
     */
    public GetDoc createGetDoc() {
        return new GetDoc();
    }

    /**
     * Create an instance of {@link ArchiveDocResponse }
     * 
     */
    public ArchiveDocResponse createArchiveDocResponse() {
        return new ArchiveDocResponse();
    }

    /**
     * Create an instance of {@link GetDocResponse }
     * 
     */
    public GetDocResponse createGetDocResponse() {
        return new GetDocResponse();
    }

    /**
     * Create an instance of {@link EdiFile }
     * 
     */
    public EdiFile createEdiFile() {
        return new EdiFile();
    }

    /**
     * Create an instance of {@link EdiResponse }
     * 
     */
    public EdiResponse createEdiResponse() {
        return new EdiResponse();
    }

    /**
     * Create an instance of {@link EdiLogin }
     * 
     */
    public EdiLogin createEdiLogin() {
        return new EdiLogin();
    }

    /**
     * Create an instance of {@link EdiFileList }
     * 
     */
    public EdiFileList createEdiFileList() {
        return new EdiFileList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.edi.exite.org/", name = "getDocResponse")
    public JAXBElement<GetDocResponse> createGetDocResponse(GetDocResponse value) {
        return new JAXBElement<GetDocResponse>(_GetDocResponse_QNAME, GetDocResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchiveDocResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.edi.exite.org/", name = "archiveDocResponse")
    public JAXBElement<ArchiveDocResponse> createArchiveDocResponse(ArchiveDocResponse value) {
        return new JAXBElement<ArchiveDocResponse>(_ArchiveDocResponse_QNAME, ArchiveDocResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.edi.exite.org/", name = "getDoc")
    public JAXBElement<GetDoc> createGetDoc(GetDoc value) {
        return new JAXBElement<GetDoc>(_GetDoc_QNAME, GetDoc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.edi.exite.org/", name = "getList")
    public JAXBElement<GetList> createGetList(GetList value) {
        return new JAXBElement<GetList>(_GetList_QNAME, GetList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.edi.exite.org/", name = "getListResponse")
    public JAXBElement<GetListResponse> createGetListResponse(GetListResponse value) {
        return new JAXBElement<GetListResponse>(_GetListResponse_QNAME, GetListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendDocResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.edi.exite.org/", name = "sendDocResponse")
    public JAXBElement<SendDocResponse> createSendDocResponse(SendDocResponse value) {
        return new JAXBElement<SendDocResponse>(_SendDocResponse_QNAME, SendDocResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchiveDoc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.edi.exite.org/", name = "archiveDoc")
    public JAXBElement<ArchiveDoc> createArchiveDoc(ArchiveDoc value) {
        return new JAXBElement<ArchiveDoc>(_ArchiveDoc_QNAME, ArchiveDoc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendDoc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.edi.exite.org/", name = "sendDoc")
    public JAXBElement<SendDoc> createSendDoc(SendDoc value) {
        return new JAXBElement<SendDoc>(_SendDoc_QNAME, SendDoc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "content", scope = SendDoc.class)
    public JAXBElement<byte[]> createSendDocContent(byte[] value) {
        return new JAXBElement<byte[]>(_SendDocContent_QNAME, byte[].class, SendDoc.class, ((byte[]) value));
    }

}
