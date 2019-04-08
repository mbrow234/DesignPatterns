package hello;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 2/12/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public interface AtvPartVisitor {

    void visit(Wheel wheel);

    void visit(Fender fender);

    void visit(Oil oil);

    void visit(PartsOrder partsOrder);
}
