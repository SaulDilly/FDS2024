public class App {

    public static void exibeProgressoCarro(Carro c, TipoCombustivel tc, String s, int abastecimento) {
        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro "+ s +" com gasolina");
        c.abastece(tc, abastecimento);
        System.out.println(c);
        System.out.println("\nViajando com o carro "+s);
        c.viaja(250);
        c.viaja(150);
        System.out.println(c);
    }

    public static void main(String[] args) throws Exception {

        Carro basico = new Carro("Basico", TipoCombustivel.GASOLINA, 10, 55);
        Carro esportivo = new Carro("Esportivo", TipoCombustivel.GASOLINA, 6, 45);
        Carro utilitario = new Carro("Utilitario", TipoCombustivel.DIESEL, 5, 70);
        Carro suv = new Carro("SUV", TipoCombustivel.FLEX, 8, 55);

        System.out.println("Tipos de veiculos:");
        System.out.println(basico);
        System.out.println(esportivo);
        System.out.println(utilitario);

        exibeProgressoCarro(basico, TipoCombustivel.GASOLINA, "basico", 55).
        exibeProgressoCarro(esportivo, TipoCombustivel.GASOLINA, "esportivo", 45).
        exibeProgressoCarro(utilitario, TipoCombustivel.DIESEL, "utilitario", 70).
        exibeProgressoCarro(suv, TipoCombustivel.GASOLINA, "suv", 55).
    }
}