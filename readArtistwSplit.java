import java.io.*;
import java.util.Scanner;

public class readArtistwSplit {

        public static void main(String[] args) throws IOException {
            int counter=0;

           //aBag = new BagInterface<String>(1);

            File file = new File("foo.txt");// input file
            File outfile = new File("fooout.txt"); //output file
            FileOutputStream fos = new FileOutputStream(outfile); //setup output stream
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            ArtistBag<Artist> artistBag = new ArtistBag(1);

            Scanner input = new Scanner(file).useDelimiter("\t");
            while (input.hasNext()) {
                //print each line as it's read
                String[] aLine = (input.nextLine().split("\t"));
                System.out.println(aLine[0]);
                System.out.println(aLine[1]);
                // add to the bag
                Artist artistToAdd = new Artist();
                artistToAdd.setArtistID(artistToAdd,Integer.valueOf(aLine[0]));
                artistToAdd.setArtistName(artistToAdd,aLine[1]);
                artistBag.add(artistToAdd);



                //test first column isInteger
                try {
                    int testInt = Integer.valueOf(aLine[0]);
                    bw.write(aLine[0] + "\t" + aLine[1] + "\n");
                }
                catch (Exception e) {
                    System.out.println("Error in line "+ ++counter);
                System.out.println("The bogus input is: "+aLine[0]+"\t"+aLine[1]);}



                //write each line to a file


                counter++;
            }
            System.out.println("Value of counter: "+ counter);


                bw.close();
                input.close();





        }
    }

