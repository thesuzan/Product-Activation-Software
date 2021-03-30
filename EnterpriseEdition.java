public class EnterpriseEdition extends MicrosoftProduct
{
    //instance variables
    private String companyName;
    private int pricePerUser;
    private int numberOfUser;
    private String activationDate;
    private String licenseExpireDate;
    private boolean isActivated;
    private boolean isExpired;

    //user defined class constructor method
    public EnterpriseEdition(int productNumber, String productName, int pricePerUser){
        super(productNumber, productName); //calling the super class constructor method
        this.pricePerUser = pricePerUser;
        this.numberOfUser = 0;
        this.activationDate = "";
        this.licenseExpireDate = "";
        this.isActivated = false;
        this.isExpired = false;
    }

    //accessor methods for all attributes
    public String getCompanyName(){
        return this.companyName;
    }

    public int getPricePerUser(){
        return this.pricePerUser;
    }
    
    public int getNumberOfUser(){
        return this.numberOfUser;
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
    
    public boolean getIsExpired(){
        return this.isExpired;
    }

    //mutator method to set the pricePerUser
    public void setPricePerUser(int pricePerUser){
        //checks if the license is activated
        if (this.getIsActivated() == false){
            this.pricePerUser = pricePerUser;
        }
        else{
            System.out.println("Sorry, the price per user cannot be changed. The license has already been activated.");
        }
    }
    
    //license activation method
    public void activateLicense(String companyName, int numberOfUser, String activationDate, String licenseExpireDate, String activationKey){
        //checks if the license is activated
        if (this.getIsActivated() == true){
            System.out.println("This license has already been activated.");
            System.out.println("Company name: " + this.getCompanyName());
            System.out.println("Number of users: " + this.getNumberOfUser());
        }
        else{
            this.companyName = companyName;
            this.numberOfUser = numberOfUser;
            this.activationDate = activationDate;
            this.licenseExpireDate = licenseExpireDate;
            this.isActivated = true;
            this.isExpired = false;
            super.setActivationKey(activationKey);
            super.setPrice(numberOfUser * pricePerUser);
        }
    }

    //license termination method
    public void terminateLicense(){
        //checks if the license is expired
        if (this.getIsExpired() == true){
            System.out.println("This license has already been terminated.");
        }
        else{
            this.companyName = "";
            this.activationDate = "";
            this.licenseExpireDate = "";
            this.numberOfUser = 0;
            this.isActivated = false;
            this.isExpired = true;
        }
    }

    //display method
    public void display(){
        super.display(); //calls the display() method of the super class
        //checks if the license is activated
        if (this.getIsActivated() == true){
            System.out.println("Company name: " + this.getCompanyName());
            System.out.println("Number of users: " + this.getNumberOfUser());
            System.out.println("Price per user: " + this.getPricePerUser());
            System.out.println("Total price: " + super.getPrice());
            System.out.println("Activation date: " + this.getActivationDate());
            System.out.println("Expire date: " + this.getLicenseExpireDate());
            System.out.println("Activation key: " + super.getActivationKey());
            System.out.println("Activation status: " + this.getIsActivated());
        }
        else{
            System.out.println("Sorry, the license has not been activated yet.");
        }
    }
}
