//Nathan Borchelt
//CSC 345 Assignment 2

public class Search {
    public static int findMin(int[] intArray){
        int minValue;
        try{
            minValue = intArray[0];
        }
        catch(Exception e){
            System.err.println(e);
            return -1;
        }
        short index = 0;
        for(short i = 0; i < intArray.length; i++){
            if(intArray[i]<minValue){
                index = i;
                minValue = intArray[i];
            }
        }
        return index;
    }
    //https://www.baeldung.com/java-generics
    public static <T extends Comparable<T>> int findMin(T[] comparables){
        T minValue;
        try{
            minValue = comparables[0];
        }
        catch(Exception e){
            System.err.println(e);
            return -1;
        }
        int index = 0;
        for(int i = 0; i < comparables.length; i++){
            if(comparables[i].compareTo(minValue)<0){
                minValue = comparables[i];
                index = i;
            }
        }
        return index;
    }

}
