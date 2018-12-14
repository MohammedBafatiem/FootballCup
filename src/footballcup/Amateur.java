package footballcup;

public class Amateur extends Teams {

    public final String teamsLevel = "Amateur";

    public Amateur(String name) {
        this.setName(name);
        this.setTeamsCategory(teamsLevel);

    }
}
