package py.com.datapar.demoLivros.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LivroService {

	@Autowired
	private LivroRepository livroRepo;

	public void carregarLivros() {
		Livro l1 = new Livro("Anna Kariênina, de Lev Tolstói",
				"Com absoluta maestria, Tolstói conduz o leitor por um salão repleto de música, perfumes, vestidos de renda, num ambiente de imagens vívidas e quase palpáveis que têm como pano de fundo a Rússia czarista.",
				"1875");
		livroRepo.save(l1);
		Livro l2 = new Livro("Madame Bovary, de Gustave Flaubert",
				"A história faz um ataque à burguesia, desmoralizando-a com a descrição exuberante de sua banalidade.",
				null);
		livroRepo.save(l2);
		Livro l3 = new Livro("Guerra e Paz, de Lev Tolstói",
				"‘Guerra e Paz’ descreve a campanha de Napoleão Bonaparte na Rússia e estende-se até o ano de 1820. Baseado em meticulosa e exaustiva pesquisa",
				null);
		livroRepo.save(l3);
		Livro l4 = new Livro("Lolita, de Vladímir Nabókov",
				"olêmico, irônico, tocante, narra o amor obsessivo de Humbert Humbert, um cínico intelectual de meia-idade, por Dolores Haze, Lolita, 12 anos, uma ninfeta que inflama suas loucuras e seus desejos mais agudos.",
				null);
		livroRepo.save(l4);
	}

}
