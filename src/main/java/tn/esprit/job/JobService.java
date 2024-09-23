package tn.esprit.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public Job addJob(Job job){
        return jobRepository.save(job);

    }
    public List<Job> getAllJobs(){
        return jobRepository.findAll();

    }
    public void updateEtat(int id,boolean etat){
        Job job = jobRepository.findById(id).get();
        job.setEtat(etat);
        jobRepository.save(job);
    }
    public String deleteJob(int id) {
        if (jobRepository.findById(id).isPresent()) {
            jobRepository.deleteById(id);
            return "Job Supprimée";
        } else        return "Job non Supprimée";}

}
