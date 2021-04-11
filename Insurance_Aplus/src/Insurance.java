import java.util.Scanner;

public class Insurance {

  

private String insuranceName;
   private int paymentFrequency;
   private int paymentTerm;
   private int basicInsurance;
   public int compensation;
   private int limitedAge;
   public main m_main;
	private Compensation m_Compensation;
	
   public Insurance(){

   }

   public void finalize() throws Throwable {

   }

 
		public double calculate(UserInformation userinfo) {
			return 0;
		}
		
   public String getInsuranceName(){return this.insuranceName = insuranceName;}
   public void setInsuranceName(String insuranceName){this.insuranceName = insuranceName;}
   public void setPaymentTerm(int paymentTerm){this.paymentTerm = paymentTerm;}   
   public int getPaymentTerm(){return this.paymentTerm = paymentTerm;}
   public void setPaymentFrequency(int paymentFrequency){this.paymentFrequency = paymentFrequency;}
   public int getPaymentFrequency(){return this.paymentFrequency = paymentFrequency;}
   public void setBasicInsurance(int basicInsurance){this.basicInsurance = basicInsurance;}
   public int getBasicInsurance(){return this.basicInsurance = basicInsurance;}   
   public boolean setLimitAge(){
      System.out.println(" 나이를 입력해주세요.");
      Scanner scanner = new Scanner(System.in);
      int age = scanner.nextInt();
      if ( age < 5 || age > 69) {
         System.out.println("가입할 수 없는 나이입니다.");
         System.out.println(" 초기메뉴로 돌아갑니다.");
         return false;
      } else {
      return true;
      }      
   }

   public int getCompensation() {
		return compensation;
	}

	public void setCompensation(int compensation) {
		this.compensation = compensation;
	}

	public Compensation getM_Compensation() {
		return m_Compensation;
	}

	public void setM_Compensation(Compensation m_Compensation) {
		this.m_Compensation = m_Compensation;
	}
   public void getLimitAge(){

   }

   public void setID(int i) {
   }

   

}