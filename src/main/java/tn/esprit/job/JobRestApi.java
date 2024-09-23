package tn.esprit.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/default")
public class JobRestApi {
    @Autowired
    private JobService jobService;

    @PostMapping("/get")
    public ResponseEntity<Job> createJob(@RequestBody Job job){
        return new ResponseEntity<> (jobService.addJob(job), HttpStatus.OK);
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Job>> JobListe(){
        return new ResponseEntity<>(jobService.getAllJobs(), HttpStatus.OK);
    }

    @PutMapping(value = "update")
    public void UpdateJobEtat(@RequestParam int id ,@RequestParam  boolean etat){
        jobService.updateEtat(id,etat);
    }



}
