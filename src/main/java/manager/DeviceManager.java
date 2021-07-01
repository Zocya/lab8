package manager;

import enums.Purpose;
import lombok.AllArgsConstructor;
import models.Device;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class DeviceManager {
    private List<Device> devices;

    public List<Device> searchByPurpose(Purpose purpose) {
        return devices.stream().filter(device -> device.getPurpose() == purpose).collect(Collectors.toList());
    }

    public List<Device> sortByHeight(boolean sortingByDescending) {
        List<Device> devicesSorted = new ArrayList<>(devices);
        if (sortingByDescending) {
            devicesSorted.sort(Comparator.comparing(Device::getHeight));
        } else {
            devicesSorted.sort(Comparator.comparing(Device::getHeight).reversed());
        }
        return devicesSorted;
    }

    public void printSortedDevices(List<Device> devices) {
        devices.forEach(System.out::println);
    }
}
