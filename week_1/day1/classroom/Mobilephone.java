package week1.day1.classroom;

public class Mobilephone
{
    String mobileBrand;
    double mobilePrice;
    int noOfContacts;
    long imeNumber;
    
    public Mobilephone() {
        this.mobileBrand = "XYZ";
        this.mobilePrice = 24990.0;
        this.noOfContacts = 100;
        this.imeNumber = 1566656564889L;
    }
    
    public void MobileDetails() {
        System.out.println("Brand name" + this.mobileBrand);
        System.out.println("Price of mobile" + this.mobilePrice);
        System.out.println("contactlist" + this.noOfContacts);
        System.out.println("IME number" + this.imeNumber);
    }
    
    public static void main(final String[] arg) {
        final Mobilephone details = new Mobilephone();
        details.MobileDetails();
    }
}