import java.io.*;
import java.util.*;

public class Main
{
    public static class Class1 {
        public String name;
        public int age;

        @Override
        public String toString() {
            return  "Class1{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException {
        //odczytywanie wartości klasy z HashMap
        Map<String, Class1> map = new HashMap<>();
        Class1 class1 = new Class1();
        class1.name = "josh";
        class1.age = 15;
        map.put("key", class1);
        Class1 c = map.get("key");
        System.out.println(c);

        //pobieranie wartości od użytkownika
        Scanner scan = new Scanner(System.in);
        String Name = scan.nextLine();
        int age = scan.nextInt();
        System.out.println(age + " " + Name);

        //wpisz "sout" i wciśnij tab
        System.out.println();

        //foreach (do przechodzenia po listach i innych zbiorach)
        List<String> items = new ArrayList<String>();
        items.add("item1");
        items.add("item2");
        items.add("item3");
        for (String item : items) {
            //instrukcje która wykona się dla każdej pozycji na liście
        }

        //odczyt plików
        String path = "./file.txt";
        BufferedReader reader = new BufferedReader(new FileReader(path));
        //kontynuacja odczytu pliku
        // |
        // V

        //odczytanie całego pliku linia po linii
        String line;
        reader.readLine();
        while ((line = reader.readLine()) != null) {
            //instrukcje jeśli linia jest pobrana
        }

        //odczyt ze zmniennej String
        String longLine = "hello,goodbye,yes";
        String hello = longLine.split(",")[0];
        String goodbye = longLine.split(",")[1];
        String yes = longLine.split(",")[2];
        System.out.println(hello + " " + goodbye + " " + yes);
    }

    //zapisywanie do pliku
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
