package com.company.transports;

/**
 * @description:
 * @author: ASUS
 * @date: Created in 2020/5/16 21:39
 * @version: ${VERSION}
 * @modified By:
 */
public class Hovercraft extends SeaTransport{
    public Hovercraft(String id) {
        super(id);
    }

    public void driveMethod(){
        System.out.println("drive hovercraft");
    }


}