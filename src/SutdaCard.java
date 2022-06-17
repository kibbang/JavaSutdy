public class SutdaCard {
    private int num; // 카드의 숫자 사이의 정수 .(1~10 )
    private boolean isKwang; //광이면 true, 아니면 false

    public SutdaCard()
    {
        this(1, true);
    }

    public SutdaCard(int num, boolean isKwang) {

        this.num = num;
        this.isKwang = isKwang;
    }

    public String info()
    {
        return num+(isKwang? "K" : "");
    }
}

class Ex6_2{
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();
        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}