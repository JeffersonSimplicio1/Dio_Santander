public class ParametrosInvalidosException {
    public int parametroUm;
    public int parametroDois;

    public ParametrosInvalidosException(int parametroUm, int parametroDois) {
        this.parametroUm = parametroUm;
        this.parametroDois = parametroDois;
    }
    public double ParametrosInvalidosException(){
        if(parametroUm < parametroDois) {
            int contar = parametroDois - parametroUm;

            for(int i =0; i< contar; i++){
                System.out.println("Imprimindo numero " + (i+1));
            }
            return contar;

        } else {
            throw new RuntimeException("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
}
