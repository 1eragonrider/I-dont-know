package AnimateObjects;

public class NPC extends Character {
    // attributes
    private boolean isBeingInteractedWith;
    // setters and getters
    public boolean getIsBeingInteractedWith() {return isBeingInteractedWith;}
    public void setIsBeingInteractedWith(boolean isBeingInteractedWithPar) {isBeingInteractedWith = isBeingInteractedWithPar;}
    // private methods

    // public methods
    public String Dialogue(String DialogueOption) {
        String output;
        switch (DialogueOption) {
            case "Greeting":
                return  
        }
        return output;
    }
}