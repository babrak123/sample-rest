package com.cubic.rest.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cubic.rest.entity.CustomerEntity;

@Service("jpaimpl")
@Transactional
public class CustomerJpaImpl implements CustomerService {
	
	@PersistenceContext
	private EntityManager em;
	@Autowired
	private CustomerMapper mapper;
	
	@Override
	public CustomerData create(CustomerData customer) {
		CustomerEntity entity = mapper.maptoCustomerDat(customer);
		em.persist(entity);
		customer.setId((entity.getPk()));
		return customer;
	}

	@Override
	public void modify(CustomerData customer) {
		CustomerEntity entity = em.find(CustomerEntity.class, new Long(customer.getId()));
		em.persist(entity);
	}

	@Override
	public CustomerData get(String id) {
		CustomerEntity entity =em.find(CustomerEntity.class, new Long (id));
		return mapper.maptoCustomerData(entity);
	}

	@Override
	public void remove(String id) {
		CustomerEntity entity =em.find(CustomerEntity.class, new Long (id));
		em.remove(entity);

	}

	@Override
	public CustomerSearchResult search(String name) {
		return null;
	}

}
