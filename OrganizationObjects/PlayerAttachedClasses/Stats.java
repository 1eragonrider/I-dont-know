package OrganizationObjects.PlayerAttachedClasses;

public class Stats {
    // Player Stats list
    private int health;
    private int goldPieces;
    private int silverPieces;
    private int copperPieces;

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    private int strengthModifier;
    private int dexterityModifier;
    private int constitutionModifier;
    private int intelligenceModifier;
    private int wisdomModifier;
    private int charismaModifier;

    // Copy constructor to make copying stats easier
    public Stats(Stats copyStats) {
        this(copyStats.health, copyStats.goldPieces, copyStats.silverPieces, copyStats.copperPieces, 
        copyStats.strength, copyStats.strengthModifier, copyStats.dexterity, copyStats.dexterityModifier, 
        copyStats.constitution, copyStats.constitutionModifier, copyStats.intelligence, copyStats.intelligenceModifier, 
        copyStats.wisdom, copyStats.wisdomModifier, copyStats.charisma, copyStats.charismaModifier);
    }

    // This part sucks, but it's necessary in POD classes
    public Stats(int hpPar, int gpPar, int spPar, int cpPar, 
                int strPar, int dexPar, int conPar, int intPar, int wisPar, int chaPar,
                int strModPar, int dexModPar, int conModPar, int intModPar, int wisModPar, int chaModpar) {

        this.health = hpPar;
        this.goldPieces = gpPar;
        this.silverPieces = spPar;
        this.copperPieces = cpPar;
        
        this.strength = strPar;
        this.strengthModifier = strModPar;
        this.dexterity = dexPar;
        this.dexterityModifier = dexModPar;
        this.constitution = conPar;
        this.constitutionModifier = conModPar;
        this.intelligence = intPar;
        this.intelligenceModifier = intModPar;
        this.wisdom = wisPar;
        this.wisdomModifier = wisModPar;
        this.charisma = chaPar;
        this.charismaModifier = chaModpar;
    }
}
