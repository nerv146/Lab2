import java.io.PrintStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.io.IOException;
public class Number4 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    static double func(int []a, double c,double sum) {
        sum-=c;
        int l = a.length-1; // берём количество эл-тов не считая выбранный
        double sra = sum/l; //считаем среднее арифметическое
        return Math.abs(c-sra);  //возвращаем искомое значение
    }
    public static void  main(String [] args) throws IOException {
        int n  = in.nextInt();
        int []arr = new int[n];
        int sum = 0;
        for (int i = 0; i<arr.length;++i) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        int index = 0;     //переменная для хранения индекса искомого числа
        double znachenie = func(arr,arr[0],sum);  // искомое значение, начинаем перебирать с первого эл-та
        for (int e = 1; e<arr.length;++e)
            if (func(arr,arr[e],sum) < znachenie) {  // если искомое значение текущей переменной, меньше минимально найденного
                znachenie = func(arr,arr[e],sum);    // обновляем минимум и индекс
                index = e;
            }
        out.println("Значение искомого элемента:" + arr[index]);
        out.println("Этот элемент находится на " + (index+1) + " позиции");
    }
}
