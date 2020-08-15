package listaraniversario;
import java.time.LocalDate;
import java.util.Scanner;
public class ListarAniversario {

    public static void main(String[] args) {
        int opcao;
        Scanner s = new Scanner(System.in);
        AniversarianteList<Aniversariante> aniversariantes = new AniversarianteList<>();
        do{
            System.out.println("=-=-=-=- MENU -=-=-=-=\n" + 
                               "1. Adicionar uma nova pessoa\n" +
                               "2. Remover uma pessoa\n" +
                               "3. Atualizar os dados de uma pessoa\n" + 
                               "4. Mostrar os dados de uma pessoa\n" +
                               "5. Listar todas as pessoas\n" +
                               "6. Ordenar pelas datas mais próximas\n" +
                               "6. Sair\n"
            );
            while(true){
                System.out.print("Sua opção: ");
                opcao = s.nextInt();
                s.nextLine();
                if(opcao >= 0 && opcao <= 6) break;
                System.out.println("Digite uma opção válida.");
            }
            
            if(opcao == 1){
                System.out.print("Digite o nome da pessoa: ");
                String nome = s.nextLine();
                
                System.out.println("Digite a data de nascimento");
                System.out.print("Dia: ");
                int dia = s.nextInt();
                System.out.print("Mês: ");
                int mes = s.nextInt();
                System.out.print("Ano: ");
                int ano = s.nextInt();
                
                LocalDate data = LocalDate.of(ano, mes, dia);
                
                Aniversariante aniversariante = new Aniversariante(nome, data);
                aniversariantes.add(aniversariante);
            }else if(opcao == 2) {
                if(aniversariantes.getIndex() == 0){
                    System.out.println("Não há ninguém na lista para remover");
                }else{
                    int posicao = 1;
                    for(Aniversariante aniversariante : aniversariantes) {
                        System.out.println(posicao + ". " + aniversariante);
                        System.out.println();
                        posicao++;
                    }
                    System.out.println("Qual você gostaria de remover: ");
                    int index = s.nextInt();
                    try{
                        aniversariantes.remove(index-1);
                    }catch(ArrayIndexOutOfBoundsException e){
                        System.out.println("O valor informado é inválido");
                    }
                }
            }else if(opcao == 3){
                int posicao = 1;
                for(Aniversariante aniversariante : aniversariantes) {
                    System.out.println(posicao + ". " + aniversariante);
                    System.out.println();
                    posicao++;
                }
                System.out.println("Qual você gostaria de atualizar? ");
                int index = s.nextInt();
                
                s.nextLine();
                System.out.println("Digite o novo nome: ");
                String nome = s.nextLine();
                
                System.out.println("Digite o dia: ");
                int dia = s.nextInt();
                System.out.println("Digite o mês: ");
                int mes = s.nextInt();
                System.out.println("Digite o ano: ");
                int ano = s.nextInt();
                
                LocalDate data = LocalDate.of(ano, mes, dia);
                Aniversariante aniversariante = new Aniversariante(nome, data);
                try{
                    aniversariantes.set(index-1, aniversariante);
                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("O valor informado é inválido");
                }
                
            }else if(opcao == 4){
                System.out.println("Você gostaria de obter os dados de qual pessoal: ");
                int index = s.nextInt();
                try{
                    System.out.println(aniversariantes.get(index));
                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("O valor informado é inválido");
                }
            }else if(opcao == 5){
                System.out.println("------------------------------------------------");
                System.out.println("| Nome           | Idade | Próximo Aniversário |");
                for(Aniversariante aniversariante : aniversariantes) {
                    System.out.printf("| %-14.14s | %5.5s | %19.19s |\n", aniversariante.getNome(),
                                                        Integer.toString(aniversariante.getIdade()),
                                                        aniversariante.getProximoAniversarioString()
                    );
                }
            }else if(opcao == 6){
                aniversariantes.sort();
            }
            
        }while(opcao != 7);
    }
    
}
