package com.emregvn.teknosa.business.abstracts;

import java.util.List;

import com.emregvn.teknosa.business.responses.GetAllCategoriesResponse;

public interface CategoryService {
	List<GetAllCategoriesResponse> getAll();
}
