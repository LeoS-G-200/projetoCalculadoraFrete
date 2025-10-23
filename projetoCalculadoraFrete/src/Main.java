interface FreteStrategy{
    double calcularFrete(double peso, double valor);

}
class Sedex implements FreteStrategy{
    @Override
    public double calcularFrete(double peso, double valor) {
        return (peso * 1.45) ;
    }
}



class Pac implements FreteStrategy{
    @Override
    public double calcularFrete(double peso, double valor) {

        return (peso * 1.10) ;
    }

}


class FreteGratis implements FreteStrategy{
    @Override
    public double calcularFrete(double peso, double valor) {
        if (valor > 200) {
            return 0.0;
        } else {
            return (peso * 1.45);
        }
    }

}

class FreteContext{
    private FreteStrategy strategy;

    public FreteContext(FreteStrategy strategy) {
        this.strategy = strategy;
    }
    public double calcular(double peso, double valor){
        return strategy.calcularFrete(peso, valor);
    }
    void setStrategy(FreteStrategy strategy){
        this.strategy = strategy;
    }
}



public class Main{
    public static void main(String[] args) {
    FreteContext context = new FreteContext(new Sedex());
    System.out.println("Frete Sedex:R$" + context.calcular(10, 150));

    context.setStrategy(new Pac());
    System.out.println("Frete Pac:R$" + context.calcular(10, 150));

    context.setStrategy(new FreteGratis());
    System.out.println("Frete Gratis:R$" + context.calcular(10, 250));
    }

}
