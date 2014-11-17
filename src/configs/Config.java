package configs;

import java.io.File;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

public class Config {
	
	private ObjectContainer db;
	
	public Config() {
		try{
			//Khoi tao
			File currentDirFile = new File(".");
			String currentPathProject = currentDirFile.getAbsolutePath();
			this.db = Db4oEmbedded.openFile(currentPathProject.substring(0,currentPathProject.length()-1)+"src/database/containers.dbo");
			System.out.println("Open connect to db4o successsfully!");
		}
		catch(Exception ex)
		{
			System.out.println("Create connect to db4o failed."+ex.getMessage());
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
