package com.cubic.rest.service;
import org.springframework.stereotype.Component;
import com.cubic.rest.entity.CustomerEntity;

@Component
public class CustomerMapper {

	public CustomerData maptoCustomerData(CustomerEntity entity) {

		return CustomerData.builder().age(entity.getAge()).firstName(entity.getFirstName()).id(entity.getPk()).build();
	
	}
	
	public CustomerEntity maptoCustomerDat(final CustomerData data) {
		CustomerEntity.CustomerEntityBuilder cb = CustomerEntity.builder();
		cb.age(data.getAge()).firstName(data.getFirstName());
		if(data.getId() != null) {
			cb.pk(new Long(data.getId()));
		}
		return cb.build();
	}
	public CustomerEntity maptoCustomerEntity(final CustomerEntity entity,final CustomerData data) {
		entity.setPk(data.getId());
		entity.setFirstName(entity.getFirstName());
		entity.setAge(data.getAge());
		return entity;
	}
}
