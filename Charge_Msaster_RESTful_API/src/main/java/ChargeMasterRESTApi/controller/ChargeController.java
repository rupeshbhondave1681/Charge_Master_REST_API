package ChargeMasterRESTApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ChargeMasterRESTApi.model.Charge;
import ChargeMasterRESTApi.service.ChargeService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/charge")
public class ChargeController {
	@Autowired
	private ChargeService chargeService;
	
	@PostMapping
	public ResponseEntity<Charge> createUser(@RequestBody Charge charge) {
		Charge savedCharge = chargeService.createCharge(charge);
		return new ResponseEntity<>(savedCharge, HttpStatus.CREATED);
	}
	  
	  @GetMapping
	    public ResponseEntity<List<Charge>> getAllCharges() {
	        List<Charge> charges = chargeService.getAllCharges();
	        return new ResponseEntity<>(charges, HttpStatus.OK);
	    }
	  
	  
//	  @PutMapping("/{chargeId}")
//	    public ResponseEntity<Charge> updateCharge(@PathVariable Long chargeId, @RequestBody Charge updatedCharge) {
//	        Charge updatedChargeResult = chargeService.updateCharge(chargeId, updatedCharge);
//	        if (updatedChargeResult != null) {
//	            return ResponseEntity.ok(updatedChargeResult);
//	        } else {
//	            return ResponseEntity.notFound().build();
//	        }
//	    }

}
