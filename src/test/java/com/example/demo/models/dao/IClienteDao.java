package com.example.demo.models.dao;

import java.util.List;

import com.example.demo.models.entity.Cliente;

/**
 * 
 * @author grim0
 *
 */
public interface IClienteDao {

	public List<Cliente> findAll();
}
