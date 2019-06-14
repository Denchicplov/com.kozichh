package hw_2;

/**
 * Created by Asus on 14.06.2019.
 */
public class Tusk_3 {
    public static void main(String[]args){
        int summ_1 = 1;
        int summ_2 = 1;
        while(summ_1<256){
            summ_1 *= 2;
            summ_2 = summ_2 + summ_1;
        }
        System.out.println("Сумма равна " + summ_2);
    }
}
