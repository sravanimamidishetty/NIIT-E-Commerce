package com.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Supplier {
	@Id
	@GeneratedValue
private int supplier_id;
private String supplier_name;
public int getSupplier_id() {
	return supplier_id;
}
public void setSupplier_id(int supplier_id) {
	this.supplier_id = supplier_id;
}
public String getSupplier_name() {
	return supplier_name;
}
public void setSupplier_name(String supplier_name) {
	this.supplier_name = supplier_name;
}

}
