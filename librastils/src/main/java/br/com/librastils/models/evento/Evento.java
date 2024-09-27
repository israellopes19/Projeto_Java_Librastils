package br.com.librastils.models.evento;

import br.com.librastils.models.Organizador;
import jakarta.persistence.*;
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
@Table(name = "eventos")
public class Evento {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String nome;
   private String tipo;
   private Organizador organizador;
   private String tema;
   private String data;
   private String horario;

   private String lugar;
   private String descricao;



}
