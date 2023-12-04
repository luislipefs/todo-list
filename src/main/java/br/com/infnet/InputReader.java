package br.com.infnet;
import java.util.Scanner;
public class InputReader {
    private Scanner scanner;

    public InputReader() {
        this.scanner = new Scanner(System.in);
    }

    public int lerInteiro() {
        return scanner.nextInt();
    }

    public String lerString() {
        return scanner.next();
    }
}
