
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Cvs_reader {
    public static List<String> read_transaction_file(String filename)  {
        try{
            List<String> cvs_text = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                cvs_text.add(line);
            }
            reader.close();
            return cvs_text;
        }catch (IOException e) {
            System.out.println("!!exception class!!");
        }
        return List.of();
    }





}
