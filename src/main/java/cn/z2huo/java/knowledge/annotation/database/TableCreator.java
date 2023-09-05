package cn.z2huo.java.knowledge.annotation.database;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class TableCreator {
	public static void main(String[] args) throws ClassNotFoundException {
		if(args.length < 1) {
			System.out.println("arguments:annotated classes");
			System.exit(0);
		}
		for(String className : args) {
			Class<?> cl = Class.forName(className);
			DBTable dbTable = cl.getAnnotation(DBTable.class);
			if (dbTable == null) {
				System.out.println("no DBTable annotations in class " + className);
				continue;
			}
			String tableName = dbTable.name();
			if (tableName.length() < 1) {
				tableName = cl.getName().toUpperCase();
			}
			List<String> columnDefs = new ArrayList<String>();
			for(Field field : cl.getDeclaredFields()) {
				String columnName = null;
				Annotation[] anns = field.getDeclaredAnnotations();
				if (anns.length < 1) {
					continue;
				}
				if(anns[0] instanceof SQLInteger) {
					SQLInteger sqlInteger = (SQLInteger) anns[0];
					if (sqlInteger.name().length() < 1) {
						columnName = field.getName().toUpperCase();
					} else {
						columnName = sqlInteger.name();
					}
					columnDefs.add(columnName + " INT" + getConstraints(sqlInteger.constraints()));
				}
				if(anns[0] instanceof SQLString) {
					SQLString sqlString = (SQLString) anns[0];
					if (sqlString.name().length() < 1) {
						columnName = field.getName().toUpperCase();
					} else {
						columnName = sqlString.name();
					}
					columnDefs.add(columnName + " VARCHAR("+sqlString.value() + ")" + getConstraints(sqlString.constraints()));
				}
				StringBuilder createCommand = new StringBuilder("CREATE TABLE " + tableName + "(");
				for(String columnDef : columnDefs) {
					createCommand.append("\n"+columnDef+",");
					String tableCreate = createCommand.substring(0, createCommand.length()-1) + ");";
					System.out.println("Table creation SQL for " + className + " is: \n" + tableCreate);
				}
			}
		}
	}
	
	private static String getConstraints(Constraints constraints) {
		String con = "";
		if (!constraints.allowNull()) {
			con += " NOT NULL";
		}
		if(constraints.primaryKey()) {
			con += " PRIMARY KEY";
		}
		if (constraints.unique()) {
			con += " UNIQUE";
		}
		return con;
	}
}
