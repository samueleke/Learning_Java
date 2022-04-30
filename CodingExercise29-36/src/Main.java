public class Main {

    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount();//12345, 1000.0, "Bob Brown", "myemail@bob.comn", "0767353400");
//
//
//        bankAccount.withdraw(100.0);
//
//        bankAccount.deposit(50.0);
//        bankAccount.withdraw(100.0);


//        VipCustomer person1 = new VipCustomer();
//        System.out.println(person1.getName());
//
//        VipCustomer person2 = new VipCustomer("Bob",25000.0);
//        System.out.println(person2.getName());
//
//        VipCustomer person3 = new VipCustomer("Tim", 100.0, "tim@email.con");
//        System.out.println(person3.getName());


//        Point first = new Point();
//        System.out.println(first.getX());

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor,carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4,4.5);
        calculator = new Calculator(floor,carpet);
        System.out.println("total= "+ calculator.getTotalCost());
    }
}
