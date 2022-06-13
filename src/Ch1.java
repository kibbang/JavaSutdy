public class Ch1 {
    public static void main(String[] args) {
        /**
         * Hello World!
         * 자바에서 문자열을 표시하기 위해서는 print(), println()을 사용한다. 그리고 그 앞에 System.out을 붙인다.
         * println -> 문자열 출력 후 개행
         */
        System.out.println("Hello world");

        /**
         * printf()메소드
         * printf(): 서식을 지정하여 출력할 수 있다.
         * %d: 정수(소수점이 없는 수)를 10진수로 표시 ex) 1,2,3,45
         * %f: 실수(소수점이 있는 수)를 표시 ex) 0.1, 1.0, 2.2
         * %c: 문자('로 에워싼 문자 1개)를 표시 ex) 'a', 'A'
         * %s: 문자열("로 에워싼 1개 이상의 문자)를 표시 ex) "A", "ABC", "가"
         *
         * 공백을 포함하여 4자리로 표시 -> printf("%4d", 25)
         * 0을 사용해서 4자리로 표시 -> printf("%04d", 25)
         * ex) %8.5f : 전체를 8자리 소수점 이하를 5자리로 표시
         */
        int a = 10;
        double b = 3.24;
        System.out.printf("%10d\n", a);
        System.out.printf("X %8.5f\n",b);
        System.out.printf("-------------------\n");
        System.out.printf("%10f\n\n", a*b);

        /**
         * 변수
         * 변수란 수치나 문자등을 담아두는 상자와 같은 것
         * print(), println()은 문자열 뿐 아니라 변수도 출력 가능
         * 선언의 방법
         * 한줄로 늘어 쓰는 것도 가능
         * 선언과 동시에 대입하는 것을 '초기화'라고 한다.
         */
        int num1; // num1 변수 선언
        int num2; // num2 변수 선언
        num1 = 2; // num1에 2를 대입
        num2 = 3; // num2에 3을 대입

        int num3 = 4; // 변수 num3를 선언과 함께 4로 초기화

        num1 = num2; // 이 순간 변수 num1에 변수 num2의 값을 대입 (원래 값은 사라짐)

        System.out.println(num1);

        /**
         * 수치형
         * 수치가 들어가는 변수형에는 정수용인 정수형과 실수용인 실수형이 있다.
         * 정수형
         * byte: -128~127 8비트
         * short: -32768~32767 16비트
         * int: -2147483648~2147483647 32비트
         * long: -9223372036854775808~9223372036854775807 64비트
         * long형 변수에 정수를 대입할 경우는 수치의 뒤에 l 또는 L을 붙여서 대입한다.
         *
         * 실수형
         * float 32비트
         * double 64비트
         * float형 변수에 실수값을 대입할 경우는 수치 뒤에 f 또는 F를 붙여서 대입한다.
         */

        long l = 3000000000L;
        byte c = 127;
        short d = 10000;
        float e = 1.2f;
        double f = 0.34;

        System.out.println(l);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
