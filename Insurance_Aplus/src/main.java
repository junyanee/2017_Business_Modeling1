import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static ArrayList<WholeLifeInsurance> designedWInsuranceList = new ArrayList<WholeLifeInsurance>();
	public static ArrayList<AnnuityInsurance> designedAInsuranceList = new ArrayList<AnnuityInsurance>();
	public static ArrayList<CancerInsurance> designedCInsuranceList = new ArrayList<CancerInsurance>();
	public static ArrayList<ActualExpense> designedEInsuranceList = new ArrayList<ActualExpense>();

	public static ArrayList<WholeLifeInsurance> acceptedWInsuranceList = new ArrayList<WholeLifeInsurance>();
	public static ArrayList<AnnuityInsurance> acceptedAInsuranceList = new ArrayList<AnnuityInsurance>();
	public static ArrayList<CancerInsurance> acceptedCInsuranceList = new ArrayList<CancerInsurance>();
	public static ArrayList<ActualExpense> acceptedEInsuranceList = new ArrayList<ActualExpense>();

	public static ArrayList<UserInformation> nominatedWUserList = new ArrayList<UserInformation>();
	public static ArrayList<UserInformation> nominatedAUserList = new ArrayList<UserInformation>();
	public static ArrayList<UserInformation> nominatedCUserList = new ArrayList<UserInformation>();
	public static ArrayList<UserInformation> nominatedEUserList = new ArrayList<UserInformation>();

	public static ArrayList<UserInformation> acceptedWUserList = new ArrayList<UserInformation>();
	public static ArrayList<UserInformation> acceptedAUserList = new ArrayList<UserInformation>();
	public static ArrayList<UserInformation> acceptedCUserList = new ArrayList<UserInformation>();
	public static ArrayList<UserInformation> acceptedEUserList = new ArrayList<UserInformation>();

	public static void main(String[] args) {

		WholeLifeInsurance wholeLifeInsurance = new WholeLifeInsurance();
		AnnuityInsurance annuityInsurance = new AnnuityInsurance();
		CancerInsurance cancerInsurance = new CancerInsurance();
		ActualExpense actualInsurance = new ActualExpense();

		Compensation WCompensation = new Compensation();
		Compensation ACompensation = new Compensation();
		Compensation CCompensation = new Compensation();
		Compensation ECompensation = new Compensation();

		Scanner scanner = new Scanner(System.in);
		int typeNumber;

		while (true) {
			System.out.println("\n" + "*********����� �޴�*********");
			System.out.println("1. ���輳���ϱ�");
			System.out.println("2. ����Ȯ���ϱ�");
			System.out.println("3. ���谡���ϱ�");
			System.out.println("4. UW�ϱ�");
			System.out.println("5. ���ü���ϱ�");
			System.out.println("6. ����ó���ϱ�");
			System.out.println("��ȣ�� �����Ͻÿ�: ");

			int number = scanner.nextInt();

			switch (number) {
			case 1:
				// ���� �����ϱ�
				System.out.println("\n" + "*********���� ���� ����*********: ");
				System.out.println("1. ���ź��� ");
				System.out.println("2. ���ݺ��� ");
				System.out.println("3. �Ϻ��� ");
				System.out.println("4. �Ǻ��� ");
				System.out.println("���� ������ �����Ͻÿ�. ");

				typeNumber = scanner.nextInt();

				// ���ź���
				if (typeNumber == 1) {
					// ���ź��� ����
					System.out.println("���� ���������� �����մϴ�.");
					Insurance wholelife = new Insurance();

					wholeLifeInsurance.setWholelife(wholelife);
					// < �⺻���� �Է� >

					// ID�Է�
					wholelife.setID(10);
					// ��ǰ�� ����
					System.out.println("������ ������� �����ϼ���.");
					String InsuranceName = scanner.next();
					// ���ѳ��� & �⺻����� ����
					wholelife.setInsuranceName(InsuranceName);
					if (wholeLifeInsurance.setWBasicInsurance() == false) {
						break;
					}
					// �����ֱ� ����
					wholelife.setPaymentFrequency(3);
					// ���ԱⰣ ����
					wholelife.setPaymentTerm(1);


					// ���賻�� ����
					System.out.println(" *****��� ������ �Ϸ�Ǿ����ϴ�.***** ");
					System.out.println("����� : " + wholelife.getInsuranceName());
					System.out.println("�⺻����� : " + wholeLifeInsurance.getBasicInsurance());
					System.out.println("�����ֱ� : " + wholelife.getPaymentFrequency() + "����");
					System.out.println("���ԱⰣ : " + wholelife.getPaymentTerm() + "��");

					// ���� �ݾ� ����

					WCompensation.setMoney(100000000);
					WCompensation.setPaymentFrequency(wholelife.getPaymentFrequency());
					WCompensation.setPaymentTerm(wholelife.getPaymentTerm());

					// Ư�� �ݾ� ����
					wholeLifeInsurance.disasterDeath = 5000;
					wholeLifeInsurance.disasterInjury = 500;
					wholeLifeInsurance.disasterFracture = 500;
					wholeLifeInsurance.hospitalization = 600;
					wholeLifeInsurance.operation = 800;
					wholelife.setM_Compensation(WCompensation);

					// Ư�� ���� �ݾ� ����
					wholeLifeInsurance.CDisasterDeath = 5000000;
					wholeLifeInsurance.CDisasterFracture = 1000000;
					wholeLifeInsurance.CDisasterInjury = 1000000;
					wholeLifeInsurance.CHospitalization = 5000000;
					wholeLifeInsurance.COperation = 5000000;

					designedWInsuranceList.add(wholeLifeInsurance);
					break;
				}
				// ���� ���� ����
				else if (typeNumber == 2) {
					// ���ݺ��� ����
					System.out.println("���� ���������� �����մϴ�.");
					Insurance annuity = new Insurance();

					annuityInsurance.setAnnuity(annuity);

					// < �⺻���� �Է� >

					// ID�Է�
					annuity.setID(20);
					// ��ǰ�� ����
					System.out.println("������ ������� �����ϼ���.");
					String InsuranceName = scanner.next();
					// ���ѳ��� & �⺻����� ����
					annuity.setInsuranceName(InsuranceName);
					if (annuityInsurance.setABasicInsurance() == false) {
						break;
					}

					// �����ֱ� ����
					annuity.setPaymentFrequency(3);
					// ���ԱⰣ ����
					annuity.setPaymentTerm(1);


					// ���賻�� ����
					System.out.println("����� ���賻���Դϴ�.");
					System.out.println("����� : " + annuity.getInsuranceName());
					System.out.println("�⺻����� : " + annuityInsurance.getBasicInsurance());
					System.out.println("�����ֱ� : " + annuity.getPaymentFrequency() + "����");
					System.out.println("���ԱⰣ : " + annuity.getPaymentTerm() + "��");

					// ���� �ݾ� ����

					ACompensation.setPaymentFrequency(annuity.getPaymentFrequency());
					ACompensation.setPaymentTerm(annuity.getPaymentTerm());
					AnnuityInsurance.amountFee = annuityInsurance.getBasicInsurance() * 12
							/ annuity.getPaymentFrequency() * annuity.getPaymentTerm();
					AnnuityInsurance.expiredMaintainFee = (int) (AnnuityInsurance.amountFee * 0.1);
					AnnuityInsurance.expirationFee = AnnuityInsurance.amountFee + AnnuityInsurance.expiredMaintainFee;
					AnnuityInsurance.surrenderValue = (int) (AnnuityInsurance.amountFee * 0.5);
					System.out.println("���� : " + AnnuityInsurance.amountFee);
					System.out.println("����� : " + AnnuityInsurance.expirationFee);
					System.out.println("�����������ڱ�: " + AnnuityInsurance.expiredMaintainFee);
					System.out.println("�ߵ�����ȯ�ޱ�: " + AnnuityInsurance.surrenderValue);

					designedAInsuranceList.add(annuityInsurance);

					break;

				} else if (typeNumber == 3) {
					// �Ϻ��� ����
					System.out.println("���� ���������� �����մϴ�.");
					Insurance cancer = new CancerInsurance();

					cancerInsurance.setCancer(cancer);

					// < �⺻���� �Է� >

					// ID�Է�
					cancer.setID(30);
					// ��ǰ�� ����
					System.out.println("������ ������� �����ϼ���.");
					String InsuranceName = scanner.next();
					// ���ѳ��� & �⺻����� ����
					cancer.setInsuranceName(InsuranceName);
					if (cancerInsurance.setCBasicInsurance() == false) {
						break;
					}
					// �����ֱ� ����
					cancer.setPaymentFrequency(3);
					// ���ԱⰣ ����
					cancer.setPaymentTerm(1);

					InsuranceGradeInformation igi = new InsuranceGradeInformation();
					System.out.println("���� 10�� �� �� ������ �ֽ��ϱ�");

					System.out.println("1. ��");
					System.out.println("2. �ƴϿ�");

					int typeNumber1 = scanner.nextInt();
					if (typeNumber1 == 1) {
						System.out.println("�ش������� ������ּ���.");
						System.out.println("1. �ֱ� 5�� �� ���� �ξҴ�.");
						System.out.println("2. �ֱ� 10�� �� ���� �ξҴ�.");

						int number1 = scanner.nextInt();
						if (number1 == 1) {
							System.out.println("����ü �Ǻ�");
							igi.setI(grade.REFUSAL);
						} else if (number1 == 2) {
							System.out.println("ǥ��ü �Ǻ�");
							igi.setI(grade.STANDARD);
						} else {
							System.out.println("�ùٸ��� ���� �Է��Դϴ�.");
						}
					} else if (typeNumber1 == 2) {
						System.out.println("�췮ü �Ǻ�");
						igi.setI(grade.SUPER);
					}


					// ���賻�� ����
					System.out.println("����� ���賻���Դϴ�.");
					System.out.println("����� : " + cancer.getInsuranceName());
					System.out.println("�⺻����� : " + cancerInsurance.getBasicInsurance());
					System.out.println("�����ֱ� : " + cancer.getPaymentFrequency() + "����");
					System.out.println("���ԱⰣ : " + cancer.getPaymentTerm() + "��");

					// ���� �ݾ� ����

					CCompensation.setPaymentFrequency(cancer.getPaymentFrequency() / 12);
					CCompensation.setPaymentTerm(cancer.getPaymentTerm());
					cancerInsurance.cancerDiagnosisFee = 30000000;
					cancerInsurance.drugTreatmentFee = 500000;
					cancerInsurance.radiationTherapyFee = 500000;
					cancerInsurance.operationFee = 10000000;
					cancerInsurance.hospitalizationFee = 5000000;

					designedCInsuranceList.add(cancerInsurance);

				} else if (typeNumber == 4) {
					// �Ǻ��� ����
					System.out.println("���� ���������� �����մϴ�.");
					Insurance actual = new Insurance();

					actualInsurance.setActual(actual);

					// < �⺻���� �Է� >

					// ID�Է�
					actual.setID(40);
					// ��ǰ�� ����
					System.out.println("������ ������� �����ϼ���.");
					String InsuranceName = scanner.next();
					// ���ѳ��� & �⺻����� ����
					actual.setInsuranceName(InsuranceName);
					if (actualInsurance.setABasicInsurance() == false) {
						break;
					}
					// �����ֱ� ����
					actual.setPaymentFrequency(3);
					// ���ԱⰣ ����
					actual.setPaymentTerm(1);
					// �ڱ�δ�� ����
					System.out.println("�ڱ�δ���� 10%�� �����˴ϴ�.");
					((ActualExpense) actualInsurance).setSelfBurdenFee((float) 0.1);

					// ���賻�� ����
					System.out.println(" *****��� ������ �Ϸ�Ǿ����ϴ�.***** ");
					System.out.println("����� : " + actual.getInsuranceName());
					System.out.println("�⺻����� : " + actualInsurance.getBasicInsurance());
					System.out.println("�����ֱ� : " + actual.getPaymentFrequency() + "����");
					System.out.println("���ԱⰣ : " + actual.getPaymentTerm() + "��");

					// ���� �ݾ� ����

					ECompensation.setPaymentFrequency(actual.getPaymentFrequency());
					ECompensation.setPaymentTerm(actual.getPaymentTerm());

					// ���� �ݾ� ����
					actualInsurance.hospitalizationFee = 300000000;
					actualInsurance.outpatientFee = 1000000;
					actualInsurance.outpatientMedicineFee = 300000;

					designedEInsuranceList.add(actualInsurance);

				}

				break;

			case 2:
				// ���� Ȯ���ϱ�
				System.out.println("Ȯ���� ���� ������ �����ϼ���");
				System.out.println("1. ���ź���");
				System.out.println("2. ���ݺ���");
				System.out.println("3. �Ϻ���");
				System.out.println("4. �Ǻ���");

				int num = scanner.nextInt();

				if (num == 1) {
					// ����Ϸ�� ��ǰ ���
					System.out.println("\n" + "********����� ���� ��ǰ*********");
					if (designedWInsuranceList.size() == 0)
						System.out.println("����� ������ �����ϴ�.");
					else if (designedWInsuranceList.size() > 0) {
						for (int i = 0; i < designedWInsuranceList.size(); i++) {
							System.out.println("[" + (i + 1) + "]�� ������ �̸� : "
									+ designedWInsuranceList.get(i).getWholelife().getInsuranceName());
							System.out.println("[" + (i + 1) + "]�� ������ �⺻����� : "
									+ designedWInsuranceList.get(i).getBasicInsurance());
							System.out.println("[" + (i + 1) + "]�� ������ ���� �ֱ� : "
									+ designedWInsuranceList.get(i).getWholelife().getPaymentFrequency() + "����");
							System.out.println("[" + (i + 1) + "]�� ������ ���� �Ⱓ : "
									+ designedWInsuranceList.get(i).getWholelife().getPaymentTerm() + "��");
							UserInformation userInfo = new UserInformation(false, ageSegment.SECOND,
									jobTitle.DAILYWORKER);
							int money = (int) designedWInsuranceList.get(i).calculate(userInfo);
							System.out.println("�� ����� = " + money + "\n");

							System.out.println("Ȯ���Ͻðڽ��ϱ�? 1.Ȯ��, 2.�ź�");
							int acceptance = scanner.nextInt();
							if (acceptance == 1) {
								acceptedWInsuranceList.add(designedWInsuranceList.get(i));
								designedWInsuranceList.remove(i);

								System.out.println("���� ��ǰ�� �����Ǿ����ϴ�.");
							} else if (acceptance == 2) {

								designedWInsuranceList.remove(i);
								System.out.println("���� ��ǰ�� ����մϴ�.");
							}

						}
					}
					// ����� ���� ��ǰ ���� ������ ����

				} else if (num == 2) {
					System.out.println("\n" + "********����� ���� ��ǰ*********");
					if (designedAInsuranceList.size() == 0)
						System.out.println("����� ������ �����ϴ�.");
					else if (designedAInsuranceList.size() > 0) {
						for (int i = 0; i < designedAInsuranceList.size(); i++) {
							System.out.println("[" + (i + 1) + "]�� ������ �̸� : "
									+ designedAInsuranceList.get(i).getAnnuity().getInsuranceName());
							System.out.println("[" + (i + 1) + "]�� ������ �⺻����� : "
									+ designedAInsuranceList.get(i).getBasicInsurance());
							System.out.println("[" + (i + 1) + "]�� ������ ���� �ֱ� : "
									+ designedAInsuranceList.get(i).getAnnuity().getPaymentFrequency() + "����");
							System.out.println("[" + (i + 1) + "]�� ������ ���� �Ⱓ :  "
									+ designedAInsuranceList.get(i).getAnnuity().getPaymentTerm() + "��");

							UserInformation userInfo = new UserInformation(false, ageSegment.SECOND,
									jobTitle.DAILYWORKER);

							System.out.println("�� ����� = " + designedAInsuranceList.get(i).getBasicInsurance() + "\n");
							System.out.println("���� : " + AnnuityInsurance.amountFee);
							System.out.println("����� : " + AnnuityInsurance.expirationFee);
							System.out.println("�����������ڱ�: " + AnnuityInsurance.expiredMaintainFee);
							System.out.println("�ߵ�����ȯ�ޱ�: " + AnnuityInsurance.surrenderValue);

							System.out.println("Ȯ���Ͻðڽ��ϱ�? 1.Ȯ��, 2.�ź�");
							int acceptance = scanner.nextInt();
							if (acceptance == 1) {
								acceptedAInsuranceList.add(designedAInsuranceList.get(i));
								designedAInsuranceList.remove(i);

								System.out.println("���� ��ǰ�� �����Ǿ����ϴ�.");
							} else if (acceptance == 2) {

								designedAInsuranceList.remove(i);
								System.out.println("���� ��ǰ�� ����մϴ�.");
							}
						}

					}
				} else if (num == 3) {
					System.out.println("\n" + "********����� ���� ��ǰ*********");
					if (designedCInsuranceList.size() == 0)
						System.out.println("����� ������ �����ϴ�.");
					else if (designedCInsuranceList.size() > 0) {
						for (int i = 0; i < designedCInsuranceList.size(); i++) {
							System.out.println("[" + (i + 1) + "]�� ������ �̸� : "
									+ designedCInsuranceList.get(i).getCancer().getInsuranceName());
							System.out.println("[" + (i + 1) + "]�� ������ �⺻����� : "
									+ designedCInsuranceList.get(i).getBasicInsurance());
							System.out.println("[" + (i + 1) + "]�� ������ ���� �ֱ� : "
									+ designedCInsuranceList.get(i).getCancer().getPaymentFrequency() + "����");
							System.out.println("[" + (i + 1) + "]�� ������ ���� �Ⱓ : "
									+ designedCInsuranceList.get(i).getCancer().getPaymentTerm() + "��");

							UserInformation userInfo = new UserInformation(false, ageSegment.SECOND,
									jobTitle.DAILYWORKER);
							int money = (int) designedCInsuranceList.get(i).calculate(userInfo);
							System.out.println("�� ����� = " + money + "\n");

							System.out.println("Ȯ���Ͻðڽ��ϱ�? 1.Ȯ��, 2.�ź�");
							int acceptance = scanner.nextInt();
							if (acceptance == 1) {
								acceptedCInsuranceList.add(designedCInsuranceList.get(i));
								designedCInsuranceList.remove(i);

								System.out.println("���� ��ǰ�� �����Ǿ����ϴ�.");
							} else if (acceptance == 2) {

								designedCInsuranceList.remove(i);
								System.out.println("���� ��ǰ�� ����մϴ�.");
							}
						}
					}
				} else if (num == 4) {
					System.out.println("\n" + "********Ȯ���� ���� ��ǰ*********");
					if (designedEInsuranceList.size() == 0)
						System.out.println("����� ������ �����ϴ�.");
					else if (designedEInsuranceList.size() > 0) {
						for (int i = 0; i < designedEInsuranceList.size(); i++) {
							System.out.println("[" + (i + 1) + "]�� ������ �̸� : "
									+ designedEInsuranceList.get(i).getActual().getInsuranceName());
							System.out.println("[" + (i + 1) + "]�� ������ �⺻����� : "
									+ designedEInsuranceList.get(i).getBasicInsurance());
							System.out.println("[" + (i + 1) + "]�� ������ ���� �ֱ� : "
									+ designedEInsuranceList.get(i).getActual().getPaymentFrequency() + "����");
							System.out.println("[" + (i + 1) + "]�� ������ ���� �Ⱓ : "
									+ designedEInsuranceList.get(i).getActual().getPaymentTerm() + "��");

							UserInformation userInfo = new UserInformation(false, ageSegment.SECOND,
									jobTitle.DAILYWORKER);
							int money = (int) designedEInsuranceList.get(i).calculate(userInfo);
							System.out.println("�� ����� = " + money + "\n");

							System.out.println("Ȯ���Ͻðڽ��ϱ�? 1.Ȯ��, 2.�ź�");
							int acceptance = scanner.nextInt();
							if (acceptance == 1) {
								acceptedEInsuranceList.add(designedEInsuranceList.get(i));
								designedEInsuranceList.remove(i);

								System.out.println("���� ��ǰ�� �����Ǿ����ϴ�.");
							} else if (acceptance == 2) {

								designedEInsuranceList.remove(i);
								System.out.println("���� ��ǰ�� ����մϴ�.");
							}
						}
					}
				}

				break;
			case 3:
				// ���谡���ϱ�

				UserInformation userInformation = new UserInformation(false, null, null);
				userInformation.setName("���̻���");
				userInformation.setAge(ageSegment.FIRST);
				userInformation.setGender(true);
				userInformation.setJob(jobTitle.STUDENT);
				userInformation.setResidentRegistrationNumber("971111-2111111");
				userInformation.setPhoneNumber("010-1234-5678");
				userInformation.setEmail("Aplus@naver.com");
				userInformation.setAddress("����");

				// ������ ���� ��ǰ �����ϱ�
				System.out.println("������ ������ �����ϼ���.");
				System.out.println("1. ���ź���");
				System.out.println("2. ���ݺ���");
				System.out.println("3. �Ϻ���");
				System.out.println("4. �Ǻ���");

				int numb = scanner.nextInt();

				if (numb == 1) {
					// �����Ϸ�� ��ǰ ���
					System.out.println("\n" + "********����� ���� ��ǰ*********");
					if (acceptedWInsuranceList.size() == 0)
						System.out.println("������ ������ �����ϴ�.");

					else if (acceptedWInsuranceList.size() > 0) {
						for (int i = 0; i < acceptedWInsuranceList.size(); i++) {
							System.out.println("[" + (i + 1) + "]�� ������ �̸� : "
									+ acceptedWInsuranceList.get(i).getWholelife().getInsuranceName());

							// ������ ���� ������ ����
							System.out.println("������ �̸�: " + userInformation.getName());
							System.out.println("������ ���ɱ�: " + userInformation.getAge());
							System.out.println("������ ������: " + userInformation.getJob());
							System.out.println("������ �ֹι�ȣ: " + userInformation.getResidentRegistrationNumber());
							System.out.println("������ ��ȭ��ȣ: " + userInformation.getPhoneNumber());
							System.out.println("������ �̸���: " + userInformation.getEmail());
							System.out.println("������ �ּ�: " + userInformation.getAddress());

							// ���� ��ǰ ���� ������ ����
							System.out
									.println("�̸�: " + acceptedWInsuranceList.get(i).getWholelife().getInsuranceName());
							System.out.println("�⺻�����: " + acceptedWInsuranceList.get(i).getBasicInsurance());
							System.out.println("���ػ�������(Ư��)= " + wholeLifeInsurance.disasterDeath);
							System.out.println("���ذ��������(Ư��)= " + wholeLifeInsurance.disasterFracture);
							System.out.println("���ػ��غ����(Ư��)= " + wholeLifeInsurance.disasterInjury);
							System.out.println("�Կ������(Ư��)= " + wholeLifeInsurance.hospitalization);
							System.out.println("���������(Ư��)= " + wholeLifeInsurance.operation);
							System.out.println(
									"���� �ֱ�(����): " + acceptedWInsuranceList.get(i).getWholelife().getPaymentFrequency());
							System.out.println(
									"���� �Ⱓ(��): " + acceptedWInsuranceList.get(i).getWholelife().getPaymentTerm());

							UserInformation userInfo = new UserInformation(false, ageSegment.SECOND,
									jobTitle.DAILYWORKER);
							int money = (int) acceptedWInsuranceList.get(i).calculate(userInfo);
							System.out.println("�� ����� = " + (money + wholeLifeInsurance.disasterDeath
									+ wholeLifeInsurance.disasterFracture + wholeLifeInsurance.disasterInjury
									+ wholeLifeInsurance.hospitalization + wholeLifeInsurance.operation));
							System.out.println("���Աݾ�= " + WCompensation.getMoney());
							System.out.println("���ػ��(Ư��)= " + wholeLifeInsurance.CDisasterDeath);
							System.out.println("���ذ���(Ư��)= " + wholeLifeInsurance.CDisasterFracture);
							System.out.println("���ػ���(Ư��)= " + wholeLifeInsurance.CDisasterInjury);
							System.out.println("�Կ�(Ư��)= " + wholeLifeInsurance.CHospitalization);
							System.out.println("����(Ư��)= " + wholeLifeInsurance.COperation);

							System.out.println("�����Ͻðڽ��ϱ�? 1.����, 2.���");
							int acceptance = scanner.nextInt();
							if (acceptance == 1) {
								userInformation.joinWInsuranceList.add(acceptedWInsuranceList.get(i));
								nominatedWUserList.add(userInformation);
								System.out.println("******** �����մϴ�. ���� ������ �Ϸ�Ǿ����ϴ�.********* ");
							} else if (acceptance == 2) {

								System.out.println("���� ��ǰ�� ����մϴ�.");
							}
						}
					}

				} else if (numb == 2) {
					System.out.println("\n" + "********����� ���� ��ǰ*********");
					if (acceptedAInsuranceList.size() == 0)
						System.out.println("������ ������ �����ϴ�.");

					else if (acceptedAInsuranceList.size() > 0) {
						for (int i = 0; i < acceptedAInsuranceList.size(); i++) {
							System.out.println("[" + (i + 1) + "]�� ������ �̸� : "
									+ acceptedAInsuranceList.get(i).getAnnuity().getInsuranceName());

							// ������ ���� ������ ����
							System.out.println("������ �̸�: " + userInformation.getName());
							System.out.println("������ ���ɱ�: " + userInformation.getAge());
							System.out.println("������ ������: " + userInformation.getJob());
							System.out.println("������ �ֹι�ȣ: " + userInformation.getResidentRegistrationNumber());
							System.out.println("������ ��ȭ��ȣ: " + userInformation.getPhoneNumber());
							System.out.println("������ �̸���: " + userInformation.getEmail());
							System.out.println("������ �ּ�: " + userInformation.getAddress());

							// ���� ��ǰ ���� ������ ����
							System.out.println("�̸�: " + acceptedAInsuranceList.get(i).getAnnuity().getInsuranceName());
							System.out.println("�⺻�����: " + acceptedAInsuranceList.get(i).getBasicInsurance());
							System.out.println(
									"���� �ֱ�(����): " + acceptedAInsuranceList.get(i).getAnnuity().getPaymentFrequency());
							System.out.println(
									"���� �Ⱓ(��): " + acceptedAInsuranceList.get(i).getAnnuity().getPaymentTerm());

							System.out.println("����� = " + AnnuityInsurance.expirationFee);
							System.out.println("�����������ڱ� = " + AnnuityInsurance.expiredMaintainFee);
							System.out.println("�ߵ�����ȯ�ޱ� = " + AnnuityInsurance.surrenderValue);

							UserInformation userInfo = new UserInformation(false, ageSegment.SECOND,
									jobTitle.DAILYWORKER);
							int money = (int) acceptedAInsuranceList.get(i).calculate(userInfo);
							System.out.println("�� ����� = " + money + "\n");

							System.out.println("�����Ͻðڽ��ϱ�? 1.����, 2.���");
							int acceptance = scanner.nextInt();
							if (acceptance == 1) {
								userInformation.joinAInsuranceList.add(acceptedAInsuranceList.get(i));
								nominatedAUserList.add(userInformation);
								System.out.println("******** �����մϴ�. ���� ������ �Ϸ�Ǿ����ϴ�.********* ");
							} else if (acceptance == 2) {

								System.out.println("���� ��ǰ�� ����մϴ�.");
							}

						}
					}

				} else if (numb == 3) {
					System.out.println("\n" + "********����� ���� ��ǰ*********");
					if (acceptedCInsuranceList.size() == 0)
						System.out.println("������ ������ �����ϴ�.");

					else if (acceptedCInsuranceList.size() > 0) {
						for (int i = 0; i < acceptedCInsuranceList.size(); i++) {
							System.out.println("[" + (i + 1) + "]�� ������ �̸� : "
									+ acceptedCInsuranceList.get(i).getCancer().getInsuranceName());

							// ������ ���� ������ ����
							System.out.println("������ �̸�: " + userInformation.getName());
							System.out.println("������ ���ɱ�: " + userInformation.getAge());
							System.out.println("������ ������: " + userInformation.getJob());
							System.out.println("������ �ֹι�ȣ: " + userInformation.getResidentRegistrationNumber());
							System.out.println("������ ��ȭ��ȣ: " + userInformation.getPhoneNumber());
							System.out.println("������ �̸���: " + userInformation.getEmail());
							System.out.println("������ �ּ�: " + userInformation.getAddress());

							// ���� ��ǰ ���� ������ ����
							System.out.println("�̸�: " + acceptedCInsuranceList.get(i).getCancer().getInsuranceName());
							System.out.println("�⺻�����: " + acceptedCInsuranceList.get(i).getBasicInsurance());
							System.out.println(
									"���� �ֱ�(����): " + acceptedCInsuranceList.get(i).getCancer().getPaymentFrequency());
							System.out
									.println("���� �Ⱓ(��): " + acceptedCInsuranceList.get(i).getCancer().getPaymentTerm());

							System.out.println("�� ���ܱ� =" + cancerInsurance.cancerDiagnosisFee);
							System.out.println("�๰ ġ��� =" + cancerInsurance.drugTreatmentFee);
							System.out.println("��缱 ġ��� =" + cancerInsurance.radiationTherapyFee);
							System.out.println("������ =" + cancerInsurance.operationFee);
							System.out.println("�Կ��� =" + cancerInsurance.hospitalizationFee);

							UserInformation userInfo = new UserInformation(false, ageSegment.SECOND,
									jobTitle.DAILYWORKER);
							int money = (int) acceptedCInsuranceList.get(i).calculate(userInfo);
							System.out.println("�� ����� = " + money + "\n");

							System.out.println("�����Ͻðڽ��ϱ�? 1.����, 2.���");
							int acceptance = scanner.nextInt();
							if (acceptance == 1) {
								userInformation.joinCInsuranceList.add(acceptedCInsuranceList.get(i));
								nominatedCUserList.add(userInformation);
								System.out.println("******** �����մϴ�. ���� ������ �Ϸ�Ǿ����ϴ�.********* ");
							} else if (acceptance == 2) {

								System.out.println("���� ��ǰ�� ����մϴ�.");
							}
						}
					}
				} else if (numb == 4) {
					System.out.println("\n" + "********����� ���� ��ǰ*********");
					if (acceptedEInsuranceList.size() == 0)
						System.out.println("������ ������ �����ϴ�.");

					else if (acceptedEInsuranceList.size() > 0) {
						for (int i = 0; i < acceptedEInsuranceList.size(); i++) {
							System.out.println("[" + (i + 1) + "]�� ������ �̸� : "
									+ acceptedEInsuranceList.get(i).getActual().getInsuranceName());

							// ������ ���� ������ ����
							System.out.println("������ �̸�: " + userInformation.getName());
							System.out.println("������ ���ɱ�: " + userInformation.getAge());
							System.out.println("������ ������: " + userInformation.getJob());
							System.out.println("������ �ֹι�ȣ: " + userInformation.getResidentRegistrationNumber());
							System.out.println("������ ��ȭ��ȣ: " + userInformation.getPhoneNumber());
							System.out.println("������ �̸���: " + userInformation.getEmail());
							System.out.println("������ �ּ�: " + userInformation.getAddress());

							// ���� ��ǰ ���� ������ ����
							System.out.println("�̸�: " + acceptedEInsuranceList.get(i).getActual().getInsuranceName());
							System.out.println("�⺻�����: " + acceptedEInsuranceList.get(i).getBasicInsurance());
							System.out.println("�ڱ�δ��= " + actualInsurance.selfBurdenFee);
							System.out.println(
									"���� �ֱ�(����): " + acceptedEInsuranceList.get(i).getActual().getPaymentFrequency());
							System.out
									.println("���� �Ⱓ(��): " + acceptedEInsuranceList.get(i).getActual().getPaymentTerm());

							System.out.println("�Կ���= " + actualInsurance.hospitalizationFee);
							System.out.println("����ܷ���= " + actualInsurance.outpatientFee);
							System.out.println("���������= " + actualInsurance.outpatientMedicineFee);

							UserInformation userInfo = new UserInformation(false, ageSegment.SECOND,
									jobTitle.DAILYWORKER);
							int money = (int) acceptedEInsuranceList.get(i).calculate(userInfo);
							System.out.println("�� ����� = " + money + "\n");

							System.out.println("�����Ͻðڽ��ϱ�? 1.����, 2.���");
							int acceptance = scanner.nextInt();
							if (acceptance == 1) {
								userInformation.joinEInsuranceList.add(acceptedEInsuranceList.get(i));
								nominatedEUserList.add(userInformation);
								System.out.println("******** �����մϴ�. ���� ������ �Ϸ�Ǿ����ϴ�.********* ");
							} else if (acceptance == 2) {

								System.out.println("���� ��ǰ�� ����մϴ�.");
							}

						}
					}
				}

				break;

			case 4:

				// U/W�� ��ǰ �����ϱ�
				System.out.println("U/W�� ������ �����ϼ���.");
				System.out.println("1. ���ź���");
				System.out.println("2. ���ݺ���");
				System.out.println("3. �Ϻ���");
				System.out.println("4. �Ǻ���");

				int numbe = scanner.nextInt();

				if (numbe == 1) {
					System.out.println("\n" + "********���Ե� ���� ��ǰ*********");
					if (nominatedWUserList.size() == 0)
						System.out.println("���Ե� ������ �����ϴ�.");
					else if (nominatedWUserList.size() > 0) {
						for (int i = 0; i < nominatedWUserList.size(); i++) {
							System.out.println("[" + i + "] �̸�: " + nominatedWUserList.get(i).getName());
						}
						System.out.println("�����ڸ� �����Ͻÿ�: ");
						int userNum = scanner.nextInt();

						// ����� ���� ��ǰ ���� ������ ����
						System.out.println("������ �̸� = " + nominatedWUserList.get(userNum).getName());
						System.out.println("������ ���ɱ� = " + nominatedWUserList.get(userNum).getAge());
						System.out.println("������ ������ = " + nominatedWUserList.get(userNum).getJob());
						System.out.println(
								"������ �ֹι�ȣ = " + nominatedWUserList.get(userNum).getResidentRegistrationNumber());
						System.out.println("������ ��ȭ��ȣ = " + nominatedWUserList.get(userNum).getPhoneNumber());
						System.out.println("������ �̸��� = " + nominatedWUserList.get(userNum).getEmail());
						System.out.println("������ �ּ� = " + nominatedWUserList.get(userNum).getAddress());

						// ���Ե� ���� ��ǰ �����Ͽ� ���� ������ ����
						for (int i = 0; i < nominatedWUserList.size(); i++) {
							System.out.println(
									"\n[" + i + "] ���Ե� ���� �̸�: " + nominatedWUserList.get(userNum).joinWInsuranceList
											.get(i).getWholelife().getInsuranceName());
						}
						System.out.println("���Ե� ���� ��ǰ�� �����Ͻÿ�: ");
						int insuranceNum = scanner.nextInt();

						// ���� ��ǰ ���� ������ ����
						System.out.println("�����: " + nominatedWUserList.get(userNum).joinWInsuranceList
								.get(insuranceNum).getWholelife().getInsuranceName());
						System.out.println("�⺻�����: " + nominatedWUserList.get(userNum).joinWInsuranceList
								.get(insuranceNum).getBasicInsurance());
						System.out.println("���� �ֱ�(��): " + nominatedWUserList.get(userNum).joinWInsuranceList
								.get(insuranceNum).getWholelife().getPaymentFrequency());
						System.out.println("���� �Ⱓ(��): " + nominatedWUserList.get(userNum).joinWInsuranceList
								.get(insuranceNum).getWholelife().getPaymentTerm());

						System.out.println("Ÿ���� ���� ���� Ȯ��: 1.���� , 2.���� ");
						int confirmNum = scanner.nextInt();

						if (confirmNum == 1) {
							System.out.println("������ ������ �� �����ϴ�.");
						} else if (confirmNum == 2) {
							System.out.println("���Խ��� �Ͻðڽ��ϱ�? 1.����, 2.�ź�");
							int acceptanceNum = scanner.nextInt();
							if (acceptanceNum == 1) {
								acceptedWUserList.add(nominatedWUserList.get(userNum));
								nominatedWUserList.remove(userNum);

								System.out.println("�����ǰ ������ ���εǾ����ϴ�.");
							} else if (acceptanceNum == 2) {

								nominatedWUserList.remove(userNum);
								System.out.println("�����ǰ ������ ��ҵǾ����ϴ�.");
							}
						}

					} else if (numbe == 2) {
						System.out.println("\n" + "********���Ե� ���� ��ǰ*********");
						if (nominatedAUserList.size() == 0)
							System.out.println("���Ե� ������ �����ϴ�.");
						else if (nominatedAUserList.size() > 0) {
							for (int i = 0; i < nominatedAUserList.size(); i++) {
								System.out.println("[" + i + "] �̸�: " + nominatedAUserList.get(i).getName());
							}
							System.out.println("�����ڸ� �����Ͻÿ�: ");
							int userNum = scanner.nextInt();

							// ����� ���� ��ǰ ���� ������ ����
							System.out.println("������ �̸� = " + nominatedAUserList.get(userNum).getName());
							System.out.println("������ ���ɱ� = " + nominatedAUserList.get(userNum).getAge());
							System.out.println("������ ������ = " + nominatedAUserList.get(userNum).getJob());
							System.out.println(
									"������ �ֹι�ȣ = " + nominatedAUserList.get(userNum).getResidentRegistrationNumber());
							System.out.println("������ ��ȭ��ȣ = " + nominatedAUserList.get(userNum).getPhoneNumber());
							System.out.println("������ �̸��� = " + nominatedAUserList.get(userNum).getEmail());
							System.out.println("������ �ּ� = " + nominatedAUserList.get(userNum).getAddress());

							// ���Ե� ���� ��ǰ �����Ͽ� ���� ������ ����
							for (int i = 0; i < nominatedAUserList.size(); i++) {
								System.out.println(
										"\n[" + i + "] ���Ե� ���� �̸�: " + nominatedAUserList.get(userNum).joinAInsuranceList
												.get(i).getAnnuity().getInsuranceName());
							}
							System.out.println("���Ե� ���� ��ǰ�� �����Ͻÿ�: ");
							int insuranceNum = scanner.nextInt();

							// ���� ��ǰ ���� ������ ����
							System.out.println("�����: " + nominatedAUserList.get(userNum).joinAInsuranceList
									.get(insuranceNum).getAnnuity().getInsuranceName());
							System.out.println("�⺻�����: " + nominatedAUserList.get(userNum).joinAInsuranceList
									.get(insuranceNum).getBasicInsurance());
							System.out.println("���� �ֱ�(��): " + nominatedAUserList.get(userNum).joinAInsuranceList
									.get(insuranceNum).getAnnuity().getPaymentFrequency());
							System.out.println("���� �Ⱓ(��): " + nominatedAUserList.get(userNum).joinAInsuranceList
									.get(insuranceNum).getAnnuity().getPaymentTerm());

							System.out.println("Ÿ���� ���� ���� Ȯ��: 1.���� , 2.���� ");
							int confirmNum = scanner.nextInt();

							if (confirmNum == 1) {
								System.out.println("������ ������ �� �����ϴ�.");
							} else if (confirmNum == 2) {
								System.out.println("���Խ��� �Ͻðڽ��ϱ�? 1.����, 2.�ź�");
								int acceptanceNum = scanner.nextInt();
								if (acceptanceNum == 1) {
									acceptedAUserList.add(nominatedAUserList.get(userNum));
									nominatedAUserList.remove(userNum);

									System.out.println("�����ǰ ������ ���εǾ����ϴ�.");
								} else if (acceptanceNum == 2) {

									nominatedAUserList.remove(userNum);
									System.out.println("�����ǰ ������ ��ҵǾ����ϴ�.");
								}
							}
						}
					} else if (numbe == 3) {
						System.out.println("\n" + "********���Ե� ���� ��ǰ*********");
						if (nominatedCUserList.size() == 0)
							System.out.println("���Ե� ������ �����ϴ�.");
						else if (nominatedCUserList.size() > 0) {
							for (int i = 0; i < nominatedCUserList.size(); i++) {
								System.out.println("[" + i + "] �̸�: " + nominatedCUserList.get(i).getName());
							}
							System.out.println("�����ڸ� �����Ͻÿ�: ");
							int userNum = scanner.nextInt();

							// ����� ���� ��ǰ ���� ������ ����
							System.out.println("������ �̸� = " + nominatedCUserList.get(userNum).getName());
							System.out.println("������ ���ɱ� = " + nominatedCUserList.get(userNum).getAge());
							System.out.println("������ ������ = " + nominatedCUserList.get(userNum).getJob());
							System.out.println(
									"������ �ֹι�ȣ = " + nominatedCUserList.get(userNum).getResidentRegistrationNumber());
							System.out.println("������ ��ȭ��ȣ = " + nominatedCUserList.get(userNum).getPhoneNumber());
							System.out.println("������ �̸��� = " + nominatedCUserList.get(userNum).getEmail());
							System.out.println("������ �ּ� = " + nominatedCUserList.get(userNum).getAddress());

							// ���Ե� ���� ��ǰ �����Ͽ� ���� ������ ����
							for (int i = 0; i < nominatedCUserList.size(); i++) {
								System.out.println(
										"\n[" + i + "] ���Ե� ���� �̸�: " + nominatedCUserList.get(userNum).joinCInsuranceList
												.get(i).getCancer().getInsuranceName());
							}
							System.out.println("���Ե� ���� ��ǰ�� �����Ͻÿ�: ");
							int insuranceNum = scanner.nextInt();

							// ���� ��ǰ ���� ������ ����
							System.out.println("�����: " + nominatedCUserList.get(userNum).joinCInsuranceList
									.get(insuranceNum).getCancer().getInsuranceName());
							System.out.println("�⺻�����: " + nominatedCUserList.get(userNum).joinCInsuranceList
									.get(insuranceNum).getBasicInsurance());
							System.out.println("���� �ֱ�(��): " + nominatedCUserList.get(userNum).joinCInsuranceList
									.get(insuranceNum).getCancer().getPaymentFrequency());
							System.out.println("���� �Ⱓ(��): " + nominatedCUserList.get(userNum).joinCInsuranceList
									.get(insuranceNum).getCancer().getPaymentTerm());

							System.out.println("Ÿ���� ���� ���� Ȯ��: 1.���� , 2.���� ");
							int confirmNum = scanner.nextInt();

							if (confirmNum == 1) {
								System.out.println("������ ������ �� �����ϴ�.");
							} else if (confirmNum == 2) {
								System.out.println("���Խ��� �Ͻðڽ��ϱ�? 1.����, 2.�ź�");
								int acceptanceNum = scanner.nextInt();
								if (acceptanceNum == 1) {
									acceptedCUserList.add(nominatedCUserList.get(userNum));
									nominatedCUserList.remove(userNum);

									System.out.println("�����ǰ ������ ���εǾ����ϴ�.");
								} else if (acceptanceNum == 2) {

									nominatedCUserList.remove(userNum);
									System.out.println("�����ǰ ������ ��ҵǾ����ϴ�.");
								}
							}
						}
					} else if (numbe == 4) {
						System.out.println("\n" + "********���Ե� ���� ��ǰ*********");
						if (nominatedEUserList.size() == 0)
							System.out.println("���Ե� ������ �����ϴ�.");
						else if (nominatedEUserList.size() > 0) {
							for (int i = 0; i < nominatedEUserList.size(); i++) {
								System.out.println("[" + i + "] �̸�: " + nominatedEUserList.get(i).getName());
							}
							System.out.println("�����ڸ� �����Ͻÿ�: ");
							int userNum = scanner.nextInt();

							// ����� ���� ��ǰ ���� ������ ����
							System.out.println("������ �̸� = " + nominatedEUserList.get(userNum).getName());
							System.out.println("������ ���ɱ� = " + nominatedEUserList.get(userNum).getAge());
							System.out.println("������ ������ = " + nominatedEUserList.get(userNum).getJob());
							System.out.println(
									"������ �ֹι�ȣ = " + nominatedEUserList.get(userNum).getResidentRegistrationNumber());
							System.out.println("������ ��ȭ��ȣ = " + nominatedEUserList.get(userNum).getPhoneNumber());
							System.out.println("������ �̸��� = " + nominatedEUserList.get(userNum).getEmail());
							System.out.println("������ �ּ� = " + nominatedEUserList.get(userNum).getAddress());

							// ���Ե� ���� ��ǰ �����Ͽ� ���� ������ ����
							for (int i = 0; i < nominatedEUserList.size(); i++) {
								System.out.println(
										"\n[" + i + "] ���Ե� ���� �̸�: " + nominatedEUserList.get(userNum).joinEInsuranceList
												.get(i).getActual().getInsuranceName());
							}
							System.out.println("���Ե� ���� ��ǰ�� �����Ͻÿ�: ");
							int insuranceNum = scanner.nextInt();

							// ���� ��ǰ ���� ������ ����
							System.out.println("�����: " + nominatedEUserList.get(userNum).joinEInsuranceList
									.get(insuranceNum).getActual().getInsuranceName());
							System.out.println("�⺻�����: " + nominatedEUserList.get(userNum).joinEInsuranceList
									.get(insuranceNum).getBasicInsurance());
							System.out.println("���� �ֱ�(��): " + nominatedEUserList.get(userNum).joinEInsuranceList
									.get(insuranceNum).getActual().getPaymentFrequency());
							System.out.println("���� �Ⱓ(��): " + nominatedEUserList.get(userNum).joinEInsuranceList
									.get(insuranceNum).getActual().getPaymentTerm());

							System.out.println("Ÿ���� ���� ���� Ȯ��: 1.���� , 2.���� ");
							int confirmNum = scanner.nextInt();

							if (confirmNum == 1) {
								System.out.println("������ ������ �� �����ϴ�.");
							} else if (confirmNum == 2) {
								System.out.println("���Խ��� �Ͻðڽ��ϱ�? 1.����, 2.�ź�");
								int acceptanceNum = scanner.nextInt();
								if (acceptanceNum == 1) {
									acceptedEUserList.add(nominatedEUserList.get(userNum));
									nominatedEUserList.remove(userNum);

									System.out.println("�����ǰ ������ ���εǾ����ϴ�.");
								} else if (acceptanceNum == 2) {

									nominatedEUserList.remove(userNum);
									System.out.println("�����ǰ ������ ��ҵǾ����ϴ�.");
								}
							}
						}
					}

				}break;
				case 5:
					
					
					UserInformation userInformation1 = new UserInformation(false, null, null);
					userInformation1.setName("���̻���");
					userInformation1.setAge(ageSegment.FIRST);
					userInformation1.setGender(true);
					userInformation1.setJob(jobTitle.STUDENT);
					userInformation1.setResidentRegistrationNumber("971111-2111111");
					userInformation1.setPhoneNumber("010-1234-5678");
					userInformation1.setEmail("Aplus@naver.com");
					userInformation1.setAddress("����");
					
					//��� ü���ϱ�
					System.out.println("��� ü���� ������ �����ϼ���.");
					System.out.println("1. ���ź���");
					System.out.println("2. ���ݺ���");
					System.out.println("3. �Ϻ���");
					System.out.println("4. �Ǻ���");
					
					int numberr = scanner.nextInt();

					if (numberr == 1) {
						System.out.println("\n" + "********���Ե� ���� ��ǰ*********");
						if (acceptedWUserList.size() == 0)
							System.out.println("���Ե� ������ �����ϴ�.");
						else if (acceptedWUserList.size() > 0) {
							for (int i = 0; i < acceptedWUserList.size(); i++) {
								System.out.println("[" + i + "] �̸�: " + acceptedWUserList.get(i).getName());
							}
							System.out.println("�����ڸ� �����Ͻÿ�: ");
							int userNum = scanner.nextInt();


							// ���Ե� ���� ��ǰ �����Ͽ� ���� ������ ����
							for (int i = 0; i < acceptedWUserList.size(); i++) {
								System.out.println(
										"\n[" + i + "] ���Ե� ���� �̸�: " + acceptedWUserList.get(userNum).joinWInsuranceList
												.get(i).getWholelife().getInsuranceName());
							
							System.out.println("���Ե� ���� ��ǰ�� �����Ͻÿ�: ");
							int insuranceNum = scanner.nextInt();
							//���� �ݾ� ���� ����
							
							System.out.println("���Աݾ�= " + WCompensation.getMoney());
							System.out.println("���ػ��(Ư��)= " + wholeLifeInsurance.CDisasterDeath);
							System.out.println("���ذ���(Ư��)= " + wholeLifeInsurance.CDisasterFracture);
							System.out.println("���ػ���(Ư��)= " + wholeLifeInsurance.CDisasterInjury);
							System.out.println("�Կ�(Ư��)= " + wholeLifeInsurance.CHospitalization);
							System.out.println("����(Ư��)= " + wholeLifeInsurance.COperation);
							
							
							UserInformation userInfo = new UserInformation(false, ageSegment.SECOND,
									jobTitle.DAILYWORKER);
							int money = (int) acceptedWInsuranceList.get(i).calculate(userInfo);
							System.out.println("�� ����� = " + (money + wholeLifeInsurance.disasterDeath
									+ wholeLifeInsurance.disasterFracture + wholeLifeInsurance.disasterInjury
									+ wholeLifeInsurance.hospitalization + wholeLifeInsurance.operation));
							
							System.out.println("����� ü���Ͻðڽ��ϱ�? 1.ü��, 2.���");
							int acceptance = scanner.nextInt();
							if (acceptance == 1) {
								System.out.println("******** ����� ü��Ǿ����ϴ�.******** ");
							} else if (acceptance == 2) {

								System.out.println("��� ü���� ����մϴ�.");
							}
			}
		}
					}else if (numberr == 2) {
						System.out.println("\n" + "********���Ե� ���� ��ǰ*********");
						if (acceptedAUserList.size() == 0)
							System.out.println("���Ե� ������ �����ϴ�.");
						else if (acceptedAUserList.size() > 0) {
							for (int i = 0; i < acceptedAUserList.size(); i++) {
								System.out.println("[" + i + "] �̸�: " + acceptedAUserList.get(i).getName());
							}
							System.out.println("�����ڸ� �����Ͻÿ�: ");
							int userNum = scanner.nextInt();

							// ���Ե� ���� ��ǰ �����Ͽ� ���� ������ ����
							for (int i = 0; i < acceptedAUserList.size(); i++) {
								System.out.println(
										"\n[" + i + "] ���Ե� ���� �̸�: " + acceptedAUserList.get(userNum).joinAInsuranceList
												.get(i).getAnnuity().getInsuranceName());
							
							System.out.println("���Ե� ���� ��ǰ�� �����Ͻÿ�: ");
							int insuranceNum = scanner.nextInt();
							
							//���� �ݾ� ���� ����
							
							System.out.println("�� ����� = " + designedAInsuranceList.get(i).getBasicInsurance() + "\n");
							System.out.println("���� : " + AnnuityInsurance.amountFee);
							System.out.println("����� : " + AnnuityInsurance.expirationFee);
							System.out.println("�����������ڱ�: " + AnnuityInsurance.expiredMaintainFee);
							System.out.println("�ߵ�����ȯ�ޱ�: " + AnnuityInsurance.surrenderValue);			
							
							UserInformation userInfo = new UserInformation(false, ageSegment.SECOND,
									jobTitle.DAILYWORKER);
							
							System.out.println("����� ü���Ͻðڽ��ϱ�? 1.ü��, 2.���");
							int acceptance = scanner.nextInt();
							if (acceptance == 1) {
								System.out.println("******** ����� ü��Ǿ����ϴ�.******** ");
							} else if (acceptance == 2) {

								System.out.println("��� ü���� ����մϴ�.");
							}
			}
		}
					}else if (numberr == 3) {
						System.out.println("\n" + "********���Ե� ���� ��ǰ*********");
						if (acceptedCUserList.size() == 0)
							System.out.println("���Ե� ������ �����ϴ�.");
						else if (acceptedCUserList.size() > 0) {
							for (int i = 0; i < acceptedCUserList.size(); i++) {
								System.out.println("[" + i + "] �̸�: " + acceptedCUserList.get(i).getName());
							}
							System.out.println("�����ڸ� �����Ͻÿ�: ");
							int userNum = scanner.nextInt();
						
							// ���Ե� ���� ��ǰ �����Ͽ� ���� ������ ����
							for (int i = 0; i < acceptedCUserList.size(); i++) {
								System.out.println(
										"\n[" + i + "] ���Ե� ���� �̸�: " + acceptedCUserList.get(userNum).joinCInsuranceList
												.get(i).getCancer().getInsuranceName());
							
							System.out.println("���Ե� ���� ��ǰ�� �����Ͻÿ�: ");
							int insuranceNum = scanner.nextInt();
							
							
							
							//���� �ݾ� ���� ����
							
					System.out.println("�� ���ܱ� =" + cancerInsurance.cancerDiagnosisFee);
					System.out.println("�๰ ġ��� =" + cancerInsurance.drugTreatmentFee);
					System.out.println("��缱 ġ��� =" + cancerInsurance.radiationTherapyFee);
					System.out.println("������ =" + cancerInsurance.operationFee);
					System.out.println("�Կ��� =" + cancerInsurance.hospitalizationFee);
					
					UserInformation userInfo = new UserInformation(false, ageSegment.SECOND,
							jobTitle.DAILYWORKER);
					int money = (int) acceptedCInsuranceList.get(i).calculate(userInfo);
					System.out.println("�� ����� = " + money + "\n");
					
					System.out.println("����� ü���Ͻðڽ��ϱ�? 1.ü��, 2.���");
					int acceptance = scanner.nextInt();
					if (acceptance == 1) {
						System.out.println("******** ����� ü��Ǿ����ϴ�.******** ");
					} else if (acceptance == 2) {

						System.out.println("��� ü���� ����մϴ�.");
					}
			}
		}
					}else if (numberr == 4) {
						System.out.println("\n" + "********���Ե� ���� ��ǰ*********");
						if (acceptedEUserList.size() == 0)
							System.out.println("���Ե� ������ �����ϴ�.");
						else if (acceptedEUserList.size() > 0) {
							for (int i = 0; i < acceptedEUserList.size(); i++) {
								System.out.println("[" + i + "] �̸�: " + acceptedEUserList.get(i).getName());
							}
							System.out.println("�����ڸ� �����Ͻÿ�: ");
							int userNum = scanner.nextInt();
						
							// ���Ե� ���� ��ǰ �����Ͽ� ���� ������ ����
							for (int i = 0; i < acceptedEUserList.size(); i++) {
								System.out.println(
										"\n[" + i + "] ���Ե� ���� �̸�: " + acceptedEUserList.get(userNum).joinWInsuranceList
												.get(i).getWholelife().getInsuranceName());
							
							System.out.println("���Ե� ���� ��ǰ�� �����Ͻÿ�: ");
							int insuranceNum = scanner.nextInt();
							
							System.out.println("�Կ���= " + actualInsurance.hospitalizationFee);
							System.out.println("����ܷ���= " + actualInsurance.outpatientFee);
							System.out.println("���������= " + actualInsurance.outpatientMedicineFee);

							UserInformation userInfo = new UserInformation(false, ageSegment.SECOND,
									jobTitle.DAILYWORKER);
							int money = (int) acceptedEInsuranceList.get(i).calculate(userInfo);
							System.out.println("�� ����� = " + money + "\n");
							
							System.out.println("����� ü���Ͻðڽ��ϱ�? 1.ü��, 2.���");
							int acceptance = scanner.nextInt();
							if (acceptance == 1) {
								System.out.println("******** ����� ü��Ǿ����ϴ�.******** ");
							} else if (acceptance == 2) {

								System.out.println("��� ü���� ����մϴ�.");
							}
							
							
						
				
			}
		}
						
					
					}
					break;
				case 6:
					
					UserInformation userInformation2 = new UserInformation(false, null, null);
					userInformation2.setName("���̻���");
					userInformation2.setResidentRegistrationNumber("971111-2111111");

					
					//��� ü���ϱ�
					System.out.println("����ó���� ������ �����ϼ���.");
					System.out.println("1. ���ź���");
					System.out.println("2. ���ݺ���");
					System.out.println("3. �Ϻ���");
					System.out.println("4. �Ǻ���");
					
					int numberrr = scanner.nextInt();
					
					if (numberrr == 1) {
						System.out.println("\n" + "********���Ե� ���� ��ǰ*********");
						if (acceptedWUserList.size() == 0)
							System.out.println("���Ե� ������ �����ϴ�.");
						else if (acceptedWUserList.size() > 0) {
							for (int i = 0; i < acceptedWUserList.size(); i++) {
								System.out.println("[" + i + "] �̸�: " + acceptedWUserList.get(i).getName());
							
							System.out.println("�����ڸ� �����Ͻÿ�: ");}
							int userNum = scanner.nextInt();
							
							// ���Ե� ���� ��ǰ �����Ͽ� ���� ������ ����
							for (int i = 0; i < acceptedWUserList.size(); i++) {
								System.out.println(
										"\n[" + i + "] ���Ե� ���� �̸�: " + acceptedWUserList.get(userNum).joinWInsuranceList
												.get(i).getWholelife().getInsuranceName());
							
							System.out.println("���Ե� ���� ��ǰ�� �����Ͻÿ�: ");
							int insuranceNum = scanner.nextInt();
							//���� �ݾ� ���� ����
							System.out.println("�����: " + acceptedWUserList.get(userNum).joinWInsuranceList
									.get(insuranceNum).getWholelife().getInsuranceName());
							System.out.println("���� �ֱ�(��): " + acceptedWUserList.get(userNum).joinWInsuranceList
									.get(insuranceNum).getWholelife().getPaymentFrequency());
							System.out.println("���� �Ⱓ(��): " + acceptedWUserList.get(userNum).joinWInsuranceList
									.get(insuranceNum).getWholelife().getPaymentTerm());			
							System.out.println("���Աݾ�= " + WCompensation.getMoney());
							System.out.println("���ػ��(Ư��)= " + wholeLifeInsurance.CDisasterDeath);
							System.out.println("���ذ���(Ư��)= " + wholeLifeInsurance.CDisasterFracture);
							System.out.println("���ػ���(Ư��)= " + wholeLifeInsurance.CDisasterInjury);
							System.out.println("�Կ�(Ư��)= " + wholeLifeInsurance.CHospitalization);
							System.out.println("����(Ư��)= " + wholeLifeInsurance.COperation);

							
							System.out.println("������� �����Ͻðڽ��ϱ�? 1.����, 2.���");
							int acceptance = scanner.nextInt();
							if (acceptance == 1) {
								System.out.println("******** ������� ���޵Ǿ����ϴ�.******** ");
							} else if (acceptance == 2) {

								System.out.println("����� ������ ����մϴ�.");
							}
							
							}				
							}
			}else if (numberrr == 2) {
				System.out.println("\n" + "********���Ե� ���� ��ǰ*********");
				if (acceptedAUserList.size() == 0)
					System.out.println("���Ե� ������ �����ϴ�.");
				else if (acceptedAUserList.size() > 0) {
					for (int i = 0; i < acceptedAUserList.size(); i++) {
						System.out.println("[" + i + "] �̸�: " + acceptedAUserList.get(i).getName());
					
					System.out.println("�����ڸ� �����Ͻÿ�: ");}
					int userNum = scanner.nextInt();
					
					// ���Ե� ���� ��ǰ �����Ͽ� ���� ������ ����
					for (int i = 0; i < acceptedAUserList.size(); i++) {
						System.out.println(
								"\n[" + i + "] ���Ե� ���� �̸�: " + acceptedAUserList.get(userNum).joinAInsuranceList
										.get(i).getAnnuity().getInsuranceName());
					
					System.out.println("���Ե� ���� ��ǰ�� �����Ͻÿ�: ");
					int insuranceNum = scanner.nextInt();
					//���� �ݾ� ���� ����
					System.out.println("�����: " + acceptedAUserList.get(userNum).joinAInsuranceList
							.get(insuranceNum).getAnnuity().getInsuranceName());
					System.out.println("���� �ֱ�(��): " + acceptedAUserList.get(userNum).joinAInsuranceList
							.get(insuranceNum).getAnnuity().getPaymentFrequency());
					System.out.println("���� �Ⱓ(��): " + acceptedAUserList.get(userNum).joinAInsuranceList
							.get(insuranceNum).getAnnuity().getPaymentTerm());			
					System.out.println("����� = " + AnnuityInsurance.expirationFee);
					System.out.println("�����������ڱ� = " + AnnuityInsurance.expiredMaintainFee);
					System.out.println("�ߵ�����ȯ�ޱ� = " + AnnuityInsurance.surrenderValue);
					
					System.out.println("������� �����Ͻðڽ��ϱ�? 1.����, 2.���");
					int acceptance = scanner.nextInt();
					if (acceptance == 1) {
						System.out.println("******** ������� ���޵Ǿ����ϴ�.******** ");
					} else if (acceptance == 2) {

						System.out.println("����� ������ ����մϴ�.");
					}
					
					}				
					}
			}else if(numberrr == 3) {
				System.out.println("\n" + "********���Ե� ���� ��ǰ*********");
				if (acceptedCUserList.size() == 0)
					System.out.println("���Ե� ������ �����ϴ�.");
				else if (acceptedCUserList.size() > 0) {
					for (int i = 0; i < acceptedCUserList.size(); i++) {
						System.out.println("[" + i + "] �̸�: " + acceptedCUserList.get(i).getName());
					
					System.out.println("�����ڸ� �����Ͻÿ�: ");}
					int userNum = scanner.nextInt();
					
					// ���Ե� ���� ��ǰ �����Ͽ� ���� ������ ����
					for (int i = 0; i < acceptedCUserList.size(); i++) {
						System.out.println(
								"\n[" + i + "] ���Ե� ���� �̸�: " + acceptedCUserList.get(userNum).joinCInsuranceList
										.get(i).getCancer().getInsuranceName());
					
					System.out.println("���Ե� ���� ��ǰ�� �����Ͻÿ�: ");
					int insuranceNum = scanner.nextInt();
					//���� �ݾ� ���� ����
					System.out.println("�����: " + acceptedCUserList.get(userNum).joinCInsuranceList
							.get(insuranceNum).getCancer().getInsuranceName());
					System.out.println("���� �ֱ�(��): " + acceptedCUserList.get(userNum).joinCInsuranceList
							.get(insuranceNum).getCancer().getPaymentFrequency());
					System.out.println("���� �Ⱓ(��): " + acceptedCUserList.get(userNum).joinCInsuranceList
							.get(insuranceNum).getCancer().getPaymentTerm());		
					
					System.out.println("�� ���ܱ� =" + cancerInsurance.cancerDiagnosisFee);
					System.out.println("�๰ ġ��� =" + cancerInsurance.drugTreatmentFee);
					System.out.println("��缱 ġ��� =" + cancerInsurance.radiationTherapyFee);
					System.out.println("������ =" + cancerInsurance.operationFee);
					System.out.println("�Կ��� =" + cancerInsurance.hospitalizationFee);

					
					System.out.println("������� �����Ͻðڽ��ϱ�? 1.����, 2.���");
					int acceptance = scanner.nextInt();
					if (acceptance == 1) {
						System.out.println("******** ������� ���޵Ǿ����ϴ�.******** ");
					} else if (acceptance == 2) {

						System.out.println("����� ������ ����մϴ�.");
					}
					
					}				
					}
			}else if(numberrr == 4) {
				System.out.println("\n" + "********���Ե� ���� ��ǰ*********");
				if (acceptedEUserList.size() == 0)
					System.out.println("���Ե� ������ �����ϴ�.");
				else if (acceptedEUserList.size() > 0) {
					for (int i = 0; i < acceptedEUserList.size(); i++) {
						System.out.println("[" + i + "] �̸�: " + acceptedEUserList.get(i).getName());
					
					System.out.println("�����ڸ� �����Ͻÿ�: ");}
					int userNum = scanner.nextInt();
					
					// ���Ե� ���� ��ǰ �����Ͽ� ���� ������ ����
					for (int i = 0; i < acceptedEUserList.size(); i++) {
						System.out.println(
								"\n[" + i + "] ���Ե� ���� �̸�: " + acceptedEUserList.get(userNum).joinEInsuranceList
										.get(i).getActual().getInsuranceName());
					
					System.out.println("���Ե� ���� ��ǰ�� �����Ͻÿ�: ");
					int insuranceNum = scanner.nextInt();
					//���� �ݾ� ���� ����
					System.out.println("�����: " + acceptedEUserList.get(userNum).joinEInsuranceList
							.get(insuranceNum).getActual().getInsuranceName());
					System.out.println("���� �ֱ�(��): " + acceptedEUserList.get(userNum).joinEInsuranceList
							.get(insuranceNum).getActual().getPaymentFrequency());
					System.out.println("���� �Ⱓ(��): " + acceptedEUserList.get(userNum).joinEInsuranceList
							.get(insuranceNum).getActual().getPaymentTerm());		
					
					System.out.println("�Կ���= " + actualInsurance.hospitalizationFee);
					System.out.println("����ܷ���= " + actualInsurance.outpatientFee);
					System.out.println("���������= " + actualInsurance.outpatientMedicineFee);
					
					System.out.println("������� �����Ͻðڽ��ϱ�? 1.����, 2.���");
					int acceptance = scanner.nextInt();
					if (acceptance == 1) {
						System.out.println("******** ������� ���޵Ǿ����ϴ�.******** ");
					} else if (acceptance == 2) {

						System.out.println("����� ������ ����մϴ�.");
					}
					
					}				
					}
			}
		}
						}
					
}
}