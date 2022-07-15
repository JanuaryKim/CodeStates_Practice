import java.util.ArrayList;
import java.util.List;

class Ball{}
class SoccerBall extends Ball{}
class GolfBall extends Ball{}

class Basket <E> {
    List<E> list = new ArrayList<>();

    void add (E item) {
        list.add(item);
    }

    E get(int index) {
        return list.get(index);
    }

    List<E> getList() {
        return list;
    }
}

public class GenericPractice {
    public static void main(String[] args) {
        Basket<Ball> basket = new Basket<>();
        basket.add(new SoccerBall());
        basket.add(new GolfBall());

        for (Ball ball : basket.list) {
            System.out.println(ball.getClass().getName());
        }
    }
}


