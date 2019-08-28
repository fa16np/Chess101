package Model;


public class Knight implements Piece {
    public final static PiecePoints killwill = PiecePoints.KNIGHT;
    private String intialPos = "";
    private String currentPos = "";
    public Team team = null;

    public String getName(){
        String t = team.getName().toString();
        return t.charAt(0)+"" + t.charAt(2)  + "-Knight";
    }
    public PiecePoints getKillwill(){
        return killwill;
    }
    public Knight(Team team){
        this.team = team;
    }

    @Override
    public String getIntialPos() { return intialPos; }


    @Override
    public String getCurrentPos() {
        return currentPos;
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
