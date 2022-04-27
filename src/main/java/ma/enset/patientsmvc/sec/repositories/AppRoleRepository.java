package ma.enset.patientsmvc.sec.repositories;

import ma.enset.patientsmvc.sec.entities.AppRole;
import ma.enset.patientsmvc.sec.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,Long> {
    AppRole findByRoleName(String roleName);
}
