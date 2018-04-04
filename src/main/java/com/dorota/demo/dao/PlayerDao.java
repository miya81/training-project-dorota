package com.dorota.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.dorota.demo.domain.Player;

@RestResource(path="players", rel="players")
public interface PlayerDao extends CrudRepository<Player, Long> {

}
