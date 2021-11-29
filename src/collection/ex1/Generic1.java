package collection.ex1;

/**
 *  제네릭의 개념과 필요성
 *  제네릭? 사용할 수 있는 객체의 타입을 미리 선언하는 것
 *  제네릭 필요성 :
 *      - 컬렉션 내부에 들어오는 객체의 타입을 확인하는 로직을 구현하거나 형변환 코드를 작성할 필요가 없다.
 *   모든 타입을 다 받는 클래스
 */
public class Generic1 {
    public static void main(String[] args) {

        Sample s1 = new Sample("hello");
        System.out.println(s1.getObj());
        s1.printInfo();

        Sample s2 = new Sample(100);
        System.out.println(s2.getObj());
        s2.printInfo();

        //s1: 문자열
        // 반환타입이 Object이므로 String으로 형변환 해야함
        String string = (String) s1.getObj();

        //s2 : Integer
        Integer number = (Integer) s2.getObj();
    }
}
