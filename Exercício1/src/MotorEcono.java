public class MotorEcono extends Motor {

    private int consumoInicial;
    private int consumoMinimo;
    private double decrementoPorKm;

    public MotorEcono(TipoCombustivel tipoMotor, int consumoInicial, int consumoMinimo, double decrementoPorKm) {
        super(tipoMotor, consumoInicial, 0);
        this.consumoInicial = consumoInicial;
        this.consumoMinimo = consumoMinimo;
        this.decrementoPorKm = decrementoPorKm;
    }

    @Override
    public int getConsumo() {
        int kmPercorrida = getQuilometragem();
        double consumoAtual = (double) (consumoInicial - (kmPercorrida / decrementoPorKm));

        // Consumo não pode ser inferior ao consumo mínimo
        if (consumoAtual < consumoMinimo) {
            consumoAtual = consumoMinimo;
        }

        return consumoAtual;
    }
}
