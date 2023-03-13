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
@Table(name = "tb_avaliacoes")  // Usada para especificar a tabela principal da entidade atualmente anotada.
public class AvaliacaoFisica {

  @Id         // Especifica o identificador da entidade. Uma entidade deve sempre ter um atributo identificado.
  @GeneratedValue(strategy = GenerationType.IDENTITY) // Especifica que o valor do identificador de entidade é gerado automaticamente.
  private Long id;

  @ManyToOne(cascade = CascadeType.ALL)   // Usada para especificar um relacionamento de banco de dados muitos-para-um.
  @JoinColumn(name = "aluno_id")          // Usada para especificar a coluna FOREIGN KEY. Indica que a entidade é a responsável pelo relacionamento.
  private Aluno aluno;

  private LocalDateTime dataDaAvaliacao = LocalDateTime.now();

  @Column(name = "peso_atual")
  private double peso;

  @Column(name = "altura_atual")
  private double altura;

}
