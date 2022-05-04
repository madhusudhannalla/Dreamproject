package com.dream.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dream.beans.StoreAreas;

@Repository
public interface AreaRepo extends JpaRepository<StoreAreas, Integer> {

}
