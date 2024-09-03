package com.ecomm.api.services;


import com.ecomm.api.entities.Tag;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TagService {

    String save(Tag tag);

    String delete(Long id);

    Tag updateTag(Tag tag);

    Optional<Tag> getById(Long id);

    List<Tag> getAllTags();

}
