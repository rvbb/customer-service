package com.rvbb.b2b.backend.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.json.JSONObject;

import java.sql.Timestamp;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DetailOrder {

	private Timestamp orderDate;

	private Double total;

	private Customer customer;

	@Override
	public String toString() {
		return new JSONObject(this).toString();
	}
}
