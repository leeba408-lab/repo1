package encapsulation;

public interface payment {
	void pay();

}
class CreditCard implements payment{

	@Override
	public void pay() {
		System.out.println("payment upi");
		
		// TODO Auto-generated method stub
	
	}
	class UpiPayment implements payment{

		@Override
		public void pay() {
			System.out.println("card");
			
			
		}
		public class MainDemo{
			public void main(String ars[]) {
				CreditCard cc=new CreditCard();
				cc.pay();
				UpiPayment u=new UpiPayment();
				u.pay();
			}
		}
			// TODO Auto-generated method stub
			
		}
	
	
	
}
