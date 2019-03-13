package br.com.dynamus.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DynamusApplication implements CommandLineRunner {
	
	// @Autowired
	// private MemberRepository memberRepos;

	// @Autowired
	// private DisciplineRepository disciplineRepos;

	public static void main(String[] args) {
		SpringApplication.run(DynamusApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// INSERT MEMBERS
		// memberRepos.save(new MemberEntity());
		// memberRepos.save(new MemberEntity());

		// INSERT DISCIPLINES
		// disciplineRepos.save(new DisciplineEntity());
		// disciplineRepos.save(new DisciplineEntity());
		
	}
}
