import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadWriteFile {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter data to be entered into the file: ");
            String str = sc.nextLine();

            FileWriter fout = new FileWriter("sample.txt");
            fout.write(str);
            fout.close();

            System.out.println("\n\nReading contents from the file...\n");
            System.out.println("\nFile contents: \n");
            FileReader fin = new FileReader("sample.txt");

            int c = fin.read();

            while(c != - 1) {
                System.out.print((char)c);
                c = fin.read();
            }

            fin.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error encountered");
        }
    }
}