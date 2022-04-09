import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;

//scrapper code from https://www.geeksforgeeks.org/download-web-page-using-java/
import java.net.URL;
import java.net.MalformedURLException;

public class CookieClicker {
    public static void main(String[] args)throws IOException, AWTException, InterruptedException, URISyntaxException{

        //screen size info
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int sWidth = screenSize.getWidth();
        int sHeight = screenSize.getHeight();

        Robot bot = new Robot();

        String website = "https://orteil.dashnet.org/cookieclicker/";

        URL url = new URL(website);

        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            Desktop.getDesktop().browse(new URI(website));
        }

        //https://www.tutorialspoint.com/how-to-read-the-contents-of-a-webpage-into-a-string-in-java
        Scanner sc = new Scanner(url.openStream());

        while




    }
}
