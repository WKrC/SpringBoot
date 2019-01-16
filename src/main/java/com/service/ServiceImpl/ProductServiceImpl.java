package com.service.ServiceImpl;

import com.bean.Product;
import com.bean.ProductKey;
import com.dao.ProductMapper;
import com.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "productServiceImpl")
public class ProductServiceImpl implements IProductService {

    @Resource
    private ProductMapper productMapper;//这里会报错，但是并不会影响

    @Override
    public Product findUser(ProductKey pk) {
        return productMapper.selectByPrimaryKey(pk);
    }

    @Override
    public Integer findOne(int id) {
        Integer i = productMapper.selectByWKR(id);
        return i;
    }
}
