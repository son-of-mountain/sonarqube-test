package com.example.applicationsimple;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationSimpleApplicationTests {

	@Test
	public void testGreet() {
		assertEquals("Hello, World!", ApplicationSimpleApplicationTests.greet(null));
		assertEquals("Hello, John!", ApplicationSimpleApplicationTests.greet("John"));
	}
}
