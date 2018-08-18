package com.cubic.rest.service;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@XmlRootElement
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerData {

	private Long id;
	private String firstName;
	private int age;

}
