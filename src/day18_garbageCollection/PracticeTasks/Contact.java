package day18_garbageCollection.PracticeTasks;

public class Contact {

    public String name;
    public String phoneNumber;
    public String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void Call(){
        System.out.println("Calling from "+name+ " now");
    }
    public void sendMessage(){
        System.out.println("Sending message to "+ phoneNumber+ " now");
    }
    public void sendEmail(){
        System.out.println("Sending email to "+ email+ " now");
    }

    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber= '" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
