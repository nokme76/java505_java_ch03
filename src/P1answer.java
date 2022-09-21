public class P1answer {
    public static void main(String [] args){

        System.out.println("\n---- 연습문제 1번 ----\n");

        int i= 0, sum= 0;
        while (i < 10)
        {
            i = i + 2;
            sum += i;
        }
        System.out.println(sum);;

// 문제1) 무엇을 계산하는 프로그램이며, 실행 결과는?
// 2의 배수 덧셈 , 30
// 문제2)
// i == 10 , i%2==1


        System.out.println("\n---- 연습문제 2번 ----\n");

        double sum1 = 0.0;
        double d[] = {1.0,2.3,3.4,5.5};
        for (int j = 0; j < 4; j++) sum1 += d[j];
        System.out.println(sum1);

//        문제1) 예상되는 실행 결과는 무엇인가? 1.0+2.3+3.4+5.5 = 12.2
//        문제2) for (int j = 0; j < 4; j++) 부분을 배열의  length 필드를 이용하여 수정하라
        System.out.println("---- length 수정 ----\n");
        double sum2 = 0.0;
        for (int j = 0; j < d.length; j++) sum2 += d[j];
        System.out.println(sum2);

//        문제3)while 문으로 바꾸어 작성하라
        System.out.println("---- while문으로 ----\n");
        i = 0;
        double sum3 = 0.0;
        while(i < d.length)
        {

            sum3 += d[i];
            i++;
        }
        System.out.println(sum3);

//        문제4) dowile 문으로 바꾸어 작성하라
        System.out.println("---- doWhile문으로 ----\n");

        i = 0;
        double sum4 = 0.0;
        do
        {
            sum4 += d[i];
            i++;
        }while(i < d.length);
        System.out.println(sum4);


//        문제5) foreach 문으로 바꾸어 작성하라
        System.out.println("---- forEach문으로 ----\n");
        i = 0;
        double sum5 = 0.0;
        for (double num : d)
        {
            sum5 = sum5 + num;
        }
            System.out.println(sum5);



//        foreach 문을 이용하여 배열 b를 모두 출력하고자 한다. 빈칸에 적절한 코드를 삽입하라
        System.out.println("---- forEach문으로 배열 b 출력 ----\n");

        boolean [] b = {true,false,true,true};
        for(boolean boo : b)
            System.out.println(boo);

    }
}


