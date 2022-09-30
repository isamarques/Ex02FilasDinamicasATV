package view;
import br.edu.fateczl.filaobj.Fila;
import model.Cliente;
import controller.OperacaoController;

public class Principal {

	public static void main(String[] args) {
		Fila fila = new Fila();
		OperacaoController operacont = new OperacaoController();
		
		
		for (int i = 0; i < 20; i++) {
			Cliente cliente = new Cliente();
			cliente.nome = "Cliente" + i;
			cliente.QuantidadePecas = (int)((Math.random() * 31) + 20);
			cliente.valorPecas = (float)((Math.random() * 96) + 5);
			fila.insert(cliente);
		}
		
		try {
			operacont.Caixa(fila);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
