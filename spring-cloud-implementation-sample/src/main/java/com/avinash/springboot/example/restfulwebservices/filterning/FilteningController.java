package com.avinash.springboot.example.restfulwebservices.filterning;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteningController {
	
	@GetMapping("/filterning")
	public SomeBean retriveBean()
	{
		return new SomeBean("value1", "Value2", "value3");
	}

	@GetMapping("/filterning-list")
	public List<SomeBean> ListretriveBean()
	{
		return Arrays.asList( new SomeBean("value1", "Value2", "value3"),
				new SomeBean("value1", "Value2", "value3"));
	}

	
	@GetMapping("/filterning2")
	public MappingJacksonValue retriveBean2()
	{
		SomeBean2 someBean = new SomeBean2("value1", "Value2", "value3");
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.
				filterOutAllExcept("filed1", "filed2");
		
		FilterProvider filters = new SimpleFilterProvider()
				.addFilter("SomeFilter", filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(someBean);
		
		
		
		mapping.setFilters(filters);

		
		return mapping;
	}

	@GetMapping("/filterning-list2")
	public MappingJacksonValue ListretriveBean2()
	{
		List<SomeBean2> list = Arrays.asList( new SomeBean2("value1", "Value2", "value3"),
			new SomeBean2("value1", "Value2", "value3"));
		
SomeBean2 someBean = new SomeBean2("value1", "Value2", "value3");
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.
				filterOutAllExcept("filed1", "filed2");
		
		FilterProvider filters = new SimpleFilterProvider()
				.addFilter("SomeFilter", filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(list);
		
		
		
		mapping.setFilters(filters);

		
		
		return mapping;
	}

}
