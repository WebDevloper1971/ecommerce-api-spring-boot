package com.ecomm.api.repositories;

import com.ecomm.api.entities.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagsRepository extends JpaRepository<Tag,Long> {
}
