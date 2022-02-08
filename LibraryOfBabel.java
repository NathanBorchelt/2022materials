import java.math.BigInteger;

public class LibraryOfBabel {
    public static void main(String[] args) {
        BigInteger bableCheck = new BigInteger("4");
        bableCheck = bableCheck.multiply(new BigInteger("5"));
        BigInteger combosPerPage = new BigInteger("29");
        combosPerPage = combosPerPage.pow(3200);
        bableCheck = bableCheck.multiply(combosPerPage);
        System.out.println(bableCheck);
    }
}
