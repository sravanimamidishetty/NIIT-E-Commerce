package com.backend.DAO;

import java.util.List;

import com.backend.model.Supplier;

public interface SupplierDAO {
public boolean saveSupplier(Supplier supplier);
	
	public List<Supplier> list();
	
	public Supplier getSupplierById(int supplier_id);
	
	public Supplier removeSupplierById(int supplier_id);
}
