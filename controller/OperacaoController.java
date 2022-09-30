package controller;
import java.text.DecimalFormat;

import br.edu.fateczl.filaobj.Fila;
import model.Cliente;

public class OperacaoController {

	public OperacaoController() {
		super();
	}

	public void Caixa (Fila fila) throws Exception {
		float totalCompra;
		
		while(!fila.isEmpty()) {
			Cliente cliente = (Cliente) fila.remove();
			totalCompra = cliente.QuantidadePecas * cliente.valorPecas;
			String valor = new DecimalFormat("####.00").format(totalCompra);
			System.out.println("Nome do cliente: " + cliente.nome + "\nValor total: " + valor);
		}
	}
}

