public class ArrayDemo {

    public static void main(String[] args){

        int[] myArray;

        myArray = new int[3];

        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;

        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }


    }

}
