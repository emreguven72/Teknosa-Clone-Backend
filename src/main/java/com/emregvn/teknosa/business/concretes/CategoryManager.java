package com.emregvn.teknosa.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.emregvn.teknosa.business.abstracts.CategoryService;
import com.emregvn.teknosa.business.responses.GetAllCategoriesResponse;
import com.emregvn.teknosa.dataAccess.abstracts.CategoryRepository;
import com.emregvn.teknosa.entities.concretes.Category;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoryManager implements CategoryService {
	private CategoryRepository categoryRepository;

	@Override
	public List<GetAllCategoriesResponse> getAll() {
		List<Category> rootCategories = this.categoryRepository.findAll().stream()
				.filter(category -> category.getParentCategory() == null).toList();

		return rootCategories.stream().map(this::mapToResponse).collect(Collectors.toList());

	}

	private GetAllCategoriesResponse mapToResponse(Category category) {
		GetAllCategoriesResponse response = new GetAllCategoriesResponse();

		response.setId(category.getId());
		response.setName(category.getName());

		List<GetAllCategoriesResponse> subCategories = category.getSubCategories().stream().map(this::mapToResponse)
				.collect(Collectors.toList());

		response.setSubCategories(subCategories);

		return response;
	}

}
