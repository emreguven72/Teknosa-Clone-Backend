package com.emregvn.teknosa.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emregvn.teknosa.entities.concretes.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>  {
	
}
