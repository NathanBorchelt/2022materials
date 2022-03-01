import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileReaderDemo {
 public static void main(String[] args) {
  BufferedReader objReader = null;
  try {
   String strCurrentLine;
   objReader = new BufferedReader(new FileReader("S:\\fun.txt"));
   while ((strCurrentLine = objReader.readLine()) != null) {
    System.out.println(strCurrentLine);
   }
  } catch (IOException e) {
   e.printStackTrace();
  } finally {
   try {
    if (objReader != null)
     objReader.close();
   } catch (IOException ex) {
    ex.printStackTrace();
   }
  }
 }
}
