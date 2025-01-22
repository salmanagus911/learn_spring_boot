package com.salmanagus.sbur_test_demo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@SpringBootApplication
public class SburTestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SburTestDemoApplication.class, args);
	}

}

class Coffee{
	private final String id;
	private String name;

	@JsonCreator
	public Coffee(@JsonProperty("id") String id, @JsonProperty("name") String name){
		this.id = id;
		this.name = name;
	}
	public Coffee(String name){
		this(UUID.randomUUID().toString(), name);
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public void setId(String id) {
//		this.id = id;
//	}
}

@RestController
@RequestMapping("/")
class RestApiDemoController {
	private final List<Coffee> coffees = new ArrayList<>();

	public RestApiDemoController() {
		coffees.addAll(List.of(
			new Coffee("Cafe Cereza"),
			new Coffee("Cafe Ganador"),
			new Coffee("Cafe Lareno"),
			new Coffee("Cafe Tres Pontas")
		));
	}

//	@RequestMapping(value = "/coffes", method = RequestMethod.GET)
//	Iterable<Coffee> getCoffees() {
//		return coffees;
//	}
	@GetMapping("/coffees")
	Iterable<Coffee> getCoffees() {
		return coffees;
	}

	@GetMapping("coffees/{id}")
	Optional<Coffee> getCoffeById(@PathVariable String id) {
		for (Coffee c: coffees) {
			if (c.getId().equals(id)){
				return Optional.of(c);
			}
		}
		return Optional.empty();
	}

	@PostMapping("/coffees")
	Coffee postCoffee(@RequestBody Coffee coffee) {
		System.out.println("Received " + coffee);
		coffees.add(coffee);
		return coffee;
	}

	@PutMapping("/{id}")
	Coffee putCoffee(@PathVariable String id, @RequestBody Coffee coffee) {
		int coffeeIndex = -1;
		for (Coffee c: coffees) {
			if (c.getId().equals(id)) {
				coffeeIndex = coffees.indexOf(c);
				coffees.set(coffeeIndex, coffee);
			}
		}

		return (coffeeIndex == -1) ?
			new ResponseEntity<>(postCoffee(coffee), HttpStatus.CREATED).getBody() :
			new ResponseEntity<>(coffee, HttpStatus.OK).getBody();
	}

	@DeleteMapping("/{id}")
	void deleteCoffee(@PathVariable String id) {
		coffees.removeIf(c -> c.getId().equals(id));
	}
}



