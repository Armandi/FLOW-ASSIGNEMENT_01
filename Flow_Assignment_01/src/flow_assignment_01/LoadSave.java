package flow_assignment_01;

import java.util.ArrayList;

/**
 *
 * @author favl
 */
public class LoadSave {
    
    public static void main(String[] args) {
        
        //Person persA = new Person("Bob",12,8,5,5);
        
        String p1 = "Jack,14,4,2,6";
        String p2 = "Mary,10,9,5,1";
        
        ArrayList<String> personList = new ArrayList<String>(); //Making a new ArrayList - REMEMBER IMPORT
        //Adding people Strings..
        personList.add(p1);
        personList.add(p2);
        
        FileHandlerStat.savePersons(personList, "people2.txt");
        
        //LOAD:
        ArrayList<String> fromTheDeadList = new ArrayList<String>(); //Creating a new ArrayList containing the file information
        fromTheDeadList = FileHandlerStat.load("people2.txt"); //Assigning the file called "people.txt" to the new ArrayList
        
        if (fromTheDeadList == null) 
        {
            System.out.println("Something went wrong!... load returned null!");            
        }
        else //there IS something...
        {
            for (String peopleString : fromTheDeadList) {
                System.out.println(peopleString);
            }
        }
    }
    
}
