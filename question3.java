import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

class FaturamentoDiario {
    public int dia;
    public double valor;

    public FaturamentoDiario() {}
}

public class question3 {
    public static void main(String[] args) {
        File arquivoJson = new File("dados.json");

        ObjectMapper mapper = new ObjectMapper();
        
        try {
            List<FaturamentoDiario> faturamentos = mapper.readValue(arquivoJson, new TypeReference<List<FaturamentoDiario>>(){});

            double menor = Double.MAX_VALUE;
            double maior = Double.MIN_VALUE;
            double soma = 0.0;
            int diasComFaturamento = 0;

            for (FaturamentoDiario faturamento : faturamentos) {
                if (faturamento.valor > 0) {
                    if (faturamento.valor < menor) {
                        menor = faturamento.valor;
                    }
                    if (faturamento.valor > maior) {
                        maior = faturamento.valor;
                    }
                    soma += faturamento.valor;
                    diasComFaturamento++;
                }
            }

            double media = soma / diasComFaturamento;

            int diasAcimaDaMedia = 0;
            for (FaturamentoDiario faturamento : faturamentos) {
                if (faturamento.valor > media) {
                    diasAcimaDaMedia++;
                }
            }

            System.out.println("Menor valor de faturamento: " + menor);
            System.out.println("Maior valor de faturamento: " + maior);
            System.out.println("Número de dias com faturamento superior à média: " + diasAcimaDaMedia);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
