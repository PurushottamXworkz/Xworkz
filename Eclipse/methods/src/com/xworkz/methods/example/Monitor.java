package com.xworkz.methods.example;

import java.util.Objects;

public class Monitor extends Object{


	public int hashCode() {
		return Objects.hash();
	}
	public String toString() {
		 return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}

}
