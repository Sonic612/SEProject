package Main;

import java.sql.SQLException;


	public interface ReportProcess{
		//Constant Variables
		/**
		 * A constant string variable to store the name of the Data Table to which data extracted will be written to.
		 */
		String TARGET_SERVER = "jdbc:sqlserver://sonic613.database.windows.net:1433;";
		String TARGET_DB = "ChocAn";
		
		//Methods	
		
		/**
		 * @param id, int variable
		 * @param startDate, Date variable that signifies the start date of the week for which the report is to be computed.
		 * @return String, report information in the required format contained in a single string variable.
		 * @throws SQLException 
		 */
		void computeReport(int id,String startDate, String endDate);
		
		/**
		 * @param startDateDate variable that signifies the start date of the week for which the report is to be computed.
		 * @return String, report information in the required format contained in a single string variable.
		 */
		void computeReport(String startDate,String endDate);
		
		/**
		 * Terminates the connection and close all prepared statements to the database.
		 */
		
		String printReport();
		void termConnection();
		
		/**
		 * Write the report string from printReport() into the listed TARGET_DBTBL.
		 */

		void saveReport(int ID);
		
		void saveReport();
		
}