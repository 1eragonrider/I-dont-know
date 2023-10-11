package AnimateObjects;

import java.util.HashMap;
import java.util.Map;
import 

public class NPC extends Character {
    // attributes
    private boolean isBeingInteractedWith;
    private String location;
    private Stats statBlock;
    private Map<String, Character> relationsMap = new HashMap<String, Character>();

    // setters and getters
    public boolean getIsBeingInteractedWith() {return isBeingInteractedWith;}
    public void setIsBeingInteractedWith(boolean isBeingInteractedWithPar) {isBeingInteractedWith = isBeingInteractedWithPar;}
    public String getLocation() {return location;}
    public void setLocation(String locationPar) {location = locationPar;}
    public String getRelation(String relationPar) {return relationsMap.get(relationPar).getName();}
    public void setRelation(String relationPar, Character characterPar) {relationsMap.put(relationPar, characterPar);}

    // constructors

    // private methods

    // public methods
    public String Dialogue(String DialogueOption) {
        String output = "";
        if (isBeingInteractedWith) {
            switch (DialogueOption) {
                case "Greeting":
                    output = "Hello Traveller, my name is " + this.getName() + ". What can I call you?";
                    break;
                case "LocationRequest":
                    output = "This is " + getLocation() +".";
                    break;
                case "RelationsRequest":
                    if (relationsMap.size() == 0) {
                        output = "I'm just by myself in the world. Sometimes it's lonely, but I get by.";
                    }
                    String toAdd = "";
                    for (Map.Entry<String, Character> element : relationsMap.entrySet()) {
                        toAdd = String.join(",", element.getValue().getName());
                    }
                    output = "I have my family and friends in town. You can go meet them. Their names are " + toAdd + ".";    
                    break; 
                default:
                    output = "I've got nothing more to say.";
            }
        }

        return output;
    }


}