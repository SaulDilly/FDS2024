public class App {

    public static void exibeProgressoCarro(Carro c, TipoCombustivel tc, String s, int abastecimento) {
        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro "+ s +" com gasolina");
        basico.abastece(tc, abastecimento);
        System.out.println(c);
        System.out.println("\nViajando com o carro "+s);
        basico.viaja(250);
        basico.viaja(150);
        System.out.println(c);
    }

    public static void main(String[] args) throws Exception {

        Carro basico = new Carro("Basico", TipoCombustivel.GASOLINA, 10, 55);
        Carro esportivo = new Carro("Esportivo", TipoCombustivel.GASOLINA, 6, 45);

        System.out.println("Tipos de veiculos:");
        System.out.println(basico);
        System.out.println(esportivo);

        exibeProgressoCarro(basico, TipoCombustivel.GASOLINA, "basico", 55).
        exibeProgressoCarro(esportivo, TipoCombustivel.GASOLINA, "esportivo", 45).
    }
}