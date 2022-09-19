package com.reader.controller;




import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.reader.model.Book;
import com.reader.model.PurchaseBook;
import com.reader.service.PurchaseServiceImpl;



@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ReaderController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private PurchaseServiceImpl perchaseserv;

	@GetMapping("/test")
	public String greet() {
		return "Hello, I am working fine@!";
	}

	@GetMapping("/books/{id}")
	public Object getBook(@PathVariable("id") Integer id) {
		Object r = restTemplate.getForObject("http://book-microservice/books/"+id,Object.class);
		return r;	

	}
	@GetMapping("/books")
	public Object getAllBooks() {
		Object r = restTemplate.getForObject("http://book-microservice/books/",Object.class);
		return r;	

	}
	/*
	 * @GetMapping("/search/{email}") public List<Integer>
	 * getbookids(@PathVariable("email")String email) { return
	 * this.perchaseserv.findBookIdsbyEmail(email);
	 * 
	 * }
	 */

	@PostMapping("/purhase")
	public Integer purchase(@RequestBody PurchaseBook p) {
		Integer id = this.perchaseserv.orderBook(p);
		return id;
	}


	@GetMapping("/books/category/{category}")
	public Object searchBooks(@PathVariable("category") String category){
		Object r = restTemplate.getForObject("http://book-microservice/books/category/search?"+category,Object.class);
		return r;
	}
	@GetMapping("/searchbooks")
	public Object searchBooksByAnything(@RequestParam("query") String query){
		Object res = restTemplate.getForObject("http://book-microservice/searchbooks/search?"+query,Object.class);
		return res;
	}

	/*
	 * @GetMapping("/getPurchasedbooks/{email}") public List<Integer>
	 * getBookIds(@PathVariable String email){ return
	 * perchaseserv.findBookIdsbyEmail(email);
	 * 
	 * }
	 */
	 @GetMapping("/getPurchasedbooks/{email}") 
	  public List<Integer> getBookIds(@PathVariable String email){ 
		 List<Integer> bids =   perchaseserv.findBookIdsbyEmail(email);
			/*
			 * List<Book> bl = new ArrayList<Book>(); for(int i=0 ; i<=bids.size(); i++) {
			 * Book r = (Book)
			 * restTemplate.getForObject("http://book-microservice/books/"+bids.get(i),
			 * Object.class); bl.add(r); }
			 */
		return bids;
	  
	  }
	 
	 

	/*
	 * @PostMapping("/placeorder") public Order placeOrder(@RequestBody Order o) {
	 * 
	 * Order x = this.orderserv.placenewOrder(o); Book b = (Book)
	 * restTemplate.getForObject("http://book-microservice/books/"+o.getObj().
	 * getBookId() ,List.class); Order. return x;
	 * 
	 * }
	 */
	/*
	 * @PostMapping("/purchasedbooks") List<Integer> getAllBooks(@RequestBody
	 * PurchaseBook p){
	 * 
	 * return this.perchaseserv.findBookIdsbyEmail(p.getReaderEmailId());
	 * 
	 * }
	 */

}
