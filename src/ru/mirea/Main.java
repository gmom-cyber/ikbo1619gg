package ru.mirea;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int a = 1;
	float b = 2.2f;
	boolean t = false;
	String srt = "jkhg";
    Scanner scanner = new Scanner(System.in);
    a = scanner.nextInt();
    System.out.println(a + 1);
    b = a;
    a =(int) b;
    }
}
