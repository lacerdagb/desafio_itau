package desafio.itau.api.dto;

import java.time.OffsetDateTime;

// import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class TransactionRequest {

    @NotNull
    // @Min(0) Tirar, pois a regra é que não pode mostrar o corpo do erro
    private Double valor;

    @NotNull
    private OffsetDateTime dataHora;

    public Double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
    
    
}
