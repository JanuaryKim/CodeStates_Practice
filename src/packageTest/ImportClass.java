package packageTest;
import packageTest.pack.*;

public class ImportClass {
    public static void main(String[] args) {
        ImportedClass importedClass = new ImportedClass();
        System.out.println("import된 importedClass의 멤버메서드 결과 : " + importedClass.plusMethod(1,2));
    }
}
