package ChargeMasterRESTApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ChargeMasterRESTApi.model.Charge;

public interface ChargeRepository extends JpaRepository<Charge, Long> {

}
