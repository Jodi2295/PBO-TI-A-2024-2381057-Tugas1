package Soal;

public class Soal3 {
    public static void main(String[] args) {
        System.out.println(countCameICaseWords("SatuDuaTiga"));

        System.out.println(countCameICaseWords("SaveChangesiInEditor"));
    }

    public static int countCameICaseWords(String camelICaseString){
        if (camelICaseString == null || camelICaseString.isEmpty()){
            return 0;
        }

        int count = 1;
        for (char c : camelICaseString.toCharArray()){
            if (Character.isUpperCase(c)){
                count++;
            }
        }

        return count;
    }
}
