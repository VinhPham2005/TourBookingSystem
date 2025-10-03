import java.util.*;

public class Guide extends Human {
    private float GuideExperience;
    private ArrayList<String> ForeignLanguage, ToursList;
    private static Map<String, Guide> GuideList = new HashMap<>();
    
    public static void add(Guide guide) {
        GuideList.put(guide.getId(), guide);
    }
    
    public Guide() {
        super();
        this.GuideExperience = 0.0F;
        this.ForeignLanguage = new ArrayList<>();
        this.ToursList = new ArrayList<>();
    }

    public Guide(String Id, String Name, String BirthDay, String PhoneNumber, String Email, float GuideExperience, ArrayList<String> ForeignLanguage, ArrayList<String> ToursList) {
        super(Id, Name, BirthDay, PhoneNumber, Email);
        this.GuideExperience = GuideExperience;
        this.ForeignLanguage = ForeignLanguage;
        this.ToursList = ToursList;
    }

    public float getGuideExperience() {
        return GuideExperience;
    }

    public void setGuideExperience(float GuideExperience) {
        this.GuideExperience = GuideExperience;
    }

    public ArrayList<String> getForeignLanguage() {
        return ForeignLanguage;
    }

    public void setForeignLanguage(ArrayList<String> ForeignLanguage) {
        this.ForeignLanguage = ForeignLanguage;
    }

    public ArrayList<String> getToursList() {
        return ToursList;
    }

    public void setToursList(ArrayList<String> ToursList) {
        this.ToursList = ToursList;
    }
    
    public String getForeignLanguageAsString() {
        StringBuilder Langs = new StringBuilder();
        for(String lang : this.ForeignLanguage) {
            Langs.append(lang).append(" ");
        }
        return Langs.toString().trim();
    }
    
    public String getToursListAsString() {
        StringBuilder Tours = new StringBuilder();
        for(String tour : this.ToursList) {
            Tours.append(tour).append(" ");
        }
        return Tours.toString().trim();
    }
    
    public static Guide findById (String id) {
        return GuideList.get(id);
    }
    
    @Override 
    public String toString() {
        return 
        "  Id: " + this.getId() + "\n" +
        "  Name: " + this.getName() + "\n" +
        "  BirthDay: " + this.getBirthDay() + "\n" +
        "  Phone: " + this.getPhoneNumber() + "\n" +
        "  Email: " + this.getEmail() + "\n" +
        "  Experience: " + this.getGuideExperience() + " years\n" +
        "  Languages: " + this.getForeignLanguageAsString() + "\n" +
        "  Tours: " + this.getToursListAsString() + "\n\n";
    }
}
