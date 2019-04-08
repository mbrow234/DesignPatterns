package hello;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 2/1/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public class FanHighState extends State {
    private Fan fan;

    public FanHighState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to off.");
        fan.setState(fan.getFanOffState());
    }

    public String toString() {
        return "Fan is on high.";
    }
}
