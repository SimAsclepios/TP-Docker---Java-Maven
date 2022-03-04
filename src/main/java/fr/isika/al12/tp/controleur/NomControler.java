package fr.isika.al12.tp.controleur;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class NomControler {
	


    @GetMapping("/")
    String hello(Model model) {
        return "index";
    }

	
	@PostMapping(path="/Reponse")
	public String reponse(@RequestParam(value = "prenom", required = false) String prenom, Model model) {
		model.addAttribute("prenom", prenom);
		return "index";
	}
	

}
