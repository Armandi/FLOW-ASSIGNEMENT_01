/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flow_assignment_01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Armandi
 */
public class ControlEngine {

    ArrayList<Person> persons = new ArrayList();

    public ControlEngine() {
    }

    public void load() {
        persons.clear();
        ArrayList<String> loadArray = FileHandlerStat.load("TableFile.txt");
        for (String string : loadArray) {
            Person person = new Person(string);
            persons.add(person);
        }
    }

    public void edit() {
        ArrayList<String> editArray = new ArrayList();
        for (Person person : persons) {
            editArray.add(person.toString());
        }
        FileHandlerStat.savePersons(editArray, "TableFile.txt");
    }
       
    public void addPerson(Person p) {
        persons.add(p);
    }
    
    public void save() {
        try {
            ArrayList<String> saveArray = new ArrayList();
            Path toDelete = Paths.get("TableFile.txt");
            Files.delete(toDelete);
            for (Person person : persons) {
                saveArray.add(person.toString());
            }
            FileHandlerStat.savePersons(saveArray, "TableFile.txt");
        } catch (IOException ex) {
            Logger.getLogger(ControlEngine.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    public ArrayList<Person> getPersons() {
        return persons;
    }

}
