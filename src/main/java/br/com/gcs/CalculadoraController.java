package br.com.gcs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    private final Calculadora calculadora = new Calculadora();

    @GetMapping("/somar")
    public String somar(@RequestParam double a, @RequestParam double b) {
        return "Resultado da soma: " + calculadora.somar(a, b);
    }

    @GetMapping("/subtrair")
    public String subtrair(@RequestParam double a, @RequestParam double b) {
        return "Resultado da subtracao: " + calculadora.subtrair(a, b);
    }

    @GetMapping("/bhaskara")
    public String bhaskara(@RequestParam double a, @RequestParam double b, @RequestParam double c) {
        if (a == 0) {
            return "O coeficiente 'a' nao pode ser zero em uma equacao do segundo grau.";
        }
        return calculadora.bhaskara(a, b, c);
    }
}