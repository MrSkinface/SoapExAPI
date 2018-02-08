package org.exite;

/**
 * Created by levitsky on 08.02.18.
 */
public class SoapExAPIException extends Exception {

    private static final long serialVersionUID = 1L;

    public SoapExAPIException(String message) {
        super(message);
    }

    public SoapExAPIException(Throwable cause) {
        super(cause);
    }

    public SoapExAPIException(String message, Throwable cause) {
        super(message, cause);
    }
}
