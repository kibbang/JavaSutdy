package oop;
// 하나의 소스파일에는 하나의 클래스만 하는게 바람직
public class Hello2 { // 소스파일 이름은 클래스 이름과 일치 하는게 좋다.
    public static void main(String[] args) {
        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은" +t.channel+" 입니다.");
    }
}

class Tv {
    String color;
    boolean power;
    int channel;

    void power(){ power = !power; }
    void channelUp(){ ++channel; }
    void channelDown(){ --channel; }
}
