/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvd.controller;

import com.mycompany.dvd.dao.DvdDAO;
import com.mycompany.dvd.dao.DvdDAOException;
import com.mycompany.dvd.dao.DvdDAOFileImpl;
import com.mycompany.dvd.dto.DVD;
import com.mycompany.dvd.ui.UserIO;
import com.mycompany.dvd.ui.UserIOConsoleImpl;
import com.mycompany.dvd.ui.DvdView;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public class DvdController {

    public DvdController(DvdDAO dao, DvdView view){
        this.dao = dao;
        this.view = view;
    }
    private DvdDAO dao;
    private DvdView view;
    private UserIO io = new UserIOConsoleImpl();

    public void run() {
        boolean keepGoing = true;
        int menuSelection = ha;
        try{
        while (keepGoing) {
            

            menuSelection = getMenuSelection();
            switch (menuSelection) {
                case 1:
                    createDvd();
                    break;
                case 2:
                    removeDvd();
                    break;
                case 3:
                   editDvd();
                    break;
                case 4:
                   listDvds();
                    break;
                case 5:
                    viewDvd();
                    break;
                case 6:
                    keepGoing = false;
                    break;
                default:
                    unknownCommand();

            }
        }
        exitMessage();    
        
        }catch (DvdDAOException e){
            view.displayErrorMessage(e.getMessage());
        }
        
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    private void createDvd()throws DvdDAOException {
        view.displayDvdCreateBanner();
        DVD newDvd = view.getNewDvdInfo();
        dao.addDvd(newDvd.getDvdtitle(), newDvd);
        view.displayDvdCreateSuccessBanner();
    }
    private void editDvd()throws DvdDAOException {
        view.displayDvdEditBanner();
        DVD newDvd = view.getNewDvdInfo();
        dao.addDvd(newDvd.getDvdtitle(), newDvd);
        view.displayDvdCreateSuccessBanner();
    }
    public void listDvds()throws DvdDAOException {
        view.displayAllBanner();
        List<DVD> dvdList = dao.getAllDvd();
        view.displayDvdList(dvdList);
    }
    private void viewDvd()throws DvdDAOException {
        view.displayDisplayDvdBanner();
        String dvdTitle = view.getDvdChoice();
        DVD dvd = dao.getDVD(dvdTitle);
        view.displayDvd(dvd);
    }
    public void removeDvd()throws DvdDAOException {
        view.displayRemoveBanner();
        String dvdTitle = view.getDvdChoice();
        DVD removedDvd = dao.removeDVD(dvdTitle);
        view.displayRemoveResult(removedDvd);
        
    }
    private void unknownCommand(){
        view.displayUnknownCommandBanner();
    }
    private void exitMessage(){
        view.displayExitBanner();
    }

}
