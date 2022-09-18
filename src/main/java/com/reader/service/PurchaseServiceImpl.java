package com.reader.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.reader.model.Book;
import com.reader.model.PurchaseBook;
import com.reader.repository.IPurchaseRepository;

@Service
public class PurchaseServiceImpl implements IPurchaseService{

	
	@Autowired
	private IPurchaseRepository purchrepo;
	
	
	@Override
	public Integer orderBook(PurchaseBook obj) {
		// TODO Auto-generated method stub
		PurchaseBook objj  = this.purchrepo.save(obj);
		
		return objj.getpId();
	}


	/*
	 * @Override public List<Book> getAllpurchasedBooks(String email) {
	 * List<Integer>bookid=purchrepo.findByEmail(email); List<Book> books =new
	 * ArrayList<Book>() ; for(int i=0;i<bookid.size();i++) {
	 * 
	 * Optional<Book>book=bookrepo.findById(bookid.get(i)); if(book.isPresent()) {
	 * books.add(book.get()); } } return books; }
	 */

	/*@Override
	public List<Integer> findBookIdsbyEmail(String buyerEmail) {
		// TODO Auto-generated method stub
		List<PurchaseBook> li = this.purchrepo.findAll();
		List<Integer> bIds = new ArrayList<Integer>();
		for(PurchaseBook p : li) {
			if(p.getReaderEmailId().equalsIgnoreCase(buyerEmail))
			{
		
			bIds.add(p.getBookId());
				
			}
			else
			{
			
			}

		}
		return bIds;*/
		/*
		 * List<PurchaseBook> li2 =
		 * li.stream().filter(p->p.getReaderEmailId().equals(buyerEmail)).collect(
		 * Collectors.toList()); List<Integer> list = new ArrayList<Integer>();
		 * 
		 * for()
		 * 
		 * int x=0;
		 * 
		 * if(li2.get(x).getReaderEmailId()==buyerEmail) {
		 * list.add(li2.get(x).getBookId()); x++; } else {
		 * 
		 * } return list;
		 */
	}


	/*
	 * @Override public Book findBooksByBid(String email) {
	 * 
	 * 
	 * Optional<Integer> ob =
	 * Optional.ofNullable(this.purchrepo.findByEmail(email)); Book obj =
	 * this.restTemp.getForObject("http://book-microservice/books/"+ob),Book.class);
	 * 
	 * return obj; }
	 */
		
//	}



	/*
	 * @Override public List<Integer> findBookIdsbyEmail(String buyerEmail) { //
	 * TODO Auto-generated method stub
	 * 
	 * //List<Book> li =
	 * this.restTemp.getForObject("http://book-microservice/books/",List.class);
	 * //li.stream().filter()
	 * 
	 * //email- bookIds //for each books id ki details from book micros
	 * //List<Integer> = this.purchrepo.findAll()
	 * 
	 * List<PurchaseBook> pbook = this.purchrepo.findAll(); List<Integer> bookIds =
	 * pbook.stream().filter(p->p.getReaderEmailId().equalsIgnoreCase(buyerEmail)).
	 * get().collect(Collectors.toList());
	 * 
	 * return pb; }
	 */
	
	/*
	 * @Override public List<Integer> findByEmail(String redaerEmail) { // TODO
	 * Auto-generated method stub List<Integer> li =
	 * purchrepo.findByEmail(redaerEmail); return li; }
	 */
	
	

