package Java_core;

public class Banking {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account(45454,100);
		SavingsAcc s = new SavingsAcc(45454,500,0.5);
		checkingAcc c = new checkingAcc(45454,500,100);
		a.get_acc_no();
		a.get_balance();
		a.deposit(1000);
		double w = a.withdraw(200);
		a.get_balance();
		a.calc_interest(w);
		s.calc_interest(w);
		c.calc_interest(w);
		
	}
}
class Account {
	int acc_no;
	double bal;
	Account (int acc,double b) {//balance = 100
		acc_no = acc;
		bal = b;
	}
	public void get_acc_no() {
		System.out.println("Your account number : " + acc_no);//acc=45454
	}
	public void get_balance() {
		System.out.println("Your Balance : " + bal);//bal = 100
	}
	public void deposit (double amtount) {//1000
		System.out.println("Enter amt to deposit : "+amtount);//1000
		bal = bal + amtount;//bal = 100+1000 = 1100
	}
	public double withdraw(double amt) { //amt=600
		System.out.println("Enter amt to withdraw : "+amt);//500
		bal = bal - amt;//bal = 1100-500 = 600
		return bal;//600
	}
	public double  calc_interest(double interest) {
		return 0;
	}
}
class SavingsAcc extends Account {
	double interestRate;
	SavingsAcc(int acc_no,double bal,double i) {
		super(acc_no,bal);
		interestRate = i;
	}
	@Override
	public double calc_interest(double interest) {
		//withdraw(double amt);
		interestRate *= interest;
		System.out.println("Interest : " + interestRate);
		return interestRate;
	}
}
class checkingAcc extends Account {
	double monthly_fee;
	checkingAcc(int acc_no,double bal,double fee) {
		super(acc_no,bal);
		monthly_fee= fee;
	}
	@Override
	public double calc_interest(double interest) {
		return 0;
	}
}
