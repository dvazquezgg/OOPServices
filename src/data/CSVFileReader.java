package data;

import com.opencsv.CSVReader;
import util.IBIO;

import java.io.FileReader;
import java.util.ArrayList;

public class CSVFileReader{

    public static ArrayList<String[]> readFile(String filename, boolean log){
        ArrayList<String[]> data = new ArrayList<String[]>();
        CSVReader reader = null;
        try {
            //parsing a CSV file into CSVReader class constructor
            reader = new CSVReader(new FileReader(filename));
            String[] nextLine;
            //reads one line at a time
            while ((nextLine = reader.readNext()) != null) {
                data.add(nextLine);
                if (log){
                    for (String token: nextLine) {
                        System.out.print(token + " ");
                    }
                    System.out.print("\n");
                }
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return data;
    }

}
