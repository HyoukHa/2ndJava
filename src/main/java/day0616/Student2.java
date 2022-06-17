package day0616;

// 캡슐화가 적용된 학생 클래스

public class Student2 {
    // 필드
    private int id;
    private String name;
    private int kor;
    private int eng;
    private int math;
    private final int SUBJECT_SIZE = 3;

    // 생성자
    // 1. 파라미터 있는 생성자
    public Student2(int id, String name, int kor, int eng, int math) {
        this.id = id;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    // 2. 파라미터 없는 생성자
    public Student2(){
        id = -1;
        name = "뭔가";
        kor = -1;
        eng = -1;
        math = -1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    // 메소드
    private int calculateSum(){
        return kor + eng + math;

    }

    private double calculateAverage(){
        return (double)calculateSum() / SUBJECT_SIZE;
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
        System.out.printf("번호 : %d번  이름 : %s\n", id, name);
        System.out.printf("국어 : %03d점  영어 : %03d점 수학 : %03d점\n", kor, eng, math);
        System.out.printf("총점 : %03d점  평균 : %06.2f점\n", calculateSum(), calculateAverage());
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", name: " + name +
                ", kor: " + kor +
                ", eng: " + eng +
                ", math: " + math +
                '}';
    }
}

// 게시판 프로그램


// 댓글 프로그램