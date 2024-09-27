package br.com.librastils.models;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Table(name = "enderecos")
public class Endereco {
    private String endereco;
    private String cep;
    private String cidade;
    private String estado;

}
