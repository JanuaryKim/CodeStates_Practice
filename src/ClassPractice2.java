public class ClassPractice2 {
    public static void main(String[] args) {

    }
}

class OverLoadClass{

    public void print(){
        System.out.println(this.getClass().getName());
    }

    public void print(String param){
        System.out.printf("매개변수는 %d 입니다", param);
        System.out.println();
    }

    public void print(Integer i1, Integer i2){


        System.out.printf("매개변수는 %d , %d 입니다",i1, i2);
        System.out.println();
    }
//    public String print(Integer i1, Integer i2){ //에러, 반환형만 다르므로 오버로드 규칙에 맞지 않음.
//
//        return "반환형만 다름";
//    }

}
