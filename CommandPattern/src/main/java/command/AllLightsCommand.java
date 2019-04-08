package command;

import java.util.List;

/**
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 1/11/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public class AllLightsCommand implements Command {

    private List<Light> lights;

    public AllLightsCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        for(Light light : lights) {
            if (light.isOn()) {
                light.toggle();
            }
        }
    }
}
