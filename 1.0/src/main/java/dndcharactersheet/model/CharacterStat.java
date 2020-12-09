package dndcharactersheet.model;

public class CharacterStat {
    private String statName;
    private int statScore;
    public CharacterStat(String statName, int statScore){
        this.statName = statName;
        this.statScore = statScore;
    }
    public String getStatName(){
        return statName;
    }
    public int getStatScore(){
        return statScore;
    }
    
}
