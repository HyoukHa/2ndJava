package struct;

// 구조체
// 구조체를 간단히 설명하자면
// 필요한 데이터 타입을 직접 만들어주는 데이터타입이다.
// C 에서는 struct 라는 키워드를 통해 구조체를 만들어주지만,
// Java 에서는 해당 문법이 존재하지 않아서
// 별개의 클래스를 만들어
// 그 안에 어떤 종류의 정보가 해당 데이터타입의 변수/상수에 저장될지를 지정해준다.

public class Student {
    public int id;
    public String name;
    public int kor;
    public int eng;
    public int math;

//    public Student(int id, String name, int kor, int eng, int math) {
//        this.id = id;
//        this.name = name;
//        this.kor = kor;
//        this.eng = eng;
//        this.math = math;
//    }
}
