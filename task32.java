//Пусть дан произвольный список целых чисел, удалить из него четные числа
import java.util.ArrayList;
import java.util.Random;

public class task32 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> digits = new ArrayList<>();
        for (int i = 0; i < 15; i++)
            digits.add(rnd.nextInt(10));
        System.out.println(digits);
        for (int i = 0; i < digits.size(); i++)
            if(digits.get(i)%2!=0)digits.remove(i--);
        System.out.println(digits);
    }
}

