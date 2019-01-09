package kata6.model;

public class Mail {
    private final String mail;

    public Mail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }
    
    public String getDomain(){
        String[] emailSplit = this.mail.split("@");
        return emailSplit[1];
    }
    
}
