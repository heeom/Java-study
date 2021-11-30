package constructor;

public class BuilderTest {
    public static void main(String[] args) {
        //1. Builder를 이용하면 동적으로 처리할 수 있다.
        // => 필요한 데이터만 설정할 수 있으므로 불필요한 코드를 줄여준다.
        User user = User.builder()
                .name("user")
                .password("1234")
                .build();
        
        // 2. 유연성 확보
        //새로운 멤버변수 phone을 추가해야 하는 상황이라면
        //생성자로 객체를 만드는 경우에는 기존의 코드를 다 수정해야하지만
        //Builder패턴을 이용하면 기존의 코드에 영향을 주지 않으므로 유연하다.
        User user2 = new User("user2", "5678", "user2@email.com", "010-1111-2222");

        //3. 가독성 높아짐
        // 파라미터가 많아지면, 생성자 패턴의 경우 가독성이 떨어진다.
        //builder패턴의 경우 어떤 변수에 어떤 값이 설정되는지 쉽게 파악할 수 있다.
        User user3 = User.builder()
                .name("user3")
                .password("0000")
                .email("user3@email.com")
                .phone("010-0000-0000")
                .build();

    }
}
