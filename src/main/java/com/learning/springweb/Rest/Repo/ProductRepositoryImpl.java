/*
 * package com.learning.springweb.Rest.Repo;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.jdbc.core.JdbcTemplate; import
 * org.springframework.stereotype.Repository;
 * 
 * import com.learning.springweb.Rest.model.Product;
 * 
 * @Repository public class ProductRepositoryImpl implements ProductRepository{
 * 
 * @Autowired JdbcTemplate jdbcTemplate;
 * 
 * @Override public int create(Product product) {
 * 
 * String query =
 * "insert into Product(id, name, description, price) values (?,?,?,?)"; int
 * result = jdbcTemplate.update(query, product.getId(), product.getName(),
 * product.getDescription(),product.getPrice()); System.out.println("result :: "
 * + result); return result; } }
 */