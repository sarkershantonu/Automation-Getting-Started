package org.automation.webtest.core;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class DataBaseQuery extends DataBaseConnection{

	/**
	 *
	 * @param email
	 */
	public void selectedTimeSlot(String email) {
		String sqlQuery = "select * from dlv.reservation r, cust.customer c " +
				"where status_code='5' " +
				"and r.customer_id=c.id " +
				"and c.user_id='" +email+ "'";

		LinkedHashSet<LinkedHashMap<String,String>> data = fetchData(sqlQuery);
		for(LinkedHashMap<String,String> currentRow : data){
			for(Map.Entry<String,String> rowData: currentRow.entrySet()){
				System.out.println(rowData.getKey() + " : " + rowData.getValue());
				// get the value you need
			}
			System.out.println("******************************");
		}

	}

	/**
	 * De select Time Slot for specific user
	 * @param EmailID
	 */
	public void deselectTimeSlot(String EmailID){
		String sqlString = "update dlv.reservation r set status_code='15', modified_dttm=sysdate where status_code='5' and r.customer_id in (select c.id from cust.customer c where c.user_id='"+ EmailID +"')";
		int noOfAffectedRow = updateData(sqlString);
		System.out.println("Number of Affected Row: " + noOfAffectedRow);
	}

	/**
	 * Delete all address but the selected for specific user
	 * @param EmailID
	 */
	public void deleteUnselectedAddresses(String EmailID){
		String sqlString = "DELETE FROM address " +
							"WHERE address.id in ( " +
									"SELECT address.id FROM address " +
									"LEFT JOIN fdcustomer ON fdcustomer.default_shipto = ADDRESS.ID " +
									"WHERE customer_id= (" +
											"SELECT id FROM customer " +
											"WHERE user_id='"+ EmailID +"') " +
							"AND fdcustomer.default_shipto IS NULL)";
		int noOfAffectedRow = updateData(sqlString);
		System.out.println("Number of Affected Row: " + noOfAffectedRow);
	}

	/**
	 * Delete all payment methods but the selected and one credit card for specific user
	 * @param EmailID
	 */
	public void deleteUnselectedPaymentMethods(String EmailID){
		String sqlString = "DELETE FROM paymentmethod " +
							"WHERE customer_id = (" +
									"SELECT id FROM customer " +
									"WHERE user_id='"+ EmailID +"') " +
							"AND id NOT IN ( " +
									"(SELECT default_payment FROM fdcustomer " +
									"WHERE erp_customer_id= (" +
											"SELECT id FROM customer " +
											"WHERE user_id='"+ EmailID +"')) " +
				"						UNION " +
											"(SELECT MAX(ID) as id FROM paymentmethod " +
											"WHERE customer_id= (" +
													"SELECT id FROM customer " +
													"WHERE user_id='"+ EmailID +"') " +
											"AND payment_method_type='CC'))";
		int noOfAffectedRow = updateData(sqlString);
		System.out.println("Number of Affected Row: " + noOfAffectedRow);
	}

}
