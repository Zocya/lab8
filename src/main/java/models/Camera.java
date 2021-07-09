package models;

import enums.Country;
import enums.Purpose;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Camera extends Device{
    private int quality;
    private String brand;
    public Camera(String name, int price, Country country, int weight, int length, Purpose purpose, int height,int id,
                 int quality, String brand) {
        super(name, price, country, weight, length, purpose, height,id);
        this.quality = quality;
        this.brand = brand;
    }
}
