import java.util.ArrayList;
import java.util.Scanner;

public class Backpack {
    public static void main(String[] args) {

        System.out.println("Press ENTER to open the Backpack");
        boolean quit = false;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> backpack = new ArrayList<>();
        scanner.nextLine();
        do {
            System.out.println("\nPlease select what action you want to perform by entering a number between 1 and 5:");
            System.out.println(" 1. Add Items into the Backpack \n 2. Remove items from the Backpack \n 3. Find a specific item in the Backpack\n 4. List all available items in the Backpack\n 5. Close the Backpack\n");
            Scanner user_input = new Scanner(System.in);
            try {
                int options = user_input.nextInt();
                switch (options) {
                    case 1 -> {
                        System.out.print("Please enter the items you want to Add in the Backpack:\n");
                        Scanner add_item = new Scanner(System.in);
                        String addItem = add_item.next();
                        backpack.add(addItem);
                        System.out.println(addItem +" has been successfully added to the Backpack.");
                    }
                    case 2 -> {
                        if(backpack.isEmpty())
                            System.out.println("The backpack is currently empty. Please add items into the backpack before removing.");
                        else {
                            System.out.print("Please enter the items you want to remove from the Backpack:\n");
                            // Scanner scanner = new Scanner(System.in);
                            String item = scanner.next();
                            boolean itemExists = backpack.contains(item);
                            if (!itemExists)
                                System.out.println(item+ "does not exist in the Backpack");
                            else {
                                backpack.remove(item);
                                System.out.println(item+" has been successfully removed. Following are the new contents of the Backpack:");
                                for (String str : backpack)
                                    System.out.println(str);
                            }
                        }

                    }
                    case 3 -> {
                        if(backpack.isEmpty())
                            System.out.println("The backpack is currently empty.");
                        else{
                                System.out.println("Please enter the name of the item you are looking for:");
                                String find_item = scanner.next();
                                boolean item = backpack.contains(find_item);
                                if (item)
                                    System.out.println("Item Found");
                                else
                                    System.out.println(find_item + " does not exist in the Backpack");
                            }
                        }

                    case 4 -> {
                        if(backpack.isEmpty())
                            System.out.println("The backpack is currently empty.");
                        else {
                            System.out.println("Your Backpack currently holds the following items:");
                            for (String i : backpack) {
                                System.out.println(i);
                            }
                        }
                    }
                    case 5 -> {
                        quit = true;
                    }
                    default ->{
                        System.out.println("Please Enter a valid number between 1 and 5");
                    }
                }
            }catch(Exception e){
                System.out.println("Please Enter a valid number between 1 and 5");
                //System.out.println(e);
            }

        } while(!quit);
        System.out.println("Bye-bye!");
    }
}
