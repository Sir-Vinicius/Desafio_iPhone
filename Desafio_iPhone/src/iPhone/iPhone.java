package iPhone;
 
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementa��o dos m�todos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando m�sica...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando m�sica...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando m�sica...");
    }

    // Implementa��o dos m�todos da interface AparelhoTelefonico
    @Override
    public void ligar() {
        System.out.println("Ligando telefone...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Implementa��o dos m�todos da interface NavegadorInternet
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo p�gina da internet...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba do navegador...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando p�gina da internet...");
    }
}