package factoryMethod;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 11/30/17.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType) {
        switch(siteType) {
            case BLOG : {
                return new Blog();
            }
            case SHOP : {
                return new Shop();
            }
            default : {
                return null;
            }
        }
    }
}
