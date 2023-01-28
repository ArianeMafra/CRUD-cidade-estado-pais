package br.com.ada.crud.view;

import br.com.ada.crud.view.viewCidade.CidadeView;
import br.com.ada.crud.view.viewEstado.EstadoView;
import br.com.ada.crud.view.viewPais.PaisView;

import java.util.Scanner;

public class Menu {
    public static void opcaoCadastro(CidadeView cidadeView, EstadoView estadoView, PaisView paisView) {
        System.out.println("Informe o número da opção que deseja interagir: ");
        System.out.println("1 - Cidade");
        System.out.println("2 - Estado");
        System.out.println("3 - País");
        System.out.println("0 - Sair");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                cidadeView.exibirOpcoesCidade();
                break;
            case 2:
                estadoView.exibirOpcoesEstado();
                break;
            case 3:
                paisView.exibirOpcoesPais();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
        }
        opcaoCadastro(cidadeView, estadoView, paisView);
    }
}
