/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvd.ui;

import com.mycompany.dvd.dto.DVD;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public class DvdView {

    private UserIO io;
    public DvdView(UserIO io){
        this.io = io;
    }

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. Add a DVD to the collection");
        io.print("2. Remove a DVD from the collection");
        io.print("3. Edit existing DVD in collection");
        io.print("4. List DVD's in collection");
        io.print("5. List particular information of DVD");
        io.print("6. Exit");
        return io.readInt("Please select from the above choices.", 1, 6);
    }

    public DVD getNewDvdInfo() {
        String dvdTitle = io.readString("Please enter name of DVD");
        String releaseDate = io.readString("Please enter relase year of DVD");
        String mpaaRating = io.readString("Please enter MPAA Rating of DVD");
        String directorName = io.readString("Please enter director's name");
        String movieStudio = io.readString("Please enter movie studio");
        String userRating = io.readString("Please enter if this was a YAY or NAE");
        DVD currentDvd = new DVD(dvdTitle);
        currentDvd.setReleaseDate(releaseDate);
        currentDvd.setMpaaRating(mpaaRating);
        currentDvd.setDirectorName(directorName);
        currentDvd.setMovieStudio(movieStudio);
        currentDvd.setUserRating(userRating);
        return currentDvd;

    }

    public void displayDvdCreateBanner() {
        io.print("=== Create DVD ===");
    }
       public void displayDvdEditBanner() {
        io.print("=== Edit DVD ===");
    }

    public void displayDvdCreateSuccessBanner() {
        io.print("DVD successfully created. Please hit enter to continue");
    }

    public void displayDvdList(List<DVD> dvdList) {
        for (DVD currentDvd : dvdList) {
            String dvdInfo = String.format("%s, %s, %s, %s, %s, %s",
                    currentDvd.getDvdtitle(),
                    currentDvd.getReleaseDate(),
                    currentDvd.getMpaaRating(),
                    currentDvd.getDirectorName(),
                    currentDvd.getMovieStudio(),
                    currentDvd.getUserRating());
            io.print(dvdInfo);
        }
        io.readString("Please hit enter to continue.");
    }

    public void displayAllBanner() {
        io.print("=== Display All DVD's ===");
    }

    public void displayDisplayDvdBanner() {
        io.print("== Display DVD ===");
    }

    public String getDvdChoice() {
        return io.readString("Please enter the DVD title");
    }

    public void displayDvd(DVD dvd) {
        if (dvd != null) {
            io.print(dvd.getDvdtitle());
            io.print(dvd.getReleaseDate());
            io.print(dvd.getMpaaRating());
            io.print(dvd.getDirectorName());
            io.print(dvd.getMovieStudio());
            io.print(dvd.getUserRating());
        } else {
            io.print("No such DVD.");
        }
        io.readString("Please hit enter to continue.");
    }

    public void displayRemoveBanner() {
        io.print("== Remove Dvd ===");
    }

    public void displayRemoveResult(DVD dvdRecord) {
        if (dvdRecord != null) {
            io.print("DVD successfully removed.");
        } else {
            io.print("No such dvd.");
        }
        io.readString("Please hit enter to continue.");
    }
    public void displayExitBanner(){
        io.print("Good Bye!!!");
    }
    public void displayUnknownCommandBanner(){
        io.print("Unknown Command!!!");
    }
    public void displayErrorMessage(String errorMsg){
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }
    
}
