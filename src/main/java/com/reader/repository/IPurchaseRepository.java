package com.reader.repository;

import java.util.List;

/*import java.util.List;*/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/*import org.springframework.data.jpa.repository.Query;
import com.reader.model.Book;*/
import com.reader.model.PurchaseBook;

public interface IPurchaseRepository extends JpaRepository<PurchaseBook, Integer> {


	
	  @Query ("Select a.bookId from PurchaseBook a where a.readerEmailId=?1")
	  List<Integer> findByEmail(String readerEmailId);
	
	 /*
	 * @Query ("Select b from Book b where a.bookId=?1") Book findBooksByBid(Integer
	 * id);
	 */
}
