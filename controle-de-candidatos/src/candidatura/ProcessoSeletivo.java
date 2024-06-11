package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");

        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);

        System.out.println("\n-- Seleção de candidatos --");
        selecaoCandidatos();

        System.out.println("\n-- Imprimir Selecionados --");
        imprimirSelecionados();

        String[] candidatos = {"Maria", "João", "Ana", "Pedro", "Clara", "Lucas", "Isabella", "Bruno", "Carolina", "Gustavo"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if(salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULDADO DOS DEMAIS CANDIDATOS");
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("o Candidato: " + candidato + " Solicitou este valor de salário  " + salarioPretendido);

            if(salarioBase >= salarioPretendido) {
                System.out.println(candidato + " foi selecionado para a vaga!");
                candidatosSelecionados++;
            }

            candidatosAtual++;
        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos de acordo com o índice do elemento");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de número " + (i+1) + " é " + candidatos[i]);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuaTentando = !atendeu;
            if(continuaTentando) {
                tentativasRealizadas++;
            }else {
                System.out.println("Contato realizado com sucesso!");
            }
        } while(continuaTentando && tentativasRealizadas < 3);

        if(atendeu) {
            System.out.println("Conseguimos o contato com " + candidato + " com " + tentativasRealizadas + " tentativas!");
        }else {
            System.out.println("NÃO conseguimos o contato com " + candidato + " com " + tentativasRealizadas + " tentativas!");
        }
    }
}