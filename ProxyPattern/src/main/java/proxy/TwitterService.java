package proxy;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 1/4/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public interface TwitterService {

    public String getTimeline(String screenName);
    public void postToTimeline(String screenName, String message);
}
