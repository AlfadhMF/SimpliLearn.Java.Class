package Test;

public class StringOperations {

    public static void main (String [] args){

        String strl = "Clean India Green India";

        System.out.println("Total num of characters are: "+strl.length());

        System.out.println("First char is: "+strl.charAt(0));
        System.out.println("First char is: "+strl.charAt(strl.length()-1));

        System.out.println("The upper case string is: "+strl.toUpperCase());
    }
}
