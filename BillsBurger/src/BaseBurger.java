public class BaseBurger {
    private String breadRollType;
    private double basePrice;
    private String meat;
    private String name;
    private Additions lettuce;
    private Additions tomato;
    private Additions carrot;
    private Additions cucumber;


    public BaseBurger(String breadRollType, double price, String meat, String name) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.basePrice = price;
        this.meat = meat;

    }

    public void addLettuce(Additions lettuce) {
       this.lettuce=lettuce;
    }

    public void addTomato(Additions tomato) {
        this.tomato=tomato;
    }

    public void addCarrot(Additions carrot) {
        this.carrot = carrot;


    }

    public void addCucumber(Additions cucumber) {
        this.cucumber=cucumber;
    }

    public void removeLettuce(){
        this.lettuce=null;
    }

    public double itemsInHamburger(){
        double hamburgerPrice = this.basePrice;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll. The price is: " + this.basePrice);
        if (lettuce != null){
            hamburgerPrice += lettuce.getPrice();
            System.out.println("Added " + lettuce.getName() + " for an extra " + lettuce.getPrice());
        }
        if (tomato != null){
            hamburgerPrice +=tomato.getPrice();
            System.out.println("Added " + tomato.getName() + " for an extra " + tomato.getPrice());
        }if (carrot != null){
            hamburgerPrice += carrot.getPrice();
            System.out.println("Added " + carrot.getName() + " for an extra " + carrot.getPrice());
        }if (cucumber != null){
            hamburgerPrice +=cucumber.getPrice();
            System.out.println("Added " +cucumber.getName() + " for an extra " + cucumber.getPrice());
        }
        System.out.println("the full price is : "+hamburgerPrice);
        return hamburgerPrice;
    }

}
