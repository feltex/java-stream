package br.com.feltex.stream;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class UsandoStream {
    public static void main(String[] args) {

        var funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Funcionario(1, "Jose da Silva", "1111-1111", 25));
        funcionarios.add(new Funcionario(2, "Maria Santos", "2222-2222", 30));
        funcionarios.add(new Funcionario(3, "Ana Maria", "3333-3333", 22));
        funcionarios.add(new Funcionario(4, "Antonio Silveira", "4444-4444", 28));
        funcionarios.add(new Funcionario(6, "Fabiana Maria Pereira", null, 52));
        funcionarios.add(new Funcionario(6, "Fabiana Maria Pereira", null, 52)); // Item repetido
        funcionarios.add(new Funcionario(7, "Paulo Ferreira Monteiro", "7777-7777", 15));
        funcionarios.add(new Funcionario(8, "James Oliver", "1111-22222", 74));
        funcionarios.add(new Funcionario(9, "Venceslau Brás Garcia", "2222-33247", 74));
        funcionarios.add(new Funcionario(10, "Alberto Roberto", "4444-55555", 22));
        funcionarios.add(new Funcionario(11, "Zeleide Almeida", "5555-444", 34));

        //for(var funcionario : funcionarios)            System.out.println(funcionario);

        /*
        //Ordenar lista por nome ou idade
        funcionarios.stream().sorted(Comparator.comparing(Funcionario::getNome))
                //.distinct()
                .limit(4)
                .forEach(System.out::println);
        */

        /*
        var mediaIdade = funcionarios.stream()
                .mapToInt(Funcionario::getIdade).average();
        System.out.println("Media de idade: " + mediaIdade.getAsDouble());

        System.out.println("Funcionario acima da media de idade");
        funcionarios.stream().filter( f -> f.getIdade() > mediaIdade.getAsDouble())
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("Funcionarios abaixo ou igual a media de idade");
                funcionarios.stream().filter( f -> f.getIdade() <= mediaIdade.getAsDouble())
                        .distinct()
                        .collect(Collectors.toList())
                        .forEach(System.out::println);
         */

        /*
        var maisVelho = funcionarios.stream()
                .max(Comparator.comparing(Funcionario::getIdade)).get();

        var maisJovem = funcionarios.stream()
                .min(Comparator.comparing(Funcionario::getIdade)).get();

        System.out.println("Funcionario mais velho: "+ maisVelho);
        System.out.println("Funcionario mais Jovem: "+ maisJovem);

        */


        System.out.println("Imprimir todos os nomes que contem uma palavra");
        funcionarios.stream()
                .filter(f -> f.getNome().toLowerCase().contains("e"))
                .collect(Collectors.toList())
                .forEach(System.out::println);


        var somaDasIdades = funcionarios.stream().mapToInt(Funcionario::getIdade).sum();
        System.out.println("Soma das Idades: " + somaDasIdades);


        var funcionarioSet = funcionarios.stream().collect(Collectors.toSet());
        funcionarioSet.forEach(System.out::println);


    }
}
