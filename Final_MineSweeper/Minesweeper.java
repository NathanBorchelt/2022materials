import java.util.Random;
public class Minesweeper {
    public static Board mineField;
    public static void main(String[] args) {

        final int X_WIDTH = 8;
        final int Y_HEIGHT = 8;
        final int NUM_BOMBS = (int)((X_WIDTH*Y_HEIGHT)*.3);
        
        Random rand = new Random();
        mineField = new Board(X_WIDTH,Y_HEIGHT);

        for(int y = 0; y < Y_HEIGHT; y++){
            for(int x = 0; x < X_WIDTH; x++){
                if(rand.nextInt(10)<3 && mineField.getBombsRemaining() <= NUM_BOMBS){
                    mineField.setSpot(new Bomb(), x, y);
                }
                else{
                    mineField.setSpot(new Empty(), x, y);
                }
            }
        }

        for(int y = 0; y < Y_HEIGHT; y++){
            for(int x = 0; x < X_WIDTH; x++){
                for(byte deltaX = -1; deltaX < 2; deltaX++){
                    for(byte deltaY = -1; deltaY < 2; deltaY++){
                        mineField.getSurrounding(x, y, deltaX, deltaY);
                    }
                }
            }
        }
        

        for(int y = 0; y < Y_HEIGHT; y++){
            for(int x = 0; x < X_WIDTH; x++){
                if(mineField.getSpot(x, y) instanceof Bomb)
                    System.out.println("Bomb: "+ x + ","+y);
            }
        }

        for(int y = 0; y < Y_HEIGHT; y++){
            for(int x = 0; x < X_WIDTH; x++){
                if(mineField.getSpot(x, y) instanceof Empty)
                    System.out.println("Empty: "+ x + ","+y);
                    mineField.getSpot(x, y).setSymbol(mineField.getSpot(x, y).getSurrounding());
            }
        }

        System.out.println(mineField);


    }

    public void bombSurrounds(PlaySpot spot){
        if( spot instanceof Empty ){
            for(byte y = -1; y < 2; y++){
                for(byte x = -1; x < 2; x++){
                    mineField.getSurrounding(spot.getxCord(), spot.getyCord(), x, y);
                }
            }
        }
    }
}
