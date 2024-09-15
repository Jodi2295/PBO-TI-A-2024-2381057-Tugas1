package Soal;

public class Soal1 {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        int sum = sumArray(array);
        System.out.println(sum);
    }

    public static int sumArray(int[] arr){
        int total = 0;
        for (int number:arr){
            total += number;
        }

        return total;
    }
}
