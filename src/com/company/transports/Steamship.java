package com.company.transports;

/**
 * @description:
 * @author: ASUS
 * @date: Created in 2020/5/16 21:41
 * @version: ${VERSION}
 * @modified By:
 */
public class Steamship {
    private String id;
    private String t_name;
    private String price;

    public void launchTransport() {
        System.out.println("launch steamship...");
    }

    public void driveMethod() {
        System.out.println("drive steamship");
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Steamship() {
    }

    public Steamship(String id, String t_name) {
        this.id = id;
        this.t_name = t_name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getT_name() {
        return this.t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }
}

