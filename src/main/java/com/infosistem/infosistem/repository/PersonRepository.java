/**
 * 
 */
package com.infosistem.infosistem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.infosistem.infosistem.model.InfoSistemPersonData;

/**
 * @author SuzanaHersak
 *
 */

@Repository
public interface PersonRepository extends JpaRepository<InfoSistemPersonData,Long>{
 
}