package prototype;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 11/28/17.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public class Book extends Item{

    private int numberOfPages;

    private int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
