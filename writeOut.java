import java.io.*;
import java.util.Scanner;
public class writeOut {

        public static void main(String[] args) throws IOException {
            int counter=0;

            File file = new File("foo.txt");// input file
            File outfile = new File("fooout.txt"); //output file
            FileOutputStream fos = new FileOutputStream(outfile); //setup output stream
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

            Scanner input = new Scanner(file).useDelimiter("\t");

            while (input.hasNext()) {
                //print each line as it's read
                String aLine = input.nextLine();
                System.out.println(aLine);
                //write each line to a file
                bw.write(aLine+"\n");

                counter++;
            }
            System.out.println("Value of counter: "+ counter);


                bw.close();
                input.close();





        }
    }

