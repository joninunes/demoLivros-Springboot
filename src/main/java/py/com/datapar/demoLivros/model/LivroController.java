package py.com.datapar.demoLivros.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/livros")
public class LivroController {
	
	@Autowired
	LivroRepository livroRepo; 
	
	@Autowired
	LivroService livroService;
	
	@GetMapping
	public List<Livro> livros(){
		return (List<Livro>) livroRepo.findAll();
		
	}
	
	@RequestMapping("/load")
	public void load() {
		livroService.carregarLivros();
	}

}
