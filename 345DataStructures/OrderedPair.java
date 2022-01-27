public class OrderedPair<E1,E2>{
    private E1 x;
    private E2 y;
    public OrderedPair(E1 x, E2 y){
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return ("( "+x+" , "+y+" )");
    };
}