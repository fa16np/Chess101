package Model;

import java.util.ArrayList;

public class TeamA extends Team {
    private ArrayList<Piece> killed = new ArrayList<Piece>();


    public ArrayList<Piece> getKilled() {
        return killed;
    }

    public void collectKilledB(Piece killed) {
        this.killed.add(killed);
    }
}
