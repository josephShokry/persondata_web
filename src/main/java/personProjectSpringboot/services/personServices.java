package personProjectSpringboot.services;

import personProjectSpringboot.Person;

import java.util.ArrayList;
import java.util.List;

public class personServices {
    public static ArrayList<Person> savedPersons=new ArrayList<Person>();
    public static void addPersonToArrayList(Person person){
        savedPersons.add(person);
    }
    public static void addSomePersons(){
        addPersonToArrayList(new Person("joseph","shokry"));
        addPersonToArrayList(new Person("fady","shokry"));
        addPersonToArrayList(new Person("ali","ahmed"));
    }
    public static Person getPerson(String name){
        for(Person p:savedPersons){
            if(p.getFirstName().equals(name)){
                return p;
            }

        }
        return null;
    }
    public static Person deletPerson(String name){
        Person target = new Person();
        for(Person p:savedPersons){
            if(p.getFirstName().equals(name)){
                target=p;
                savedPersons.remove(p);
                break;
            }
        }
        return target;
    }


    public static ArrayList<String> getAllNames(){
        ArrayList<String> li=new ArrayList<>();
        for(Person p:savedPersons){
            li.add(p.getFirstName()+" "+p.getLastName());
        }
        return li;
    }
    public static void addNewPerson(Person person){
        savedPersons.add(person);
    }

}
