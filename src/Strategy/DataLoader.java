package Strategy;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class DataLoader {
    private final static char SEMICOLON = ';';
    String dir = System.getProperty("user.dir");
    BufferedReader csvReader = null;

    public PilotsRanking openCSV(){
        try {
            PilotsRanking ranking = new PilotsRanking();
            csvReader = new BufferedReader(new FileReader(dir + File.separator + "pilots.csv"));

            String line = csvReader.readLine();

            while (null != line) {

                String[] data = line.split(String.valueOf(SEMICOLON));
                ranking.addNewPilot(new Pilot(data[1],data[2]),Integer.valueOf(data[0]));

                line = csvReader.readLine();

            }return ranking;

        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;}

}
