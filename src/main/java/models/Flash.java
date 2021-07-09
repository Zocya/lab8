package models;

import enums.Country;
import enums.Purpose;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Flash extends Device{
    private int power;
    private String colour;
    public Flash(String name, int price, Country country, int weight, int length, Purpose purpose, int height,int id,
    int power, String colour) {
        super(name, price, country, weight, length, purpose, height, id);
        this.power = power;
        this.colour = colour;
    }
}
