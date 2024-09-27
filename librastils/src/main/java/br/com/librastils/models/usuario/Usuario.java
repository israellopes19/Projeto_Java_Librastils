package br.com.librastils.models.usuario;

import br.com.librastils.models.Endereco;
import br.com.librastils.models.evento.Evento;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Table(name = "usuarios")
public class Usuario {
    private String user;
    private String nomeCompleto;
    private double dataDeNascimento;
    @Id
    private String cpf;
    private String telefone;
    private String email;
    private double senha;
    @Embedded
    private Endereco endereco;

    private List<Evento> eventos;


}
