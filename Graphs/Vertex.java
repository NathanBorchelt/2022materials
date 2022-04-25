import java.util.ArrayList;

public class Vertex<T> implements Graph{
    private T value;
    private int weight;
    private Vertex<T> neighbor;

    public Vertex(String name){
        this.name = name;
        this.weight = 1;
    }
    public Vertex(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public void connect(Vertex<T> v){
        while(neighbor)
    }
    public void sever(Vertex v){
        connections.remove(v);
    }

    public Vertex[] getNetwork(){
        return (Vertex[])connections.toArray();
    }

    public int getNetworkSize(){
        return connections.size();
    }

    public
}
