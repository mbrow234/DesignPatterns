package proxy;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 1/4/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public class TwitterDemo {

    public static void main(String[] args) {
        TwitterService service = (TwitterService)SecurityProxy.newInstance(new TwitterServiceStub());

        System.out.println(service.getTimeline("michael"));

        service.postToTimeline("michael", "my message");
    }
}
