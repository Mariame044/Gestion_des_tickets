package odk.apprenant.syteme_de_gestion.service;


import odk.apprenant.syteme_de_gestion.modele.Apprenant;
import odk.apprenant.syteme_de_gestion.repository.ApprenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApprenantService {
    private final ApprenantRepository apprenantRepository;

    @Autowired
    public ApprenantService(ApprenantRepository apprenantRepository) {
        this.apprenantRepository = apprenantRepository;
    }
    public List<Apprenant> getAllApprenants() {
        return apprenantRepository.findAll();

    }
    public Apprenant getApprenantById(Long id) {
        return apprenantRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Apprenant non trouvé avec l'ID : " + id));

    }
    public Apprenant createApprenant(Apprenant apprenant) {
        return apprenantRepository.save(apprenant);
    }
    public Apprenant updateApprenant(Long id, Apprenant apprenant) {
        apprenant.setId(id);
        return apprenantRepository.save(apprenant);
    }
    public void deleteApprenant(Long id) {
        apprenantRepository.deleteById(id);
    }

}
