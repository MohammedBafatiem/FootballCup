package footballcup;

public class Professional extends Teams {

    public final String teamLevel = "Professional";

    public Professional(String name){
        this.setName(name);
        this.setTeamsCategory(teamLevel);
    }

}

