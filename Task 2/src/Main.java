import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами
            print("Введите число: ");
            evenOrOdd(input());
        }

    public static void print(String text) {
        System.out.println(text);
    }

    public static int input() {
        return new Scanner(System.in).nextInt();
    }

    public static void evenOrOdd(int number) {

        if (number % 2 != 0) {
            print("false");
        } else print("true");
    }
}


