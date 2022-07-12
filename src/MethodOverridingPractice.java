public class MethodOverridingPractice {
    public static void main(String[] args) {
        Car torres = new Car(4, "torres", "black", null);
        Bike harley = new Bike(2, "harley-davidson", "brown", new Engine(90));
        KickBoard mito = new KickBoard(2, "mito-kickboard", "yellow", new Engine(10));

        System.out.println();
        System.out.println(torres); //상위 클래스와 하위 클래스의 변수들에 접근하여 내용 출력
        System.out.println(harley); //상위 클래스와 하위 클래스의 변수들에 접근하여 내용 출력
        System.out.println();
        System.out.println(torres.drive());
        System.out.println(harley.drive());
        System.out.println();
        torres.fix();   //정확하게 재정의 하였으므로 재정의된 메서드의 내용물이 출력
        harley.fix();   //재정의 하지 않았으므로 상위 클래스의 메서드 내용이 출력
        System.out.println();

        Vehicle[] vehicles = new Vehicle[]{torres, harley, mito};

        System.out.println(vehicles[0].drive()); //상위 클래스의 참조변수로 drive를 호출하여도 하위 클래스에서 재정의 해주었으므로 재정의된 내용 출력
        System.out.println(vehicles[1].drive()); //상위 클래스의 참조변수로 drive를 호출하여도 하위 클래스에서 재정의 해주었으므로 재정의된 내용 출력
        System.out.println();

        System.out.println("vehicles[2] (mito) 의 wheelCount = " + vehicles[2].wheelCount); //상위 클래스와 하위 클래스가 같은 명칭의 멤버변수를 가지고 있을 경우
        System.out.println("mito의 wheelCount = " + mito.wheelCount); //상위 클래스와 하위 클래스가 같은 명칭의 멤버변수를 가지고 있을 경우
        //위 2개의 출력문의 대한 결과 해석
        //멤버 메소드는 상위클래스 참조변수로 하위클래스를 담아도 하위클래스에서 재정의 되어 있다면 하위클래스의 메소드를 실행하지만
        //멤버 변수는 상위클래스 참조변수로 하위클래스를 담을시에 하위클래스에 재정의 되어있어도 상위클래스의 멤버변수 내용을 참조하게 된다.
        System.out.println();

    }
}


class Engine{

    static final int BASIC = 100;
    int capacity;

    public Engine(int capacity) {
        this.capacity = capacity;
    }
}

class Vehicle{ // Engine을 포함

    int wheelCount;
    Engine engine;

    public Vehicle(int wheelCount, Engine engine) {
        this.wheelCount = wheelCount;
        this.engine = engine == null ? new Engine(Engine.BASIC) : engine; //인자값이 null인 경우 자동으로 초기화
    }

    public String drive() {
        return String.format("해당 %s 이 질주합니다", this.getClass().getName());
    }

    public void fix() {
        System.out.println("해당 탈것을 수리 합니다");
    }
}

class Car extends Vehicle { //Vehicle을 상속(확장)

    String modelName;
    String color;

    public Car(int wheelCount, String modelName, String color, Engine engine) {
        super(wheelCount, engine); //상위 클래스가 생성자로 초기화를 해줘야 하는경우 꼭 첫번째줄에서 먼저 초기화 해주어야 한다
        this.modelName = modelName;
        this.color = color;
    }

    public String toString(){
        return String.format("이 자동차는 %s 로써 엔진 용량은 %d 이고 %d륜입니다.", modelName, engine.capacity, wheelCount);
    }

    @Override
    public String drive() {
//        super.drive();
        return String.format("자동차 %s 가 질주 합니다.", modelName);
    }

    @Override
    public void fix() {
//        super.fix();
        System.out.println("해당 자동차를 수리합니다");
    }
}

class Bike extends Vehicle { //Vehicle을 상속(확장)

    String modelName;
    String color;


    public Bike(int wheelCount, String modelName, String color, Engine engine) {
        super(wheelCount, engine); //상위 클래스가 생성자로 초기화를 해줘야 하는경우 꼭 첫번째줄에서 먼저 초기화 해주어야 한다
        this.modelName = modelName;
        this.color = color;
    }

    public String toString(){
        return String.format("이 오토바이는 %s 로써 엔진 용량은 %d 이고 %d륜입니다.", modelName, engine.capacity, wheelCount); //상속받은 상위 클래스의 필드에 접근 가능
    }

    @Override
    public String drive() {
//        super.drive();
        return String.format("바이크 %s 가 질주 합니다.", modelName);
    }

//    @Override
//    protected void fix() {        // 에러, 상위 클래스의 메서드보다 접근제어자의 범위가 좁아서 에러 발생
////        super.fix();
//        System.out.println("해당 바이크를 수리합니다");
//    }
}

class KickBoard extends Vehicle { //Vehicle을 상속(확장)

    String modelName;
    String color;
    int wheelCount; //상위 클래스와 동일한 명칭의 필드 (멤버변수) 를 선언하였다.


    public KickBoard(int wheelCount, String modelName, String color, Engine engine) {
        super(3, engine); //상위 클래스가 생성자로 초기화를 해줘야 하는경우 꼭 첫번째줄에서 먼저 초기화 해주어야 한다
        this.wheelCount = wheelCount; //상위 클래스의 wheelCount와 다른 값을 할당해 주었다.
        this.modelName = modelName;
        this.color = color;
    }

    public String toString(){
        return String.format("이 킥보드는 %s 로써 엔진 용량은 %d 이고 %d륜입니다.", modelName, engine.capacity, wheelCount); //상속받은 상위 클래스의 필드에 접근 가능
    }

    @Override
    public String drive() {
//        super.drive();
        return String.format("킥보드 %s 가 질주 합니다.", modelName);
    }

//    @Override
//    protected void fix() {        // 에러, 상위 클래스의 메서드보다 접근제어자의 범위가 좁아서 에러 발생
////        super.fix();
//        System.out.println("해당 바이크를 수리합니다");
//    }
}