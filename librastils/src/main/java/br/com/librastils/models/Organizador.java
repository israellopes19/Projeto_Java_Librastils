package br.com.librastils.models;

import br.com.librastils.models.evento.Evento;
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
@Getter
@Setter
@Table(name = "organizadores")
public class Organizador {
    @Id
    private String cnpj;
    private String nome;
    private List<Evento> eventos;
}
