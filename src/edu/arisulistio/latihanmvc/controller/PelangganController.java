/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.arisulistio.latihanmvc.controller;

import edu.arisulistio.latihanmvc.model.PelangganModel;
import edu.arisulistio.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author Ari Sulistio
 */
public class PelangganController {
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
   
   
   
   public void resetForm(PelangganView view){
       String nama = view.getTextNama().getText();
       String email = view.getTextEmail().getText();
       String notelepon = view.getTextNoTelepon().getText();
       
       if (nama.equals("") && email.equals("") && notelepon.equals("")) {
           
       }else{
       
       model.resetForm();
       }
   }
   
   public void simpanForm(PelangganView view){
       String nama = view.getTextNama().getText();
       String email = view.getTextEmail().getText();
       String notelepon = view.getTextNoTelepon().getText();
       
       if (nama.trim().equals("")) {
           JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
           
       }else if(email.trim().equals("")) {
           JOptionPane.showMessageDialog(view, "Email Masih Kosong");
            
       }else if(notelepon.trim().equals("")) {
           JOptionPane.showMessageDialog(view, "No Telepon Masih Kosong");
             
       }else{
           model.simpanForm();
       }
   }
}
