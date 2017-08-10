package java_employee_test;

/**
 * Created by taemi on 2017-08-10.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

private class test{

}

public class PrintFile {

    public static void main(String[] argv) {

        try {
            new PrintFile().print("/tmp/log");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void print(String filePath) throws IOException {

        File inputFile = new File(filePath);
        InputStream inputStream = new FileInputStream(inputFile);

        try {
            while (inputStream.available() > 0) {
                System.out.print((char) inputStream.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            inputStream.close();
        }

    }
}
