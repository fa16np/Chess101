package Model.Pieces;

import Model.PiecePoints;
import Model.Teams.Team;

public class Queen implements Piece {
    public final static PiecePoints killwill = PiecePoints.QUEEN;
    private String intialPos = "";
    private String currentPos = "";
    public Team team = null;

    public String getName(){
        String t = team.getName().toString();
        return t.charAt(0)+"" + t.charAt(2)  + " -Queen";
    }

    public PiecePoints getKillwill(){
        return killwill;
    }
    public Queen(Team team){
        this.team = team;
    }

    @Override
    public int[] getIntialPos() { int temp[] = new int[2];
        temp[0] = (int) currentPos.toCharArray()[0];
        temp[1] = 65 - ((int) currentPos.toCharArray()[1]);
        return temp; }


    @Override
    public String getCurrentPos() {
       return currentPos;
    }
    @Override
    public void setIntialPos(int i, int j) {
        this.intialPos = (char) (i+1)+ ""+ (char)(j+65);
    }

    @Override
    public void setCurrentPos(String currentPos) {
        this.currentPos = currentPos;
    }

    @Override
    public Team getTeam() {
        return team;
    }

    @Override
    public int getPoints() {
        return killwill.getValue();
    }

}
