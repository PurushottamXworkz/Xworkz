package com.xworkz.streamtask.dto;

import java.time.LocalDate;
import java.util.Objects;

public class OrderDto {
		private int orderId;
		private LocalDate orderDate;
		private double amount;
		
		public OrderDto(int orderId, LocalDate orderDate, double amount) {
			super();
			this.orderId = orderId;
			this.orderDate = orderDate;
			this.amount = amount;
		}

		public int getOrderId() {
			return orderId;
		}

		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}

		public LocalDate getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(LocalDate orderDate) {
			this.orderDate = orderDate;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		@Override
		public int hashCode() {
			return Objects.hash(amount, orderDate, orderId);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			OrderDto other = (OrderDto) obj;
			return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
					&& Objects.equals(orderDate, other.orderDate) && orderId == other.orderId;
		}

		@Override
		public String toString() {
			return "OrderDto [orderId=" + orderId + ", orderDate=" + orderDate + ", amount=" + amount + "]";
		}
				
}
