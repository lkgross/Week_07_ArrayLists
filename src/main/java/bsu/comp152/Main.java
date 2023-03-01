package bsu.comp152;
import com.sun.source.doctree.SystemPropertyTree;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> roster = new ArrayList<String>();
        roster.add("Amber");
        roster.add("Gael");
        roster.add("Cardelina");
        roster.add("Alice");
        roster.add("Nathan");
        roster.add("Adam");
        System.out.println(roster);
        System.out.println(roster.size());
        System.out.println(roster.get(0));
        roster.set(4, "Ali");
        System.out.println(roster);
        System.out.println(roster.contains("Nathan"));
        System.out.println(roster.contains("Ali"));
        roster.remove("Ali");
        System.out.println(roster);
        roster.add(0, "Cris");
        System.out.println(roster);
        // We can loop through an ArrayList element-by-element.
        for (String name : roster){
            System.out.printf("%s (Section 001)\n", name);
        }
        // We can loop through an ArrayList index-by-index.
        System.out.println("Where is Cardelina in the roster?");
        for (int i = 0; i < roster.size(); i++){
            if (roster.get(i).equals("Cardelina")){
                System.out.printf("Index: %d\n", i);
            }
        }
        System.out.println("Where is Nathan in the roster?");
        for (int i = 0; i < roster.size(); i++){
            if (roster.get(i).equals("Nathan")) {
                System.out.printf("Index: %d\n", i);
            }
        }
    }
}