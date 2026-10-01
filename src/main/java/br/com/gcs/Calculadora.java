package br.com.gcs;

/**
 * Classe responsável por operações aritméticas básicas.
 */
public class Calculadora {
    /**
     * Realiza a soma de dois números racionais (double).
     * @param a Primeiro operando.
     * @param b Segundo operando.
     * @return O resultado da soma entre a e b.
     */
    public double somar(double a, double b) { return a + b; }

    /**
     * Realiza a subtração de dois números racionais (double).
     * @param a Primeiro operando.
     * @param b Segundo operando.
     * @return O resultado da subtração entre a e b.
     */
    public double subtrair(double a, double b) { return a - b; }

    /**
     * Calcula o discriminante (delta) de uma equação do segundo grau.
     * Fórmula: Δ = b² - 4ac.
     *
     * @param a Coeficiente quadrático.
     * @param b Coeficiente linear.
     * @param c Termo constante.
     * @return O valor do discriminante (delta).
     */
    private double calcularDelta(double a, double b, double c) {
        return (Math.pow(b, 2)) - (4 * a * c);
    }
    
    /**
     * Calcula as raízes reais de uma equação do segundo grau utilizando a fórmula de Bhaskara.
     *
     * @param a Coeficiente quadrático.
     * @param b Coeficiente linear.
     * @param c Termo constante.
     * @return Uma string contendo as raízes encontradas formatadas ou uma mensagem informando 
     *         que não existem soluções reais caso o discriminante seja negativo.
     */
    public String bhaskara(double a, double b, double c) {
        double delta = calcularDelta(a, b, c);
            
        if (delta < 0) {
            return "Não há soluções reais";
        }

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        return String.format("Soluções: %.2f %.2f", x1, x2);
    }
}
