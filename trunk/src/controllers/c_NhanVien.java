/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.db4o.ObjectSet;
import configs.Config;
import models.NhanVien;

/**
 *
 * @author Dinh Nhan
 */
public class c_NhanVien {
    public ObjectSet<NhanVien> getAllNhanVien(Config conn){
        ObjectSet<NhanVien> nvs = conn.getConn().queryByExample(NhanVien.class);
        return nvs;
    }
}
