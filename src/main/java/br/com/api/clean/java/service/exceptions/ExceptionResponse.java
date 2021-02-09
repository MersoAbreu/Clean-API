package br.com.api.clean.java.service.exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class ExceptionResponse{


	private String message;
	private String datails;
	private LocalDateTime timestamp;
	
	public ExceptionResponse(String message, String datails, LocalDateTime timestamp) {
		super();
		this.message = message;
		this.datails = datails;
		this.timestamp = timestamp;
	}
	
	
}
