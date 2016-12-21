
import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "UCIRoad")
public class UCIRoad {
    
    @XmlAttribute
    private String category;
    @XmlAttribute(name = "actualSeason")
    private int actualSeasosn;
    
    @XmlElement(name = "worldTeam", type=Team.class)
    private List<Team> teams = new ArrayList<>();

    public UCIRoad() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getActualSeasosn() {
        return actualSeasosn;
    }

    public void setActualSeasosn(int actualSeasosn) {
        this.actualSeasosn = actualSeasosn;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public UCIRoad(String category, int actualSeasosn) {
        this.category = category;
        this.actualSeasosn = actualSeasosn;
    }
    
    public void writeUCIRoad() {
        StringBuilder sb = new StringBuilder();
        sb.append("Category: "+category+", season " +actualSeasosn+".\n");
        for(Team team : teams) {
            sb.append("\t"+team.writeTeam());
        }
        System.out.println(sb.toString());
    }
    
}
