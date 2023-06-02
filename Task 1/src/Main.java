import java.util.Scanner;

public class Main {
    static double a = 0;
    static double b = 0;

    public static void main(String[] args) {
        print("\n***КАЛЬКУЛЯТОР***\n");
        print("Введите первое число: ");
        a = inputDouble();
        print("Введите второе число: ");
        b = inputDouble();
        print("Сумма: "+sum());      //Метод суммирования чисел
        print("Произведение: "+multiply()); //Метод умножения чисел
        print("Разность: "+diff());     //Метод вычитания чисел
        print("Частное: "+divide());   //Метод деления чисел
    }

    private static double divide() {
        return a/b;
    }

    private static double diff() {
        return a-b;
    }

    private static double multiply() {
        return a*b;
    }

    private static double sum() {
        return a+b;
    }

    private static double inputDouble() {
        return new Scanner(System.in).nextDouble();
    }

    public static void print(String text){
        System.out.println(text);
    }
}
