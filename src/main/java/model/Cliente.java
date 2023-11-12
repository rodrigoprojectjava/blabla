package model;

import java.sql.Date;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Cliente {
	
	@Id
	@GeneratedValue
	private Long clienteId;
	
	@Column(nullable = false)
	@NotEmpty(message = "{campo.clienteNome.obrigatorio}")
	@Length(max = 100, message = "{campo.clienteNome.caracteres}")
	@NotNull(message = "campo.clienteNome.nulo")
	private String clienteNome;
	
	@Email (message = "{campo.clienteEmail.invalido}")
	@NotNull(message = "{campo.clienteEmail.nulo}")
	@Length (max = 100, message = "{campo.clienteEmail.caracteres}")
	@NotEmpty(message = "{campo.clienteEmail.obrigatorio}")
	@Column (nullable = false, unique = true)
	private String clienteEmail;
	
	@CPF (message = "{campo.clienteCpf.invalido}")
	@NotNull (message = "{campo.clienteCpf.nulo}")
	@NotEmpty (message = "{campo.clienteCpf.obrigatorio}")
	@Column(nullable = false, unique = true)
	private String clienteCpf;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	@NotNull(message = "{campo.clienteNascimento.nulo}")
	@Column(nullable = false)
	private Date clienteNascimento;
}
