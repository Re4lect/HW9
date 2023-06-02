import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        while (true){
       print("Введите число: ");
       evenOrOdd(input());}
    }
    public static void print(String text){
        System.out.println(text);
    }
    public static int input(){
        return new Scanner(System.in).nextInt();
    }
    public static void evenOrOdd(int number){

        if (number % 2 != 0){
            print("false");
        }else print("true");
    }
}
