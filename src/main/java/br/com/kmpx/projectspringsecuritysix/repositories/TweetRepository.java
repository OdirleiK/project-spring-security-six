package br.com.kmpx.projectspringsecuritysix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kmpx.projectspringsecuritysix.entities.Tweet;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {

}