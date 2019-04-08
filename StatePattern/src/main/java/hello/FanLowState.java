package hello;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 2/1/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public class FanLowState extends State {
    private Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to med.");
        fan.setState(fan.getFanMedState());
    }

    public String toString() {
        return "Fan is on low.";
    }
}
