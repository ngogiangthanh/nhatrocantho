/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.io.File;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
/**
 *
 * @author Dinh Nhan
 */
public class KetNoi {
    private ObjectContainer db;
    //ham khoi tao ket noi den CSDL
    public KetNoi(){
        this.db = Db4oEmbedded.openFile("../database/container.dbo");
}
    //ham lay ket noi de sd
    public ObjectContainer GetDb(){
       return this.db;
}
    //ham commit CSDL
    public void CommitDb(){
        this.db.commit();
    }
    //ham dong ket noi
    public void CloseDb(){
        this.db.close();
    }
    
            
}
 
