package week1.day1.classroom;

public class Mobile
{
    public void MakeCall() {
        System.out.println("Made a call");
    }
    
    public void SendMessage() {
        System.out.println("sent a message");
    }
    
    public void TakePicture() {
        System.out.println("taken a picture");
    }
    
    public static void main(final String[] arg) {
        final Mobile myMobile = new Mobile();
        myMobile.MakeCall();
        myMobile.SendMessage();
        myMobile.TakePicture();
    }
}