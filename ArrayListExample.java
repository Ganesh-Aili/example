import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		  // Creating an ArrayList of String
        List<String> animals = new ArrayList<>();

        // Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        // Adding an element at a particular index in an ArrayList
        animals.add(2, "Elephant");
        animals.remove(1);
        animals.get(0);
        System.out.println(animals);
//        animals.get(0);
        System.out.println(animals.get(0));
        for(int i=0;i<animals.size();i++) {
            System.out.println(animals.get(i));
        }
        if(animals.contains()) {
            System.out.println(animals.get(0));

        }
	}

}
