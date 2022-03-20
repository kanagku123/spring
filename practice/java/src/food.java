import java.sql.SQLOutput;
import java.util.*;

public class food {
    public static void main(String[] args) {

        System.out.println("저장할 음식 이름 입력:");
        List<String> foods = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String food = scanner.nextLine();

                if(food.equals("0")){
                    System.out.println(foods);
                    break;
                }

                if(foods.contains(food)){
                    System.out.println("이미 목록에 있습니다");

                }else {
                    foods.add(food);
                }
            Collections.sort(foods);
            System.out.println(foods);
        }
    }
}
