package com.company.transports;

/**
 * @description:
 * @author: ASUS
 * @date: Created in 2020/5/16 21:42
 * @version: ${VERSION}
 * @modified By:
 */
public class Vehicle extends LandTransport {
    public Vehicle(String id) {
        super(id);
    }

    public void driveMethod(){
        System.out.println("drive vehicle");
    }

}