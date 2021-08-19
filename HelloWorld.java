public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("\nHello World!\n");
        System.out.println("Hello There.");
        System.out.println("Ahh... General Kenobi");
        for(byte i = 0; i < Byte.MAX_VALUE;i++){
            System.out.print(i+Character.toString(i));
        }
    }
}
