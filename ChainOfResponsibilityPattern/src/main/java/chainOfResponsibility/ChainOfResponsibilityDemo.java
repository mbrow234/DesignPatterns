package chainOfResponsibility;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 1/9/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {
        Director michael = new Director();
        VP crystal = new VP();
        CEO jeff = new CEO();

        michael.setSuccessor(crystal);
        crystal.setSuccessor(jeff);

        Request request = new Request(RequestType.CONFERENCE, 500);
        michael.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        michael.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        michael.handleRequest(request);
    }
}
