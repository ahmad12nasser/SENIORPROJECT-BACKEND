package com.project.spring.controller.mutualControllers;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.AppliedRequests;
import com.project.spring.model.Requests;
import com.project.spring.service.freelancer.applyOnRequest.ApplyForRequestService;
import com.project.spring.service.requests.DeleteRequestByIdService;
import com.project.spring.service.requests.NewRequestService;
import com.project.spring.service.requests.RequestsService;

@RestController
@RequestMapping("/requests")
public class RequestsController {

	@Autowired
	private RequestsService requestsService;
	@Autowired
	private ApplyForRequestService applyForRequestService;
	@Autowired
	private NewRequestService newRequestService;
	@Autowired
	private DeleteRequestByIdService deleteRequestByIdService;

	@PostMapping("/getAllRequestsWithClientInfo")
	@ResponseBody
	public List<Requests> getAllRequests(HttpServletRequest req,
			HttpServletResponse res) throws ParseException, IOException {
		return requestsService.getAllRequestsWithClientInfo();
	}

	@PostMapping("/applyForRequest")
	@ResponseBody
	public ResponseEntity<String> applyForRequest(
			@RequestBody AppliedRequests appliedRequests) {
		int r = 0;
		r = applyForRequestService.applyForRequest(
				appliedRequests.getRequestId(), appliedRequests.getClientId(),
				appliedRequests.getFreelancerId());
		return r > 0
				? ResponseEntity.ok("Request applied successfully")
				: ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
						.body("Error applying for request");
	}

	@PostMapping("/createRequest")
	@ResponseBody
	public ResponseEntity<GenericResponse> createRequest(
			@RequestParam("client_id") int client_id,
			@RequestParam("image") MultipartFile imageFile,
			@RequestParam("title") String title,
			@RequestParam("description") String description,
			@RequestParam("categ_name") String categ_name,
			@RequestParam("location") String location,
			@RequestParam("datePosted") Date datePosted,
			@RequestParam("deadline") Date deadline,
			@RequestParam("price") BigDecimal price) throws IOException {

		Requests requests = new Requests();
		if (imageFile != null && !imageFile.isEmpty()) {
			requests.setImage(imageFile.getBytes());
		}
		requests.setCateg_name(categ_name);
		requests.setClientId(client_id);
		requests.setTitle(title);
		requests.setDatePosted(datePosted);
		requests.setDeadline(deadline);
		requests.setDescription(description);
		requests.setPrice(price);
		requests.setLocation(location);
		return new ResponseEntity<>(newRequestService.createRequest(requests),
				HttpStatus.CREATED);

	}

	@PostMapping("/deleteRequestById/{request_id}")
	@ResponseBody
	public GenericResponse deleteRequestById(@PathVariable int request_id) {
		return deleteRequestByIdService.deleteRequestById(request_id);
	}

}
