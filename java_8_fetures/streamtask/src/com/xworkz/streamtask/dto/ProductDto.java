package com.xworkz.streamtask.dto;

import java.util.Objects;

public class ProductDto {
		private String name;
		private String category;
		private double price;
		
		public ProductDto(String name, String category, double price) {
			super();
			this.name = name;
			this.category = category;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		@Override
		public int hashCode() {
			return Objects.hash(category, name, price);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ProductDto other = (ProductDto) obj;
			return Objects.equals(category, other.category) && Objects.equals(name, other.name)
					&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
		}

		@Override
		public String toString() {
			return "ProductDto [name=" + name + ", category=" + category + ", price=" + price + "]";
		}
		
		
}
