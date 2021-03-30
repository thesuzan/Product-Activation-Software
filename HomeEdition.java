public class HomeEdition extends MicrosoftProduct
{
    //instance variables
    private String userName;
    private String activationDate;
    private String licenseExpireDate;
    private boolean isActivated;

    //user defined class constructor method
    public HomeEdition(int productNumber, String productName, int price){
        super(productNumber, productName); //calling the super class constructor method
        super.setPrice(price); //calling the setPrice() method from the super class
        this.userName = "";
        this.activationDate = "";
        this.licenseExpireDate = "";
        this.isActivated = false;
    }

    //accessor methods for all attributes
    public String getUserName(){
        return this.userName;
    }

    public String getActivationDate(){
        return this.activationDate;
    }

    public String getLicenseExpireDate(){
        return this.licenseExpireDate;
    }

    public boolean getIsActivated(){
        return this.isActivated;
    }

    //mutator method to set a new price
    public void setPrice(int price){
        //checks if license is activated
        if (this.getIsActivated() == false){
            super.setPrice(price);
        }
        else{
            System.out.println("Sorry the price cannot be changed. The license has already been activated.");
        }
    }

    //method to activate license
    public void activateLicense(String userName, String activationDate,
    String licenseExpireDate, String activationKey){
        //checks if license is activated
        if (this.getIsActivated() == true){
            System.out.println("The license has already been activated.");
            System.out.println("Username: " + this.getUserName());
            System.out.println("Activation Date: " + this.getActivationDate());
        }
        else{
            super.setActivationKey(activationKey);
            this.userName = userName;
            this.activationDate = activationDate;
            this.licenseExpireDate = licenseExpireDate;
            this.isActivated = true;
        }
    }

    //display method
    public void display(){
        //calls the display() method from the super class
        super.display();
        //check if the license is activated
        if (this.getIsActivated() == true){
            System.out.println("Username: " + this.getUserName());
            System.out.println("Activation Date: " + this.getActivationDate());
            System.out.println("License Expire Date: " + this.getLicenseExpireDate());
            System.out.println("Price: " + this.getPrice());
            System.out.println("Activation Status: " + this.getIsActivated());
        }
        else{
            System.out.println("Sorry, the license has not been activated yet.");
        }
    }
}
