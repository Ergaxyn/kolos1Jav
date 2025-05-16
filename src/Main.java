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

    //pisanie w pliku
    public void FileWriter()
    {
        File file = new File("out.txt");
        try {
            PrintWriter writer = new PrintWriter(file);
            writer.print("First line\n");
            writer.println("Second line");
            writer.printf("%s line", "Third\n");
            writer.close();
        } catch (FileNotFoundException e) {
            System.err.println("Cannot open: " + file.getName());
        }
    }
    // StringBuilder
   public void StringBuilder()
    {
        File file = new File("in.txt");
        StringBuilder result = new StringBuilder();
        try {
            FileReader reader = new FileReader(file);
            int next;
            while ((next = reader.read()) != -1)
                result.append((char) next);
            reader.close();
        } catch (IOException e) {
            System.err.println("Cannot access: " + file.getName());
        }
        System.out.println(result);
    }
}
