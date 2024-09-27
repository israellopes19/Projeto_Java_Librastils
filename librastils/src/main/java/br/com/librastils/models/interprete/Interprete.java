package br.com.librastils.models.interprete;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Table(name = "interpretes")
public class Interprete {
    private String user;
    private String nomeCompleto;
    @Id
    private String cpf;
    private String dataDeNascimento;
    private String telefone;
    private String email;
    private double senha;
}
