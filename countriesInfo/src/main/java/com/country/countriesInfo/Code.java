package com.country.countriesInfo;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.country.countriesInfo.models.ApiResponse;
import com.country.countriesInfo.models.ListOfCountries;
import com.google.gson.Gson;

@Service
public class Code {

	public static void main(String[] args) {

		String url = "https://restcountries.com/v3.1/name/india";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);

		// printing http response code from rest call
		System.out.println(responseEntity.getStatusCode());

		// printing response body from rest call
		System.out.println(responseEntity.getBody());

		// type 1 which reads only required fields
		Gson gson = new Gson();
		ListOfCountries response = gson.fromJson("{\"apiresponse\":" + responseEntity.getBody() + "}",
				ListOfCountries.class);
		System.out.println("solution1:\n" + response);

		// type 2 which reads all the fields from the json but we can read only class
		// objects
		ArrayList<ApiResponse> response2 = gson.fromJson(responseEntity.getBody(), ArrayList.class);
		System.out.println("solution2:\n" + response2);
	}

}
