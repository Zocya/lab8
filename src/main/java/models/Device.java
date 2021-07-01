package models;

import enums.Country;
import enums.Purpose;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
@NoArgsConstructor
@Data
public class Device {
    private String name;
    private int price;
    private Country country;
    private int weight;
    private int length;
    private Purpose purpose;
    private int height;

}
