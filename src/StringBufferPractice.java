public class StringBufferPractice {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();

        int bufferCapacity = stringBuffer.capacity();
        System.out.println("bufferSize : " + bufferCapacity);

        StringBuffer totalSB = stringBuffer.append("안녕하세요").append("처음 뵙겠습니다. 제뉴어리맨이라고 합니다")
                .append("잘 부탁드립니다");

        System.out.println(totalSB);
        String str = totalSB.toString();
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(stringBuffer.capacity());
    }
}
