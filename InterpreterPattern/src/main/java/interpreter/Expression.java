package interpreter;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 1/16/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public interface Expression {
    public boolean interpret(String context);
}
