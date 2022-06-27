package day0617;



public class Board {
    // field 선언부
    private int id;
    private String title;
    private String writer;
    private String content;

    public Board() {}

    public Board(int id) {
        this.id = id;
    }

    // 깊은 복사를 위한 생성자.
    public Board(Board origin) {
        this.id = origin.id;
        this.title = origin.title;
        this.writer = origin.writer;
        this.content = origin.content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // method 선언부
    public boolean equals(Object obj) {
        if(obj instanceof Board) {
            Board temp = (Board)obj;
            return id == temp.id;
        }

        return false;
    }

    public void print() {
        System.out.println("\n===================================");
        System.out.println(title);
        System.out.println("-----------------------------------");
        System.out.println("글번호: " + id);
        System.out.println("작성자: " + writer);
        System.out.println("-----------------------------------");
        System.out.println(content);
        System.out.println("===================================\n");
    }
}












































