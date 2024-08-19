public class CarroEcono extends Carro {

    public CarroEcono(String modelo, TipoCombustivel tipoCombustivel, int consumoInicial, int capacidadeTanque, int consumoMinimo, double decrementoPorKm) {
        super(modelo, tipoCombustivel, new MotorEcono(tipoCombustivel, consumoInicial, consumoMinimo, decrementoPorKm), capacidadeTanque);
    }
}