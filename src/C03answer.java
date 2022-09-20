import java.util.Scanner;

public class C03answer {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Up & Down 게임입니다. 숨겨진 수를 맞추어 보세요");
        System.out.println("0-99");
        int goal = 68;
        int high = 99;
        int low = 0;
        int cnt = 0;
        int no = 1;
        boolean y;

        System.out.print(no + ">>" );
        int num = scan.nextInt();

        while (num != goal)
        {

            if(num > goal)
            {
                System.out.println("더 낮게");
                high = num;
            }
            else if (num < goal)
            {
                System.out.println("더 높게");
                low = num;

            }

            no++;
            System.out.println(low+"-"+high);
            System.out.print(no + ">>" );
            num = scan.nextInt();
        }

        System.out.println("맞았습니다.");
        System.out.print("다시 하시겠습니까?(y/n)>> ");
        y = scan.hasNext();

    }
}
