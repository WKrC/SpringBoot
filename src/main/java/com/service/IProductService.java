package com.service;

import com.bean.Product;
import com.bean.ProductKey;

import java.util.List;

public interface IProductService {
    Product findUser(ProductKey pk);
    Integer findOne(int id);
}
