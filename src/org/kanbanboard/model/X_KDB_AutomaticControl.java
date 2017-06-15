/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.kanbanboard.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Model for KDB_AutomaticControl
 *  @author iDempiere (generated) 
 *  @version Release 4.1 - $Id$ */
public class X_KDB_AutomaticControl extends PO implements I_KDB_AutomaticControl, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20170614L;

    /** Standard Constructor */
    public X_KDB_AutomaticControl (Properties ctx, int KDB_AutomaticControl_ID, String trxName)
    {
      super (ctx, KDB_AutomaticControl_ID, trxName);
      /** if (KDB_AutomaticControl_ID == 0)
        {
			setAD_Role_ID (0);
			setKDB_AutomaticControl_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_KDB_AutomaticControl (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 6 - System - Client 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_KDB_AutomaticControl[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_Form getAD_Form() throws RuntimeException
    {
		return (org.compiere.model.I_AD_Form)MTable.get(getCtx(), org.compiere.model.I_AD_Form.Table_Name)
			.getPO(getAD_Form_ID(), get_TrxName());	}

	/** Set Special Form.
		@param AD_Form_ID 
		Special Form
	  */
	public void setAD_Form_ID (int AD_Form_ID)
	{
		if (AD_Form_ID < 1) 
			set_Value (COLUMNNAME_AD_Form_ID, null);
		else 
			set_Value (COLUMNNAME_AD_Form_ID, Integer.valueOf(AD_Form_ID));
	}

	/** Get Special Form.
		@return Special Form
	  */
	public int getAD_Form_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Form_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_Role getAD_Role() throws RuntimeException
    {
		return (org.compiere.model.I_AD_Role)MTable.get(getCtx(), org.compiere.model.I_AD_Role.Table_Name)
			.getPO(getAD_Role_ID(), get_TrxName());	}

	/** Set Role.
		@param AD_Role_ID 
		Responsibility Role
	  */
	public void setAD_Role_ID (int AD_Role_ID)
	{
		if (AD_Role_ID < 0) 
			set_Value (COLUMNNAME_AD_Role_ID, null);
		else 
			set_Value (COLUMNNAME_AD_Role_ID, Integer.valueOf(AD_Role_ID));
	}

	/** Get Role.
		@return Responsibility Role
	  */
	public int getAD_Role_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Role_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getAD_User_ID(), get_TrxName());	}

	/** Set User/Contact.
		@param AD_User_ID 
		User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1) 
			set_Value (COLUMNNAME_AD_User_ID, null);
		else 
			set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get User/Contact.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Kanban Automatic Control.
		@param KDB_AutomaticControl_ID Kanban Automatic Control	  */
	public void setKDB_AutomaticControl_ID (int KDB_AutomaticControl_ID)
	{
		if (KDB_AutomaticControl_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_KDB_AutomaticControl_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_KDB_AutomaticControl_ID, Integer.valueOf(KDB_AutomaticControl_ID));
	}

	/** Get Kanban Automatic Control.
		@return Kanban Automatic Control	  */
	public int getKDB_AutomaticControl_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_KDB_AutomaticControl_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set KDB_AutomaticControl_UU.
		@param KDB_AutomaticControl_UU KDB_AutomaticControl_UU	  */
	public void setKDB_AutomaticControl_UU (String KDB_AutomaticControl_UU)
	{
		set_Value (COLUMNNAME_KDB_AutomaticControl_UU, KDB_AutomaticControl_UU);
	}

	/** Get KDB_AutomaticControl_UU.
		@return KDB_AutomaticControl_UU	  */
	public String getKDB_AutomaticControl_UU () 
	{
		return (String)get_Value(COLUMNNAME_KDB_AutomaticControl_UU);
	}

	/** Set Kanban Board.
		@param KDB_KanbanBoard_ID Kanban Board	  */
	public void setKDB_KanbanBoard_ID (int KDB_KanbanBoard_ID)
	{
		if (KDB_KanbanBoard_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_KDB_KanbanBoard_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_KDB_KanbanBoard_ID, Integer.valueOf(KDB_KanbanBoard_ID));
	}

	/** Get Kanban Board.
		@return Kanban Board	  */
	public int getKDB_KanbanBoard_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_KDB_KanbanBoard_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getName());
    }

	/** ResponsibleType AD_Reference_ID=304 */
	public static final int RESPONSIBLETYPE_AD_Reference_ID=304;
	/** Organization = O */
	public static final String RESPONSIBLETYPE_Organization = "O";
	/** Human = H */
	public static final String RESPONSIBLETYPE_Human = "H";
	/** Role = R */
	public static final String RESPONSIBLETYPE_Role = "R";
	/** System Resource = S */
	public static final String RESPONSIBLETYPE_SystemResource = "S";
	/** Set Responsible Type.
		@param ResponsibleType 
		Type of the Responsibility for a workflow
	  */
	public void setResponsibleType (String ResponsibleType)
	{

		set_Value (COLUMNNAME_ResponsibleType, ResponsibleType);
	}

	/** Get Responsible Type.
		@return Type of the Responsibility for a workflow
	  */
	public String getResponsibleType () 
	{
		return (String)get_Value(COLUMNNAME_ResponsibleType);
	}
}