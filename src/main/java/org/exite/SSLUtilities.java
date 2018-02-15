package org.exite;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/**
 * Created by levitsky on 15.02.18.
 */
public final class SSLUtilities {

    /**
     * Hostname verifier for the Sun's deprecated API.
     *
     * @deprecated see {@link #_hostnameVerifier}.
     */
    private static HostnameVerifier __hostnameVerifier;
    /**
     * Thrust managers for the Sun's deprecated API.
     *
     * @deprecated see {@link #_trustManagers}.
     */
    private static TrustManager[] __trustManagers;
    /**
     * Hostname verifier.
     */
    private static HostnameVerifier _hostnameVerifier;
    /**
     * Thrust managers.
     */
    private static TrustManager[] _trustManagers;

    /**
     * Set the default Hostname Verifier to an instance of a fake class that
     * trust all hostnames. This method uses the old deprecated API from the
     * com.sun.ssl package.
     *
     * @deprecated see {@link #_trustAllHostnames()}.
     */
    private static void __trustAllHostnames() {
        // Create a trust manager that does not validate certificate chains
        if (__hostnameVerifier == null) {
            __hostnameVerifier = new _FakeHostnameVerifier();
        } // if
        // Install the all-trusting host name verifier
        HttpsURLConnection.setDefaultHostnameVerifier(__hostnameVerifier);
    } // __trustAllHttpsCertificates

    /**
     * Set the default X509 Trust Manager to an instance of a fake class that
     * trust all certificates, even the self-signed ones. This method uses the
     * old deprecated API from the com.sun.ssl package.
     *
     * @deprecated see {@link #_trustAllHttpsCertificates()}.
     */
    private static void __trustAllHttpsCertificates() {
        SSLContext context;

        // Create a trust manager that does not validate certificate chains
        if (__trustManagers == null) {
            __trustManagers = new TrustManager[]{new _FakeX509TrustManager()};
        } // if
        // Install the all-trusting trust manager
        try {
            context = SSLContext.getInstance("SSL");
            context.init(null, __trustManagers, new SecureRandom());
        } catch (GeneralSecurityException gse) {
            throw new IllegalStateException(gse.getMessage());
        } // catch
        HttpsURLConnection.setDefaultSSLSocketFactory(context.getSocketFactory());
    } // __trustAllHttpsCertificates

    /**
     * Return true if the protocol handler property java.
     * protocol.handler.pkgs is set to the Sun's com.sun.net.ssl.
     * internal.www.protocol deprecated one, false
     * otherwise.
     *
     * @return                true if the protocol handler
     * property is set to the Sun's deprecated one, false
     * otherwise.
     */
    private static boolean isDeprecatedSSLProtocol() {
        return ("com.sun.net.ssl.internal.www.protocol".equals(System.getProperty("java.protocol.handler.pkgs")));
    } // isDeprecatedSSLProtocol

    /**
     * Set the default Hostname Verifier to an instance of a fake class that
     * trust all hostnames.
     */
    private static void _trustAllHostnames() {
        // Create a trust manager that does not validate certificate chains
        if (_hostnameVerifier == null) {
            _hostnameVerifier = new FakeHostnameVerifier();
        } // if
        // Install the all-trusting host name verifier:
        HttpsURLConnection.setDefaultHostnameVerifier(_hostnameVerifier);
    } // _trustAllHttpsCertificates

    /**
     * Set the default X509 Trust Manager to an instance of a fake class that
     * trust all certificates, even the self-signed ones.
     */
    private static void _trustAllHttpsCertificates() {
        SSLContext context;

        // Create a trust manager that does not validate certificate chains
        if (_trustManagers == null) {
            _trustManagers = new TrustManager[]{new FakeX509TrustManager()};
        } // if
        // Install the all-trusting trust manager:
        try {
            context = SSLContext.getInstance("SSL");
            context.init(null, _trustManagers, new SecureRandom());
        } catch (GeneralSecurityException gse) {
            throw new IllegalStateException(gse.getMessage());
        } // catch
        HttpsURLConnection.setDefaultSSLSocketFactory(context.getSocketFactory());
    } // _trustAllHttpsCertificates

    /**
     * Set the default Hostname Verifier to an instance of a fake class that
     * trust all hostnames.
     */
    public static void trustAllHostnames() {
        // Is the deprecated protocol setted?
        if (isDeprecatedSSLProtocol()) {
            __trustAllHostnames();
        } else {
            _trustAllHostnames();
        } // else
    } // trustAllHostnames

    /**
     * Set the default X509 Trust Manager to an instance of a fake class that
     * trust all certificates, even the self-signed ones.
     */
    public static void trustAllHttpsCertificates() {
        // Is the deprecated protocol setted?
        if (isDeprecatedSSLProtocol()) {
            __trustAllHttpsCertificates();
        } else {
            _trustAllHttpsCertificates();
        } // else
    } // trustAllHttpsCertificates

}
