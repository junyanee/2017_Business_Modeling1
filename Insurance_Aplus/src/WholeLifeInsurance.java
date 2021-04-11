import java.util.Scanner;

public class WholeLifeInsurance extends Insurance {

	private Insurance wholelife;

	private int deathBenefit;
	public SpecialContract specialContract;
	
	public int getDeathBenefit() {
		return deathBenefit;
	}




	public void setDeathBenefit(int deathBenefit) {
		this.deathBenefit = deathBenefit;
	}




	public Insurance getWholelife() {
		return wholelife;
	}




	public void setWholelife(Insurance wholelife) {
		this.wholelife = wholelife;
	}




	public SpecialContract getSpecialContract() {
		return specialContract;
	}




	public void setSpecialContract(SpecialContract specialContract) {
		this.specialContract = specialContract;
	}




	public int getCDisasterDeath() {
		return CDisasterDeath;
	}




	public void setCDisasterDeath(int cDisasterDeath) {
		CDisasterDeath = cDisasterDeath;
	}




	public int getCDisasterInjury() {
		return CDisasterInjury;
	}




	public void setCDisasterInjury(int cDisasterInjury) {
		CDisasterInjury = cDisasterInjury;
	}




	public int getCDisasterFracture() {
		return CDisasterFracture;
	}




	public void setCDisasterFracture(int cDisasterFracture) {
		CDisasterFracture = cDisasterFracture;
	}




	public int getCHospitalization() {
		return CHospitalization;
	}




	public void setCHospitalization(int cHospitalization) {
		CHospitalization = cHospitalization;
	}




	public int getCOperation() {
		return COperation;
	}




	public void setCOperation(int cOperation) {
		COperation = cOperation;
	}




	public int getDisasterDeath() {
		return disasterDeath;
	}




	public void setDisasterDeath(int disasterDeath) {
		this.disasterDeath = disasterDeath;
	}




	public int getDisasterInjury() {
		return disasterInjury;
	}




	public void setDisasterInjury(int disasterInjury) {
		this.disasterInjury = disasterInjury;
	}




	public int getDisasterFracture() {
		return disasterFracture;
	}




	public void setDisasterFracture(int disasterFracture) {
		this.disasterFracture = disasterFracture;
	}




	public int getHospitalization() {
		return hospitalization;
	}




	public void setHospitalization(int hospitalization) {
		this.hospitalization = hospitalization;
	}




	public int getOperation() {
		return operation;
	}




	public void setOperation(int operation) {
		this.operation = operation;
	}




	public int disasterDeath, disasterInjury, disasterFracture, hospitalization, operation;
	public int CDisasterDeath, CDisasterInjury, CDisasterFracture, CHospitalization, COperation;
	public void specialContractfee() {
		
		}




	public boolean setWBasicInsurance(){
		System.out.println("���̸� �Է����ּ���. ");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if ( age < 5 || age > 69) {
			System.out.println("������ �� ���� �����Դϴ�.");
			System.out.println("�ʱ�޴��� ���ư��ϴ�.");
			return false;
		} 
		if( age >= 5 && age <= 69) {
			this.setBasicInsurance(100000);
			System.out.println("�⺻������ " + this.getBasicInsurance() + "�� ���� �����˴ϴ�.");
		} return true;
		
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
	
	
	
	
	public WholeLifeInsurance(){

	}
}