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
         
       String p1 = "Bob, 12,4,5,6";
       String p2 = "Linda, 11,2,8,4";
       
       ArrayList<String> personList = new ArrayList<String>();
       //Adding people strings:
       personList.add(p1);
       personList.add(p2);
       
       FileHandlerStat.savePersons(personList, "people.txt");
       
       // LOAD:
       ArrayList<String> otherPersonList = new ArrayList<String>();
       otherPersonList = FileHandlerStat.load("people.txt");
       if (otherPersonList == null){
               System.out.println("Somthing went wrong");
       }
       else{ // If somthing there 
           for (String peopleString : otherPersonList) {
               System.out.println(peopleString);
           }
       }
    }
    
}
