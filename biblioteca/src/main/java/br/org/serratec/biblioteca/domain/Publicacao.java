package br.org.serratec.biblioteca.domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@MappedSuperclass
public class Publicacao {

	@Column(nullable = false, length = 50)
	@NotBlank(message = "O livro precisa conter um autor")
	@Size(min = 2, max = 50, message = "O nome do autor deve conter entre {min} e {max} de caracteres")
	private String autor;

	@Column
	@Temporal(TemporalType.DATE)
	private LocalDate dataPublicacao;

	@Column(length = 50)
	@Size(min = 2, max = 50, message = "O nome da editora deve conter entre {min} e {max} de caracteres")
	private String editora;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

}
