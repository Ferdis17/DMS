package com.dorm.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.dorm.domain.Product;

public class InMemoryProductRepository implements ProductRepository{
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public List<Product> getAllProducts() {
		Map<String, Object> params = new HashMap<String,Object>();
		List<Product> result = jdbcTemplate.query("SELECT * FROM products", params, new ProductMapper());
			        return result;
			}
	@Override
    public void updateStock(String productId, long noOfUnits) {
       String SQL = "UPDATE PRODUCTS SET UNITS_IN_STOCK = :unitsInStock WHERE ID = :id";
       Map<String, Object> params = new HashMap<>();
       params.put("unitsInStock", noOfUnits);
       params.put("id", productId);
       jdbcTemplate.update(SQL, params);
}
	private static final class ProductMapper implements
	 	RowMapper {
		   public Product mapRow(ResultSet rs, int rowNum)
		   throws SQLException {
			   
		   Product product = new Product();
		   
		    product.setProductId(rs.getString("ID"));
		    product.setName(rs.getString("NAME"));
		    product.setDescription(rs.getString("DESCRIPTION"));
		    product.setUnitPrice(rs.getBigDecimal("UNIT_PRICE"));
		    product.setManufacturer(rs.getString("MANUFACTURER"));
		    product.setCategory(rs.getString("CATEGORY"));
		    product.setCondition(rs.getString("CONDITION"));
		    product.setUnitsInStock(rs.getLong("UNITS_IN_STOCK"));
		    product.setUnitsInOrder(rs.getLong("UNITS_IN_ORDER"));
		    product.setDiscontinued(rs.getBoolean("DISCONTINUED"));
		    return product;
		   }

		
		}
		
	}


