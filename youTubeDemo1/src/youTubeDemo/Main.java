package youTubeDemo;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.giveCredit();
		
		
		/*
		 * Customer customer = new Customer(); //öreneğini oluşturmak , instance
		 * oluşturmak, instance creation customer.id = 1; customer.city = "İstanbul";
		 * 
		 * Company company = new Company(); company.id = 1; company.companyName =
		 * "Arçelik"; company.taxNumber = "54524";
		 * 
		 * Person person = new Person(); person.firstName = "Şule";
		 * person.nationalIdentity = "86363334696";
		 * 
		 * CustomerManager customerManager = new CustomerManager(customer);
		 * customerManager.save(); customerManager.delete();
		 * 
		 * CustomerManager customerManager2 = new CustomerManager(new Company());
		 * 
		 * Customer c1 = new Customer(); Customer c2 = new Person(); Customer c3 = new
		 * Company();
		 * 
		 * CreditManager creditManager = new CreditManager(); creditManager.calculate();
		 * creditManager.save();
		 */
		
		
	}

}
