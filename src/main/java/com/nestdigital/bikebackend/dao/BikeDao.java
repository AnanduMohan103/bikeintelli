package com.nestdigital.bikebackend.dao;

import com.nestdigital.bikebackend.model.BikeModel;
import org.springframework.data.repository.CrudRepository;

public interface BikeDao extends CrudRepository<BikeModel,Integer> {
}
