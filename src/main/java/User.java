public class User {
    int id;
    String firstNBame;
    String lastName;
    String mail;

    public User(String firstNBame, String lastName, String mail) {
        this.firstNBame = firstNBame;
        this.lastName = lastName;
        this.mail = mail;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstNBame() {
        return firstNBame;
    }

    public void setFirstNBame(String firstNBame) {
        this.firstNBame = firstNBame;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
