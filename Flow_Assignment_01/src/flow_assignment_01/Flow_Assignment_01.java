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
public class Flow_Assignment_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person persA = new Person("Anton", 12, 12, 4, 2);
        System.out.println("Person A printet: " + persA.toString());
        String p1 = "Bob,12,4,5,6";
        String p2 = "Linda,4,12,5,6";
        String p3 = "Zebra,55,212,25,26";
        ArrayList<String> personList = new ArrayList<String>(); //Making a new Arraylist of string object
//Adding people strings:
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(persA.toString());
        FileHandlerStat.savePersons(personList, "people.txt");
/////LOAD: ////////////////
        ArrayList<Person> listOfPeople = new ArrayList<Person>();
        ArrayList<String> fromTheDeadList = new ArrayList<String>();
        fromTheDeadList = FileHandlerStat.load("people.txt");
        if (fromTheDeadList == null) {
            System.out.println("Something went wrong!... load returned null");
        } else { //there is something in there....
            for (String peopleString : fromTheDeadList) {
//Go from a string to a person object: 
//peopleString IS a string of 1 person - > Person object
                Person tempPerson = new Person(peopleString);
                listOfPeople.add(tempPerson);
            }
        }
/////////////See my arraylist of Person objects:
        System.out.println("-------- NOW PRINTING MY PERSON OBEJCTS:");
        for (Person onePerson : listOfPeople) {
            System.out.println("Person: " + onePerson.toString());
        }
    }
}

DefaultTableModel model;
//place around public class...
model = (DefaultTableModel)viewPersonsTable.getModel();


//actionperformed add
model.insertRow(model.getRowCount(), new Object[]{nameTF.getText(), administratorTF.getText(), analystTF.getText(), creativeTF.getText(), finisherTF.getText(), commentsTF.getText()});


//actionperformed edit


//put your table to event, mouse clicked.
nameTF.setText(String.valueOf(model.getValueAt(viewPersonsTable.getSelectedRow(), 0)));
administratorTF.setText(String.valueOf(model.getValueAt(viewPersonsTable.getSelectedRow(), 1)));
analystTF.setText(String.valueOf(model.getValueAt(viewPersonsTable.getSelectedRow(), 2)));
creativeTF.setText(String.valueOf(model.getValueAt(viewPersonsTable.getSelectedRow(), 3)));
finisherTF.setText(String.valueOf(model.getValueAt(viewPersonsTable.getSelectedRow(), 4)));
commentsTF.setText(String.valueOf(model.getValueAt(viewPersonsTable.getSelectedRow(), 5)));