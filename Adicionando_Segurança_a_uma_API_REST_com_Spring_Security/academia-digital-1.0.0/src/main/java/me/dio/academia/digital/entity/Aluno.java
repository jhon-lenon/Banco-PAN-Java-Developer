package me.dio.academia.digital.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data                 // Abastrair get, set, equols e hashcod
@NoArgsConstructor    // Cria um construtor vazio
@AllArgsConstructor   // Cria um construtor com todos os atributos
@Entity               // Usada para especificar que a classe anotada atualmente representa um tipo de entidade.
@Table(name = "tb_alunos")  // Usada para especificar a tabela principal da entidade atualmente anotada.
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) // inicialização lenta.
public class Aluno {

  @Id         // Especifica o identificador da entidade. Uma entidade deve sempre ter um atributo identificado.
  @GeneratedValue(strategy = GenerationType.IDENTITY) // Especifica que o valor do identificador de entidade é gerado automaticamente.
  private Long id;

  private String nome;

  @Column(unique = true)  // Usada para especificar o mapeamento entre um atributo de entidade básico e a coluna da tabela de banco de dados.
  private String cpf;

  private String bairro;

  private LocalDate dataDeNascimento;

  @OneToMany(mappedBy = "aluno", fetch = FetchType.LAZY) // Usada para especificar um relacionamento de banco de dados um-para-muitos.
  @JsonIgnore
  private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

}
