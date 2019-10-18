/**
 * 
 */
package com.infosistem.infosistem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.infosistem.infosistem.model.InfoSistemBookData;

/**
 * @author SuzanaHersak
 *
 */

@Repository
public interface BookRepository extends JpaRepository<InfoSistemBookData,Long>{
 
}