public class Motor {
    
    private TipoCombustivel tipoMotor;
    private int consumoCombustivel1;
    private int consumoCombustivel2;
    private int quilometragem;

    public Motor(TipoCombustivel tipoMotor, int consumoCombustivel1, int consumoCombustivel2) {
        this.tipoMotor = tipoMotor;
        this.consumoCombustivel1 = consumoCombustivel1;
        this.consumoCombustivel2 = consumoCombustivel2;
    }

    public int getConsumo(TipoCombustivel tipoCombustivel) {
        return tipoCombustivel == TipoCombustivel.ALCOOL ? this.consumoCombustivel2 : this.consumoCombustivel1;
    }

    public TipoCombustivel getTipoMotor(){
        return this.tipoMotor;
    }

    public int getQuilometragem(){
        return this.quilometragem;
    }

    public int combustivelNecessario(int distancia, TipoCombustivel tipoCombustivel) {
        return distancia / getConsumo(tipoCombustivel);
    }

    public void percorre(int distancia) {
        quilometragem += distancia;
    }

    @Override
    public String toString() {
        return "Motor [consumoCombustivel1=" + consumoCombustivel1 + ", consumoCombustivel2=" + consumoCombustivel2 + ", quilometragem=" + quilometragem + ", tipoMotor=" + tipoMotor + "]";
    }
}
