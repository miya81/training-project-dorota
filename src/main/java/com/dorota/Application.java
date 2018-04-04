package com.dorota;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dorota.demo.dao.TeamDao;
import com.dorota.demo.domain.Player;
import com.dorota.demo.domain.Team;
import com.dorota.demo.repository.TeamRepository;

@SpringBootApplication
public class Application {

	@Autowired TeamRepository teamRepository;
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @PostConstruct
	public void init() {
    	
		List<Team> team = new ArrayList<>();

		Set<Player> set = new HashSet<>();
		set.add(new Player("Big Easy", "Showman"));
		set.add(new Player("Buckets", "Guard"));
		set.add(new Player("Dizzy", "Guard"));
		
		team.add(new Team("Harlem", "Globetrotters", set));
		team.add(new Team("Washington","Generals",null));

		teamDao.save(team);
	}    
    
    @Autowired TeamDao teamDao;
    
}
