package com.ecomm.api.services;

import com.ecomm.api.entities.Tag;
import com.ecomm.api.repositories.TagsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TagServiceImpl implements TagService{

    @Autowired
    TagsRepository tagsRepository;

    @Override
    public String save(Tag tag) {
        tagsRepository.save(tag);
        return "Tag saved successfully";
    }

    @Override
    public String delete(Long id) {
        tagsRepository.deleteById(id);
        return "Tag deleted successfully";
    }

    @Override
    public Tag updateTag(Tag tag) {
        return null;
    }

    @Override
    public Optional<Tag> getById(Long id) {
        return tagsRepository.findById(id);
    }

    @Override
    public List<Tag> getAllTags() {
        return tagsRepository.findAll();
    }
}
