package com.meridian.assessment;

import static org.junit.Assert.*;

import org.junit.Test;

public class CoinChangeTest {

	@Test(expected = Exception.class)
	public void count_WhenCoinValueIsInvalid_ShouldThrowException()
			throws Exception {
		CoinChange.count(74890);
	}

	@Test
	public void count_WhenCoinValueIs0_ShouldReturn1() throws Exception {
		assertEquals(1, CoinChange.count(0));
	}

	@Test
	public void count_WhenCoinValueIsValid_ShouldReturnCorrectCountWayValue()
			throws Exception {
		assertEquals(4, CoinChange.count(11));
		assertEquals(13, CoinChange.count(26));
	}
}
