package br.com.natzuj.calc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {

    private enum TipoComando{
        ZERAR, NUMERO, DIVISAO, MULTIPLICACAO, SUBTRACAO, SOMA, IGUAL, VIRGULA;
    };

    private static final Memoria instancia = new Memoria();
    private String textoAtual = "";
    private final List<MemoriaObserver> observadores = new ArrayList<>();

    private Memoria() {

    }

    public static Memoria getInstancia() {
        return instancia;
    }

    public void adicionarObserver(MemoriaObserver observador) {
        observadores.add(observador);
    }

    public String getTextoAtual() {
        return textoAtual.isEmpty() ? "0" : textoAtual;
    }

    public void processarComando(String texto) {
        TipoComando tipoComando = detectarTipoComando(texto);
        System.out.println(tipoComando);

        if ("AC".equals(texto)) {
            textoAtual = "";
        } else {
            textoAtual += texto;
        }
        observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
    }

    private TipoComando detectarTipoComando(String texto) {
        if (textoAtual.isEmpty() && texto == "0") {
            return null;
        }

        try {
            Integer.parseInt(texto);
            return TipoComando.NUMERO;
        } catch (NumberFormatException e) {
            //Quando nao for numero..
            if ("AC".equalsIgnoreCase(texto)) {
                return TipoComando.ZERAR;
            }else if ("/".equals(texto)) {
                return TipoComando.DIVISAO;
            }else if ("x".equalsIgnoreCase(texto)) {
                return TipoComando.MULTIPLICACAO;
            }else if ("+".equals(texto)) {
                return TipoComando.SOMA;
            }else if ("-".equals(texto)) {
                return TipoComando.SUBTRACAO;
            }else if ("=".equals(texto)) {
                return TipoComando.IGUAL;
            }else if (",".equals(texto)) {
                return TipoComando.VIRGULA;
            }        
        }

        return null;
    }
        
}
