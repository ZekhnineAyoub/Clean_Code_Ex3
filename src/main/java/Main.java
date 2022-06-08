import services.Parsing;

import java.io.*;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws FileNotFoundException {
        //Started
        System.out.println("Started");
        //Read File
        File file=new File("src/main/java/data/Numbers.txt");    //creates a new file instance
        Scanner scanner = scanner = new Scanner(file);
        System.out.println("Insert your operation:");
            Scanner in = new Scanner(System.in);
            String operation = in.nextLine();
            if(operation.equals("+")) System.out.println("applying operation addition");
            else if (operation.equals("-"))  System.out.println("applying operation soustraction");
            else if (operation.equals("*"))  System.out.println("applying operation multiplication");
            else System.out.println("your opération is not found");

            int total =scanner.nextInt();
            while (scanner.hasNextInt()) {
                int value= scanner.nextInt();

                total = total+value;
                Parsing parsing = new Parsing(value);
                parsing.affichage();
                System.out.println(scanner.nextInt());
            }
            scanner.close();
          System.out.println("totola is : "+total);


    }
}
