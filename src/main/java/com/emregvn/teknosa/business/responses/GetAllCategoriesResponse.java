package com.emregvn.teknosa.business.responses;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCategoriesResponse {
	private int id;
	private String name;
	private List<GetAllCategoriesResponse> subCategories = new ArrayList<>();
}
