package models;

import enums.Country;
import enums.Purpose;
import lombok.*;

@AllArgsConstructor
@ToString
@NoArgsConstructor
@Data
@Getter
@Setter

public class Device {
    private String name;
    private int price;
    private Country country;
    private int weight;
    private int length;
    private Purpose purpose;
    private int height;
    private int id;


}
