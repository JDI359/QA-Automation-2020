package lectures.lecture12;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {
//        StaticNumbers staticNumbers = new StaticNumbers();
//       log.info("Number with static call {}", StaticNumbers.nextValue());
//       log.info("Number with object call {}", staticNumbers.nextValue());
//        StaticNumbers obj1 = new StaticNumbers();
//        log.info("First object ");
//        StaticNumbers obj2 = new StaticNumbers();
//        log.info("Second object ");
//        obj2.printArray();

//        MathOperations mathOperations = new MathOperations();
//        mathOperations.calculateTriangleFace(2,2,60);

        RandomGeneration randomGeneration = new RandomGeneration();
//        randomGeneration.toto5From35Generation();
//        randomGeneration.randomNumberBetweenRange(10,50);
//        randomGeneration.generateRandomId(4);
        randomGeneration.generateRandomPassword();

    }
}
