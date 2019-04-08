package proxy;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 1/4/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public class TwitterServiceStub implements TwitterService {

    @Override
    public String getTimeline(String screenName) {
        return "My neato timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {
        //not going to allow this
        System.out.println(message);
    }
}
