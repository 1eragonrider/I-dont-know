package OrganizationObjects.PlayerAttachedClasses;

public class Stats {
    
    // Player Attributes
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    // Setters and getters

    public int getStrength() {return strength;};
    public int getDexterity() {return dexterity;};
    public int getConstitution() {return constitution;};
    public int getIntelligence() {return intelligence;};
    public int getWisdom() {return wisdom;};
    public int getCharisma() {return charisma;};

    public void setStrength(int statPar) {strength = statPar;}
    public void setDexterity(int statPar) {dexterity = statPar;}
    public void setConstitution(int statPar) {constitution = statPar;}
    public void setIntelligence(int statPar) {intelligence = statPar;}
    public void setWisdom(int statPar) {wisdom = statPar;}
    public void setCharisma(int statPar) {charisma = statPar;}

    // Constructors
    Stats(int strPar, int dexPar, int conPar, int intPar, int wisPar, int chaPar) {
        setStrength(strPar);
        setDexterity(dexPar);
        setConstitution(conPar);
        setIntelligence(intPar);
        setWisdom(wisPar);
        setCharisma(chaPar);
    }


}
