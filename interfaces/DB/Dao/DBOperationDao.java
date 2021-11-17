package com.xworkz.dataTransfer_dataAccess.DB.Dao;

public interface DBOperationDao {

	public void connectDb(String user, String password);
	public void save(String name, String place);
	public void delete(String name);
	public void update(String name, String place);
}
