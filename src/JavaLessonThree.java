public class JavaLessonThree {

    public static void main(String[] args)
    {

        int randomNumber = (int) (Math.random() * 50);

        if (randomNumber < 25)
        {
            System.out.println("The random number is less than 25");
        }
        else if (randomNumber > 40)
        {
            System.out.println("The random number is less than 40");
        }

        System.out.println("The random number is " + randomNumber);

    }

}
