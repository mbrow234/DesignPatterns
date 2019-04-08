package hello;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 2/1/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public class Fan {

    private State fanOffState;
    private State fanLowState;
    private State fanMedState;
    private State fanHighState;

    private State state;

    public Fan() {
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMedState = new FanMedState(this);
        fanHighState = new FanHighState(this);

        state = fanOffState;
    }

    public String toString() {
        return state.toString();
    }

    public void pullChain() {
        state.handleRequest();
    }

    public State getFanLowState() {
        return fanLowState;
    }

    public State getFanMedState() {
        return fanMedState;
    }

    public State getFanHighState() {
        return fanHighState;
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public void setState(State state) {
        this.state = state;
    }
}
