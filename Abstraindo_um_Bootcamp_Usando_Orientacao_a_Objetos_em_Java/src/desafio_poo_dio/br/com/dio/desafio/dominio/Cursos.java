package desafio_poo_dio.br.com.dio.desafio.dominio;

public class Cursos extends Conteudo {
    private int cargaHoraria;

    public Cursos() {
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Titulo= '" + getTitulo() + '\'' +
                ", Descrição= '" + getDescricao() + '\'' +
                ", Carga Horária= " + cargaHoraria + " horas" +
                "}";
    }
}
