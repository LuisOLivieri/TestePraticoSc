public class Main {
    public static void main(String[] args) {

        Projeto projeto = new Projeto("Scenario");
        Ambiente sala = new Ambiente("Sala");
        Modulo modulo = new Modulo("EB-SDM8");
        Luminaria spot = new Luminaria("Spot");
        Luminaria arandela = new Luminaria("Arandela");
        Teclado tecladoEntrada = new Teclado("Entrada",Corteclado.BRANCO);
        Teclado tecladoEscada = new Teclado("Escada",Corteclado.PRETO);
        Cena cena = new Cena("Cinema");


        spot.ligar();
        spot.desligar();

        cena.ligarLuminarias();
        cena.desligarLuminaras();

        cena.ligarLuminarias();
        cena.desligarLuminaras();
        projeto.adicionarAmbiente(sala);
        sala.adicionarItemAmbiente(modulo);
        sala.adicionarItemAmbiente(spot);
        sala.adicionarItemAmbiente(arandela);
        sala.adicionarItemAmbiente(tecladoEntrada);
        sala.adicionarItemAmbiente(tecladoEscada);
        modulo.adicionarLuminaria(spot);
        modulo.adicionarLuminaria(arandela);
        spot.adicionarAcionadores(tecladoEntrada);
        arandela.adicionarAcionadores(tecladoEntrada);
        arandela.adicionarAcionadores(tecladoEscada);

        sala.removerItemAmbiente(spot);
        modulo.removerLuminaria(arandela);




    }
}