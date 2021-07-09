package org.example;

import Controller.DeviceController;
import enums.Country;
import enums.Purpose;
import manager.DeviceManager;
import models.Camera;
import models.Device;
import models.Flash;
import models.Lenz;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootApplication
@ComponentScan(basePackageClasses = DeviceController.class)
public class App {
    public static void main(final String[] args) {
        List<Device> devices = List.of(
            new Flash("pes", 4, Country.BRAZIL, 3, 5, Purpose.NIGHT,
                        9, 6,6, "pink"),
            new Lenz("paska", 5, Country.FRANCE, 4, 3,Purpose.ON_OPEN_AIR,
                5, 8,3, "glass"),
            new Camera("hotdog", 5,Country.CHINA, 6, 8, Purpose.STUDIO,
                6, 10,1, "euro")
        );


        DeviceManager deviceManager = new DeviceManager(devices);
        deviceManager.printSortedDevices(deviceManager.searchByPurpose(Purpose.STUDIO));
        System.out.println("-------------------\n");
        deviceManager.printSortedDevices(deviceManager.sortByHeight(true));
    }
}