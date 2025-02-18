package com.xworkz.shoppingcart.dto;

import java.util.Objects;

public class ShoppingDetails {
		private int quantity;
		private String nameOfProduct;
		private String typeOfProduct;
		
		public ShoppingDetails(int quantity, String nameOfProduct, String typeOfProduct) {
			super();
			this.quantity = quantity;
			this.nameOfProduct = nameOfProduct;
			this.typeOfProduct = typeOfProduct;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public String getNameOfProduct() {
			return nameOfProduct;
		}

		public void setNameOfProduct(String nameOfProduct) {
			this.nameOfProduct = nameOfProduct;
		}

		public String getTypeOfProduct() {
			return typeOfProduct;
		}

		public void setTypeOfProduct(String typeOfProduct) {
			this.typeOfProduct = typeOfProduct;
		}

		@Override
		public int hashCode() {
			return Objects.hash(nameOfProduct, quantity, typeOfProduct);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ShoppingDetails other = (ShoppingDetails) obj;
			return Objects.equals(nameOfProduct, other.nameOfProduct) && quantity == other.quantity
					&& Objects.equals(typeOfProduct, other.typeOfProduct);
		}

		@Override
		public String toString() {
			return "ShoppingDetails [quantity=" + quantity + ", nameOfProduct=" + nameOfProduct + ", typeOfProduct="
					+ typeOfProduct + "]";
		}
		
		
}
