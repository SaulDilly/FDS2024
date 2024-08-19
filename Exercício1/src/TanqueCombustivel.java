public class TanqueCombustivel {

    private TipoCombustivel tipoCombustivel; // Tipo de combustível que o tanque suporta
    private TipoCombustivel ultimoCombustivel; // Tipo de combustível do último abastecimento
    private int capacidade;
    private int combustivelDisponivel;

    public TanqueCombustivel(TipoCombustivel tipoCombustivel, int capacidade) {
        this.tipoCombustivel = tipoCombustivel;
        this.capacidade = capacidade;
        this.combustivelDisponivel = 0;
        this.ultimoCombustivel = tipoCombustivel; // Inicialmente, o tipo de combustível é o mesmo do tanque
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public TipoCombustivel getUltimoCombustivel() {
        return ultimoCombustivel;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getCombustivelDisponivel() {
        return combustivelDisponivel;
    }

    // Retorna false se o tipo de combustivel for incompativel ou se a quantidade
    // for maior que a capacidade livre
    public boolean abastece(TipoCombustivel tipoCombustivel, int quantidade) {
        if (tipoCombustivel != this.tipoCombustivel && this.tipoCombustivel != TipoCombustivel.FLEX) {
            return false;
        }

        if (getCombustivelDisponivel() + quantidade > getCapacidade()) {
            return false;
        } else {
            combustivelDisponivel += quantidade;
            this.ultimoCombustivel = tipoCombustivel;  // Atualiza para o tipo de combustível do último abastecimento
            return true;
        }
    }

    public boolean gasta(int quantidade) {
        if (getCombustivelDisponivel() - quantidade < 0) {
            return false;
        } else {
            combustivelDisponivel -= quantidade;
            return true;
        }
    }

    @Override
    public String toString() {
        return "TanqueCombustivel [capacidade=" + capacidade + ", combustivelDisponivel=" + combustivelDisponivel
                + ", tipoCombustivel=" + tipoCombustivel + ", ultimoCombustivel=" + ultimoCombustivel + "]";
    }

}
