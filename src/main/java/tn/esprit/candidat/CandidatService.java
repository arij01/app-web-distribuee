package tn.esprit.candidat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatService {
    @Autowired
    private CandidatRepo candidatRepo;

    public Candidat addCandidat(Candidat candidat){
        return candidatRepo.save(candidat);

    }
    public List<Candidat> getAllCandidat(){
        return candidatRepo.findAll();

    }
    public Candidat updateCandidat(int id,Candidat newcand) {
        if (candidatRepo.findById(id).isPresent()) {
            Candidat existingCand = candidatRepo.findById(id).get();
            existingCand.setNom(newcand.getNom());
            existingCand.setPrenom(newcand.getPrenom());
            existingCand.setMail(newcand.getMail());
            return candidatRepo.save(existingCand);
        } else {
            return candidatRepo.save(newcand);
        }

    }
    public String deleteCandidat (int id){
        if (candidatRepo.findById(id).isPresent()) {
            candidatRepo.deleteById(id);
            return "candidat supprimée";
        }
        else return "candidat n'existe pas";
    }
}
