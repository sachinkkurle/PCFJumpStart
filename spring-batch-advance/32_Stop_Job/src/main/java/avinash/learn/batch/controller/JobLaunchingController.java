
package avinash.learn.batch.controller;

import org.springframework.batch.core.launch.JobOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobLaunchingController {

	@Autowired
	private JobOperator jobOperator;

	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.ACCEPTED)
	public long launch(@RequestParam("name") String name) throws Exception {
		return this.jobOperator.start("job", String.format("name=%s", name));
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void stop(@PathVariable("id") Long id) throws Exception {
		this.jobOperator.stop(id);
	}
}
