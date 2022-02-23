public class Sorting {

    public static <T extends Comparable<T>> T[] selectionSortInt(T[]  objArray){
            for (int i = 0; i < objArray.length - 1; i++)
            {
            int minIndex = i;
            for (int searchIndex = i + 1; searchIndex < objArray.length; searchIndex++)
            {
                if(objArray[searchIndex].compareTo(objArray[minIndex])<0)
                minIndex = searchIndex;
            }
            T temp = objArray[i];
            T smallest = objArray[minIndex];
            objArray[i] =  smallest;
            objArray[minIndex] =  temp;
            }
            return objArray;
      }
}
