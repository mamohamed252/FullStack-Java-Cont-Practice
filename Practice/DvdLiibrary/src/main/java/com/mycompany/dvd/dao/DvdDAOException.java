/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvd.dao;

/**
 *
 * @author Mohamed
 */
public class DvdDAOException extends Exception {
    public DvdDAOException(String message){
        super(message);
    }
    public DvdDAOException(String message, Throwable cause){
        super(message, cause);
    }
}
