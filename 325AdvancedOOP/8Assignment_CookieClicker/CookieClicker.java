import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;

public class CookieClicker {
    public static void main(String[] args)throws IOException, AWTException, InterruptedException, URISyntaxException{

        Robot bot = new Robot();

        String website = "https://orteil.dashnet.org/cookieclicker/";

        String[] browsers = {"firefox","chrome","iexplore"};

        Runtime run;

        boolean appRunning = false;

        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            Desktop.getDesktop().browse(new URI(website));
        }



    }
}
