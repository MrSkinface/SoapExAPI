package org.exite;

import java.util.List;

/**
 * Created by levitsky on 08.02.18.
 */
public interface ISoapExAPI {

    /**
     *
     * @return
     * 			List of filenames
     * @throws SoapExAPIException
     * 			if something goes wrong
     */
    List<String> getList() throws SoapExAPIException;
    /**
     *
     * @param fileName
     * 			name of available file on server
     * @return
     * 			byte's array of doc's content
     * @throws SoapExAPIException
     * 			if something goes wrong [bad 'fileName']
     */
    byte[] getDoc(String fileName) throws SoapExAPIException;
    /**
     *
     * @param names
     * 			name of available files on server
     * @return
     * 			byte's array of zip content
     * @throws SoapExAPIException
     * 			if something goes wrong [bad 'fileName']
     */
    byte[] getZippedDocs(List<String> names) throws SoapExAPIException;
    /**
     *
     * @param fileName
     * 			name of available file on server
     * @return
     * 			base64 string of doc's content
     * @throws SoapExAPIException
     * 			if something goes wrong [bad 'fileName']
     */
    String getDocBase64(String fileName) throws SoapExAPIException;
    /**
     *
     * @param fileName
     * 			base64 string of doc's content
     * @return
     * 			error code (0 == O.K., otherwise SoapExAPIException will be thrown)
     * @throws SoapExAPIException
     * 			if something goes wrong [bad 'fileName']
     */
    boolean archiveDoc(String fileName) throws SoapExAPIException;

    /**
     *
     * @param names
     * 			names of available files on server
     * @return
     * 			error code (0 == O.K., otherwise SoapExAPIException will be thrown)
     * @throws SoapExAPIException
     * 			if something goes wrong [bad 'fileName']
     */
    boolean archiveDocuments(List<String> names) throws SoapExAPIException;
    /**
     *
     * @param fileName
     * 			name of a local file
     * @param content
     * 			byte's array of local doc's content
     * @return
     * 			error code (0 == O.K., otherwise SoapExAPIException will be thrown)
     * @throws SoapExAPIException
     * 			if something goes wrong [bad 'fileName', bad 'content']
     */
    boolean sendDoc(String fileName, byte[] content) throws SoapExAPIException;
    /**
     *
     * @param fileName
     * @param base64content
     * 			base64 string of doc's content
     * @return
     * @throws SoapExAPIException
     * 			if something goes wrong [bad 'fileName', bad 'base64content']
     */
    boolean sendDocBase64(String fileName, String base64content) throws SoapExAPIException;

}
