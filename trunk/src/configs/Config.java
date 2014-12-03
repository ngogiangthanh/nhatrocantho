package configs;

import java.io.File;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ext.DatabaseFileLockedException;
import com.db4o.ext.DatabaseReadOnlyException;
import com.db4o.ext.Db4oIOException;
import com.db4o.ext.IncompatibleFileFormatException;
import com.db4o.ext.OldFormatException;

public class Config {
	
	private ObjectContainer db;
	
	public Config() {
		try{
                    EmbeddedConfiguration config = Db4oEmbedded.newConfiguration(); 
               //     config.common().objectClass(Publication.class).cascadeOnUpdate(true); 
                //    config.common().objectClass(Publication.class).cascadeOnDelete(true); 
                    config.common().optimizeNativeQueries(false);
			//Khoi tao
			File currentDirFile = new File(".");
			String currentPathProject = currentDirFile.getAbsolutePath();
			this.db = Db4oEmbedded.openFile(config,currentPathProject.substring(0,currentPathProject.length()-1)+"src/database/containers.dbo");
                      
			System.out.println("Open connect to db4o successsfully!");
		}
		catch(Db4oIOException | DatabaseFileLockedException | IncompatibleFileFormatException | OldFormatException | DatabaseReadOnlyException ex)
		{
			System.out.println("Create connect to db4o failed. Cause: "+ex.getMessage());
		}
	}
	
	public ObjectContainer getConn()
	{
		return this.db;
	}
	
	public boolean closeConn()
	{
		return this.db.close();
	}
}
