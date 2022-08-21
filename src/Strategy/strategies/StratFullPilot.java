package Strategy.strategies;
import Strategy.Pilot;
import Strategy.Strategy;

public class StratFullPilot implements Strategy {

    @Override
    public String execute(Pilot pilot, int actualPosition) {
        return "Pilot: " + pilot.getName() + "\n"
                + "Team: " + pilot.getTeam() + "\n"
                + "Actual position: " + actualPosition;
    }
}
