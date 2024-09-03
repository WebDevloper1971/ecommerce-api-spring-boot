package com.ecomm.api.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;

    private String product_name;
    private String product_desc;
    private String product_img;
    private Long product_price;


    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    @JoinColumn(name = "fk_product_category")
    private Category product_category;


    @OneToMany(cascade = CascadeType.ALL, targetEntity = Tag.class)
    @JoinColumn(name = "fk_product_tag", referencedColumnName = "product_id") // referenced column is in this class pk
    private List<Tag> product_tags;

//    @OneToMany(cascade = CascadeType.ALL, targetEntity = ProductImage.class)
//    @JoinColumn(name = "fk_product_img", referencedColumnName = "product_id") // referenced column is in this class pk
//    private List<ProductImage> product_img;



}
