package �ӿڼ��쳣����;

public class DoctoralCandidate {
DoctoralCandidate[] x = new DoctoralCandidate[2];
        for (int e = 0; e < 2; e++) {
            x[e] = new DoctoralCandidate();
            while (true) {
                try {
                    System.out.println("����������");
                    Scanner name = new Scanner(System.in);
                    String p =name.nextLine();
                    if (p.matches("[^a-z]"))
                        throw new  AException();
                    break;
                }
                catch (AException w){
                    System.out.println("����������");
                }
            }
 System.out.println("�������Ա�");
            Scanner sex = new Scanner(System.in);
            x[e].setSex(sex.nextLine());
            while (true) {
                try {
                    System.out.println("����������");
                    Scanner age = new Scanner(System.in);
                    x[e].setAge(age.nextInt());
                    break;
                } catch (Exception q) {
                    System.out.println("�������ֵ��������������");
                }
            }
            while (true) {
                try {
                    System.out.println("������ѧ��");
                    Scanner fees = new Scanner(System.in);
                    x[e].setFees(fees.nextDouble());
                    break;
                } catch (Exception q) {
                    System.out.println("�������ֵ��������������");
                }
            }
            System.out.println("�����빤��");
            Scanner roll = new Scanner(System.in);
            x[e].setRoll(roll.nextDouble());
            System.out.println(x[e]);
        }

}
