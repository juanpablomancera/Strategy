package Strategy.strategies;
import Strategy.Pilot;
import Strategy.Strategy;

public class StratPilotName implements Strategy {

    @Override
    public String execute(Pilot pilot, int actualPosition) {
        return pilot.getName();
    }
}
