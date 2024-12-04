import java.util.Scanner;

/**
 * Main
 */
public class Main{
    /**
     * Метод отримання значення N
     *
     * @return Введене значення N
     */
    static int inputPosition(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть N-ий член ряду Фібоначчі (N<=0) ");
        int n = input.nextInt();
        while (n > 0) {
            System.out.println("N повинно бути від'ємним");
            n = input.nextInt();
        }
        return n;
    }
    /**
     * Метод, щоб отримати N-ий елемент ряду Фібоначчі
     *
     * @return N-ий елемент ряду Фібоначчі
     */
    static Fibonacci calculateFibonacci(int position){
        if(position == 0 ) {
            return new Fibonacci(position, 0);
        }

        Fibonacci a = new Fibonacci(1,1);
        Fibonacci b = new Fibonacci(2, 1);
        Fibonacci c = new Fibonacci(position, a.getValue() + b.getValue());
        int absN = Math.abs(position);

        for(int i = 2; i < absN; i++){
            c = new Fibonacci(position, a.getValue() + b.getValue());
            a = b;
            b = c;
        }
        if(position % 2 == 0){
            c.setValue(-c.getValue());
        }
        return c;
    }
    /**
     * Метод для виведення результату
     * @param fib - об'єкт
     */
    static void printFibonacci(Fibonacci fib){
        System.out.println("Число на " + fib.getPosition() + " позиції це: " + fib.getValue());
    }
    /**
     * Main - тіло програми
     * @param args аргументи командного рядка
     */
    public static void main(String[] args) {
        int position = inputPosition();
        Fibonacci fib = calculateFibonacci(position);
        printFibonacci(fib);
    }

}
