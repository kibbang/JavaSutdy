public class Ch1 {
    public static void main(String[] args) {
        /**
         * 자바에서 묹자열을 표시하기 위해서는 print(), println()을 사용한다. 그리고 그 앞에 System.out을 붙인다.
         * println -> 문자열 출력 후 개행
         */
        System.out.println("Hello world");

        /**
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
    }
}
