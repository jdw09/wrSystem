package b1nd.jdw09.repository;

import b1nd.jdw09.model.MainModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainRepository extends JpaRepository<MainModel, Long> {
}