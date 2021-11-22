public class Empty extends PlaySpot {

/*
    U+24EA = 0
    U+2460 = 1
    U+2461 = 2
    U+2462 = 3
    U+2463 = 4
    U+2464 = 5
    U+2465 = 6
    U+2466 = 7
    U+2467 = 8 
    
*/
    public Empty() {
        super();
    }

    public int showSymbol(){

        switch(super.getSurrounding()){
            case 0:
                return Conversion.hexToInt("24EA");
            case 1:
                return Conversion.hexToInt("2460");
            case 2:
                return Conversion.hexToInt("2461");
            case 3:
                return Conversion.hexToInt("2462");
            case 4:
                return Conversion.hexToInt("2463");
            case 5:
                return Conversion.hexToInt("2464");
            case 6:
                return Conversion.hexToInt("2465");
            case 7:
                return Conversion.hexToInt("2466");
            case 8:
                return Conversion.hexToInt("2467");
            default:
                return -1;

        }
    }

}
