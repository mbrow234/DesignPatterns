package chainOfResponsibility;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 1/9/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public class CEO extends Handler {

    @Override
    public void handleRequest(Request request) {
        System.out.println("CEOs can approve anything they want.");
    }
}
