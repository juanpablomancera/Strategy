package Strategy;

import java.util.ArrayList;

public class PilotsRanking {
    ArrayList<Pilot> pilots;
    Context context;

    public PilotsRanking(){

        pilots = new ArrayList<>();
        context = new Context();
    }

    public void addNewPilot(Pilot pilot, int startingPostion) {
        pilot.setStartingPosition(startingPostion);
        pilots.add(pilot);
    }

    public void setStrategy(int strategy){
        context.setStrategy(strategy);
    }

    @Override
    public String toString() {
        String string = "";
        for (int i = 0; i < pilots.size(); i++) {
            string += context.printPilot(pilots.get(i),i) + "\n";
        }
        return string;
    }
}
