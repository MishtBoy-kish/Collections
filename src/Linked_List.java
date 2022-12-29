import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		LinkedList<String> ink = new LinkedList<>();
		ink.add("cricket");
		ink.add("ball");
		ink.add("stump");
		ink.add("out");

        System.out.println(ink);

        ink.remove(2);
        System.out.println(ink);

        ink.set(2, "Happyyy");
        System.out.println(ink);

        //using for loop

        for (int i = 0; i < ink.size(); i++) // Normal for loop
        {
            System.out.print(ink.get(i) + " ");
        }

        System.out.println();

//        /---using for each loop---/
        for (String s : ink) // For each loop
        {
            System.out.print(s + " ");
        }

//        /---using iterator---/

        LinkedList<String> llist = new LinkedList<>();
        llist.add("alice");
        llist.add("ram");
        llist.add("jiggy");

        Iterator<String> itr = llist.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

	}

}
