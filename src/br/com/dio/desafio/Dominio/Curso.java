package br.com.dio.desafio.Dominio;

public class Curso  extends  Conteudo{
   private String titulo;
   private  String descricao;
   private  int cargaHoraia;

   public Curso(){

   }

    @Override
    public double calcularxp() {
        return XP_PADRAO * cargaHoraia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraia() {
        return cargaHoraia;
    }

    public void setCargaHoraia(int cargaHoraia) {
        this.cargaHoraia = cargaHoraia;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao()+ '\'' +
                ", cargaHoraia=" + cargaHoraia +
                '}';
    }
}
