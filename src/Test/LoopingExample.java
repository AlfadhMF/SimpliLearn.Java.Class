package Test;

public class LoopingExample {

    public static void main (String [] args){

        //Print all the numbers from 1 to 100.
       //While loop
        int Num1 =1;
        while (Num1<=100){
            System.out.print(Num1+" , ");
            Num1=Num1+1;
        }

        System.out.println();
        System.out.println();
        // print all the numbers from 10 to 11;
        // While Loop

        int Num2=10;
        while (Num2>=0){
            System.out.print(Num2+" , ");
            Num2=Num2-1;
        }
        System.out.println();
        System.out.println();
        // For loop

        for(int num3=1; num3<=10;num3++){

            System.out.print(num3+" , ");
        }

        System.out.println();
        System.out.println();

        for(int num4=3;num4<=50;num4+=2){
            System.out.print(num4+" , ");
        }

        System.out.println();
        System.out.println();


        int [] Arr1 = {50, 54, 12, 23, 43, 90};
        int sum = 0;

        for(int value:Arr1){

            System.out.print(value+" , ");
            sum+=value;



        }
        System.out.println("Sum is: "+sum);

    }
}
