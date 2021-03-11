/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvd.app;

import com.mycompany.dvd.controller.DvdController;
import com.mycompany.dvd.dao.DvdDAO;
import com.mycompany.dvd.dao.DvdDAOFileImpl;
import com.mycompany.dvd.ui.DvdView;
import com.mycompany.dvd.ui.UserIO;
import com.mycompany.dvd.ui.UserIOConsoleImpl;

/**
 *
 * @author Mohamed
 */
public class App {
    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        DvdView myView = new DvdView(myIo);
        DvdDAO myDao = new DvdDAOFileImpl();
        DvdController controller = new DvdController(myDao, myView);
        controller.run();
    }
}
