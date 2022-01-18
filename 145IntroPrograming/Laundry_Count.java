public class Laundry_Count {
    public static void main(String[] args) {
        int total = 0;
        int weeks = 0;
        while(total<64){
            total+=2;
            if ((int)(weeks/2)==weeks/2){
                total++;
            }
            weeks++;
        }
        System.out.println(weeks);
    }
}
