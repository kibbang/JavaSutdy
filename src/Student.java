public class Student {
    public String name; // 학생이름
    public int ban; // 반
    public int no; // 번호
    public int kor; // 국어점수
    public int eng; // 영어점수
    public int math; // 수학점수

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no  = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.getTotal();
        this.getAverage();
    }

    public int getTotal() // 총점
    {
        return kor+eng+math;
    }

    public float getAverage() // 평균
    {
        return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
    }

    public String info()
    {
        return name+","+no+","+ban+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
    }

}
class Ex_4 {
    public static void main(String[] args) {
        Student s = new Student("홍길동",1,1,100,60,76);

        System.out.println(s.info());
    }
}
