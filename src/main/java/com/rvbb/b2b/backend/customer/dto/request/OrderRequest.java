package com.rvbb.b2b.backend.customer.dto.request;

import lombok.*;

import java.util.Date;

@Builder
@Setter
@Getter
public class OrderRequest {

	private Date orderDate;
	private Float total;
	private Long customerId;
}
