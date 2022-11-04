package eu.macioszektv.HTMLGenerator;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        PrintWriter fileOutput;
        String nameOutput;

        System.out.println("Podaj nazwę pliku:");
        nameOutput = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Podaj treść strony:");
        String trescstrony;
        trescstrony = scanner.nextLine();

        try {
            fileOutput = new PrintWriter(nameOutput + ".html");
            fileOutput.println("<html>");
            fileOutput.println("<head><title>macioch dev</title></head>");
            fileOutput.println("<body>");
            fileOutput.println(trescstrony);
            fileOutput.println("</body>");
            fileOutput.println("</html>");
            System.out.println("Strona jest w przygotowaniu!");
            fileOutput.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
