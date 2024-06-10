import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Operators {
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double totalTipUnrounded = 0.0;
        double totalTaxUnrounded = 0.0;
        double totalTipRounded;
        double totalTaxRounded;
        double totalMealCost;

        if (tip_percent > 0) totalTipUnrounded = meal_cost * ((double) tip_percent / 100);
            // the numerator needs to be cast to double to prevent lossy conversion

        if (tax_percent > 0) totalTaxUnrounded = meal_cost * ((double) tax_percent / 100);


        totalTipRounded = roundToTheNearestInteger(totalTipUnrounded, 2);
        totalTaxRounded = roundToTheNearestInteger(totalTaxUnrounded, 2);
        totalMealCost = meal_cost + totalTipRounded + totalTaxRounded;

        long roundedMealCost = Math.round(totalMealCost);
        System.out.println(roundedMealCost);

    }

    private static double roundToTheNearestInteger(double num, int precision) {
         /* the method has to be static because
        non-static methods cannot be referenced from a static context */

        BigDecimal bigDecimal = new BigDecimal(Double.toString(num));
        BigDecimal roundedBigDecimal = bigDecimal.setScale(precision, RoundingMode.HALF_UP);
        return roundedBigDecimal.doubleValue();
    }
}

    class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            /*
            > System.in is an InputStream object that represents the standard input stream, typically the keyboard.
            > InputStreamReader is a bridge from byte streams to character streams.
              It reads bytes and decodes them into characters using a specified charset handling different character encodings.

            > BufferedReader reads text from a character input stream, buffering characters to provide efficient reading of characters, arrays, and lines.
              By wrapping the InputStreamReader in a BufferedReader, you can efficiently read input line by line or character by character.

            > Combining Them
              new InputStreamReader(System.in) creates an InputStreamReader that reads from the standard input stream.
              new BufferedReader(new InputStreamReader(System.in)) then wraps this InputStreamReader in a BufferedReader, allowing for efficient reading.

            > Using BufferedReader improves efficiency, especially when reading large amounts of data,
              because it reduces the number of I/O operations by buffering input.


            */

            double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

            int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

            int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

            Operators.solve(meal_cost, tip_percent, tax_percent);

            bufferedReader.close();
        }
    }
