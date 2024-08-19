public class App {

    public static void exibeProgressoCarro(Carro c, TipoCombustivel tc, String s, int abastecimento) {
        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro "+ s +" com "+tc.name().toLowerCase());
        c.abastece(tc, abastecimento);
        System.out.println(c);
        System.out.println("\nViajando com o carro "+s);
        c.viaja(250);
        c.viaja(150);
        System.out.println(c);
    }

    public static void main(String[] args) throws Exception {

        Carro basico = new Carro("Basico", TipoCombustivel.GASOLINA, 10, 0, 55);
        Carro esportivo = new Carro("Esportivo", TipoCombustivel.GASOLINA, 6, 0, 45);
        Carro utilitario = new Carro("Utilitario", TipoCombustivel.DIESEL, 5, 0, 70);
        Carro suv = new Carro("SUV", TipoCombustivel.FLEX, 8, 0, 55);
        Carro suvFlex = new Carro("SUVFlex", TipoCombustivel.FLEX, 8, 6, 65);


        System.out.println("Tipos de veiculos:");
        System.out.println(basico);
        System.out.println(esportivo);
        System.out.println(utilitario);
        System.out.println(suv);

        exibeProgressoCarro(basico, TipoCombustivel.GASOLINA, "basico", 55);
        exibeProgressoCarro(esportivo, TipoCombustivel.GASOLINA, "esportivo", 45);
        exibeProgressoCarro(utilitario, TipoCombustivel.DIESEL, "utilitario", 70);
        exibeProgressoCarro(suv, TipoCombustivel.GASOLINA, "suv", 55);
        exibeProgressoCarro(suvFlex, TipoCombustivel.GASOLINA, "suvFlex", 65);
        exibeProgressoCarro(suvFlex, TipoCombustivel.ALCOOL, "suvFlex", 65-suvFlex.getCombustivelDisponivel());
    }
}