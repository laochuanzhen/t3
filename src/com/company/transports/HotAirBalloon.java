package com.company.transports;

/**
 * @description:
 * @author: ASUS
 * @date: Created in 2020/5/16 21:38
 * @version: ${VERSION}
 * @modified By:
 */
public class HotAirBalloon extends AirTransport{
    public HotAirBalloon(String id) {
        super(id);
    }

    public void driveMethod() {
        System.out.println("drive hotairbaloon");
    }
}

