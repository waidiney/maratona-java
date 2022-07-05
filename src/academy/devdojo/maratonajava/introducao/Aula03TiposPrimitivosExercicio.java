package academy.devdojo.maratonajava.introducao;
/* Prática
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>, confirmo que recebi o <salário>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Waidiney";
        String endereco = "Rua patativas, Quadra 3 casa 18";
        double salario = 5000.25;
        String dataRecebimentoSalario = "06/06/22";
        String relatorio = "Eu "+nome+", morando no endereço "+endereco+" confirmo que recebi o salario de "+salario+", na data "+dataRecebimentoSalario+".";
        System.out.println(relatorio);
        }
}