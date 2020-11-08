package 接口及异常处理;

public class DoctoralCandidate {
DoctoralCandidate[] x = new DoctoralCandidate[2];
        for (int e = 0; e < 2; e++) {
            x[e] = new DoctoralCandidate();
            while (true) {
                try {
                    System.out.println("请输入姓名");
                    Scanner name = new Scanner(System.in);
                    String p =name.nextLine();
                    if (p.matches("[^a-z]"))
                        throw new  AException();
                    break;
                }
                catch (AException w){
                    System.out.println("您输入有误");
                }
            }
 System.out.println("请输入性别");
            Scanner sex = new Scanner(System.in);
            x[e].setSex(sex.nextLine());
            while (true) {
                try {
                    System.out.println("请输入年龄");
                    Scanner age = new Scanner(System.in);
                    x[e].setAge(age.nextInt());
                    break;
                } catch (Exception q) {
                    System.out.println("您输入的值有误，请重新输入");
                }
            }
            while (true) {
                try {
                    System.out.println("请输入学费");
                    Scanner fees = new Scanner(System.in);
                    x[e].setFees(fees.nextDouble());
                    break;
                } catch (Exception q) {
                    System.out.println("您输入的值有误，请重新输入");
                }
            }
            System.out.println("请输入工资");
            Scanner roll = new Scanner(System.in);
            x[e].setRoll(roll.nextDouble());
            System.out.println(x[e]);
        }

}
