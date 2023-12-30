package AnimalExample.zoo.processor;

import AnimalExample.zoo.validator.AnimalValidator;
import AnimalExample.InvalidAnimalException;

public class AnimalProcessor {
    public static void processAnimal(String animalName) {
        try {
            AnimalValidator.validateAnimal(animalName);
            // Process the animal (not shown in this simplified example)
            System.out.println("Processing " + animalName);
        } catch (InvalidAnimalException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
