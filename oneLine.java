import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
// This example displays the use of hasNext and nextLine methods
// Also displayed is the use of reading the text file into an ArrayBag
// Running oneLine.java displays the number of items in the file and the number of times 4\tBarton is found

public class oneLine {

        public static void main(String[] args) throws FileNotFoundException {
            int counter=0;
            ArrayBag<String> exampleArray = new ArrayBag(100);

            File file = new File("foo.txt");
            Scanner input = new Scanner(file).useDelimiter("\t");
            while (input.hasNext()) {
                //print each line as it's read
                exampleArray.add(input.nextLine());
               // System.out.println(input.nextLine());
                counter++;
            }
            System.out.println(exampleArray.getFrequencyOf("4\tBaron"));
            System.out.println(exampleArray.getCurrentSize());
            System.out.println("Value of counter: "+ counter);
            input.close();
        }
    }

