/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;

import modelos.*;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import utils.HibernateUtil;
/**
 *
 * @author 031115215
 */
public class DAOStatus {
    

    public MODStatus get(int id) {
    	switch (id){
    	case 1:
    		return new MODStatus(1, "Disponível");
		case 2:
    		return new MODStatus(2, "Danificado");
    	case 3:
    		return new MODStatus(3, "Faltando");
    	default:
    		return new MODStatus(1, "Disponível");
    	}
   	

    }

    public List<MODStatus> list() {
    	List<MODStatus> listMODStatus = new ArrayList();
    	listMODStatus.add(new MODStatus(1, "Disponível"));
    	listMODStatus.add(new MODStatus(2, "Danificado"));
    	listMODStatus.add(new MODStatus(3, "Faltando"));

        return listMODStatus;
    }

}
