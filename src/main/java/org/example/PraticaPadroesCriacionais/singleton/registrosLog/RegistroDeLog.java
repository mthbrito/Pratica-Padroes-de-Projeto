package org.example.PraticaPadroesCriacionais.singleton.registrosLog;

import java.io.FileWriter;
import java.io.IOException;

//TODO: Você tem várias classes no sistema que precisam escrever logs.
// Problema: cada classe pode acabar criando sua própria instância da classe de log,
// resultando em múltiplas conexões ao mesmo arquivo — o que pode causar conflitos e desperdício de recursos.


public class RegistroDeLog {

    private static RegistroDeLog instancia;
    private FileWriter escrever;

    private RegistroDeLog() {
        try {
            escrever = new FileWriter("registro.txt", true);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static RegistroDeLog getInstancia() {
        if (RegistroDeLog.instancia == null) {
            RegistroDeLog.instancia = new RegistroDeLog();
        }
        return RegistroDeLog.instancia;
    }

    public void registrar(String mensagem) {
        try {
            escrever.write(mensagem + "\n");
            escrever.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
