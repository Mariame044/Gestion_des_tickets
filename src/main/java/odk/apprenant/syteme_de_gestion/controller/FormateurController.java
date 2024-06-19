package odk.apprenant.syteme_de_gestion.controller;

import odk.apprenant.syteme_de_gestion.modele.Formateur;
import odk.apprenant.syteme_de_gestion.service.FormateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/formateurs")
public class FormateurController {

    @Autowired
    private final FormateurService formateurService;
    public FormateurController(FormateurService formateurService) {
        this.formateurService = formateurService;
    }
    @GetMapping("/")
    public List<Formateur> getAllFormateurs() {
        return formateurService.getAllFormateurs();
    }

    @GetMapping("/{id}")
    public Formateur getFormateurById(@PathVariable Long id) {
        return formateurService.getFormateurById(id);
    }

    @PostMapping("/")
    public Formateur createFormateur(@RequestBody Formateur formateur) {
        return formateurService.createFormateur(formateur);
    }

    @PutMapping("/{id}")
    public Formateur updateFormateur(@PathVariable Long id, @RequestBody Formateur formateur) {
        return formateurService.updateFormateur(id, formateur);
    }

    @DeleteMapping("/{id}")
    public void deleteFormateur(@PathVariable Long id) {
        formateurService.deleteFormateur(id);
    }
}
