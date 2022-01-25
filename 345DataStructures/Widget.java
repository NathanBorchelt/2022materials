public class Widget<T> {
    private T value;
    public Widget(T v){
        value = v;
    }
    public T getValue() {
        return value;
    }
}
