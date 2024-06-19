package odk.apprenant.syteme_de_gestion.service;

import odk.apprenant.syteme_de_gestion.modele.Formateur;
import odk.apprenant.syteme_de_gestion.repository.FormateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormateurService {
    private final FormateurRepository formateurRepository;
    @Autowired
    public FormateurService(FormateurRepository formateurRepository) {
        this.formateurRepository = formateurRepository;
    }
    public List<Formateur> getAllFormateurs() {
        return formateurRepository.findAll();
    }

    public Formateur getFormateurById(Long id) {
        return formateurRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Formateur non trouvé avec l'ID : " + id));
    }

    public Formateur createFormateur(Formateur formateur) {
        return formateurRepository.save(formateur);
    }

    public Formateur updateFormateur(Long id, Formateur formateur) {
        formateur.setId(id); // Assurez-vous que l'ID du formateur à mettre à jour est défini
        return formateurRepository.save(formateur);
    }

    public void deleteFormateur(Long id) {
        formateurRepository.deleteById(id);
    }
}
