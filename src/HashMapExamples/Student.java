package HashMapExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Student {
    private static HashMap<String, String> empNames = new HashMap<String, String>();

    public void setNames(){
        System.out.println("Please input the rollno");
        Scanner sc = new Scanner(System.in);
        String rollno = sc.nextLine();
        System.out.println("Please input the name");
        String name = sc.nextLine();
        empNames.put(rollno, name);
        System.out.println(name + " has been ADDED to" + rollno);
    }

    public void printNames(){
        if (empNames.isEmpty()){
            System.out.println("The map is empty");
            return;
        }
        //Implement using lambda and forEach()
//        empNames.forEach((key, value) -> {
//            System.out.println(value);
//        });
        Set<String> keyset = empNames.keySet();
        Iterator<String> iterator = keyset.iterator();
        String key = "";
        while (iterator.hasNext()){
             key = iterator.next();
            System.out.println(empNames.get(key));
        }
    }
    public void getName(String key){
        if (empNames.isEmpty()){
            System.out.println("The map is empty");
            return;
        }
        System.out.println("The value for " + key + " is " + empNames.get(key));
    }
    public void printNamesKeySet(){
        if (empNames.isEmpty()){
            System.out.println("The map is empty");
            return;
        }
        Set<String> keyset = empNames.keySet();
        System.out.println("The values are: ");
        for (String key: keyset){
            System.out.println(empNames.get(key));
        }
    }
    public void printSize(){
        System.out.println(empNames.size());
    }
    public void remove(String key){
        if (empNames.isEmpty()){
            System.out.println("The map is empty");
            return;
        }
        if (empNames.containsKey(key)){
            empNames.remove(key);
            System.out.println(key + " has been REMOVED");
        } else {
            System.out.println(key + " NOT found");
        }
    }
}
