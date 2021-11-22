import javax.xml.catalog.Catalog;

public class Conversion {

    public static void main(String[] args) {
        System.out.println(hexToInt("0x2592"));
    }
    public static int hexToInt(String hexValue){
        //Positive values only

        int finalInt = 0;
        byte symbolValueDeci;

        for(byte i = 0; i < hexValue.length(); i++){
            symbolValueDeci = 0;
            switch (hexValue.charAt(i)){
                case 'a':
                case 'A':
                    symbolValueDeci = 10;
                    break;
                case 'b':
                case 'B':
                    symbolValueDeci = 11;
                    break;
                case 'c':
                case 'C':
                    symbolValueDeci = 12;
                    break;
                case 'd':
                case 'D':
                    symbolValueDeci = 13;
                    break;
                case 'e':
                case 'E':
                    symbolValueDeci = 14; 
                    break;
                case 'f':
                case 'F':
                    symbolValueDeci = 15;
                    break;
                default:
                    try{
                        symbolValueDeci = Integer.valueOf(hexValue.substring(i, i+1)).byteValue();
                    }
                    catch(Exception ex){
                        //System.out.println("invalid hexidemimal value, defaulted to 0");
                        symbolValueDeci = 0;
                    }
                    break;
            }

            finalInt += (int) (symbolValueDeci * (Math.pow(16, ((hexValue.length()-1)-i))));
        }


        return finalInt;
    }
}
