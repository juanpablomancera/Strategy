package Strategy;

public class Pilot {
    String name, team;
    int startingPosition;

    public Pilot(String name, String team){
        this.name = name;
        this.team = team;
        startingPosition = -1;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public void setStartingPosition(int startingPosition) {
        this.startingPosition = startingPosition;
    }

}
