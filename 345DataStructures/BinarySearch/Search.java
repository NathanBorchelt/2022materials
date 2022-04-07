public class Search {
    public static int binarySearch(int[] intArr, int key){
        return binarySearch(intArr, key, 0, intArr.length-1);
    }

    private static int binarySearch(int[] intArr, int key, int min, int max){
        int mid = (min+max)/2;

        if(intArr[mid] == key){
            return mid;
        }
        else if(min-max <= 0){
            return -1;
        }
        else if(intArr[mid] < key){
            return binarySearch(intArr, key, mid, intArr.length-1);
        }
        else{
            return binarySearch(intArr, key, min, mid-1);
        }
    }
}
