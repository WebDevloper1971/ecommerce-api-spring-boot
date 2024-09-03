package com.ecomm.api.controllers;


import com.ecomm.api.entities.Tag;
import com.ecomm.api.services.TagServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tag")
public class TagController {


    @Autowired
    TagServiceImpl tagService;

    @GetMapping
    public List<Tag> getAllTags(){
        return tagService.getAllTags();
    }

    @PostMapping
    public String saveTag(@RequestBody Tag tag){
        tagService.save(tag);
        return "Tag saved successfully";
    }

}
