package abhay.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import abhay.model.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer> {
	
	@Query("from User where user_email=?1")
	public List<Bank> findByEMAIL(String email);
	
	@Query("from User where user_email=?1 and user_pass=?2")
	public Bank findByUsernamePassword(String username,String password);

}
