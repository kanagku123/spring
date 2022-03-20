import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        /*for(int i=2;i<10;i++){
            for(int j=1;j<10;j++){
                System.out.println(i + "*" + j + "=" + (i*j));
            }
        }*/

 /*       String pwd = "abc123";
        Scanner scanner = new Scanner(System.in);

        System.out.println("비밀번호 입력 : ");
        String input =scanner.nextLine();

        while(input.equals(pwd)!= true){
            System.out.println("올바른 비밀번호를 입력해주세요 : ");
            input = scanner.nextLine();
        }

        System.out.println("올바른 비밀번호를 입력했습니다.");

        */
        /* String[] days =
                {"월","화","수","목","금"}
                {"월","화","수","목","금"}
                {"월","화","수","목","금"};
        System.out.println(days[0]);
        System.out.println(days[4]);

        int lenthOfDays = days.length;
        System.out.println(lenthOfDays);

        for(int i=0;i<days.length;i++){
            System.out.println(days[i] + "요일");

        }
        System.out.println(days);
        System.out.println(Arrays.toString(days));
        */

        System.out.println("지금부터 0~255 사이에서 숫자를 하나 뽑겠습니다");
        System.out.println("여러분은 제가 뽑은 숫자를 맞춰야합니다");
        Random random = new Random();
        int randomNumber = random.nextInt(256);
        Scanner scanner = new Scanner(System.in);

        for(int i=0;  i < 8 ; i++){
            System.out.println(8 - i + "번의 기회가 있습니다");
            System.out.println("추측한 숫자를 입력하세요");
            String input = scanner.nextLine();
            int guess = Integer.parseInt(input);

                if(randomNumber == guess){
                    System.out.println("정답입니다.");
                    break;
                }
                else if(randomNumber < guess ){
                    System.out.println("더 작습니다.");
                }
                else{
                    System.out.println("더 큽니다!");
                }

                if(i==7){
                    System.out.println(" 더이상 게임기회가 없습니다");
                }

        }
        System.out.println("게임을 종료합니다");


    }
}
