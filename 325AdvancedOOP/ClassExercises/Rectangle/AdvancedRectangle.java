public class AdvancedRectangle extends Rectangle {
    private double x;
    private double y;

    public AdvancedRectangle(double x, double y, double length, double width){
        super(length,width);
        this.x = x;
        this.y = y;
    }

    public String calcCorners(){
        String outString = "";
        outString += ("P1: ("+x+","+y+")\n");
        outString += ("P2:("+(x-super.getLength())+","+y+")\n");
        outString += ("P3: ("+(x-super.getLength())+","+(y-super.getWidth())+")\n");
        outString += ("P4: ("+x+","+(y-super.getWidth())+")");
        return outString;
    }
}
