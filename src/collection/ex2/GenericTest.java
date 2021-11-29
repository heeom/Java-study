package collection.ex2;

/**
 * 제네릭의 필요성
 * 컴파일 단계에서는 Error가 발생하지 않고, runtime에 Cast오류가 발생하는 상황
 * 제네릭을 사용하면 -> 컴파일 단계에서 타입 체크를 하기 때문에, runtime에 cast오류가 발생하지 않는다.
 */

public class GenericTest {
    public static void main(String[] args) {

        Person person = new Person(new Student(100));
        System.out.println(person.getObj());

        Teacher teacher = (Teacher) person.obj;//Student 객체는 Teacher type으로 참조할 수 없다.
        //컴파일타임에는 Error가 발생하지 않고, 런타임에 에러가 발생한다
        //Exception in thread "main" java.lang.ClassCastException:
        // class collection.ex2.Student cannot be cast to class collection.ex2.Teacher
        // (collection.ex2.Student and collection.ex2.Teacher are in unnamed module of loader 'app')
        // at collection.ex2.GenericTest.main(GenericTest.java:15)
    }
}
