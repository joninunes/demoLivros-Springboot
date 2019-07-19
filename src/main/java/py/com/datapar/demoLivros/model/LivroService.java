package py.com.datapar.demoLivros.model;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LivroService {

	@Autowired
	private LivroRepository livroRepo;
	

	
	public void carregarLivros() {
		Livro l1 = new Livro("HISTORIA DO TIRIRICA", "AAAAAAAAAA", "1990");
		livroRepo.save(l1);
		Livro l2 = new Livro("BBBBBBBBBB", "AAAAAAAAAA", "1990");
		livroRepo.save(l2);
		Livro l3 = new Livro("CCCCCC", "AAAAAAAAAA", "1990");
		livroRepo.save(l3);
		Livro l4 = new Livro("HISTORIA DO DDDDDDD", "AAAAAAAAAA", "1990");
		livroRepo.save(l4);
	}
	
}
