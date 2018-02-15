package org.exite;

import javax.net.ssl.X509TrustManager;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * Created by levitsky on 15.02.18.
 */
public class _FakeX509TrustManager implements X509TrustManager {

    /**
     * Empty array of certificate authority certificates.
     */
    private static final X509Certificate[] _AcceptedIssuers =
            new X509Certificate[]{};

    /**
     * Always return true, trusting for client SSL
     * chain peer certificate chain.
     *
     * @param chain           the peer certificate chain.
     * @return                the true boolean value
     * indicating the chain is trusted.
     */
    public boolean isClientTrusted(X509Certificate[] chain) {
        return (true);
    } // checkClientTrusted

    /**
     * Always return true, trusting for server SSL
     * chain peer certificate chain.
     *
     * @param chain           the peer certificate chain.
     * @return                the true boolean value
     * indicating the chain is trusted.
     */
    public boolean isServerTrusted(X509Certificate[] chain) {
        return (true);
    } // checkServerTrusted

    /**
     * Return an empty array of certificate authority certificates which
     * are trusted for authenticating peers.
     *
     * @return                a empty array of issuer certificates.
     */
    public X509Certificate[] getAcceptedIssuers() {
        return (_AcceptedIssuers);
    } // getAcceptedIssuers

    public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
