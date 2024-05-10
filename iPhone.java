// Interface Reprodutor de Musica
public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica();
}

// Interface do Aparelho Telefonico
public interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

// Interface Navegador de Internet
public interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

// Classe iPhone implementando as interfaces
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementações dos métodos das interfaces
    public void tocar() {
        // Implementação
    }
    
    public void pausar() {
        // Implementação
    }
    
    public void selecionarMusica() {
        // Implementação
    }
    
    public void ligar(String numero) {
        // Implementação
    }
    
    public void atender() {
        // Implementação
    }
    
    public void iniciarCorreioVoz() {
        // Implementação
    }
    
    public void exibirPagina(String url) {
        // Implementação
    }
    
    public void adicionarNovaAba() {
        // Implementação
    }
    
    public void atualizarPagina() {
        // Implementação
    }
}
