package odk.apprenant.syteme_de_gestion.controller;

import odk.apprenant.syteme_de_gestion.modele.Apprenant;
import odk.apprenant.syteme_de_gestion.service.ApprenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/apprenants")
public class ApprenantController {

    private final ApprenantService apprenantService;
    @Autowired
    public ApprenantController(ApprenantService apprenantService) {
        this.apprenantService = apprenantService;
    }
    @GetMapping("/")
    public List<Apprenant> getAll() {
        return apprenantService.getAllApprenants();
    }

    @GetMapping("/{id}")
    public Apprenant getApprenantById(@PathVariable Long id) {
        return apprenantService.getApprenantById(id);
    }

    @PostMapping("/")
    public Apprenant createApprenant(@RequestBody Apprenant apprenant) {
        return apprenantService.createApprenant(apprenant);
    }

    @PutMapping("/{id}")
    public Apprenant updateApprenant(@PathVariable Long id, @RequestBody Apprenant apprenant) {
        return apprenantService.updateApprenant(id, apprenant);
    }

    @DeleteMapping("/{id}")
    public void deleteApprenant(@PathVariable Long id) {
        apprenantService.deleteApprenant(id);

    }
}
