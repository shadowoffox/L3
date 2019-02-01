import java.util.*;

public class PhoneBook {

    static Map<String, ArrayList<Integer>> tm = new HashMap<String, ArrayList<Integer>>();

    static ArrayList<Integer> al = new ArrayList<>();

    public static void add(String SecondName, Integer PhoneNumber){
    if (tm.containsKey(SecondName)) {
        tm.get(SecondName).add(PhoneNumber);
    }
        else{
            tm.put(SecondName, new ArrayList<>(Arrays.asList(PhoneNumber)));

    }

    }

    public static void get(String Name) {
        System.out.println("ИМЯ: " + Name + " | Телефон: " + tm.get(Name));

    }

    public static void main(String[] args) {

        add("Denio",53464);
        add("qw", 887799);
        add("qw",400011);
        add("alex",4001011);



        get("qw");
        get("alex");
        get("Denio");
    }
}
