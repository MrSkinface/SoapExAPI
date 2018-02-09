
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

    private final static QName _SendDocContent_QNAME = new QName("", "content");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.exite.edi.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UploadDocResponse }
     * 
     */
    public UploadDocResponse createUploadDocResponse() {
        return new UploadDocResponse();
    }

    /**
     * Create an instance of {@link EdiResponse }
     * 
     */
    public EdiResponse createEdiResponse() {
        return new EdiResponse();
    }

    /**
     * Create an instance of {@link GetDocumentsResponse }
     * 
     */
    public GetDocumentsResponse createGetDocumentsResponse() {
        return new GetDocumentsResponse();
    }

    /**
     * Create an instance of {@link EdiFile }
     * 
     */
    public EdiFile createEdiFile() {
        return new EdiFile();
    }

    /**
     * Create an instance of {@link ArchiveDocumentsResponse }
     * 
     */
    public ArchiveDocumentsResponse createArchiveDocumentsResponse() {
        return new ArchiveDocumentsResponse();
    }

    /**
     * Create an instance of {@link GetDocuments }
     * 
     */
    public GetDocuments createGetDocuments() {
        return new GetDocuments();
    }

    /**
     * Create an instance of {@link EdiLogin }
     * 
     */
    public EdiLogin createEdiLogin() {
        return new EdiLogin();
    }

    /**
     * Create an instance of {@link GetDoc }
     * 
     */
    public GetDoc createGetDoc() {
        return new GetDoc();
    }

    /**
     * Create an instance of {@link UploadDoc }
     * 
     */
    public UploadDoc createUploadDoc() {
        return new UploadDoc();
    }

    /**
     * Create an instance of {@link GetDocResponse }
     * 
     */
    public GetDocResponse createGetDocResponse() {
        return new GetDocResponse();
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
     * Create an instance of {@link EdiFileList }
     * 
     */
    public EdiFileList createEdiFileList() {
        return new EdiFileList();
    }

    /**
     * Create an instance of {@link ArchiveDocuments }
     * 
     */
    public ArchiveDocuments createArchiveDocuments() {
        return new ArchiveDocuments();
    }

    /**
     * Create an instance of {@link ArchiveDocResponse }
     * 
     */
    public ArchiveDocResponse createArchiveDocResponse() {
        return new ArchiveDocResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "content", scope = SendDoc.class)
    public JAXBElement<byte[]> createSendDocContent(byte[] value) {
        return new JAXBElement<byte[]>(_SendDocContent_QNAME, byte[].class, SendDoc.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "content", scope = UploadDoc.class)
    public JAXBElement<byte[]> createUploadDocContent(byte[] value) {
        return new JAXBElement<byte[]>(_SendDocContent_QNAME, byte[].class, UploadDoc.class, ((byte[]) value));
    }

}
