package com.reader.repository;

/*import java.util.List;*/

import org.springframework.data.jpa.repository.JpaRepository;
/*import org.springframework.data.jpa.repository.Query;
import com.reader.model.Book;*/
import com.reader.model.PurchaseBook;

public interface IPurchaseRepository extends JpaRepository<PurchaseBook, Integer> {


	/*
	 * @Query ("Select a.bookId from Purchase_book a where a.readerEmail=?1")
	 * List<Integer> findByEmail(String readerEmail);
	 * 
	 * @Query ("Select b from Book b where a.bookId=?1") Book findBooksByBid(Integer
	 * id);
	 */
}
