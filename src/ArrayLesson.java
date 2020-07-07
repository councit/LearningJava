import java.util.Arrays;

public class ArrayLesson {

    public static void main(String[] args){

        int[] randomArray;
        int[] numberArray = new int[10];

        randomArray = new int[20];
        randomArray[1] = 2;

        String[] stringArray = {"Just", "random", "words"};

        for(int i = 0; i < numberArray.length; i++){
            numberArray[i] = i;
        }

        int k = 1;
        while(k <= 41){
            System.out.print('-');
            k++;
        }
        System.out.println();

    }

}
