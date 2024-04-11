import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AthleteManager {
    private List<Athlete> athletes;
    private Map<Integer, InstagramPost> postsMap;

    public AthleteManager() {
        this.athletes = new ArrayList<>();
        this.postsMap = new HashMap<>();
    }

    public void addAthlete(Athlete athlete) {
        athletes.add(athlete);
    }

    public void removeAthlete(Athlete athlete) {
        athletes.remove(athlete);
    }

    public List<Athlete> getAthletes() {
        return athletes;
    }

    public void updateAthleteProfile(Athlete athlete) {
        athlete.updateProfile();
    }

    public void planCampaign() {
        System.out.println("Campaign planning is in progress...");
    }
}
