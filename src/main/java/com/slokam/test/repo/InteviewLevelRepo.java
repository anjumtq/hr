package com.slokam.hr.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.hr.entity.InteviewLevel;
				@Repository
				public interface InteviewLevelRepo extends JpaRepository<InteviewLevel, Integer> {

				}
