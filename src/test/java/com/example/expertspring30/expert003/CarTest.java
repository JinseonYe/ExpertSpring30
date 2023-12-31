package com.example.expertspring30.expert003;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("/expert003.xml")
public class CarTest {
	@Autowired
	Car car;

	@Test
	void 자동차_코리아타이어_장착_타이어브랜드_테스트() {
		assertEquals("장착된 타이어: 코리아 타이어", car.getTireBrand());
	}
}
