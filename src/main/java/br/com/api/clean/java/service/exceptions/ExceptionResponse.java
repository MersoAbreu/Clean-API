package br.com.api.clean.java.service.exceptions;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionResponse implements Serializable{


	
	private static final long serialVersionUID = 1L;
	private String message;
	private String datails;
	private LocalDateTime timestamp;
	
	
}
