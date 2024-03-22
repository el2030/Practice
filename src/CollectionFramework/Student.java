package CollectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Student {
    private static ArrayList<String> names = new ArrayList<String>();

    public void setNames(){
        System.out.println("Please input the student name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        names.add(name);
        System.out.println(name + " has been ADDED");
    };
    public void searchName(String name){
        ListIterator<String> iterator = names.listIterator();
        String result;
        while(iterator.hasNext()){
            if (iterator.next().equals(name)){
                System.out.println(name + " IS in the list");
                return;
            }
        }
        System.out.println(name + " NOT found");
    };

    public void searchName(int index){
        if (names.isEmpty()){
            System.out.println("List is empty");
            return;
        }
        System.out.println(names.get(index) + " IS in index " + index);
    };
    public void printNames(){
        ListIterator<String> iterator = names.listIterator();
        //String result;
        if (names.isEmpty()){
            System.out.println("List is empty");
            return;
        } else {
            System.out.println("Names in the list: ");
            while(iterator.hasNext()){
                System.out.println(iterator.next());
        }

        }
    };
    public void removeName(String stuName){
        ListIterator<String> iterator = names.listIterator();
        String result;
        while(iterator.hasNext()) {
            result = iterator.next();
            if (result.equals(stuName)) {
                iterator.remove();
                System.out.println(stuName + " Has been REMOVED");
                return;
            }
        }
        System.out.println(stuName + " is NOT in the list");
    };

}
