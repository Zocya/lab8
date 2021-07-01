package models;

import enums.Country;
import enums.Purpose;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Lenz extends Device{
    private int angle;
    private String material;
    public Lenz(String name, int price, Country country, int weight, int length, Purpose purpose, int height,
                 int angle, String material) {
        super(name, price, country, weight, length, purpose, height);
        this.angle = angle;
        this.material = material;
    }
}
