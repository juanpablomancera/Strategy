package Strategy;

public class Main {
    public static void main(String []args){
        DataLoader dataLoader = new DataLoader();
        PilotsRanking pilotsRanking = dataLoader.openCSV();

        pilotsRanking.setStrategy(Context.FULL_PILOT);
        System.out.println(pilotsRanking);

        pilotsRanking.setStrategy(Context.ONLY_NAME);
        System.out.println(pilotsRanking);
    }
}
