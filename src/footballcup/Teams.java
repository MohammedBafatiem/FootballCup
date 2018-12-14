package footballcup;

public  abstract class  Teams {
    private String name;
    private String teamsCategory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamsCategory() {
        return teamsCategory;
    }

    public void setTeamsCategory(String teamsCategory) {
        this.teamsCategory = teamsCategory;
    }
}
