public class Login {
    String user ="001";
    String pass = "****";

    public Login(String usr, String pwd) {
        if(usr.equals(user)&&pwd.equals(pass)){
            System.out.println("Welcome M bank"+"\nUpdating... ");
            new ui();
        }
        else {
            System.out.println("Your username or password incorrect"+"\nPlease try again later!");

        }
    }







}
