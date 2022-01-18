public class Box {
    private double length;
    private double width; 
    private double depth;
    private boolean isEmpty;

    public Box(double l, double w, double d){
        this.length = l;
        this.width = w;
        this.depth = d;
        this.isEmpty = true;
    }

    public double getVolume(){
        return this.length*this.width*this.depth;
    }

    public void take(){
        this.isEmpty = true;
    }
    public void put(){
        this.isEmpty = false;
    }

    public boolean isEmpty(){
        return this.isEmpty;
    }
    public String toString(){
        return "L x W x D: "+ this.length+" x "+this.width+" x "+this.depth+"\nVolume: "+ this.getVolume() + "\n"+(this.isEmpty()?"Empty":"Full") + "\n";
    }


}
