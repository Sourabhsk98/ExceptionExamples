package AnimalExample.zoo.validator;

import AnimalExample.InvalidAnimalException;

public class AnimalValidator {
    public static void validateAnimal(String animalName) throws InvalidAnimalException {
        if (animalName == null || animalName.trim().isEmpty()) {
            throw new InvalidAnimalException("Invalid animal name: " + animalName);
        }

        // Additional validation logic can be added here

        System.out.println("Valid animal: " + animalName);
    }
}
