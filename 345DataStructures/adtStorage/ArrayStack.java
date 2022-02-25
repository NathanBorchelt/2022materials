public class ArrayStack<T> implements Stack<T> {
    private T[] values;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayStack(){
        values = (T[])(new Object[10]);
        size = 0;
    }

    public void push(T value){
        if(size = values.length){
            valuesTemp = (T[])(new Object[size*2]);
            for(int i = 0; i<value.length; i++){
                valuesTemp[i] = values[i];
            }
        }
        values[size] = value;
        size++;
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

    public String toString() {
        String outString = "[";
        for(int i = 0; i <size-1; i++){
            outString += values[i]+", ";
        }
        outString += values[size-1]+"]";
        return outString;
    }
}
