package models;

import enums.Country;
import enums.Purpose;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Camera extends Device{
    private int quality;
    private String brand;
    public Camera(String name, int price, Country country, int weight, int length, Purpose purpose, int height,
                 int quality, String brand) {
        super(name, price, country, weight, length, purpose, height);
        this.quality = quality;
        this.brand = brand;
    }
}
