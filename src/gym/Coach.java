package gym;

public class Coach {
    private String surname;
    private String name;
    private String middleName;

    public Coach(String surname, String name, String middleName) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
    }

    public String getSurname() { return surname; }
    public String getName() { return name; }
    public String getMiddleName() { return middleName; }
}
