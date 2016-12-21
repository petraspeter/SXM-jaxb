
import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Team {
    
    @XmlAttribute
    private String teamName;
    
    @XmlElement(name = "rider", type = Rider.class)
    private List<Rider> riders = new ArrayList<>();

    public Team() {
    }
    

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<Rider> getRiders() {
        return riders;
    }

    public void setRiders(List<Rider> riders) {
        this.riders = riders;
    }

    public Team(String teamName) {
        this.teamName = teamName;
    }
    
    public String writeTeam() {
        StringBuilder sb = new StringBuilder();
        sb.append(teamName+": \n");
        for(Rider rider : riders) {
            sb.append(rider.writeRider());
        }
        return sb.toString();
    }
    
}
