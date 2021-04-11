import java.util.Scanner;

public class ActualExpense extends Insurance {
	
	private Insurance actual;

	public Insurance getActual() {
		return actual;
	}

	public void setActual(Insurance actual) {
		this.actual = actual;
	}



	public int hospitalizationFee,outpatientFee,outpatientMedicineFee;

	public float selfBurdenFee;
	
	public ActualExpense(){

	}

	public boolean setABasicInsurance() {
		System.out.println("���̸� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if (age < 5 || age > 69) {
			System.out.println("������ �� ���� �����Դϴ�.");
			System.out.println("�ʱ�޴��� ���ư��ϴ�.");
			return false;
		}
		this.setBasicInsurance(40000);
		return true;
	}

	public float getSelfBurdenFee() {
		return selfBurdenFee;
	}



	public void setSelfBurdenFee(float selfBurdenFee) {
		this.selfBurdenFee = selfBurdenFee;
		
	}

	   public double calculate(UserInformation userinfo){
		      int money = this.getBasicInsurance();
		      
		      switch (userinfo.getAge()) {
		         case FIRST: money *= 0.95;
		         case SECOND: money *= 1.1;
		         case THIRD: money *= 1.15;
		         }
		      
		      if(userinfo.isGender()) money *= 1.05;
		      else money *= 0.95;
		      
		      switch (userinfo.getJob()) {
		         case SALESMAN: money *= 0.95;
		         case JOBLESS: money *= 1.1;
		         case DAILYWORKER: money *= 1.1;
		         case FIELDWORKER: money *= 1.1;
		         case OWNER: money *= 1.0;
		         case PRESCHOOL: money *= 0.9;
		         case STUDENT: money *= 0.9;
		         case ETC: money *= 1.05;
		      }
			return money;
		   }
	
}