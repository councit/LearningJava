public class VariableTypes {
    public static void main(String[] args) {
        // var types
        byte bigByte = 127;
        short bigShort = 32767;
        int bigInt = 21000000;
        long bigLong = 92000000000L;
        float bigFloat = 3.14F;
        double bigDouble = 3.145345345345;

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        boolean trueOrFalse = true;

        char randomChar = 65;
        char anotherChar = 'A';
        char escapedChar = '\b';
        //String type methods
        String randomString = "I'm a random string";
        String anotherString = "Stuff";

        String andAnotherString = randomString + ' ' + anotherString;

        String byteString = Byte.toString(bigByte);

        String intString = Integer.toString(bigInt);
        int stringToInt = Integer.parseInt(intString);

        System.out.println(stringToInt);

        System.out.println(randomChar);
        System.out.println(anotherChar);
        System.out.println(andAnotherString);
        System.out.println(byteString);
        // casting and converting
        double aDoubleValue = 3.144234234;
        int doubleToInt = (int) aDoubleValue;

        System.out.println(doubleToInt);


    }
}
