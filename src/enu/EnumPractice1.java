package enu;


enum Season{

    SPRING("봄"),
    SUMMER("여름"),
    FALL("가을"),
    WINTER("겨울");

    String krName;

    Season(String krName) {
        this.krName = krName;
    }

    public String getKrName() {
        return krName;
    }

    public void setKrName(String krName) {
        this.krName = krName;
    }
}

public class EnumPractice1 {
    public static void main(String[] args) {

        Season season1 = Season.SUMMER;
        System.out.println("season1.krName = " + season1.krName);
    }
}
