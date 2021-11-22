public class Board{
    
    private int sizeX;
    private int sizeY;
    private PlaySpot[][] boardSpots;
    private int bombsRemaining;

    public Board(int width, int height){
        sizeX = width;
        sizeY =  height;
        boardSpots = new PlaySpot[height][width];
        bombsRemaining = 0;
    }

    public void getSurrounding(int xCord, int yCord, byte xDelta, byte yDelta){
        //use the delat, as a relative way of testing, ie: (1,1) to check the 
        //upper right corner, (-1,0) to check the spot directly to the left
        try{
            if (boardSpots[yCord+yDelta][xCord+xDelta] instanceof Bomb){
                boardSpots[yCord][xCord].bombSurrounds();
            }            
        }
        catch(Exception e){
            System.out.print("");
        }
    }

    public PlaySpot getSpot(int x , int y) {
        if((x>=0 && x < sizeX) && (y>=0 && y<sizeY)){
            return boardSpots[y][x];
        }
        return null;
        
        
    }

    public void setSpot(PlaySpot playSpot, int x, int y){
        boardSpots[y][x] = playSpot;
        if(playSpot instanceof Bomb){
            bombsRemaining++;
        }
    }
    public int getBombsRemaining() {
        return bombsRemaining;
    }

    public String toString(){
        String outString = "";

        for(int y = 0; y < sizeY; y++){
            for(int x = 0; x < sizeX; x++){
                outString+=boardSpots[y][x];
            }
            outString+="\n";
        }

        return outString;
    }
}
