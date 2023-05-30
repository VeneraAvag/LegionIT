import java.util.*;

public class ArraysAndHashes {
    public static void main(String[] args) {
        ArraysAndHashes arraysAndHashes = new ArraysAndHashes();

        ArrayList<String> list = new ArrayList<String>();
        list.add("Steve");
        list.add("Tim");
        list.add("Lucy");
        list.add("Steve");
        list.add("Pat");
        list.add("Angela");
        list.add("Tom");
        list.add("Tim");
        list.add("Anna");
        list.add("Lucy");

        System.out.println(list);
        System.out.println(arraysAndHashes.removeDuplicates(list));
        System.out.println(arraysAndHashes.noDuplicates(list));

        System.out.println(arraysAndHashes.getDay(2));
        System.out.println(arraysAndHashes.getToyById(12));
        System.out.println(arraysAndHashes.getToyByIdWithScanner());
    }
    public String getDay(int day){
        // Create a method with an array list of days of the week from Sunday to Saturday.
        // The method can receive a number and return/print the day of the week.
        // For example, if 2 will be provided, the method should return "Monday"
        ArrayList<String> days = new ArrayList<String>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Thursday");
        days.add("Wednesday");
        days.add("Tuesday");
        days.add("Friday");
        days.add("Saturday");

        return days.get(day - 1);
    }
    public String getToyById(int id) {
        // The online Toys store has 5 different products. Create a Method that return the name of the toy by ID.
        // Ex. getToyById(6) -> “Wonder Woman”.
        // If there is no product with an id specified in the call, return “No such Toy” String instead
        HashMap<Integer, String> toys = new HashMap<Integer, String>();
        toys.put(12, "Batmobile ");
        toys.put(45, "Light Saber ");
        toys.put(6, "Wonder Woman ");
        toys.put(201, "Hello Kitty Bag ");
        toys.put(56, "Junior QA Analyst Doll");

        if (toys.get(id) == null)
            return "No such Toy";
        else
            return toys.get(id);
    }
    public String getToyByIdWithScanner() {
        // ask a question in console
        // get input as a String
        HashMap<Integer, String> toys = new HashMap<Integer, String>();
        toys.put(12, "Batmobile ");
        toys.put(45, "Light Saber ");
        toys.put(6, "Wonder Woman ");
        toys.put(201, "Hello Kitty Bag ");
        toys.put(56, "Junior QA Analyst Doll");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Toy ID: ");
        int id = Integer.parseInt(scanner.next());

        if (toys.get(id) == null)
            return "No such Toy";
        else
            return toys.get(id);
    }
    public ArrayList<String> removeDuplicates(ArrayList<String> list) {
        //The program should receive an ArrayList of Strings and print all the words with no duplicates.
        //in:  [Steve, Tim, Lucy, Steve, Pat, Angela, Tom, Tim, Anna, Lucy]
        //out: [Steve, Tim, Lucy, Pat, Angela, Tom, Anna]
        ArrayList<String> newList = new ArrayList<String>();

        for (String element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }
    public ArrayList<String> noDuplicates(ArrayList<String> list){
        return new ArrayList<String>(new HashSet<String>(list));
    }

    }
