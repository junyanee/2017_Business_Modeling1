import java.util.Scanner;

public class AnnuityInsurance extends Insurance {
	private Insurance annuity;

	public Insurance getAnnuity() {
		return annuity;
	}

	public void setAnnuity(Insurance annuity) {
		this.annuity = annuity;
	}

	public static int amountFee;
	public static int expiredMaintainFee;
	public static int expirationFee;
	public static int surrenderValue;

	public AnnuityInsurance() {

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
		this.setBasicInsurance(50000);
		return true;
	}
	
	public double calculate(UserInformation userinfo){
	      int money = this.getBasicInsurance();
	      
	      switch (userinfo.getAge()) {
	         case FIRST: money *= 0.95;
	         break;
	         case SECOND: money *= 1.1;
	         break;
	         case THIRD: money *= 1.15;
	         break;
	         }
	      
	      if(userinfo.isGender()) money *= 1.05;
	      else money *= 0.95;
	      
	      switch (userinfo.getJob()) {
	         case SALESMAN: money *= 0.95;
	         break;
	         case JOBLESS: money *= 1.1;
	         break;
	         case DAILYWORKER: money *= 1.1;
	         break;
	         case FIELDWORKER: money *= 1.1;
	         break;
	         case OWNER: money *= 1.0;
	         break;
	         case PRESCHOOL: money *= 0.9;
	         break;
	         case STUDENT: money *= 0.9;
	         break;
	         case ETC: money *= 1.05;
	         break;
	      }
		return money;
	      
	      }

}