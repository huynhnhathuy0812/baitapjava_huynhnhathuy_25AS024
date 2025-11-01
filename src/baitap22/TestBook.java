package baitap22;

public class TestBook {
    public static void main(String[] args) {
        Author a1 = new Author("Nguyễn Nhật Ánh", "anh@example.com", 'm');
        Author a2 = new Author("Trần Thu Hà", "ha@example.com", 'f');

        Author[] authors = {a1, a2};

        Book book = new Book("Cho tôi xin một vé đi tuổi thơ", authors, 120000, 10);

        System.out.println(book.toString());

        System.out.println("Tác giả: " + book.getAuthorNames());
    }
}
