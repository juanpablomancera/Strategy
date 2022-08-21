package Strategy;

import Strategy.strategies.StratFullPilot;
import Strategy.strategies.StratPilotName;

public class Context {
    public final static int ONLY_NAME = 1;
    public final static int FULL_PILOT = 2;
    Strategy strategy;

    public Context(){
        strategy = new StratPilotName();
    }

    public void setStrategy(int strategyType){
        switch(strategyType){
            case ONLY_NAME:
                strategy = new StratPilotName();
                break;
            case FULL_PILOT:
                strategy = new StratFullPilot();
                break;
        }
    }

    public String printPilot(Pilot pilot, int position){
        return strategy.execute(pilot, position);
    }
}
