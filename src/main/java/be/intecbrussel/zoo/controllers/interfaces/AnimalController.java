package be.intecbrussel.zoo.controllers.interfaces;


import org.springframework.ui.Model;

public interface AnimalController {

    String seeAllAnimalsByCountry(Model model, String countryName);
    String addAnimal(String animalName, String countryName);
}
