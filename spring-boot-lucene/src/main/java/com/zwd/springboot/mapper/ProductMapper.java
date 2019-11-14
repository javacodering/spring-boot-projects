package com.zwd.springboot.mapper;


import com.zwd.springboot.entity.PageQuery;
import com.zwd.springboot.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
	/**
	 * 通过id获取商品
	 * @param id
	 * @return
	 */
	public Product getProductById(String id);
	/**
	 * 获取所有的商品
	 * @return
	 */
	public List<Product> getAllProduct();
	/**
	 * 通过参数查询,筛选商品
	 * @param pageQuery
	 * @return
	 */
	public List<Product> getProductList(PageQuery<Product> pageQuery);
	/**
	 * 添加Product
	 * @param product
	 */
	public void addProduct(Product product);
	/**
	 * 通过id删除商品
	 * @param id
	 */
	public void deleteProductById(String id);
	/**
	 * 更新商品
	 * @param product
	 */
	public void updateProductById(Product product);
	
}
