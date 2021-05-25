package tests.entities;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {
	
	@Test
	public void entryShouldReturnTwentyPercentOfTotalAmount() {
		Financing financing = new Financing(100000.0, 2000.0, 80);
		double expectedValue = 100000.0 * 0.2;
		double entry = financing.entry();
		assertEquals(expectedValue, entry);
	}

	@Test
	public void quotaShouldReturnEigthyPercentForTotalMonths() {
		Financing financing = new Financing(100000.0, 2000.0, 80);
		double expectedValue = 1000.0;
		double quota = financing.quota();
		assertEquals(expectedValue, quota);
	}
	
	@Test
	public void constructorShouldSetValuesWhenValidData() {
		Financing financing = new Financing(100000.0, 2000.0, 80);
		
		assertEquals(100000.0, financing.getTotalAmount());
		assertEquals(2000.0, financing.getIncome());
		assertEquals(80, financing.getMonths());
	}
	
	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Financing(100000.0, 2000.0, 79);
		});
	}
	
	@Test
	public void setTotalAmountShouldSetValueWhenValidData() {
		Financing financing = new Financing(100000.0, 2000.0, 80);
		financing.setTotalAmount(90000.0);
		assertEquals(90000.0, financing.getTotalAmount());
	}
	
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = new Financing(100000.0, 2000.0, 80);
			financing.setTotalAmount(110000.0);
		});
	}
	
	@Test
	public void setIncomeShouldSetValueWhenValidData() {
		Financing financing = new Financing(100000.0, 2000.0, 80);
		financing.setIncome(3000.0);
		assertEquals(3000.0, financing.getIncome());
	}
	
	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = new Financing(100000.0, 2000.0, 80);
			financing.setTotalAmount(110000.0);
		});
	}
	
	@Test
	public void setMonthsShouldSetValueWhenValidData() {
		Financing financing = new Financing(100000.0, 2000.0, 80);
		financing.setMonths(90);
		assertEquals(90, financing.getMonths());
	}
	
	@Test
	public void setMounthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = new Financing(100000.0, 2000.0, 80);
			financing.setMonths(70);
		});
	}
}
