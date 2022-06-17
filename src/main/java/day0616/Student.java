//package day0616;
//
//// 학생 클래스
//// field: id, name, kor, eng, math
//// method : calcSum(), calcAvg(), print(), equals() -- override
//
//public class Student {
//    // field
//    private int id;
//    private String name;
//    private int kor;
//    private int eng;
//    private int math;
//    private final int SUBJECT_SIZE = 3;
//
//    // constructor
//    public Student(int id, String name, int kor, int eng, int math) {
//        this.id = id;
//        this.name = name;
//        this.kor = kor;
//        this.eng = eng;
//        this.math = math;
//    }
//
//    // constructor without parameter
//    public Student(){
//        this.id = -1;
//        this.name = "아직 입력 안됨";
//        this.kor = -1;
//        this.eng = -1;
//        this.math = -1;
//    };
//
//    @Override
//    public String toString() {
//        return
//                "id : " + id + "\n" +
//                "name='" + name + "\'\n" +
//                "kor=" + kor + "\n" +
//                "eng=" + eng + "\n" +
//                "math=" + math;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getKor() {
//        return kor;
//    }
//
//    public void setKor(int kor) {
//        this.kor = kor;
//    }
//
//    public int getEng() {
//        return eng;
//    }
//
//    public void setEng(int eng) {
//        this.eng = eng;
//    }
//
//    public int getMath() {
//        return math;
//    }
//
//    public void setMath(int math) {
//        this.math = math;
//    }
//
//    private int calcSum() {
//        return this.kor + this.eng + this.math;
//    }
//
//    private double calcAvg() {
//        return (double)(calcSum() / SUBJECT_SIZE);
//    }
//
//    // 3. equals() Override
//    @Override
//    public boolean equals(Object obj) {
//        // 파라미터로 들어온 obj 가
//        // 실체화가 끝난 인스턴스인지를
//        // instanceof 라는 키워드를 통해 체크하여
//        // 맞으면 추가적인 코드를 진행한다.
//
//        // instanceof
//        // 객체의 타입과 초기화가 되어있는지까지(null 이 아닌지)에 대해서 체크해주는 키워드!(사용할 곳 많아보임)
//        if(obj instanceof Student) {
//            Student s = (Student) obj;
//            return this.id == s.id;
//        }
//
//        return false;
//    }
//
//    public void printInfo() {
//        System.out.printf("번호: %d번  이름: %s\n", this.id, this.name);
//        System.out.printf("국어: %03d점  영어: %03d점  수학: %03d점\n", this.kor, this.eng, this.math);
//        System.out.printf("총점: %03d점  평균: %06.2f점\n", calcSum(), calcAvg());
//    }
//}

package day0616;
// 학생 클래스
// 필드 : 번호, 이름, 국어, 영어, 수학
// 메소드 : 총점 계산, 평균 계산, 정보 출력, equals() 오버라이드
public class Student {
    // 필드
    public int id;
    public String name;
    public int kor;
    public int eng;
    public int math;
    public final int SUBJECT_SIZE = 3;

    // 메소드
    public int calculateSum(){
        return kor + eng + math;

    }

    public double calculateAverage(){
        return (double)calculateSum() / SUBJECT_SIZE;
    }

    // 생성자
    // 1. 파라미터 있는 생성자


    public Student(int id, String name, int kor, int eng, int math) {
        this.id = id;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    // 2. 파라미터 없는 생성자
    public Student(){
        id = -1;
        name = "뭔가";
        kor = -1;
        eng = -1;
        math = -1;
    }

    // 3. equals() 오버라이드
    public boolean equals(Object obj){
        // 먼저 파라미터로 들어온 Object 객체가
        // 실체화가 끝난
        // 즉 Student 클래스 인스턴스인지를
        // instanceof라는 키워드를 통해 체크하여
        // 맞으면 추가적인 코드를 진행한다.

        // 같은 클래스인지 먼저 확인한다.
        if (obj instanceof Student){
            // obj에 들어온 값을 비교대상인 클래스화 해주고
            // 그 값을 비교한 후 리턴한다.
            Student s = (Student)obj;
            return id == s.id;
        }

        return false;
    }

    // 4. 정보 출력용 메소드
    public void printInfo(){
        System.out.printf("번호 : %d번  이름 : %s", id, name);
        System.out.printf("국어 : %03d점  영어 : %03d점 수학 : %03d점", kor, eng, math);
        System.out.printf("총점 : %03d점  평균 : %06.2f점", calculateSum(), calculateAverage());
    }
}