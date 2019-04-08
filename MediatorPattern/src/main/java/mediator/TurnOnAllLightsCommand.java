package mediator;



/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 1/23/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public class TurnOnAllLightsCommand implements Command {

    private Mediator med;

    public TurnOnAllLightsCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOnAllLights();
    }
}
