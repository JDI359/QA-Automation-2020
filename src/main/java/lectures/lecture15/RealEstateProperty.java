package lectures.lecture15;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
@AllArgsConstructor
public class RealEstateProperty implements RealEstateActions{

    String location;
    double price;
    Town town;
    int yearOfConstruction;
    int totalSize;
    int[] floor;
    Owner owner;

    public int getNumberOfFloors(){
        int numberOfFloors = floor.length;
        log.info("The number of floors are: {}", numberOfFloors);
        return numberOfFloors;
    }

    public void printAllFloorsofProperty(){
        int floorNumber;
        for (int j : floor) {
            floorNumber = j;
            log.info("The floor for property is: {}", floorNumber);
        }
        log.info("All floors for the property are: ", Arrays.toString(floor));
    }

    @Override
    public void sell(double price) {
        log.info("Selling the property");
    }

    @Override
    public void buy(double price) {
        log.info("Buying the property");
    }

    @Override
    public void giveRent(double price) {
        log.info("Renting the property");
    }

    @Override
    public void takeRent(double price) {
        log.info("Taking rent for the property");
    }
}
