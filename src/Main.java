import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        try {
//            FileWriter writers = new FileWriter("output.txt");
//            writers.write("Hello World\n");
//            writers.write("This is Written to a file");
//            System.out.println("Successfuly wrote to the file.");
//        } catch (IOException e) {
//            System.out.println("An Error Occurred");
//        }
//    }
//        try {
//            FileWriter fileWriter = new FileWriter("quotes.txt");
//            BufferedWriter bwriter = new BufferedWriter(fileWriter);
//            bwriter.write(" The only limit to our realization of tomorrow is out doubts of today.");
//            bwriter.write("Success is not final, failure is not fatal: It is the courage to continue.");
//            bwriter.newLine();
//            System.out.println("Quotes Written Successfully!");
//        }
//        catch (IOException e){
//            System.out.println("System Error");
//            e.printStackTrace();
//        }
        Scanner scanner = new Scanner(System.in);
        String filename = "my_quotes.txt";
        try{
            BufferedWriter bwriter = new BufferedWriter(new FileWriter(filename));
            while (true){
                System.out.println("Enter a quote ( type \"Exit\" to finish)");
                String quote = scanner.nextLine();
                if (quote.equalsIgnoreCase("exit")){
                    System.out.println("You have finished your quote and saved to " + filename);
                    break;
                }
                bwriter.write(quote);
                bwriter.newLine();

            }
        }catch (IOException e){
            System.out.println("Error Occurred!");
        }
        // Reader


    }

}
