
import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Rider {
    
    @XmlElement(name = "firstName")
    private String firstName;
    @XmlElement(name = "lastName")
    private String lastName;
    @XmlElement(name = "nickName")
    private String nickName;
    @XmlElement(name = "type")
    private String type;
    @XmlElement(name = "dateOfBirth")
    private String dateOfBirth;
    @XmlElement(name = "nationality")
    private String nationality;
    @XmlElement(name = "height")
    private  Height heightJaxb;
//    @XmlAttribute(name = "height/unit")
    private String heightUnit;
//    @XmlElement(name = "height")
    private double height;    
    
    @XmlElement(name = "majorAchievement")
    private List<MajorAchievement> ma = new ArrayList<>();
    
    private List<SeasonAchievement> seasonAchievements = new ArrayList<>();

    public Rider(String firstName, String lastName, String nickName, String type, String dateOfBirth, String nationality, String heightUnit, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.type = type;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.heightUnit = heightUnit;
        this.height = height;
    }

    public Rider() {
    }
    
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getNickName() {
        return nickName;
    }
    
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public String getNationality() {
        return nationality;
    }
    
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    public String getHeightUnit() {
        return heightUnit;
    }
    
    public void setHeightUnit(String heightUnit) {
        this.heightUnit = heightUnit;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public List<SeasonAchievement> getAchievements() {
        return seasonAchievements;
    }
    
    public void setAchievements(List<SeasonAchievement> achievements) {
        this.seasonAchievements = achievements;
    }
    
    public String writeRider() {
        StringBuilder sb = new StringBuilder();
        sb.append("\t\t"+firstName+" \""+nickName+"\""+" "+lastName+". Role: "+type+", date of birth: "+dateOfBirth+", nationality: "+ nationality+", height: "+heightJaxb.getHeight()+heightJaxb.getUnit()+".\n");
        for(MajorAchievement majorAchievement : ma) {            
            sb.append("\t"+majorAchievement.writeMA());
        }     
        return sb.toString();
    }
    
}
