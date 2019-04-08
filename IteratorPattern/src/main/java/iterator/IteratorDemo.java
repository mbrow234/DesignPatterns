package iterator;

import java.util.Iterator;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 1/18/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public class IteratorDemo {

    public static void main(String[] args) {
        BikeRepository repo = new BikeRepository();

        repo.addBike("Cervelo");
        repo.addBike("Scott");
        repo.addBike("Fuji");

        Iterator<String> bikeIterator = repo.iterator();

        while(bikeIterator.hasNext()) {
            System.out.println(bikeIterator.next());
        }

        for (String bike: repo) {
            System.out.println(bike);
        }
    }
}
