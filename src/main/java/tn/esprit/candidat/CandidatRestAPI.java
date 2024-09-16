package tn.esprit.candidat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidats")
public class CandidatRestAPI {
    @Autowired
    private CandidatService candidatService;

    @PostMapping("/create")
    public ResponseEntity<Candidat>createCandidat(@RequestBody Candidat candidat){
        return new ResponseEntity<> (candidatService.addCandidat(candidat), HttpStatus.OK);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Candidat>>getAllCandidats(){
        return new ResponseEntity<>(candidatService.getAllCandidat(), HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Candidat>updateCandidat(@PathVariable int id,@RequestBody Candidat updatedCandidat){
        return new ResponseEntity<>(candidatService.updateCandidat(id,updatedCandidat), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String>deleteCandidat(@PathVariable int id){
        return new ResponseEntity<>(candidatService.deleteCandidat(id), HttpStatus.OK);
    }

}
