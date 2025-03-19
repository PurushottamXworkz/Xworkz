package com.xworkz.streamtask.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import com.xworkz.streamtask.dto.EmployeesDto;
import com.xworkz.streamtask.dto.OrderDto;
import com.xworkz.streamtask.dto.ProductDto;
import com.xworkz.streamtask.dto.TransactionDto;
import com.xworkz.streamtask.dto.UserDto;
import com.xworkz.streamtask.service.FilterService;

public class StreamRunner {
	public static void main(String[] args) {
		FilterService filterService=new FilterService();
		
		List<UserDto> user=Arrays.asList(
				new UserDto(1, "Praveen", true),
	            new UserDto(2, "Pandu", false),
	            new UserDto(3, "Mahesh", true)
				);
		
		List<OrderDto> orders = Arrays.asList(
	            new OrderDto(1, LocalDate.now(), 500.0),
	            new OrderDto(2, LocalDate.now().minusDays(8), 1000.0),
	            new OrderDto(3, LocalDate.now().minusDays(2), 200.0)
	        );
		
		 List<String> names = Arrays.asList("Ravi", "Raaju", "Nidhi", "Samantha");
	        List<ProductDto> products = Arrays.asList(new ProductDto("Laptop", "Electronics", 1200.0));
	        List<TransactionDto> transactions = Arrays.asList(new TransactionDto(1, 5000, "Credit"));
	        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 11, 13);
	        List<EmployeesDto> employees = Arrays.asList(new EmployeesDto("Raj", 50000, 12000));
	        List<String> words = Arrays.asList("hello", "racecar", "world", "madam");
		
	        
	        System.out.println(filterService.getUsersActive(user));
	        System.out.println(filterService.getOrderDtos(orders));
	        System.out.println(filterService.getLongNames(names));
	        System.out.println(filterService.getElectronics(products));
	        System.out.println(filterService.getcrediDtos(transactions));
	        System.out.println(filterService.getPrime(numbers));
	        System.out.println(filterService.getHighBonusEmployees(employees));
	        System.out.println(filterService.getFirstThreeItems(names));
	        System.out.println(filterService.getWordsContainingE(words));
	        System.out.println(filterService.getPalindromes(words)); 
	        
	}
}
