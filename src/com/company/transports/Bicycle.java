package com.company.transports;

/**
 * @description:
 * @author: ASUS
 * @date: Created in 2020/5/16 21:38
 * @version: ${VERSION}
 * @modified By:
 */
public class Bicycle extends LandTransport {
    public Bicycle(String id) {
        super(id);
    }

    public void driveMethod(){
        System.out.println("drive bicycle");
    }

}