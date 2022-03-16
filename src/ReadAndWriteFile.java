import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class ReadAndWriteFile {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("sampleInput.txt");
            FileOutputStream fout = new FileOutputStream("sampleOutput.txt");

            System.out.println("Copying file...\n");
            System.out.println("File Contents: \n");

            int c;

            while((c = fin.read()) != -1) {
                fout.write(c);
                System.out.print((char)c);
            }

            fin.close();
            fout.close();

            System.out.println("\n\nFile Copied");

        } catch(FileNotFoundException e) {
            System.out.println("\nFile not found...");
            System.out.println(e.getMessage());
        } catch(IOException e) {
            System.out.println("\nInput output exception encountered...");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("\nError encountered");
            System.out.println(e.getMessage());
        }
    }
}
