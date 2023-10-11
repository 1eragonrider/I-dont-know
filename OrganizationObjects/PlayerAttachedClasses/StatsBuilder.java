package OrganizationObjects.PlayerAttachedClasses;

public class StatsBuilder {

    // This class uses the Builder Pattern design 
    // https://codereview.stackexchange.com/questions/212802/player-class-for-rpg-dnd-type-game/212805#212805
    
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

    // private methods
    private int CalculateModifier(int baseStatPar) {
        return (baseStatPar - 10) / 2;
    }

    // Builders

    private StatsBuilder setHealth(int hpPar) {
        this.health = hpPar;
        return this;
    }

     private StatsBuilder setGP(int gpPar) {
        this.goldPieces = gpPar;
        return this;
    }

     private StatsBuilder setSP(int spPar) {
        this.silverPieces = spPar;
        return this;
    }

     private StatsBuilder setCP(int cpPar) {
        this.copperPieces = cpPar;
        return this;
    }

    public StatsBuilder setStrength(int strPar) {
        this.strength = strPar;
        this.strengthModifier = CalculateModifier(strPar);
        return this;
    }

    public StatsBuilder setDexterity(int dexPar) {
        this.strength = dexPar;
        this.strengthModifier = CalculateModifier(dexPar);
        return this;
    }

    public StatsBuilder setConstitution(int conPar) {
        this.strength = conPar;
        this.strengthModifier = CalculateModifier(conPar);
        return this;
    }

    public StatsBuilder setIntelligence(int intPar) {
        this.strength = intPar;
        this.strengthModifier = CalculateModifier(intPar);
        return this;
    }

    public StatsBuilder setWisdom(int wisPar) {
        this.strength = wisPar;
        this.strengthModifier = CalculateModifier(wisPar);
        return this;
    }

    public StatsBuilder setCharisma(int chaPar) {
        this.strength = chaPar;
        this.strengthModifier = CalculateModifier(chaPar);
        return this;
    }

    public Stats build() {
        return new Stats(health, goldPieces, silverPieces, copperPieces, 
        strength, dexterity, constitution, intelligence, wisdom, charisma,
        strengthModifier, dexterityModifier, constitutionModifier, 
        intelligenceModifier, wisdomModifier, charismaModifier);
    }

}
