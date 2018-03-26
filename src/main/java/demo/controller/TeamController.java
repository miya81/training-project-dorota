package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import demo.dao.TeamDao;
import demo.domain.Team;
import demo.repository.TeamRepository;

@RestController
public class TeamController {
	
	@Autowired TeamDao teamDao;

	@GetMapping("/hi/{name}")
	public Team hi(@PathVariable String name) {
		return teamDao.findByName(name);
	}
	
}
