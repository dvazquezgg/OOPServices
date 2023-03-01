package data;

import com.opencsv.CSVReader;
import model.AuthCredentials;
import model.Person;
import util.IBIO;

import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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

    public static ArrayList<Person> readPersonFile(String filename, boolean log){
        ArrayList<Person> data = new ArrayList<Person>(); // Create an empty ArrayList of Person objects
        CSVReader reader = null;
        try {
            //parsing a CSV file into CSVReader class constructor
            reader = new CSVReader(new FileReader(filename));
            String[] nextLine;   // {"Bess","Erickson","lazsi@egzet.gm","Male","2/26/1991"};
                                 // Create a String array to hold the data from the CSV file
            //reads one line at a time
            int row = 0;
            while ((nextLine = reader.readNext()) != null) {
                if(row == 0){
                    row++;
                    continue;
                }
                if (log){
                    for (String token: nextLine) {
                        System.out.print(token + " ");
                    }
                    System.out.print("\n");
                }
                // Convert the String[] into a Person object
                String name = nextLine[0];
                String surname = nextLine[1];
                String email = nextLine[2];
                String gender = nextLine[3];
                String dateOfBirth = nextLine[4];
                SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
                Date date = formatter.parse(dateOfBirth);
                // int, double, boolean, char, String, Date, etc.
                // Integer.parseInt(), Double.parseDouble(), Boolean.parseBoolean(), etc.
                Person person = new Person(name, surname, email, gender, date);
                data.add(person);


            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return data;
    }


    public static ArrayList<AuthCredentials> readCredentials(String filename, boolean log){
        ArrayList<AuthCredentials> data = new ArrayList<AuthCredentials>(); // Create an empty ArrayList of Person objects
        CSVReader reader = null;
        try {
            //parsing a CSV file into CSVReader class constructor
            reader = new CSVReader(new FileReader(filename));
            String[] nextLine;   // {"Bess","Erickson","lazsi@egzet.gm","Male","2/26/1991"};
            // Create a String array to hold the data from the CSV file
            //reads one line at a time
            int row = 0;
            while ((nextLine = reader.readNext()) != null) {
                if(row == 0){
                    row++;
                    continue;
                }
                if (log){
                    for (String token: nextLine) {
                        System.out.print(token + " ");
                    }
                    System.out.print("\n");
                }
                // Convert the String[] into a Person object
                int id = Integer.parseInt(nextLine[0]);
                String email = nextLine[1];
                String username = nextLine[2];
                String password = nextLine[3];
                String regDate = nextLine[4];
                SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
                Date date = formatter.parse(regDate);
                // int, double, boolean, char, String, Date, etc.
                // Integer.parseInt(), Double.parseDouble(), Boolean.parseBoolean(), etc.
                AuthCredentials person = new AuthCredentials(id, username,password, email, date);
                data.add(person);

            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}
