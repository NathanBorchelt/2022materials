import java.util.Scanner;
public class BoxProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Box box1 = new Box(1,1,1);
        box1.put();
        System.out.println(box1);
        Box box2 = new Box(5,10,10);
        System.out.println(box2.getVolume());
        box2.put();
        System.out.println(box2.isEmpty());
        box2.take();
        System.out.println(box2);
    }

}
