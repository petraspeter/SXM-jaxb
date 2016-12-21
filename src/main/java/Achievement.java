
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
public class Achievement {
    
    @XmlAttribute(name = "type")
    private String raceType;
    @XmlValue
    private String achievement;

    public Achievement(String raceType, String achievement) {
        this.raceType = raceType;
        this.achievement = achievement;
    }

    public Achievement() {
    }
    
    public String getRaceType() {
        return raceType;
    }

    public void setRaceType(String raceType) {
        this.raceType = raceType;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    @Override
    public String toString() {
        return "\t\t\t\t"+raceType + " achievement: " + achievement;
    }
    
}
