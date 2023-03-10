import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

import static java.lang.System.out;

public class App {
    public static void main(String[] args) throws Exception {
        out.println("ARRAY LIST DEMO");
        out.println("---------------");
        arrayListDemo();

        out.println("\nLINKED LIST DEMO");
        out.println("----------------");
        linkedListDemo();

        out.println("\nVECTOR CLASS DEMO");
        out.println("-----------------");
        vectorDemo();

        out.println("\nSTACK CLASS DEMO");
        out.println("----------------");
        stackDemo();

        out.println("\nHASHSET CLASS DEMO");
        out.println("------------------");
        hashSetDemo();

        out.println("\nLINKEDHASHSET CLASS DEMO");
        out.println("------------------------");
        linkedHashSetDemo();

    }

    public static void arrayListDemo(){
        ArrayList <Person> alPerson = new ArrayList<>();

        alPerson.add(new Person ("Judy Tan", 'F'));
        Person p = new Person("Maricar Reyes", 'F');
        p.setAge(20);

        alPerson.add(p);

        alPerson.add(1, new Person("Zoro Roronoa", 'M'));

        alPerson.forEach((x) ->{
            out.println(x);
        });

        p = alPerson.get(1);
        p.setAge(40);
        alPerson.set(0, p);

        alPerson.forEach((x) -> {
            out.println(x);
        });
    }

    public static void linkedListDemo(){
        // Create a Linked List object of Person objects
        LinkedList<Person> llPerson = new LinkedList<>();

        // add person object to the list
        llPerson.add(new Person ("Judy Tan", 'F'));
        Person p = new Person("Maricar Reyes", 'F');
        p.setAge(20);
        
        // add person object to the list
        llPerson.add(p) ;
        // insert a person object to the list at index 1
        llPerson.add(1, new Person("Zoro Roronoa", 'M'));

        llPerson.forEach((x) ->{
            out.println(x);
        });

        while (!llPerson.isEmpty()){
            out.println(llPerson.removeFirst());
        };
    }

    public static void vectorDemo(){
        // Create a Vector object of Person objects
        Vector<Person> vPerson = new Vector<>();

        // add person object to the list
        vPerson.add(new Person ("Judy Tan", 'F'));
        Person p = new Person("Maricar Reyes", 'F');
        p.setAge(20);
        
        // add person object to the list
        vPerson.addElement(p) ;
        // insert a person object to the list at index 1
        vPerson.add(0, new Person("Zoro Roronoa", 'M'));

        vPerson.set(2, new Person("Nami Chan", 'F'));
        vPerson.forEach((x) ->{
            out.println(x);
        });
    }

    public static void stackDemo(){
        // Create a Stack object of Person objects
        Stack<Person> sPerson = new Stack<>();
        
        // add person object to the stack
        sPerson.push(new Person ("Judy Tan", 'F'));
        Person p = new Person("Maricar Reyes", 'F');
        p.setAge(20);

        // add person object to the stack
        sPerson.push(p);
        
        //add person object to the stack
        sPerson.push(new Person("Zoro Roronoa", 'M'));

        while(!sPerson.isEmpty()){
            out.println(sPerson.pop());
        }
    }

    public static void hashSetDemo(){
        // Create a HashSet object of Person objects
        HashSet<String> hsNames = new HashSet<>();
        
        //Add String objects
        hsNames.add("Judy");
        hsNames.add("Maricar");
        hsNames.add("Zoro");
        hsNames.add("Nami");
        hsNames.add("Judy");
        hsNames.add(null);

        out.println(hsNames);  
    }

    public static void linkedHashSetDemo(){
        // Create a LinkedHashSet object of Person objects
        LinkedHashSet<String> lhsNames = new LinkedHashSet<>();
        
        //Add String objects
        lhsNames.add("Judy");
        lhsNames.add("Maricar");
        lhsNames.add("Zoro");
        lhsNames.add("Nami");
        lhsNames.add("Judy");
        lhsNames.add(null);

        out.println(lhsNames);  
    }
}
