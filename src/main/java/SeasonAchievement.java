
import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class SeasonAchievement {

    @XmlAttribute(name = "year")
    private int year;
    @XmlAttribute(name = "team")
    private String team;

    @XmlElement(name = "achievement")
    private List<Achievement> achievements = new ArrayList<>();

    public SeasonAchievement(int year, String team) {
        this.year = year;
        this.team = team;
    }

    public SeasonAchievement() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public List<Achievement> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<Achievement> achievements) {
        this.achievements = achievements;
    }

    public String writeAchievements() {
        StringBuilder sb = new StringBuilder();
        sb.append("\t\t" + "Season " + year + ", " + team + "\n");
        for (Achievement achievement : achievements) {
            sb.append(achievement.toString() + "\n");
        }
        return sb.toString();
    }

}
