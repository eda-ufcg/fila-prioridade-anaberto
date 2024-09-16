import java.util.ArrayList;

public class InsereFinalFilaPrioridade implements FilaPrioridade {

	private ArrayList<Pair> fila;

	public InsereFinalFilaPrioridade(int capacidade) {
		this.fila = new ArrayList<Pair>(capacidade);
	}
	
	// criar um Pair e adicionar no fim da fila
	public void add(String elemento, int prioridade) {
		Pair p = new Pair(elemento, prioridade);
		fila.add(p);
	}


	// buscar pelo elemento de maior prioridade na fila.
	public String removeNext() {

		int maior = fila.get(0).getPrioridade();
		int c = 0;
		while(fila.size() >= 0){
			if(fila.get(c).getPrioridade() > maior){
				maior = fila.get(c).getPrioridade();
			}
			c++;
		}
		return fila.get(c).getElemento();
	}

}
