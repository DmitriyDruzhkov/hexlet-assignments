package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// BEGIN
public class App {

    public static List<String> buildApartmentsList(List list, int n){
        Collections.sort(list);
        List<String> apartments = new ArrayList<>();
        if (list!=null && list.size()>0) {
            for (int i = 0; i < n; i++) {
                apartments.add(list.get(i).toString());
            }
        }
        return apartments;
        }


    public static void main(String[] args) {
        CharSequence text = new ReversedSequence("abcdef");
        System.out.println(text.toString()); // "fedcba"
        System.out.println(text.charAt(1)); // 'e'
        System.out.println(text.length()); // 6
        System.out.println(text.subSequence(1, 4).toString()); // "edc"
    }
}
// END
