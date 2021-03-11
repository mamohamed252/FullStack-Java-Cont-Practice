/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvd.dao;

import com.mycompany.dvd.dto.DVD;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public interface DvdDAO {
    
    DVD addDvd (String dvdTitle, DVD dvd)throws DvdDAOException ;
    DVD editDvd (String dvdTitle, DVD dvd)throws DvdDAOException ;
    List<DVD> getAllDvd()throws DvdDAOException ;
    DVD getDVD(String dvdTitle)throws DvdDAOException ;
    DVD removeDVD(String dvdTitle)throws DvdDAOException ;
    
}
