package com.shopping.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.entity.ShopEntity;

public interface ShopRepository extends JpaRepository<ShopEntity, Long>{

	List<ShopEntity> save(List<ShopEntity> shopEntity);

}
