
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Conta {

    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private BigDecimal saldo;


}
