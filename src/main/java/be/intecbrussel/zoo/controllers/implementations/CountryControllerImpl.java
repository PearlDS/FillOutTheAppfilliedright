package be.intecbrussel.zoo.controllers.implementations;

import be.intecbrussel.zoo.controllers.interfaces.CountryController;
import be.intecbrussel.zoo.services.interfaces.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CountryControllerImpl implements CountryController {

    @Autowired
    private CountryService countryService;

    @Override
    @GetMapping("countries")
    public String showAllCountries(Model model) {

        model.addAttribute("countries", countryService.getAllCountries());

        return "countries";
    }
}
