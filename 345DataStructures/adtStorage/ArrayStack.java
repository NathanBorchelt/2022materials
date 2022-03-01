public class ArrayStack<T> implements Stack<T> {
    private T[] values;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayStack(){
        values = (T[])(new Object[10]);
        size = 0;
    }

    public void push(T value){
        if(size == values.length){
            expandCapacity();
        }
        values[size] = value;
        size++;
    }

    @SuppressWarnings("unchecked")
    private void expandCapacity(){
        T[] valuesTemp = (T[])(new Object[size*2]);
        for(int i = 0; i<values.length; i++){
            valuesTemp[i] = values[i];
        }
        values = valuesTemp;
    }
    public void pop(){
        try{
            values[size-1] = null;
            size--;
        }
        catch (Exception e){
            throw new RuntimeException("Cannot Pop Empty ArrayStack");
        }
    }
    public T peek(){
        try{
            return values[size-1];
        }
        catch (Exception e){
            throw new RuntimeException("Cannot Peek Empty ArrayStack");
        }
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public T takeOut(){
        try{
            T removingVal = values[size-1];
            values[size-1] = null;
            size--;
            return removingVal;
        }
        catch (Exception e){
            throw new RuntimeException("Cannot Take From Empty ArrayStack");
        }
    }

    public String toString() {
        String outString = "[";
        for(int i = size-1; i >0; i--){
            outString += values[i]+", ";
        }
        if(values[0] != null)
            outString += values[0];
        outString += "]";
        return outString;
    }
}
