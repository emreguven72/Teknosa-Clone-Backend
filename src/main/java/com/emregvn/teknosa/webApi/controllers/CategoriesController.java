package com.emregvn.teknosa.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emregvn.teknosa.business.abstracts.CategoryService;
import com.emregvn.teknosa.business.responses.GetAllCategoriesResponse;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoriesController {
		private CategoryService categoryService;
		
		@GetMapping()
		public List<GetAllCategoriesResponse> getAll() {
			return this.categoryService.getAll();
		}
	
}
