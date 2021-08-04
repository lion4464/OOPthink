package max_long;

import java.math.BigDecimal;

public class Max_long {
    public static void main(String[] args) {
        BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE);
        long start = (long) Math.sqrt(Long.MAX_VALUE);
        BigDecimal n = new BigDecimal(start);

        for(int count=0;count<10;count++) {
            BigDecimal squared = n.multiply(n);
            if (squared.compareTo(longMaxValue) > 0) {
                System.out.println(count+": " + n + " squared = " + squared);
            }
            n = n.add(BigDecimal.ONE);
        }
    }

}
