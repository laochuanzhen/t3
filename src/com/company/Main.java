package com.company;

import com.company.human.Person;
import com.company.transports.Airship;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Person person1 = new Person("111111", "jam");
        Airship airship1 = new Airship("222222", "airship");
        person1.driveMethod(airship1);
    }
}
