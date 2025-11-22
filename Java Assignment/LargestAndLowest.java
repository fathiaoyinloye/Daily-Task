import java.util.Arrays;
public class LargestAndLowest{
    public static void main (String... args){
    int[] myArray = {3,5,6,7,8,9};
    System.out.print(Arrays.toString(getHighestAndLowest(myArray)));


    }
    public static int[] getHighestAndLowest(int[] myArray ){
        int largest = myArray[0];
        int lowest = myArray[1];


        for(int number : myArray){
            if(number > largest) largest = number;
            if(number < lowest) lowest = number;
        }

        int[] newArray = {largest, lowest};
        return newArray;
    }



}