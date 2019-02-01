import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class PhoneBook {

    static HashMap<String, ArrayList<Integer>> tm = new HashMap<>();

    static ArrayList<Integer> al = new ArrayList<>();

    public static void add(String SecondName, Integer PhoneNumber){
    if (tm.containsKey(SecondName)) {

        al.add(PhoneNumber);
        System.out.println(al);
        tm.put(SecondName, al);
       /// al.clear();
    }
        else{

           al.add(PhoneNumber);
            tm.put(SecondName,al);

    }

    }


    public static void main(String[] args) {

        add("Denio",53464);
        System.out.println(tm);
        add("qw", 887799);
        System.out.println(tm);
        add("qw",400011);
        System.out.println(tm);
        add("alex",4001011);



        System.out.println(tm);
    }
}
