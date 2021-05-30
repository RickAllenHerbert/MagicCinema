package ac.za.cput.project3.entity;

public class User {

    private String username;
    private String password;
    private String name;
    private String address;
    private String gender;

    public User(String username, String password, String name, String address, String gender) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.address = address;
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        String output = "USER INFORMATION: /n NAME: " + name + "/nGENDER: " + gender + "/nADDRESS: " + address;
        return output;
    }
}