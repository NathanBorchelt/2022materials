import java.util.ArrayList;

public class Vertex implements Graph{
    private String name;
    private int weight;
    private ArrayList<Vertex> connections;
    public Vertex(String name){
        this.name = name;
        this.weight = 1;
        connections = new ArrayList<>();
    }
    public Vertex(String name, int weight){
        this.name = name;
        this.weight = weight;
        connections = new ArrayList<>();
    }

    public void connect(Vertex v){
        connections.add(v);
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
