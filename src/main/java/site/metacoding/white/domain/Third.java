package site.metacoding.white.domain;

public class Third {
	private Integer id;
	private String title;
	private String content;
	

	
	@Override
	public String toString() { //모든것을 문자열로 리턴
		return "Third [id=" + id + ", title=" + title + ", content=" + content + "]";
	}

	public Third() {
		System.out.println("Third 디폴트 생성자 실행됨");
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		System.out.println("setID 실행됨");
		this.id = id;
	}

	public String getTitle() {
		return title;
	}
 
	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		System.out.println("setContent 실행됨");
		this.content = content;
	}

	
}
