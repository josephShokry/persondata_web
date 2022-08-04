package personProjectSpringboot.services;

import org.springframework.web.bind.annotation.*;
import personProjectSpringboot.Person;

import java.util.List;

import static personProjectSpringboot.services.personServices.*;
@RestController
public class personControllers {
    @GetMapping("/addpersons")
    public static void addingpersons(){
        personServices.addSomePersons();
    }
    @GetMapping("/viewall")
    public static List<Person> viewAll(){
        return savedPersons;
    }

    @GetMapping("/getdata/{firstname}")
    public static Person getByfirstName(@PathVariable String firstname){
        return getPerson(firstname);
    }

    @DeleteMapping("/delet/{firstname}")
    public static Person delet(@PathVariable String firstname){
        return deletPerson(firstname);
    }

    @PostMapping("addperson")
    public static String addperson(@RequestBody Person person){
        addNewPerson(person);
        return "the person was added issusless";
    }
    /*@DeleteMapping("delet/{firstName}")
    public static Person deletperson(@PathVariable String firstName){
        return deletPerson(firstName);
    }*/

}
