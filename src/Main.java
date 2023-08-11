import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("abs.txt");
        int a = 0;
        for (int i = 65; i <= 90; i++) {
            a++;
            writer.write(a+" : "+  (char) i+ "\n");
        }

            writer.close();

        FileReader reader = new FileReader("abs.txt");
        Scanner scanner = new Scanner(reader);
        StringBuilder builder=new StringBuilder();
       while (scanner.hasNextLine()) {
           builder.append(scanner.nextLine()+"\n");
       }
       System.out.println(builder);
            reader.close();
        }}