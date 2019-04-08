package flyweight;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 1/2/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */

//Instances of Item will be the Flyweights
public class Item {

    private final String name;

    public Item(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
