/*

Enclosed Numbers: 
used to show that the spot has been selected and show the near by bombs

U+24EA = 0
U+2460 = 1
U+2461 = 2
U+2462 = 3
U+2463 = 4
U+2464 = 5
U+2465 = 6
U+2466 = 7
U+2467 = 8 

U+25A2 = untouched square
U+2691 = Flag

*/
public class PlaySpot {
    private char visualSymbol;
    private byte surrounding;
    private int xCord;
    private int yCord;
    public PlaySpot(){
        visualSymbol = (char) Conversion.hexToInt("2593");
    }

    public void setSymbol(int newSymbol){
        visualSymbol = (char) newSymbol;
    }

    public void bombSurrounds(){
        surrounding++;
    }   

    public String toString(){
        return Character.toString(visualSymbol);
    }

    public int getxCord() {
        return xCord;
    }
    public int getyCord() {
        return yCord;
    }

    public void selectedSpace(){
        if( this instanceof Bomb){
            System.out.println("Game Over");
        }
        else{
            visualSymbol = (char)((Empty) this).showSymbol();
        }
    }
    public byte getSurrounding() {
        return surrounding;
    }
}
