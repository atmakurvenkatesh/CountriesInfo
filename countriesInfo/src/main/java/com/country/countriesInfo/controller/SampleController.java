package com.country.countriesInfo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.country.countriesInfo.models.Name;

@RequestMapping
public class SampleController {

	@PostMapping("/get")
	@ResponseBody
	public Name getValues(@RequestBody Name name) {

		Name name2 = null;

		return name2;
	}

}
