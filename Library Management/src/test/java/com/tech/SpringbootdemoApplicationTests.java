package com.tech;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.tech.entity.BookDetails;

@SpringBootTest
class SpringbootdemoApplicationTests {
	
	BookDetails bd=new BookDetails();

	@Test
	void contextLoads() {
	}
    @Test
	void testBooksQuanity() {
		int ExpectedResult=20;
		
		int ActualResult = bd.getNo_Of_Books();
		
		assertThat(ActualResult).isEqualTo(ExpectedResult);
	}
}
