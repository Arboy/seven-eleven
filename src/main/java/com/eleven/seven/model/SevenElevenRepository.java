package com.eleven.seven.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by JPMPC-B209 on 1/6/2017.
 */

@Repository
public interface SevenElevenRepository extends JpaRepository<SevenElevenForm, Integer> {
}

