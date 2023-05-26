import java.util.ArrayList;

public class Prime {

    /*
    Метод, проверяющий число на простоту
     */
    public static boolean prime(int num){

        for (int i = 2; i < Math.sqrt(num) + 1; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    /*
    Метод возвращающий делите числа
     */
    public static ArrayList<Integer> primeNumber(int num){

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 1; i < Math.sqrt(num)+1; i++){
            if (num % i == 0){
                array.add(i);
                if (i != num / i){
                    array.add(num / i);
                }
            }
        }

        return array;

    }
}
