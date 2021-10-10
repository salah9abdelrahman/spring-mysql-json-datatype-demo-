package com.salah.tryjsondatabasedatatype;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ARepository extends JpaRepository<TestJSONModel, Integer> {
}
