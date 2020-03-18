package br.gov.rn.natal.pgmlogin.models;

import java.io.Serializable;
// import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class InputUser implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String email;
	private String password;
	private String registration;
	private String sector;
	private String bond;
	// private Date dateCreate;

}