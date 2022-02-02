//Nathan Borchelt
//CSC 345 Assignment 2

public class Search {
    public int findMin(int[] intArray){
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
        return index
    }
    public T findMin(Comparable<T>[] comparables){

    }

}
