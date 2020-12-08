package lectures.lecture15;

import lombok.extern.slf4j.Slf4j;
import lombok.ToString;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Apartment apartment1 = new Apartment("Iztok", 150000, Town.SOFIA);
        Owner owner1 = new Owner("Kiril", 20, "Male");
        Apartment apartment2 = new Apartment("Mladost 1", 150000, Town.PLOVDIV) ;
        House house1 = new House("Sea Garden", 25000, Town.BURGAS, 2020, 200, new int[]{1,2,3}, owner1, true, 200);
        House house2 = new House("Sea Garden", 25000, Town.BURGAS, 2020, 200, new int[]{1,2,3,4}, owner1, true, 200);


//        log.info(apartment1.toString());
//        apartment1.setPricePerLocation();
//        log.info(apartment2.toString());
//        house2.getNumberOfFloors()
        house1.sell(1000000);
//        house1.printAllFloorsofProperty();
    }
}
