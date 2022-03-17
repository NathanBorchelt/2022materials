public class CustomColor extends Color{

    /**
     *Creates an opaque CustomColor color
     */
    public CustomColor(){
        super(Random.nextInt(255), Random.nextInt(255), Random.nextInt(255));
    }

    /**
     *
     * {@inheritDoc}
     */
    public CustomColor(float r, float g, float b){
        super(r,g,b);
    }


    /**
     *
     * {@inheritDoc}
     */
    public CustomColor(float r, float g, float b, float a){
        super(r,g,b,a);
    }


    /**
     *
     * {@inheritDoc}
     */
    public CustomColor(int rgb){
        super(rgb);
    }

    /**
     *
     * {@inheritDoc}
     */
    public CustomColor(int rgba, boolean hasAlpha){
        super(rgba, hasAlpha);
    }

    /**
     *
     * {@inheritDoc}
     */
    public CustomColor(int r, int g, int b){
        super(r,g,b);
    }


    /**
     *
     * {@inheritDoc}
     */
    public CustomColor(int r, int g, int b, int a){
        super(r, g,b,a);
    }

    /**
     *
     * @param hexCodeRGBA Creates a CustomColor using Hexadecimal input with an alpha channel
     * @param hasAlpha if the alpha channel is used, if false defaults to "FF"/255
     */
    public CustomColor(String hexCodeRGBA, boolean hasAlpha){
        super(Integer.parseInt(hexCodeRGBA,16),hasAlpha);
    }

    /**
     *
     * @param hexCodeRGB Creates an opaque CustomColor using Hexadecimal input
     */
    public CustomColor(String hexCodeRGB){
        super(Integer.parseInt(hexCodeRGB,16),false);
    }



    /**
     *This will take 1, 2, 3, 4, 6 character length string to create a string that
     *is 8 characters long, usable with the constructors that take the value as a string
     * @param hexCode
     * @return String as an 8 character hex string valued as RRGGBBAA (No pound sign)
     */
    public static String hexConversion(String hexCode){
        if(hexCode.contains('#'))
            hexCode = hexCode.substring(1);
        String outString = "";
        byte hexLen = hexCode.length();
        if (hexLen == 1){
            for (int i = 0; i < 3; i++) {
                outString += hexCode + hexCode;
            }
            outString+= "FF";
            return outString;
        }
        else if(hexLen == 2){
            for (int i = 0; i < 3; i++) {
                outString += hexCode.charAt(0) + hexCode.charAt(0);
            }
            outString += hexCode.charAt(1) + hexCode.charAt(1);
            return outString;
        }
        else if(hexLen == 3){
            for (int i = 0; i < 3; i++) {
                outString += hexCode.charAt(i) + hexCode.charAt(i);
            }
            outString +="FF";
            return outString;
        }

        else if(hexLen == 4){
            for (int i = 0; i < 4; i++) {
                outString += hexCode.charAt(i) + hexCode.charAt(i);
            }
            return outString;
        }
        else if(hexLen == 6){
            return hexCode+"FF";
        }
        else{
            throw new RuntimeException("Invalid Input Size for Conversion");
        }



    }
}
