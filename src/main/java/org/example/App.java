package org.example;

import enums.Country;
import enums.Purpose;
import manager.DeviceManager;
import models.Camera;
import models.Device;
import models.Flash;
import models.Lenz;

import java.util.List;


public class App {
    public static void main(final String[] args) {
        List<Device> devices = List.of(
            new Flash("pes", 4, Country.BRAZIL, 3, 5, Purpose.NIGHT,
                        9, 6, "pink"),
            new Lenz("paska", 5, Country.FRANCE, 4, 3,Purpose.ON_OPEN_AIR,
                5, 8, "glass"),
            new Camera("hotdog", 5,Country.CHINA, 6, 8, Purpose.STUDIO,
                6, 10, "euro")
        );


        DeviceManager deviceManager = new DeviceManager(devices);
        deviceManager.printSortedDevices(deviceManager.searchByPurpose(Purpose.STUDIO));
        System.out.println("-------------------\n");
        deviceManager.printSortedDevices(deviceManager.sortByHeight(true));
    }
}