public class WrapperClassPractice {
    public static void main(String[] args) {
        /** 박싱, 언바싱 예 **/
        Integer boxing = new Integer(11); //박싱
        int unBoxing = boxing.intValue(); //언박싱
        /** ~박싱, 언바싱 예 **/

        /** 오토박싱, 오토언바싱 예 **/
        Integer autoBoxing = 12; //오토박싱
        int autoUnBoxing = autoBoxing; //오토언박싱
        /** ~오토박싱, 오토언바싱 예 **/
    }
}
