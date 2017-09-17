import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        int counter=0;

        File file = new File("foo.txt");
        Scanner input = new Scanner(file).useDelimiter("\t");
        while (input.hasNext()) {


            System.out.println(input.nextLine());
            counter++;
        }


    System.out.println("Value of counter: "+ counter);
    input.close();
    }
}
