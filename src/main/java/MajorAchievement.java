
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Raven
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class MajorAchievement {
    
    
    @XmlElement(name = "season")
    private List<SeasonAchievement> seasonAchievements = new ArrayList<>();

    public MajorAchievement() {
    }

    
    public List<SeasonAchievement> getSeasonAchievements() {
        return seasonAchievements;
    }

    public void setSeasonAchievements(List<SeasonAchievement> seasonAchievements) {
        this.seasonAchievements = seasonAchievements;
    }
           
    
    public String writeMA() {
        StringBuilder sb = new StringBuilder();
          for(SeasonAchievement seasonAchievementa : seasonAchievements) {            
            sb.append("\t"+seasonAchievementa.writeAchievements());
        }     
        return sb.toString();
    }
}
