import java.util.Scanner;
enum grade {SUPER, STANDARD, REFUSAL};

public class InsuranceGradeInformation {

	private grade i;

	public InsuranceGradeInformation(){

	}

	public void finalize() throws Throwable {

	}

	public grade getI() {
		return i;
	}

	public void setI(grade i) {
		this.i = i;
	}

//	/**
//	 * 
//	 * @param ������
//	 */
//	public void setRating(int ������){
//			InsuranceGradeInformation igi = new InsuranceGradeInformation();
//			System.out.println("���� 10�� �� �� ������ �ֽ��ϱ�");
//			
//			System.out.println("1. ��");
//			System.out.println("2. �ƴϿ�");
//			
//			Scanner scanner = new Scanner(System.in);
//			int typeNumber = scanner.nextInt();
//			if (typeNumber == 1) {
//				System.out.println("1. �ֱ� 5�� �� ���� �ξҴ�.");
//				System.out.println("2. �ֱ� 10�� �� ���� �ξҴ�.");
//				
//				int number = scanner.nextInt();
//				if (number == 1) {
//					System.out.println("����ü �Ǻ�");
//					igi.getRating(Refusal);
//				} else if (number == 2) {
//					System.out.println("ǥ��ü �Ǻ�");
//				} else {
//					System.out.println("�ùٸ��� ���� �Է��Դϴ�.");
//				}
//			} else if (typeNumber == 2) {
//				System.out.println("�췮ü �Ǻ�");
//			}
//			
//			return cancerHistory;
//		}
//
//	}
//
//	/**
//	 * 
//	 * @param ������
//	 */
//	public void getRating(int ������){
//
//	}

}