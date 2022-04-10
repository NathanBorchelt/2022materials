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

//scrapper code from https://www.geeksforgeeks.org/download-web-page-using-java/
import java.net.URL;
import java.net.MalformedURLException;

public class CookieClicker {
    public static void main(String[] args)throws IOException, AWTException, InterruptedException, URISyntaxException{

        //screen size info
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int sWidth = (int) screenSize.getWidth();
        int sHeight = (int) screenSize.getHeight();

        Robot bot = new Robot();

        String website = "https://orteil.dashnet.org/cookieclicker/";


        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            Desktop.getDesktop().browse(new URI(website));
        }

        System.out.println("5 second sleep to assure page is open and loaded");
        int cookieX = (int) (sWidth * 0.16);
        int cookieY = (int) (sHeight * 0.5);
        Thread.sleep(5000);
        for(int i = 0; i <1000; i++){
            bot.mouseMove(cookieX, cookieY);
            bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(20);
            bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            System.out.println("Click #" + (i+1));
        }





    }
}
