public class Human {
    private String Id, Name, BirthDay, PhoneNumber, Email;
   private static int count = 0;

    public Human() {
        this.Id = "";
        this.Name = "";
        this.BirthDay = "";
        this.PhoneNumber = "";
        this.Email = "";
    }
    
    public Human(Human other) {
        this.Id = other.Id;
        this.Name = other.Name;
        this.BirthDay = other.BirthDay;
        this.PhoneNumber = other.PhoneNumber;
        this.Email = other.Email;
    }


    public Human(String Name, String BirthDay, String PhoneNumber, String Email) {
        count++;
        this.Id = String.format("%d", count);
        this.Name = Name;
        this.BirthDay = BirthDay;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
    }
    

    public Human(String Id, String Name, String BirthDay, String PhoneNumber, String Email) {
        this.Id = Id;
        this.Name = Name;
        this.BirthDay = BirthDay;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
    }



    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String BirthDay) {
        this.BirthDay = BirthDay;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public void chuanHoaTenVaNgaySinh() {
        //Chuan hoa ten
        StringBuilder tmpName = new StringBuilder();
        String[] WordsName = this.Name.trim().toLowerCase().split("\\s+");
        
        for(String word : WordsName) {
            tmpName.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");
        }
        this.Name = tmpName.toString().trim();
        
        //Chuan hoa ngay sinh
        StringBuilder tmpBirth = new StringBuilder(this.BirthDay);
        if(tmpBirth.charAt(1) == '/') tmpBirth.insert(0, 0);
        if(tmpBirth.charAt(4) == '/') tmpBirth.insert(3, 0);
        this.BirthDay = tmpBirth.toString();
    }
}
