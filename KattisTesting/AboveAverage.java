import java.util.Scanner;

public class AboveAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int loopTimes = Integer.valueOf(in.nextLine());
        double average = 0;
        int aboveAverage = 0;
        double percAboveAvg = 0;
        for (int i = 0; i < loopTimes; i++) {
            String[] gradesArr= in.nextLine().split(" ");
            average = 0;
            aboveAverage = 0;
            for (int j = 1; j<gradesArr.length; j++){
                average += Double.valueOf(gradesArr[j]);
            }
            average /= Integer.valueOf(gradesArr[0]);

            for (int j = 1; j<gradesArr.length; j++){
                if(Double.valueOf(gradesArr[j]) > average) aboveAverage++;
            }
            percAboveAvg = aboveAverage/Double.valueOf(gradesArr[0]);
            percAboveAvg *= 100000;
            percAboveAvg = Math.round(percAboveAvg);
            percAboveAvg /= 1000;

            System.out.printf("%5.3f%s",percAboveAvg,"%");

        }
    }
}
