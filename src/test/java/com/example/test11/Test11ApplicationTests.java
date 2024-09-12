package com.example.test11;

import com.example.test11.article.Article;
import com.example.test11.article.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class Test11ApplicationTests {

	@Autowired
	private ArticleRepository articleRepository;

	@Test
	void contextLoads() {
		Article ta = new Article();
		ta.setTitle("test07");
		ta.setContent("내용");
		ta.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(ta);
	}

	@Test
	void contextLoads1() {
		Article ta = new Article();
		ta.setTitle("t7");
		ta.setContent("내용1");
		ta.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(ta);
	}

	@Test
	void contextLoads2() {
		Article ta = new Article();
		ta.setTitle("test2024");
		ta.setContent("내용2");
		ta.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(ta);
	}

	@Test
	void contextLoads3() {
		Article ta = new Article();
		ta.setTitle("7");
		ta.setContent("내용3");
		ta.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(ta);
	}

	@Test
	void contextLoads4() {
		Article ta = new Article();
		ta.setTitle("777777");
		ta.setContent("내용4");
		ta.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(ta);
	}

	@Test
	void contextLoads5() {
		Article ta = new Article();
		ta.setTitle("9999");
		ta.setContent("내용5");
		ta.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(ta);
	}

	@Test
	void contextLoads6() {
		Article ta = new Article();
		ta.setTitle("777");
		ta.setContent("내용6");
		ta.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(ta);
	}
}
