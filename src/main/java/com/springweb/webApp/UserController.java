package com.springweb.webApp;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

	public class UserController {

	private UserRepository userRepository;

	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping("/users")
	public List<User> getUsers() {
		System.out.println("print all users");
		return (List<User>) userRepository.findAll();
	}

	@GetMapping("/test")
	public String test() {
		return "test";
	}

	@PostMapping("/users")
	void addUser(@RequestBody User user) {
		System.out.println(user + " saved");
		userRepository.save(user);
	}
}
//public class BooksController {
//
//	@GetMapping("/books")
//	public List<Book> getAllBooks(){
//		System.out.println("call books");
//		return Arrays.asList(
//				new Book(1l,"spring book","Pietro Santoro"));
//
//	}
//	@GetMapping("/boss")
//	public List<Book> getAll(){
//		return Arrays.asList(
//				new Book(1l,"spring","Pietro"));
//
//	}
//	@GetMapping("/error")
//	public void error(){
//		System.out.println("error");
//
//	}
//
//}
