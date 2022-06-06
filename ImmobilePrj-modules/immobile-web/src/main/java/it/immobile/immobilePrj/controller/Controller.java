package it.immobile.immobilePrj.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import it.immobile.immobilePrj.entity.Immobile;
import it.immobile.immobilePrj.service.ImmobileService;

@RestController
@RequestMapping("/immobile")
@Tag(name = "Immobile ", description = " Immobile API")
public class Controller {
	@Autowired
	ImmobileService service;

	@ApiResponses(value = { @ApiResponse(responseCode = "201", description = "immobile created"),
							@ApiResponse(responseCode = "400", description = "Invalid input") })
	@Operation(summary = "Add a new immobile")
	@PostMapping("/immobiles/new")
	public Immobile addImmobile(@RequestBody Immobile immobile) {
		return service.addImmobile(immobile);
	}

	@Operation(summary = "find all immobiles")
	@GetMapping("/immobiles")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Successfully retrieved"),
							@ApiResponse(responseCode = "404", description = "immobiles not found") })
	public List<Immobile> showAllImmobiles() {
		return service.showAllImmobiles();
	}

	@Operation(summary = "find  immobile by his id")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Successfully retrieved"),
							@ApiResponse(responseCode = "404", description = "immobile not found") })
	@GetMapping("/immobiles/{id}")
	public Immobile showImmobileById(
			@Parameter(description = "Id of the immobile to be showed. Cannot be empty.", required = true) @PathVariable("id") int id) {
		return service.findImmobileById(id);
	}

	@Operation(summary = "delete  immobile by his id")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Successfully deleted"),
							@ApiResponse(responseCode = "404", description = "immobile not found") })
	@DeleteMapping("/immobiles/{idImmobile}")
	public void deleteImmobile(@Parameter(description = "Id of the immobile to be deleted. Cannot be empty.", required = true) @PathVariable("idImmobile") int id) {			
		service.deleteImmobile(id);
	}

	@Operation(summary = "update immobile surface")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Successfully updated"),
							@ApiResponse(responseCode = "404", description = "immobile not found") })
	@PatchMapping("/immobiles/{idImmobile}/{immobileSurface}")
	public Immobile updateImmobileSurface(
											@Parameter(description = "Id of the immobile to be updated. Cannot be empty.", required = true) @PathVariable("idImmobile") int id,
											@Parameter(description = "value of new surface for immobile. Cannot be empty.", required = true) @PathVariable("immobileSurface") int surface) {
		return service.updateImmobileSurface(id, surface);
	}

	@Operation(summary = "add a new address to immobile")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Successfully updated"),
							@ApiResponse(responseCode = "404", description = "immobile not found"),
							@ApiResponse(responseCode = "404", description = "address not found") })
	@PutMapping("/immobiles/{idImmobile}/address/{idAddress}")
	public Immobile addAddressToImmobile(
											@Parameter(description = "Id of the immobile to be updated. Cannot be empty.", required = true) @PathVariable("idImmobile") int idImmobile,
											@Parameter(description = "Id of the address .", required = true) @PathVariable("idAddress") int idAddress) {
		return service.addAddressToImmobile(idImmobile, idAddress);
	}

}
