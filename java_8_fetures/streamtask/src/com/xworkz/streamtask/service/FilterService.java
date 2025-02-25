package com.xworkz.streamtask.service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.xworkz.streamtask.dto.EmployeesDto;
import com.xworkz.streamtask.dto.OrderDto;
import com.xworkz.streamtask.dto.ProductDto;
import com.xworkz.streamtask.dto.TransactionDto;
import com.xworkz.streamtask.dto.UserDto;

public class FilterService {
	
		public List<UserDto> getUsersActive(List<UserDto> users){
			return users.stream().filter(UserDto::isActive).collect(Collectors.toList());
		}
		
		public List<OrderDto> getOrderDtos(List<OrderDto> order){
			LocalDate weekAgo=LocalDate.now().minusDays(7);
			return order.stream().filter(o->o.getOrderDate().isAfter(weekAgo)).collect(Collectors.toList());
		}
		
		public List<String> getLongNames(List<String> names) {
	        return names.stream().filter(name -> name.length() > 5).collect(Collectors.toList());
	    }
		
		public List<ProductDto> getElectronics(List<ProductDto> products) {
	        return products.stream().filter(product -> "Electronics".equalsIgnoreCase(product.getCategory())).collect(Collectors.toList());
	    }
		
		public List<TransactionDto> getcrediDtos(List<TransactionDto> tranDtos){
			return tranDtos.stream().filter(tranDto->"Credit".equalsIgnoreCase(tranDto.getType())).collect(Collectors.toList());
		}
		
		public List<Integer> getPrime(List<Integer> numbers){
			return numbers.stream().filter(this::isPrime).collect(Collectors.toList());
		}
		
		public boolean isPrime(int num) {
			if(num < 2 ) 
				return false;
			return IntStream.rangeClosed(2, (int)Math.sqrt(num)).allMatch(n->num %n!=0);
		}
		
		
		 public List<EmployeesDto> getHighBonusEmployees(List<EmployeesDto> employees) {
		        return employees.stream().filter(emp -> emp.getBonus() > 10000).collect(Collectors.toList());
		    }
		 
		 public <T> List<T> getFirstThreeItems(List<T> items) {
		        return items.stream().limit(3).collect(Collectors.toList());
		    }
		 
		 public List<String> getWordsContainingE(List<String> words) {
		        return words.stream()
		                    .filter(word -> word.contains("e") || word.contains("E"))
		                    .collect(Collectors.toList());
		    }
		 
		  public List<String> getPalindromes(List<String> words) {
		        return words.stream()
		                    .filter(word -> word.equalsIgnoreCase(new StringBuilder(word).reverse().toString()))
		                    .collect(Collectors.toList());
		    }
}
