package personProjectSpringboot.Home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import personProjectSpringboot.services.personServices;

import java.util.ArrayList;
import java.util.List;

@Controller
public class homeController {
    @GetMapping()
    public static String display(Model model){
        model.addAttribute("all",personServices.savedPersons);
        return "index";
    }
    /*
    @GetMapping()
    public static String great(){
        //model.addAttribute("message","hi");
        return "welcome from the home controller";
    }*/
/*
    @GetMapping()
    @ModelAttribute("Persons")
    public static List<String> getnames(){
        return (List<String>) personServices.getAllNames();
    }
*/
}

