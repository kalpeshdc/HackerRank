import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * PhoneBook
 */
public class PhoneBook {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<>();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            phoneBook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            Integer number = phoneBook.get(s);
            if(number == null){
                System.out.println("Not found");
            } else{
                System.out.println(s + "=" + number);
            }
        }
        in.close();
    }
}