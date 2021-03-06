package demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceLocationBulkUploadController {

	private ServiceLocationRepository repository;

	@Autowired
	public ServiceLocationBulkUploadController(ServiceLocationRepository repository) {
		this.repository = repository;

	}

	@RequestMapping(value="/bulk/serviceLocations", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void upload(@RequestBody List<ServiceLocation> locations) {
		this.repository.save(locations);
	}

	@RequestMapping(value="/purge", method=RequestMethod.POST)
	public void purge() {
		this.repository.deleteAll();
	}

}
