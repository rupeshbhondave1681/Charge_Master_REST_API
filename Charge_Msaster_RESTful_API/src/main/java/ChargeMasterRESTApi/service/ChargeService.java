package ChargeMasterRESTApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ChargeMasterRESTApi.model.Charge;
import ChargeMasterRESTApi.repository.ChargeRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ChargeService {
	
	@Autowired
	private ChargeRepository chargeRepository;
	
	public Charge createCharge(Charge charge) {
		return chargeRepository.save(charge);
	}
	    
	    public List<Charge> getAllCharges() {
	        return chargeRepository.findAll();
	    }
	    
	    //public Charge updateCharge(Long chargeId, Charge updatedCharge) {
//	    	return chargeRepository.(chargeId,updatedCharge);
	    //}
	   

}
