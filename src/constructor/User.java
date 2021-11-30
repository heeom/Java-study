package constructor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * Builder패턴의 장점
 * -----------------------------
 * 1. 필요한 데이터만 설정할 수 있음
 * 2. 유연성, 가독성
 * -----------------------------
 * User객체 생성시 email파라미터는 필요 없다면?
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private String name;
    private String password;
    private String email;
    private String phone;

    // 생성자패턴 : email파라미터가 없는 생성자 새로 만들기
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    // 정적 메서드 패턴 : email에 "" 더미 값 넣기
    //정적 팩토리 메서드 : 메서드를 통해서 객체를 생성
    public static User of(String name, String password, String email){
        return new User(name, "1234", "", "010-1111-2222");
    }

}


