public class CustomColor{

    //Creates an opaque sRGB color with the specified red, green, and blue values in the range (0.0 - 1.0).
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

    public CustomColor(String hexCodeRGBA, boolean hasAlpha){
        super(Integer.parseInt(hexCodeRGBA,16),hasAlpha);
    }

    public CustomColor(String hexCodeRGB){
        super(Integer.parseInt(hexCodeRGB,16),false);
    }



    /**
     *This will take 1, 2, 3, 4, 6 character length string to create a string that
     *is 8 characters long, usable with the constructors that take the value as a string
     * @param hexCode
     * @return String as an 8 character hex string
     */
    public static String hexConversion(String hexCode){
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
