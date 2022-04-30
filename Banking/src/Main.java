public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("BCR");
        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide","Sam",500.0);
        bank.addCustomer("Adelaide", "Judith", 1000.0);
        bank.addCustomer("Adelaide", "Viki", 100.0);

        bank.addBranch("Cluj-Napoca");

        bank.addCustomer("Cluj-Napoca","Lajos", 50.5);

        bank.addCustomerTransaction("Adelaide", "Sam", 500.55);
        bank.addCustomerTransaction("Adelaide", "Sam", 590.55);
        bank.addCustomerTransaction("Adelaide", "Judith", 50000.55);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Cluj-Napoca", true);

        bank.addBranch("Melbourne");
        if (!bank.addCustomer("Melbourne", "Brian", 5.33)){
            System.out.println("Error!");
        }

        if (!bank.addBranch("Adelaide")){
            System.out.println("Branch Adelaide already exists!");
        }
    }
}
