package drools;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private String name;
    private String cardType;
    private double discount;
    private double price;
}
