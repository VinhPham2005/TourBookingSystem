import java.util.*;

public class Guide extends Human {
    private float GuideExperience;
    private ArrayList<String> ForiegnLanguage, ToursList;

    public Guide() {
        super();
        this.GuideExperience = 0.0F;
        this.ForiegnLanguage = new ArrayList<>();
        this.ToursList = new ArrayList<>();
    }

    public Guide(float GuideExperience, ArrayList<String> ForiegnLanguage, ArrayList<String> ToursList, Human other) {
        super(other);
        this.GuideExperience = GuideExperience;
        this.ForiegnLanguage = ForiegnLanguage;
        this.ToursList = ToursList;
    }

    public Guide(float GuideExperience, ArrayList<String> ForiegnLanguage, ArrayList<String> ToursList, String Id, String Name, String BirthDay, String PhoneNumber, String Email) {
        super(Id, Name, BirthDay, PhoneNumber, Email);
        this.GuideExperience = GuideExperience;
        this.ForiegnLanguage = ForiegnLanguage;
        this.ToursList = ToursList;
    }

    public float getGuideExperience() {
        return GuideExperience;
    }

    public void setGuideExperience(float GuideExperience) {
        this.GuideExperience = GuideExperience;
    }

    public ArrayList<String> getForiegnLanguage() {
        return ForiegnLanguage;
    }

    public void setForiegnLanguage(ArrayList<String> ForiegnLanguage) {
        this.ForiegnLanguage = ForiegnLanguage;
    }

    public ArrayList<String> getToursList() {
        return ToursList;
    }

    public void setToursList(ArrayList<String> ToursList) {
        this.ToursList = ToursList;
    }
}
