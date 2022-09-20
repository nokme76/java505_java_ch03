import java.util.Scanner;

public class C03answer {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);


        while (true)
        {
        System.out.println("Up & Down 게임입니다. 숨겨진 수를 맞추어 보세요");
        System.out.println("0-99");
        int goal = (int)(Math.random() * 98 ) + 1 ;
//        int goal = 55;
        int high = 99;
        int low = 0;
        int no = 1;


        System.out.print(no + ">>" );
        int num = scan.nextInt();

        while (goal != num)
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
                String a ;
                a = scan.next();
                while (true)
                {
                    if (a.equals("y") || (a.equals("n")))

                    break;
                    System.out.println("잘못 입력하셨습니다.  y/n을 입력해주세요");
                    a = scan.next();
                }

                if (a.equals("n"))
                {
                    break;
                }


    }
}
}


