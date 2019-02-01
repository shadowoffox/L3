import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class List {

    public static void main(String[] args) {
        ArrayList<String> Str = new ArrayList<String>();
        LinkedHashSet<String> hs = new LinkedHashSet<String>();

        Str.add("1");
        Str.add("2");
        Str.add("3");
        Str.add("4");
        Str.add("5");
        Str.add("5");
        Str.add("4");
        Str.add("3");
        Str.add("2");
        Str.add("1");
        Str.add("6");


        System.out.println("Начальный массив" + Str);
        for (int i=0;i<Str.size();i++) {
            hs.add(Str.get(i));
        }
        System.out.println("Обработанный массив" + hs);

       for (String S : hs) {
           int count =0;
        for (String W: Str){
            if (S.equals(W)) count++;
        }
           System.out.println(S + " - "+ count);
       }

    }
}
