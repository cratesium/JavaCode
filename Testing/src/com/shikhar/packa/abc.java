package com.shikhar.packa;
import java.util.ArrayList;
import java.util.List;

 class ListInsertionExample {
    public static void mai() {
        // Create the main list
        List<List<Integer>> mainList = new ArrayList<>();

        // Insert elements from an anonymous ArrayList into the main list
        mainList.add(new ArrayList<Integer>() {{
            add(4);
            add(5);
            add(6);
        }});

        // Display the main list after insertion
        System.out.println("Main List after insertion: " + mainList);
    }
}

public class abc {
	public static void main(String[] args) {
		ListInsertionExample objExample = new ListInsertionExample();
		objExample.mai();
	}

}
