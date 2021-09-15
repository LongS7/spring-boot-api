package com.longs7.spingbootapi;

import com.longs7.spingbootapi.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpingBootApiApplicationTests {
	@Autowired
	private BookRepository bookRepository;

	@Test
	void testFind() {
		System.out.println(bookRepository.findAll());
	}

}
