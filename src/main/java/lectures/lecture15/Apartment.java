package lectures.lecture15;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Slf4j
public class Apartment {

    String location;
    double price;
    Town town;
    int yearOfConstruction;
    int totalSize;
    int floor;
    Owner owner;

    public Apartment(String location, double price, Town town){
        this.location = location;
        this.price = price;
        this.town = town;
    }

    public double setPricePerLocation(){
        switch (town){
            case SOFIA:
                price = 200000;
                log.info("Apartment price for Sofia is: " + price);
                break;
            case BURGAS:
                price = 150000;
                log.info("Apartment price for Burgas is: " + price);
                break;
            default:
                price = 50000;
                log.info("Apartment price for all other cities is: " + price);
                break;
        }
        return price;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "location=" + location + '\'' +
                ", price=" + price +
                ", town= " + town +
                ", year of construction=" + yearOfConstruction +
                ", total size=" + totalSize +
                "floor=" + floor +
                "owner name= " + owner.name +
                '}';
    }
}
