package com.dorm.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import javax.swing.tree.TreePath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dorm.domain.Customer;


@Repository
public class InMemoryCustomerRepository implements CustomerRepository{
	
	@Autowired
	   private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public List<Customer> getAllCustomers() {
		
		Map<String, Object> params = new HashMap<String,Object>();
			        List<Customer> result = jdbcTemplate.query("SELECT * FROM customers", params, new CustomerMapper());
			        return result;
			}
	
		private static final class CustomerMapper implements RowMapper {
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		   
	   Customer customer = new Customer();
	   
	   	customer.setCustomerId(rs.getLong("ID"));
	   	customer.setName(rs.getString("name"));
	   	customer.setNoOfOrdersMade(rs.getInt("Orders"));
	   	customer.setAddess(rs.getString("Kigali"));
//	    product.setProductId(rs.getString("ID"));
//	    product.setName(rs.getString("NAME"));
//	    product.setDescription(rs.getString("DESCRIPTION"));
//	    product.setUnitPrice(rs.getBigDecimal("UNIT_PRICE"));
//	    product.setManufacturer(rs.getString("MANUFACTURER"));
//	    product.setCategory(rs.getString("CATEGORY"));
//	    product.setCondition(rs.getString("CONDITION"));
//	    product.setUnitsInStock(rs.getLong("UNITS_IN_STOCK"));
//	    product.setUnitsInOrder(rs.getLong("UNITS_IN_ORDER"));
//	    product.setDiscontinued(rs.getBoolean("DISCONTINUED"));
	    return customer;
	   }

	
	}


}
