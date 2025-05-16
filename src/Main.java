import java.io.*;
import java.util.*;

public class Main
{
    public class Class1 {
        public String name;
        public int age;
    }

    public static void main(String[] args) throws IOException {
        //reading class value from HashMap
        HashMap<String, Class1> map = new HashMap<>();
        Class1 c = map.get("key");

        // basic scanner class implementation/usage
        Scanner scan = new Scanner(System.in);
        System.out.println("sth");
        String firstName = scan.nextLine();
        System.out.println("Witaj" + firstName);


        //type "sout" and hit tab
        System.out.println();

        //foreach (do przechodzenia po listach i innych zbiorach)
        List<String> items = new ArrayList<String>();
        items.add("item1");
        items.add("item2");
        items.add("item3");
        for (String item : items) {
            System.out.println(item);
        }

        //odczyt plików
        String path = "./file.txt";
        BufferedReader reader = new BufferedReader(new FileReader(path));
        //odczytanie całego pliku linia po linii
        String line;
        reader.readLine();
        while ((line = reader.readLine()) != null) {
        }
        

    }

}