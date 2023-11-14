import eduni.distributions.*;
import java.io.*;

public class Main {
    private static final int N = 10000;
    private static final String FILENAME = "rand.csv";

    private static String toEuropianString(double value) {
        return (Double.toString(value).replace(".", ","));
    }

    private static void writeCSV(String filename, double values[]) {
        try (Writer writer = new FileWriter(filename);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            for (int i = 0; i < values.length; i++) {
                bufferedWriter.write((i+1) + ";" + toEuropianString(values[i])); bufferedWriter.newLine();  // Write a new line
            }

            // It is important to flush or close the writer to ensure the data is written to the file
            bufferedWriter.flush();
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Close the file");
        }
    }
    public static void main(String args[]) {
        Negexp source = new Negexp(0.1);    // 1 Customer / 10 minutes
        double[] val = new double[N];

        for (int i=0; i<val.length; i++) {
            //System.out.println("sample "+i+"=" + source.sample());
            val[i] = source.sample();
        }

        writeCSV(FILENAME, val);
    }
}
