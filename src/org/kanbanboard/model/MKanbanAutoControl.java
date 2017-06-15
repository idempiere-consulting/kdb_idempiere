package org.kanbanboard.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MKanbanAutoControl extends X_KDB_AutomaticControl {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8678508477438339410L;
	
	/** Organization = O */
	public static final String RESPONSIBLETYPE_Organization = "O";
	/** Human = H */
	public static final String RESPONSIBLETYPE_Human = "H";
	/** Role = R */
	public static final String RESPONSIBLETYPE_Role = "R";
	/** System Resource = S */
	public static final String RESPONSIBLETYPE_SystemResource = "S";

	public MKanbanAutoControl(Properties ctx, int KDB_AutomaticControl_ID, String trxName) {
		super(ctx, KDB_AutomaticControl_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MKanbanAutoControl(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
