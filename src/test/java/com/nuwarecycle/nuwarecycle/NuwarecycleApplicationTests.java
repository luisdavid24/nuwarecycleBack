package com.nuwarecycle.nuwarecycle;

import com.nuwarecycle.nuwarecycle.controllers.UserController;
import com.nuwarecycle.nuwarecycle.models.User;
import com.nuwarecycle.nuwarecycle.services.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class NuwarecycleApplicationTests {

	@Test
	void contextLoads() {
	}

	import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

	@SpringBootTest
	class UserServiceImplTest {

		@InjectMocks
		private UserServiceImpl userService;

		@Mock
		private UserRepository userRepository;

		@Test
		void testGetAllUsers() {
			// Mocking the behavior of userRepository.findAll()
			List<User> mockUsers = Arrays.asList(new User(), new User());
			Mockito.when(userRepository.findAll()).thenReturn(mockUsers);

			// Testing the service method
			List<User> result = userService.getAllUsers();

			// Asserting the result
			Assertions.assertEquals(mockUsers, result);
		}

		@Test
		void testCreateUser() {
			// Creating a mock user
			User newUser = new User();

			// Testing the service method
			userService.createUser(newUser);

			// Verifying that userRepository.save(newUser) was called
			Mockito.verify(userRepository).save(newUser);

			// Asserting that the user's registration date and password are set
			assertNotNull(newUser.getRegistrationDate());
			assertNotNull(newUser.getPassword());
		}

		@Test
		void testGetUserById() {
			// Creating a mock user ID
			Long userId = 1L;

			// Mocking the behavior of userRepository.findUserById(userId)
			User mockUser = new User();
			Mockito.when(userRepository.findUserById(userId)).thenReturn(mockUser);

			// Testing the service method
			User result = userService.getUserById(userId);

			// Asserting the result
			Assertions.assertEquals(mockUser, result);
		}

		@Test
		void testDeleteUser() {
			// Creating a mock user ID
			Long userId = 1L;

			// Testing the service method
			userService.deleteUser(userId);

			// Verifying that userRepository.deleteUserById(userId) was called
			Mockito.verify(userRepository).deleteUserById(userId);
		}

		@Test
		void testFindOneByEmail() {
			// Creating a mock email
			String email = "test@example.com";

			// Mocking the behavior of userRepository.findOneByEmail(email)
			User mockUser = new User();
			Mockito.when(userRepository.findOneByEmail(email)).thenReturn(Optional.of(mockUser));

			// Testing the service method
			Optional<User> result = userService.findOneByEmail(email);

			// Asserting the result
			assertTrue(result.isPresent());
			Assertions.assertEquals(mockUser, result.get());
		}

		@Test
		void testUpdateUser() {
			// Creating a mock user
			User existingUser = new User();
			existingUser.setId(1L);

			User newUser = new User();
			newUser.setUsername("newUsername");
			newUser.setPassword("newPassword");
			newUser.setProfileImg("newProfileImg");
			newUser.setEmail("newEmail");

			// Mocking the behavior of userRepository.findUserById(existingUser.getId())
			Mockito.when(userRepository.findUserById(existingUser.getId())).thenReturn(existingUser);

			// Testing the service method
			userService.updateUser(newUser);

			// Verifying that userRepository.save(existingUser) was called
			Mockito.verify(userRepository).save(existingUser);

			// Asserting that user properties are updated
			assertEquals(newUser.getUsername(), existingUser.getUsername());
			assertEquals(newUser.getPassword(), existingUser.getPassword());
			assertEquals(newUser.getProfileImg(), existingUser.getProfileImg());
			assertEquals(newUser.getEmail(), existingUser.getEmail());
		}
	}

	@InjectMocks
	private ProductServiceImpl productService;

	@Mock
	private ProductRepository productRepository;

	@Test
	void testCreateProduct() {
		// Creating a mock product
		Product newProduct = new Product();

		// Testing the service method
		productService.createProduct(newProduct);

		// Verifying that productRepository.save(newProduct) was called
		Mockito.verify(productRepository).save(newProduct);
	}

	@Test
	void testDeleteProductById() {
		// Creating a mock product ID
		int productId = 1;

		// Mocking the behavior of productRepository.existsById(productId)
		Mockito.when(productRepository.existsById(productId)).thenReturn(true);

		// Testing the service method
		productService.deleteProductById(productId);

		// Verifying that productRepository.deleteById(productId) was called
		Mockito.verify(productRepository).deleteById(productId);
	}

	@Test
	void testUpdateProduct() {
		// Creating a mock product
		Product existingProduct = new Product();
		existingProduct.setIdProd(1);

		Product newProduct = new Product();
		newProduct.setName("New Product");
		// Set other properties as needed

		// Mocking the behavior of productRepository.getProductById(existingProduct.getIdProd())
		Mockito.when(productRepository.getProductById(existingProduct.getIdProd())).thenReturn(existingProduct);

		// Testing the service method
		productService.updateProduct(newProduct);

		// Verifying that productRepository.save(existingProduct) was called
		Mockito.verify(productRepository).save(existingProduct);

		// Asserting that product properties are updated
		assertEquals(newProduct.getName(), existingProduct.getName());
		// Assert other properties as needed
	}

	@Test
	void testGetProductsByCategory() {
		// Creating a mock category
		String category = "Electronics";

		// Mocking the behavior of productRepository.findByCategory(category)
		List<Product> mockProducts = Arrays.asList(new Product(), new Product());
		Mockito.when(productRepository.findByCategory(category)).thenReturn(mockProducts);

		// Testing the service method
		List<Product> result = productService.getProductsByCategory(category);

		// Asserting the result
		assertEquals(mockProducts, result);
	}

	@Test
	void testGetProductsByBrands() {
		// Creating a mock list of brands
		List<String> brands = Arrays.asList("Brand1", "Brand2");

		// Mocking the behavior of productRepository.findByBrandIn(brands)
		List<Product> mockProducts = Arrays.asList(new Product(), new Product());
		Mockito.when(productRepository.findByBrandIn(brands)).thenReturn(mockProducts);

		// Testing the service method
		List<Product> result = productService.getProductsByBrands(brands);

		// Asserting the result
		assertEquals(mockProducts, result);
	}

	@Test
	void testGetProductsBetweenPrice() {
		// Mocking the behavior of productRepository.findByPriceIsBetween(min, max)
		List<Product> mockProducts = Arrays.asList(new Product(), new Product());
		Mockito.when(productRepository.findByPriceIsBetween(Mockito.anyInt(), Mockito.anyInt())).thenReturn(mockProducts);

		// Testing the service method
		List<Product> result = productService.getProductsBetweenPrice(10, 100);

		// Asserting the result
		assertEquals(mockProducts, result);
	}

	@InjectMocks
	private OrderServiceImpl orderService;

	@Mock
	private OrderRepository orderRepository;

	@Test
	void testGetAllOrders() {
		// Mocking the behavior of orderRepository.findAll()
		List<Order> mockOrders = Arrays.asList(new Order(), new Order());
		Mockito.when(orderRepository.findAll()).thenReturn(mockOrders);

		// Testing the service method
		List<Order> result = orderService.getAllOrders();

		// Asserting the result
		assertEquals(mockOrders, result);
	}

	@Test
	void testCreateOrder() {
		// Creating a mock order
		Order newOrder = new Order();

		// Testing the service method
		orderService.createOrder(newOrder);

		// Verifying that orderRepository.save(newOrder) was called
		Mockito.verify(orderRepository).save(newOrder);

		// Asserting that the order's creation date is set
		assertNotNull(newOrder.getCreationDate());
	}
}