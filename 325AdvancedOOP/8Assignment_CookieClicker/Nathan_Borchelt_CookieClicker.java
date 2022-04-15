//Borchelt cookie clicker
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.*;
import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.InputEvent;

public class Nathan_Borchelt_CookieClicker {
    public static void main(String[] args)throws IOException, AWTException, InterruptedException, URISyntaxException{

        //screen size info
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int sWidth = (int) screenSize.getWidth();
        int sHeight = (int) screenSize.getHeight();

        Robot bot = new Robot();

        String website = "https://orteil.dashnet.org/cookieclicker/";


        //https://stackoverflow.com/a/5226244
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            Desktop.getDesktop().browse(new URI(website));
        }
        else{
            System.out.println("No web browser to use");
            System.exit(0);
        }

        System.out.println("15 second sleep to assure page is open and loaded");
        //what seem to be constant coordinates considering cookie clicker is built of divs with percentages
        int cookieX = (int) (sWidth * 0.16);
        int cookieY = (int) (sHeight * 0.5);
        Thread.sleep(15000);
        for(int i = 0; i <1000; i++){
            bot.mouseMove(cookieX, cookieY);
            bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            //14 ms has been the fastest i can run it, 15 allows for variation due to other task
            Thread.sleep(15);
            bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            //5ms delay to assure release of mouse
            Thread.sleep(5);
            System.out.println("Click #" + (i+1));
        }





    }
}
