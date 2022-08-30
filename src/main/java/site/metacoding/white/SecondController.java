package site.metacoding.white;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

// 데이터 받기 
// GET -> htttp body가 없음. -> QueryString -> Form (GET) -> 브라우저 (주소뒤 ? 붙이기)
// POST, PUT -> http body 담아준다. -> Form(Post) -> JS
// DELETE -> htttp body가 없음. -> QueryString, PathVariable(PK)

@RestController //메모리에 띄운다.
public class SecondController { 
	@GetMapping("/second/{id}")	//PK(ID)가 1인것
	public String getData(@PathVariable Integer id) {
		return "id:" +id;
	}
	
	//QueryString = x-www-form 머시기머시기 타입이다.
	@GetMapping("/second")
	public String getData(String title, String content) {
		return "title :" +title+",content :" +content;
	}
	
	//body의 타입은 엄청많기때문에 어떤 타입인지 알려주어야한다.
	// BR -> title=제목&content=내용, x-www 머시기
	// BR -> title=제목&content=내용, content-type
	@PostMapping("/second")
	public String postData(String title, String content) { //스프링 파싱 기본전략 : x-www-form-머시기
		return "title : " + title +", content : " +content;
	}
	
	@PutMapping("/second")
	public String putData(String title, String content) { //스프링 파싱 기본전략 : x-www-form-머시기
		return "title : " + title +", content : " +content;
	}
	
	@DeleteMapping("/second/{id}")
	public String deleteData(@PathVariable Integer id) { //스프링 파싱 기본전략 : x-www-form-머시기
		return id+" delete ok";
	}
}
