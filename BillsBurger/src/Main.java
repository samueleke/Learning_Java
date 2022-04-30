public class Main {

    public static void main(String[] args) {
        Additions lettuce = new Additions("Lettuce",0.75);
        Additions tomato = new Additions("Tomato",0.27);
        Additions carrot = new Additions("Carrot",1.12);
        Additions cucumber = new Additions("Cucumber",0.5);

        BaseBurger hamburger = new BaseBurger("white", 3.56, "Sausage", "Basic");
        double price = hamburger.itemsInHamburger();
        hamburger.addTomato(tomato);
        hamburger.addCucumber(cucumber);
        price = hamburger.itemsInHamburger();



    }
}
