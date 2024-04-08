package prog2.samcis.slu;

import java.io.*;
import java.util.Scanner;

public class TextDisplayer {
    public static void main(String[] args) {
        TextDisplayer program ;
        try{
            program = new TextDisplayer();
            program.run();
        }

        // if the file is not found
        catch (FileNotFoundException e) {
            System.out.println("File is not found. ");
        }

        // Since the readline method of the BufferedReader throws IOException and IOException is a checked exception,
        // we need to handle it, thus throwing it here
        catch (IOException e){
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        // for other possible exceptions
        catch (Exception e){
            e.printStackTrace();
        }

        // terminate the program
        finally{
            System.exit(0);
        }
    }

    private void run() throws IOException {
        String file = "samplefile1.txt";
        int count = lineReader(file);
        System.out.println(count);
    } // end of the run method

    private int lineReader(String fileName) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        Scanner fileReader = new Scanner(new FileReader(fileName));

        int counter = 0;

        while(fileReader.hasNextLine()){ // read the file until the line is null
            ++counter;
            fileReader.nextLine();
        }

        // Close the BufferedReader
        fileReader.close();

        return counter;
    }

}
