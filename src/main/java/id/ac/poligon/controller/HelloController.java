package id.ac.poligon.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{
    
    @GetMapping("/hello")
	public Map<String, String > hello(){

		Map<String, String> data= new HashMap<>();
		data.put(
			"nama", "Lamin H. Datau"
		);
		return data;
	}

}