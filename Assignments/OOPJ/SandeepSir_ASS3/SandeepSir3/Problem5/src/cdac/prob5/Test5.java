package cdac.prob5;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TollBoothRevenueManager t=new TollBoothRevenueManager();
		
		t.acceptRecord();
		t.setTollRates();
		t.calculateRevenue();
		t.printRecord();
	}

}
