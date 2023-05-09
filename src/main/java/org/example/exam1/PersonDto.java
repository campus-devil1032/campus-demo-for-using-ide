package org.example;


/**
 * 자바 클래스는 객체를 생성하는데 사용되는 설계도와 같은 것입니다.
 * 객체는 클래스의 인스턴스입니다.
 * 클래스를 정의할 때는 일반적으로 필드와 메서드를 포함합니다.
 * 필드는 클래스의 데이터 멤버입니다. 필드는 클래스에 저장된 데이터를 나타냅니다.
 * 예를 들어, Person 클래스에는 이름, 나이, 성별 등과 같은 필드가 있을 수 있습니다.
 * "메서드"는 클래스에 정의된 함수입니다.
 * 이것들은 클래스에서 수행할 수 있는 작업을 정의합니다.
 * 예를 들어, Person 클래스에는 이름을 출력하거나 나이를 계산하는 메서드가 있을 수 있습니다.
 */
public class PersonDto {
    private String name;
    private int age;

    /**
     * 생성자는 클래스를 이용해서 객체를 생성 할 때 최초 한번 불러오게 되는 특별한 메서드입니다.
     * 생성자는 클래스의 이름과 동일한 이름을 가지고, 반환 유형이 없습니다.
     * 생성자는 주로 클래스의 필드를 "초기화"하는데 사용 됩니다.
     *
     * @param name 이 클래스에서 사용 할 "이름"에 해당하는 값입니다
     * @param age  이 클래스에서 사용 할 "나이"에 해당하는 값입니다
     */
    public PersonDto(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int azoomge) {
        this.age = age;
    }
}