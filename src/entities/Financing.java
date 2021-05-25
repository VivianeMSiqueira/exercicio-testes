package entities;

public class Financing {
	
	private Double totalAmount;
	private Double income;
	private Integer months;
	
	public Financing() {
	}

	public Financing(Double totalAmount, Double income, Integer months) {
		if((totalAmount * 0.8) / months > income / 2.0) {
			throw new IllegalArgumentException();
		}
		this.totalAmount = totalAmount;
		this.income = income;
		this.months = months;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		if((totalAmount * 0.8) / months > income / 2.0) {
			throw new IllegalArgumentException("A prestação não pode ser maior que metade da renda");
		}
		this.totalAmount = totalAmount;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		if((totalAmount * 0.8) / months > income / 2.0) {
			throw new IllegalArgumentException("A prestação não pode ser maior que metade da renda");
		}
		this.income = income;
	}

	public Integer getMonths() {
		return months;
	}

	public void setMonths(Integer months) {
		if((totalAmount * 0.8) / months > income / 2.0) {
			throw new IllegalArgumentException("A prestação não pode ser maior que metade da renda");
		}
		this.months = months;
	}

	public Double quota() {
		double quota = (totalAmount * 0.8) / months;
		if(quota > income / 2.0) {
			throw new IllegalArgumentException("A prestação não pode ser maior que metade da renda");
		}
		return quota;
	}

	public Double entry() {
		double entry = totalAmount * 0.2;
		return entry;
	}
}
