package struct;

import java.util.ArrayList;

public class Board {
    private int id;
    private String title;
    private String writer;
    private String content;

    public Board(int id, String title, String writer, String content) {
        this.id = id;
        this.title = title;
        this.writer = writer;
        this.content = content;
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

    public void showList() {
        System.out.printf("%d. %s\n", this.id, this.title);
    }

    @Override
    public String toString() {
        return
                "게시글 번호 : " + this.id +
                "\n제목 : " + this.title +
                "\n작성자 : " + this.writer +
                "\n내용 : " + this.content;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Board) {
            Board temp = (Board)obj;
            return id == temp.id;
        }

        return false;
    }
}
