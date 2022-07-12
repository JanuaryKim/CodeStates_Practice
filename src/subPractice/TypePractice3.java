package subPractice;

public class TypePractice3 {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.buy(new Americano());
        customer.buy(new CaffeLatte());

        System.out.println();
        System.out.println("=".repeat(20));
        System.out.println(new Americano());
        System.out.println(new CaffeLatte());
        System.out.println("=".repeat(20));
    }
}

class Coffe{

    static final int AMERICANO = 4000;
    static final int CAFFELATTE = 4500;

    int price;

    public Coffe(int price) {
        this.price = price;
    }
}

class Americano extends Coffe {
    public Americano() {
        super(Coffe.AMERICANO);
    }

    public String toString() {
        return String.format("아메리카노의 가격은 %d원입니다", super.price);
    }
}

class CaffeLatte extends Coffe {
    public CaffeLatte() {
        super(Coffe.CAFFELATTE);
    }

    public String toString() {
        return String.format("카페라떼의 가격은 %d원입니다", super.price);
    }
}

class Customer{
    int money = 90000;

    void buy(Coffe coffe) {

        String coffeMenu = "";
        if (coffe instanceof CaffeLatte) {
            coffeMenu += "카페라떼";
        } else if (coffe instanceof Americano) {
            coffeMenu += "아메리카노";
        }

        money -= coffe.price;
        System.out.printf("고객이 %s를 구입하였고, \n현재 잔액은 %d입니다",coffeMenu, money);
        System.out.println();
    }
}