/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flow_assignment_01;

import java.util.ArrayList;

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
        ArrayList<String> loadArray = FileHandlerStat.load("TableFile");
        for (String string : loadArray) {
            Person person = new Person(string);
            persons.add(person);
        }
    }

    public void addPerson(Person p) {
        persons.add(p);

    }

    public void save() {
        ArrayList<String> saveArray = new ArrayList();
        for (Person person : persons) {
            saveArray.add(person.toString());
        }
        FileHandlerStat.savePersons(saveArray, "TableFile");
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

}
