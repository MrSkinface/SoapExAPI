package org.exite;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/**
 * Created by levitsky on 15.02.18.
 */
public class FakeHostnameVerifier implements HostnameVerifier {

    /**
     * Always return true, indicating that the host name is
     * an acceptable match with the server's authentication scheme.
     *
     * @param hostname        the host name.
     * @param session         the SSL session used on the connection to
     * host.
     * @return                the true boolean value
     * indicating the host name is trusted.
     */
    public boolean verify(String hostname,
                          SSLSession session) {
        return (true);
    } // verify

}
