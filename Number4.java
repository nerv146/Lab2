import java.io.PrintStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.io.IOException;
public class Number4 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    static int func(int []a, int c) {
        int sum = -c; //начинаем с -с чтобы получить сумму всех чисел кроме с
        int l = a.length-1; // берём количество эл-тов не считая выбранный
        for ( int j = 0;j<a.length;++j)
            sum+=a[j];
        int sra = sum/l; //считаем среднее арифметическое
        return Math.abs(c-sra);  //возвращаем искомое значение
    }
    public static void  main(String [] args) throws IOException {
        int n  = in.nextInt();
        int []arr = new int[n];
        for (int i = 0; i<arr.length;++i)
            arr[i] = in.nextInt();
        int index = 0;     //переменная для хранения индекса искомого числа
        int znachenie = func(arr,arr[0]);  // искомое значение, начинаем перебирать с первого эл-та
        for (int e = 1; e<arr.length;++e)
            if (func(arr,arr[e]) < znachenie) {  // если искомое значение текущей переменной, меньше минимально найденного
                znachenie = func(arr,arr[e]);    // обновляем минимум и индекс
                index = e;
            }
        out.println("Значение искомого элемента:" + arr[index]);
        out.println("Этот элемент находится на " + (index+1) + " позиции");
    }
}