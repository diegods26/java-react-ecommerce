package com.ecommerce.ds_ecom.repository;

import com.ecommerce.ds_ecom.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>
{
}
