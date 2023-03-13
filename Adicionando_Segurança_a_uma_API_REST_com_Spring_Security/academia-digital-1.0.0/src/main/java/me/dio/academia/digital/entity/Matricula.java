package me.dio.academia.digital.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data                 // Abastrair get, set, equols e hashcod
@NoArgsConstructor    // Cria um construtor vazio
@AllArgsConstructor   // Cria um construtor com todos os atributos
@Entity               // Usada para especificar que a classe anotada atualmente representa um tipo de entidade.
@Table(name = "tb_matriculas")  // Usada para especificar a tabela principal da entidade atualmente anotada.
public class Matricula {

  @Id         // Especifica o identificador da entidade. Uma entidade deve sempre ter um atributo identificado.
  @GeneratedValue(strategy = GenerationType.IDENTITY) // Especifica que o valor do identificador de entidade é gerado automaticamente.
  private Long id;

  @OneToOne(cascade = CascadeType.ALL)  // Usada para especificar um relacionamento de banco de dados um-para-um.
  @JoinColumn(name = "aluno_id")
  private Aluno aluno;

  private LocalDateTime dataDaMatricula = LocalDateTime.now();
}
