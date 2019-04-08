package command;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 1/11/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
//invoker
public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }
}
