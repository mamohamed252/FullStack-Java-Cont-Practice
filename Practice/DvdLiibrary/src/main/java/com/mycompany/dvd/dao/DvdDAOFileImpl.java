/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvd.dao;

import com.mycompany.dvd.dto.DVD;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Mohamed
 */
public class DvdDAOFileImpl implements DvdDAO {

    public static final String ROSTER_FILE = "dvd.txt";
    public static final String DELIMITER = "::";

    private Map<String, DVD> dvds = new HashMap<>();
    

    @Override
    public DVD addDvd(String dvdTitle, DVD dvd)throws DvdDAOException  {
        loadRoster();
        DVD newDvd = dvds.put(dvdTitle, dvd);
        writeRoster();
        return newDvd;
    }
     @Override
    public DVD editDvd(String dvdTitle, DVD dvd)throws DvdDAOException  {
        loadRoster();
        DVD editDvd = dvds.put(dvdTitle, dvd);
        writeRoster();
        return editDvd;
    }

    @Override
    public List<DVD> getAllDvd()throws DvdDAOException  {
        loadRoster();
        return new ArrayList<DVD>(dvds.values());
    }

    @Override
    public DVD getDVD(String dvdTitle)throws DvdDAOException  {
        loadRoster();
        return dvds.get(dvdTitle);
    }

    @Override
    public DVD removeDVD(String dvdTitle) throws DvdDAOException  {
        loadRoster();
        DVD removedDvd = dvds.remove(dvdTitle);
        writeRoster();
        return removedDvd;
    }
    // translate a line of text into DVD object
    private DVD unmarshallDvd(String dvdAsText) {
        String[] dvdTokens = dvdAsText.split(DELIMITER);
        String dvdTitle = dvdTokens[0];

        DVD dvdFromFile = new DVD(dvdTitle);

        dvdFromFile.setReleaseDate(dvdTokens[1]);
        dvdFromFile.setMpaaRating(dvdTokens[2]);
        dvdFromFile.setDirectorName(dvdTokens[3]);
        dvdFromFile.setMovieStudio(dvdTokens[4]);
        dvdFromFile.setUserRating(dvdTokens[5]);
        return dvdFromFile;
    }
    // reads roster file into memory
    private void loadRoster() throws DvdDAOException {
        Scanner scanner;

        try {
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(ROSTER_FILE)));
        } catch (FileNotFoundException e) {
            throw new DvdDAOException(
                    "-_- Could not load roster data into memory.", e);
        }
        String currentLine;
        DVD currentDvd;
        while (scanner.hasNextLine()) {
            currentLine = scanner.nextLine();
            currentDvd = unmarshallDvd(currentLine);
            dvds.put(currentDvd.getDvdtitle(), currentDvd);
        }
        scanner.close();
    }
    
    // method organizes dvd object so it can be written
    private String marshallDvd(DVD aDvd) {
        String dvdAsText = aDvd.getDvdtitle() + DELIMITER;
        dvdAsText += aDvd.getReleaseDate() + DELIMITER;
        dvdAsText += aDvd.getMpaaRating() + DELIMITER;
        dvdAsText += aDvd.getDirectorName() + DELIMITER;
        dvdAsText += aDvd.getMovieStudio() + DELIMITER;
        dvdAsText += aDvd.getUserRating();
        return dvdAsText;

    }

    private void writeRoster() throws DvdDAOException{
        PrintWriter out;
        try {
            out = new PrintWriter(new FileWriter(ROSTER_FILE));

        } catch (IOException e) {
            throw new DvdDAOException(
                    "Could not save dvd data.", e);
        }
        String dvdAsText;
        List<DVD> dvdList = new ArrayList(dvds.values());
        for (DVD currentDvd : dvdList){
           
            dvdAsText = marshallDvd(currentDvd);
            out.println(dvdAsText);
            out.flush();
        }
        out.close();
    }

}
