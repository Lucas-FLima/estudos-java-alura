import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("TopGun: Maverick");
        meuFilme.setAnoDeLancamento(2021);
        meuFilme.setDuracaoEmMinutos(215);
        meuFilme.setIncluidoNoPlano(false);

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.exibeFichaTecnica();
        System.out.println(meuFilme.pegaMedia());
        System.out.println(meuFilme.getTotalDeAvaliacoes());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(45);
        lost.setIncluidoNoPlano(true);
        lost.setAtiva(false);

        System.out.println("Duração total da série: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(meuFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());


    }
}
