// Classe IPhone que implementa as interfaces ReprodutorMusical, AparelhoTelefonico e NavegadorInternet

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação do método tocar() da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música.");
    }

    // Implementação do método pausar() da interface ReprodutorMusical
    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    // Implementação do método selecionarMusica(String musica) da interface ReprodutorMusical
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    // Implementação do método ligar(String numero) da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    // Implementação do método atender() da interface AparelhoTelefonico
    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    // Implementação do método iniciarCorreioVoz() da interface AparelhoTelefonico
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    // Implementação do método exibirPagina(String url) da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    // Implementação do método adicionarNovaAba() da interface NavegadorInternet
    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    // Implementação do método atualizarPagina() da interface NavegadorInternet
    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    // Método principal para testar as funcionalidades do IPhone
    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();

        // Testando funcionalidades do ReprodutorMusical
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica("Imagine - John Lennon");

        // Testando funcionalidades do AparelhoTelefonico
        meuIPhone.ligar("123-456-7890");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testando funcionalidades do NavegadorInternet
        meuIPhone.exibirPagina("www.example.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
