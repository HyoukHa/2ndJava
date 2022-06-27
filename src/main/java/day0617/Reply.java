package day0617;

// POJO
// Plain Old Java Object
// -> 옛날의 평범한 자바 객체
// -> 다른 클래스타입의 필드는 사용을 최소화하자!

public class Reply {
    // 필드
    private int boardId;
    private int id;
    private String content;

//    public Reply(int boardId, int id, String content) {
//        this.boardId = boardId;
//        this.id = id;
//        this.content = content;
//    }

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return content;
    }

    public void setComment(String comment) {
        this.content = comment;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Reply) {
            Reply temp = (Reply)obj;
            return id == temp.id;
        }
        return false;
    }

    public void print() {
        System.out.println("댓글 : " + content);
    }
}
