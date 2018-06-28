package net.person.model;

/**
 * 图书实体
 */
public class BookModel {

	private long bookId;// 图书ID

	private String name;// 图书名称

	private int number;// 馆藏数量

	public BookModel() {
	    super();
	}

	public BookModel(long bookId, String name, int number) {
        super();
		this.bookId = bookId;
		this.name = name;
		this.number = number;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "BookModel [bookId=" + bookId + ", name=" + name + ", number=" + number + "]";
	}


}
