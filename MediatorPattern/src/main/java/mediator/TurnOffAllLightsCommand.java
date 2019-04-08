package mediator;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 1/23/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public class TurnOffAllLightsCommand implements Command {

    private Mediator med;

    public TurnOffAllLightsCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOffAllLights();
    }
}
