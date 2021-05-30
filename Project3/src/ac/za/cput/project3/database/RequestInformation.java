package ac.za.cput.project3.database;

public class RequestInformation {

    //Dummy Data
    public RequestInformation() {

    }

    public boolean requestVerification(String username, String email, String password) {
        if((username.equals("project")) && (email.equals("project")) && (password.equals("project"))){
            return true;
        }
        else {
            return false;
        }
    }
}
