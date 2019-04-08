package hello;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 2/1/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public abstract class State {

    public void handleRequest() {
        System.out.println("Shouldn't be able to get here.");
    }
}
