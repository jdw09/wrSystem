package b1nd.jdw09.service;

import b1nd.jdw09.model.MainModel;
import b1nd.jdw09.repository.MainRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MainService {
    private final MainRepository mainRepository;
    public MainService(MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }

    public List<MainModel> getAll() {return mainRepository.findAll();}

    @Transactional
    public void updateStatus(int id) {
        MainModel washer = mainRepository.findById((long) id).orElseThrow();
        boolean using = washer.getUsing();
        if (using) {
            washer.setUsing(false);
        } else {
            washer.setUsing(true);
        }
    }
}
