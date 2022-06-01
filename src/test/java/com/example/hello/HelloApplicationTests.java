package com.example.hello;

import com.example.hello.dto.User2;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("----------------------");

		// Text Json -> Object
		// Object -> Text json

		// controller req json(text) -> object
		// response object -> json(text)

		var objectMapper = new ObjectMapper();

		// object -> text
		// object mapper get method를 활용한다.
		var user = new User2("mjh",26,"010-8888-8888");
		var text = objectMapper.writeValueAsString(user);
		System.out.println(text);


		// text -> object
		// object mapper는 default 생성자를 필요로 한다.
		var objectUser = objectMapper.readValue(text,User2.class);
		System.out.println(objectUser);

	}

}
