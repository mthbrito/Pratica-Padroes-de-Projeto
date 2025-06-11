package org.example.PraticaPadroesEstruturais.bridge;

public class NotaFiscal {

    private String cliente;
    private Double valor;
    private EnvioNotaFiscal envioNotaFiscal;

    public NotaFiscal(String cliente, Double valor, EnvioNotaFiscal envioNotaFiscal) {
        this.cliente = cliente;
        this.valor = valor;
        this.envioNotaFiscal = envioNotaFiscal;
    }

    public void emitir() {
        this.envioNotaFiscal.emitir(this.cliente, this.valor);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public EnvioNotaFiscal getEnvioNotaFiscal() {
        return envioNotaFiscal;
    }

    public void setEnvioNotaFiscal(EnvioNotaFiscal envioNotaFiscal) {
        this.envioNotaFiscal = envioNotaFiscal;
    }
}
