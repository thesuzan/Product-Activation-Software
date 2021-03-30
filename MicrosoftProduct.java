public class MicrosoftProduct
{
    //instance variables
    protected int productNumber;
    protected String productName;
    protected String activationKey;
    protected int price;

    //user defined class constructor method
    public MicrosoftProduct(int productNumber, String productName){
        this.productNumber = productNumber;
        this.productName = productName;
        this.activationKey = "";
        this.price = 0;
    }

    //accessor methods for all attributes
    public int getProductNumber(){
        return this.productNumber;
    }

    public String getProductName(){
        return this.productName;
    }

    public String getActivationKey(){
        return this.activationKey;
    }

    public int getPrice(){
        return this.price;
    }

    //mutator methods for activationKey and price
    public void setActivationKey(String activationKey){
        this.activationKey = activationKey;
    }

    public void setPrice(int price){
        this.price = price;
    }

    //display method
    public void display(){
        System.out.println("Product Number: " + this.getProductNumber());
        System.out.println("Product Name: " + this.getProductName());

        if (this.getActivationKey() != "" && this.getPrice() != 0){

            System.out.println("Activation Key: " + this.getActivationKey());
            System.out.println("Price: " + this.getPrice());
        }
        else{
            System.out.println("Sorry, the license has not been activated yet.");
        }
    }
}
