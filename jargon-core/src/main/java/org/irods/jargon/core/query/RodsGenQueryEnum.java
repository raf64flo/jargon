/**
 *
 */
package org.irods.jargon.core.query;

import org.irods.jargon.core.exception.JargonException;

/**
 * Java equivalent of the rodsGenQuery.h
 *
 * @author Mike Conway - DICE (www.irods.org)
 *
 */
public enum RodsGenQueryEnum {

	// zone info
	COL_ZONE_ID("ZONE_ID", 101), COL_ZONE_NAME("ZONE_NAME", 102), COL_ZONE_TYPE(
			"ZONE_TYPE", 103), COL_ZONE_CONNECTION("ZONE_CONNECTION", 104), COL_ZONE_COMMENT(
					"ZONE_COMMENT", 105), COL_ZONE_CREATE_TIME("ZONE_CREATE_TIME", 106), COL_ZONE_MODIFY_TIME(
							"ZONE_MODIFY_TIME", 107),
							// user info
							COL_USER_ID("USER_ID", 201), COL_USER_NAME("USER_NAME", 202), COL_USER_TYPE(
									"USER_TYPE", 203), COL_USER_ZONE("USER_ZONE", 204), COL_USER_DN(
											"USER_DN", 1601), COL_USER_INFO("USER_INFO", 206), COL_USER_COMMENT(
													"USER_COMMENT", 207), COL_USER_CREATE_TIME("USER_CREATE_TIME", 208), COL_USER_MODIFY_TIME(
															"USER_MODIFY_TIME", 209),
															// resource info
															COL_R_RESC_ID("RESC_ID", 301), COL_R_RESC_NAME("RESC_NAME", 302), COL_R_ZONE_NAME(
																	"RESC_ZONE_NAME", 303), COL_R_TYPE_NAME("RESC_TYPE_NAME", 304), COL_R_CLASS_NAME(
																			"RESC_CLASS_NAME", 305), COL_R_LOC("RESC_LOC", 306), COL_R_VAULT_PATH(
																					"RESC_VAULT_PATH", 307), COL_R_FREE_SPACE("RESC_FREE_SPACE", 308), COL_R_FREE_SPACE_TIME(
																							"RESC_FREE_SPACE_TIME", 314), COL_R_RESC_INFO("RESC_INFO", 309), COL_R_RESC_COMMENT(
																									"RESC_COMMENT", 310), COL_R_CREATE_TIME("RESC_CREATE_TIME", 311), COL_R_MODIFY_TIME(
																											"RESC_MODIFY_TIME", 312), COL_R_RESC_STATUS("RESC_STATUS", 313), COL_R_RESC_CHILDREN(
																													"RESC_CHILDREN", 315), COL_R_RESC_CONTEXT("RESC_CONTEXT", 316), COL_R_RESC_PARENT(
																															"RESC_PARENT", 317),
																															// data obj info
																															COL_D_DATA_ID("DATA_ID", 401), COL_D_COLL_ID("DATA_COLL_ID", 402), COL_DATA_NAME(
																																	"DATA_NAME", 403), COL_DATA_REPL_NUM("DATA_REPL_NUM", 404), COL_DATA_VERSION(
																																			"DATA_VERSION", 405), COL_DATA_TYPE_NAME("DATA_TYPE_NAME", 406), COL_DATA_SIZE(
																																					"DATA_SIZE", 407), COL_D_RESC_GROUP_NAME("DATA_RESC_GROUP_NAME",
																																							408), COL_D_RESC_NAME("DATA_RESC_NAME", 409), COL_D_DATA_PATH(
																																									"DATA_PATH", 410), COL_D_OWNER_NAME("DATA_OWNER_NAME", 411), COL_D_OWNER_ZONE(
																																											"DATA_OWNER_ZONE", 412), COL_D_REPL_STATUS("DATA_REPL_STATUS", 413), COL_D_DATA_STATUS(
																																													"DATA_STATUS", 414), COL_D_DATA_CHECKSUM("DATA_CHECKSUM", 415), COL_D_EXPIRY(
																																															"DATA_EXPIRY", 416), COL_D_MAP_ID("DATA_MAP_ID", 417), COL_D_COMMENTS(
																																																	"DATA_COMMENTS", 418), COL_D_CREATE_TIME("DATA_CREATE_TIME", 419), COL_D_MODIFY_TIME(
																																																			"DATA_MODIFY_TIME", 420), COL_D_DATA_MODE("DATA_MODE", 421), COL_D_RESC_HIER("DATA_RESC_HIER", 422),COL_D_RESC_ID("DATA_RESC_ID", 423),
																																																			// data access
																																																			COL_DATA_ACCESS_TYPE("DATA_ACCESS_TYPE", 700), COL_DATA_ACCESS_NAME(
																																																					"DATA_ACCESS_NAME", 701), COL_DATA_TOKEN_NAMESPACE(
																																																							"DATA_TOKEN_NAMESPACE", 702), COL_DATA_ACCESS_USER_ID(
																																																									"DATA_ACCESS_USER_ID", 703), COL_DATA_ACCESS_DATA_ID(
																																																											"DATA_ACCESS_DATA_ID", 704),
																																																											// coll info
																																																											COL_COLL_ID("COLL_ID", 500), COL_COLL_NAME("COLL_NAME", 501), COL_COLL_PARENT_NAME(
																																																													"COLL_PARENT_NAME", 502), COL_COLL_OWNER_NAME("COLL_OWNER_NAME",
																																																															503), COL_COLL_OWNER_ZONE("COLL_OWNER_ZONE", 504), COL_COLL_MAP_ID(
																																																																	"COLL_MAP_ID", 505), COL_COLL_INHERITANCE("COLL_INHERITANCE", 506), COL_COLL_COMMENTS(
																																																																			"COLL_COMMENTS", 507), COL_COLL_CREATE_TIME("COLL_CREATE_TIME", 508), COL_COLL_MODIFY_TIME(
																																																																					"COLL_MODIFY_TIME", 509), COL_COLL_TYPE("COLL_COLL_TYPE", 510), COL_COLL_INFO1(
																																																																							"COL_COLL_INFO1", 511), COL_COLL_INFO2("COL_COLL_INFO2", 512),

																																																																							// collection access info
																																																																							COL_COLL_ACCESS_TYPE("COLL_ACCESS_TYPE", 710), COL_COLL_ACCESS_NAME(
																																																																									"COLL_ACCESS_NAME", 711), COL_COLL_TOKEN_NAMESPACE(
																																																																											"COLL_TOKEN_NAMESPACE", 712), COL_COLL_ACCESS_USER_ID(
																																																																													"COLL_ACCESS_USER_ID", 713), COL_COLL_ACCESS_COLL_ID(
																																																																															"COLL_ACCESS_COLL_ID", 714), COL_COLL_ACCESS_USER_NAME(
																																																																																	"COLL_ACCESS_USER_NAME", 1300), COL_COLL_ACCESS_USER_ZONE(
																																																																																			"COLL_ACCESS_USER_ZONE", 1301),

																																																																																			// object metadata
																																																																																			COL_META_DATA_ATTR_NAME("META_DATA_ATTR_NAME", 600), COL_META_DATA_ATTR_VALUE(
																																																																																					"META_DATA_ATTR_VALUE", 601), COL_META_DATA_ATTR_UNITS(
																																																																																							"META_DATA_ATTR_UNITS", 602), COL_META_DATA_ATTR_ID(
																																																																																									"META_DATA_ATTR_ID", 603), COL_META_DATA_CREATE_TIME(
																																																																																											"META_DATA_CREATE_TIME", 604), COL_META_DATA_MODIFY_TIME(
																																																																																													"META_DATA_MODIFY_TIME", 605),

																																																																																													// collection metadata
																																																																																													COL_META_COLL_ATTR_NAME("META_COLL_ATTR_NAME", 610), COL_META_COLL_ATTR_VALUE(
																																																																																															"META_COLL_ATTR_VALUE", 611), COL_META_COLL_ATTR_UNITS(
																																																																																																	"META_COLL_ATTR_UNITS", 612), COL_META_COLL_ATTR_ID(
																																																																																																			"META_COLL_ATTR_ID", 613),

																																																																																																			COL_META_NAMESPACE_COLL("META_NAMESPACE_COLL", 620), COL_META_NAMESPACE_DATA(
																																																																																																					"META_NAMESPACE_DATA", 621), COL_META_NAMESPACE_RESC(
																																																																																																							"META_NAMESPACE_RESC", 622), COL_META_NAMESPACE_USER(
																																																																																																									"META_NAMESPACE_USER", 623),

																																																																																																									// resource metadata
																																																																																																									COL_META_RESC_ATTR_NAME("META_RESC_ATTR_NAME", 630), COL_META_RESC_ATTR_VALUE(
																																																																																																											"META_RESC_ATTR_VALUE", 631), COL_META_RESC_ATTR_UNITS(
																																																																																																													"META_RESC_ATTR_UNITS", 632), COL_META_RESC_ATTR_ID(
																																																																																																															"META_RESC_ATTR_ID", 633),

																																																																																																															// user attr name
																																																																																																															COL_META_USER_ATTR_NAME("META_USER_ATTR_NAME", 640), COL_META_USER_ATTR_VALUE(
																																																																																																																	"META_USER_ATTR_VALUE", 641), COL_META_USER_ATTR_UNITS(
																																																																																																																			"META_USER_ATTR_UNITS", 642), COL_META_USER_ATTR_ID(
																																																																																																																					"META_USER_ATTR_ID", 643),

																																																																																																																					// resc group
																																																																																																																					COL_RESC_GROUP_RESC_ID("RESC_GROUP_RESC_ID", 800), COL_RESC_GROUP_NAME(
																																																																																																																							"RESC_GROUP_NAME", 801),

																																																																																																																							// user group
																																																																																																																							COL_USER_GROUP_ID("USER_GROUP_ID", 900), COL_USER_GROUP_NAME(
																																																																																																																									"USER_GROUP_NAME", 901),

																																																																																																																									// rule info
																																																																																																																									COL_RULE_EXEC_ID("RULE_EXEC_ID", 1000), COL_RULE_EXEC_NAME(
																																																																																																																											"RULE_EXEC_NAME", 1001), COL_RULE_EXEC_REI_FILE_PATH(
																																																																																																																													"RULE_EXEC_REI_FILE_PATH", 1002), COL_RULE_EXEC_USER_NAME(
																																																																																																																															"RULE_EXEC_USER_NAME", 1003), COL_RULE_EXEC_ADDRESS(
																																																																																																																																	"RULE_EXEC_ADDRESS", 1004), COL_RULE_EXEC_TIME("RULE_EXEC_TIME",
																																																																																																																																			1005), COL_RULE_EXEC_FREQUENCY("RULE_EXEC_FREQUENCY", 1006), COL_RULE_EXEC_PRIORITY(
																																																																																																																																					"RULE_EXEC_PRIORITY", 1007), COL_RULE_EXEC_ESTIMATED_EXE_TIME(
																																																																																																																																							"RULE_EXEC_ESTIMATED_EXE_TIME", 1008), COL_RULE_EXEC_NOTIFICATION_ADDR(
																																																																																																																																									"RULE_EXEC_NOTIFICATION_ADDR", 1009), COL_RULE_EXEC_LAST_EXE_TIME(
																																																																																																																																											"RULE_EXEC_LAST_EXE_TIME", 1010), COL_RULE_EXEC_STATUS(
																																																																																																																																													"RULE_EXEC_STATUS", 1011),

																																																																																																																																													// token
																																																																																																																																													COL_TOKEN_NAMESPACE("TOKEN_NAMESPACE", 1100), COL_TOKEN_ID("TOKEN_ID", 1101), COL_TOKEN_NAME(
																																																																																																																																															"TOKEN_NAME", 1102), COL_TOKEN_VALUE("TOKEN_VALUE", 1103), COL_TOKEN_VALUE2(
																																																																																																																																																	"TOKEN_VALUE2", 1104), COL_TOKEN_VALUE3("TOKEN_VALUE3", 1105), COL_TOKEN_COMMENT(
																																																																																																																																																			"TOKEN_COMMENT", 1106),

																																																																																																																																																			// object audit
																																																																																																																																																			COL_AUDIT_OBJ_ID("AUDIT_OBJ_ID", 1200), COL_AUDIT_USER_ID("AUDIT_USER_ID",
																																																																																																																																																					1201), COL_AUDIT_ACTION_ID("AUDIT_ACTION_ID", 1202), COL_AUDIT_COMMENT(
																																																																																																																																																							"AUDIT_COMMENT", 1203), COL_AUDIT_CREATE_TIME("AUDIT_CREATE_TIME",
																																																																																																																																																									1204), COL_AUDIT_MODIFY_TIME("AUDIT_MODIFY_TIME", 1205),

																																																																																																																																																									// server load
																																																																																																																																																									COL_SL_HOST_NAME("SL_HOST_NAME", 1400), COL_SL_RESC_NAME("SL_RESC_NAME",
																																																																																																																																																											1401), COL_SL_CPU_USED("SL_CPU_USED", 1402), COL_SL_MEM_USED(
																																																																																																																																																													"SL_MEM_USED", 1403), COL_SL_SWAP_USED("SL_SWAP_USED", 1404), COL_SL_RUNQ_LOAD(
																																																																																																																																																															"SL_RUNQ_LOAD", 1405), COL_SL_DISK_SPACE("SL_DISK_SPACE", 1406), COL_SL_NET_INPUT(
																																																																																																																																																																	"SL_NET_INPUT", 1407), COL_SL_NET_OUTPUT("SL_NET_OUTPUT", 1408), COL_SL_CREATE_TIME(
																																																																																																																																																																			"SL_CREATE_TIME", 1409), COL_SLD_RESC_NAME("SLD_RESC_NAME", 1500), COL_SLD_LOAD_FACTOR(
																																																																																																																																																																					"SLD_LOAD_FACTOR", 1501), COL_SLD_CREATE_TIME("SLD_CREATE_TIME",
																																																																																																																																																																							1502),

																																																																																																																																																																							// rule data
																																																																																																																																																																							COL_RULE_ID("RULE_ID", 1700), COL_RULE_VERSION("RULE_VERSION", 1701), COL_RULE_BASE_NAME(
																																																																																																																																																																									"RULE_BASE_NAME", 1702), COL_RULE_NAME("RULE_NAME", 1703), COL_RULE_EVENT(
																																																																																																																																																																											"RULE_EVENT", 1704), COL_RULE_CONDITION("RULE_CONDITION", 1705), COL_RULE_BODY(
																																																																																																																																																																													"RULE_BODY", 1706), COL_RULE_RECOVERY("RULE_RECOVERY", 1707), COL_RULE_STATUS(
																																																																																																																																																																															"RULE_STATUS", 1708), COL_RULE_OWNER_NAME("RULE_OWNER_NAME", 1709), COL_RULE_OWNER_ZONE(
																																																																																																																																																																																	"RULE_OWNER_ZONE", 1710), COL_RULE_COMMENT("RULE_COMMENT", 1711), COL_RULE_CREATE_TIME(
																																																																																																																																																																																			"RULE_CREATE_TIME", 1712), COL_RULE_MODIFY_TIME("RULE_MODIFY_TIME",
																																																																																																																																																																																					1713),

																																																																																																																																																																																					// dvm
																																																																																																																																																																																					COL_DVM_ID("DVM_ID", 1800), COL_DVM_VERSION("DVM_VERSION", 1801), COL_DVM_BASE_NAME(
																																																																																																																																																																																							"DVM_BASE_NAME", 1802), COL_DVM_EXT_VAR_NAME("DVM_EXT_VAR_NAME",
																																																																																																																																																																																									1803), COL_DVM_CONDITION("DVM_CONDITION", 1804), COL_DVM_INT_MAP_PATH(
																																																																																																																																																																																											"DVM_INT_MAP_PATH", 1805), COL_DVM_STATUS("DVM_STATUS", 1806), COL_DVM_OWNER_NAME(
																																																																																																																																																																																													"DVM_OWNER_NAME", 1807), COL_DVM_OWNER_ZONE("DVM_OWNER_ZONE", 1808), COL_DVM_COMMENT(
																																																																																																																																																																																															"DVM_COMMENT", 1809), COL_DVM_CREATE_TIME("DVM_CREATE_TIME", 1810), COL_DVM_MODIFY_TIME(
																																																																																																																																																																																																	"DVM_MODIFY_TIME", 1811),

																																																																																																																																																																																																	// fnm
																																																																																																																																																																																																	COL_FNM_ID("FNM_ID", 1900), COL_FNM_VERSION("FNM_VERSION", 1901), COL_FNM_BASE_NAME(
																																																																																																																																																																																																			"FNM_BASE_NAME", 1902), COL_FNM_EXT_FUNC_NAME("FNM_EXT_FUNC_NAME",
																																																																																																																																																																																																					1903), COL_FNM_INT_FUNC_NAME("FNM_INT_FUNC_NAME", 1904), COL_FNM_STATUS(
																																																																																																																																																																																																							"FNM_STATUS", 1905), COL_FNM_OWNER_NAME("FNM_OWNER_NAME", 1906), COL_FNM_OWNER_ZONE(
																																																																																																																																																																																																									"FNM_OWNER_ZONE", 1907), COL_FNM_COMMENT("FNM_COMMENT", 1908), COL_FNM_CREATE_TIME(
																																																																																																																																																																																																											"FNM_CREATE_TIME", 1909), COL_FNM_MODIFY_TIME("FNM_MODIFY_TIME",
																																																																																																																																																																																																													1910),

																																																																																																																																																																																																													// quota
																																																																																																																																																																																																													COL_QUOTA_USER_ID("QUOTA_USER_ID", 2000), COL_QUOTA_RESC_ID(
																																																																																																																																																																																																															"QUOTA_RESC_ID", 2001), COL_QUOTA_LIMIT("QUOTA_LIMIT", 2002), COL_QUOTA_OVER(
																																																																																																																																																																																																																	"QUOTA_OVER", 2003), COL_QUOTA_MODIFY_TIME("QUOTA_MODIFY_TIME",
																																																																																																																																																																																																																			2004), COL_QUOTA_USAGE_USER_ID("QUOTA_USAGE_USER_ID", 2010), COL_QUOTA_USAGE_RESC_ID(
																																																																																																																																																																																																																					"QUOTA_USAGE_RESC_ID", 2011), COL_QUOTA_USAGE("QUOTA_USAGE", 2012), COL_QUOTA_USAGE_MODIFY_TIME(
																																																																																																																																																																																																																							"QUOTA_USAGE_MODIFY_TIME", 2013), COL_QUOTA_USER_NAME(
																																																																																																																																																																																																																									"QUOTA_USER_NAME", 2021), COL_QUOTA_USER_TYPE("QUOTA_USER_TYPE",
																																																																																																																																																																																																																											2022), COL_QUOTA_RESC_NAME("QUOTA_RESC_NAME", 2020),

																																																																																																																																																																																																																											// tickets
																																																																																																																																																																																																																											COL_TICKET_ID("TICKET_ID", 2200), COL_TICKET_STRING("TICKET_STRING", 2201), COL_TICKET_TYPE(
																																																																																																																																																																																																																													"TICKET_TYPE", 2202), COL_TICKET_USER_ID("TICKET_USER_ID", 2203), COL_TICKET_OBJECT_ID(
																																																																																																																																																																																																																															"TICKET_OBJECT_ID", 2204), COL_TICKET_OBJECT_TYPE(
																																																																																																																																																																																																																																	"TICKET_OBJECT_TYPE", 2205), COL_TICKET_USES_LIMIT(
																																																																																																																																																																																																																																			"TICKET_USES_LIMIT", 2206), COL_TICKET_USES_COUNT(
																																																																																																																																																																																																																																					"TICKET_USES_COUNT", 2207), COL_TICKET_EXPIRY_TS(
																																																																																																																																																																																																																																							"TICKET_EXPIRY_TS", 2208), COL_TICKET_CREATE_TIME(
																																																																																																																																																																																																																																									"TICKET_CREATE_TIME", 2209), COL_TICKET_MODIFY_TIME(
																																																																																																																																																																																																																																											"TICKET_MODIFY_TIME", 2210), COL_TICKET_WRITE_FILE_COUNT(
																																																																																																																																																																																																																																													"TICKET_WRITE_FILE_COUNT", 2211), COL_TICKET_WRITE_FILE_LIMIT(
																																																																																																																																																																																																																																															"TICKET_WRITE_FILE_LIMIT", 2212), COL_TICKET_WRITE_BYTE_COUNT(
																																																																																																																																																																																																																																																	"TICKET_WRITE_BYTE_COUNT", 2213), COL_TICKET_WRITE_BYTE_LIMIT(
																																																																																																																																																																																																																																																			"TICKET_WRITE_BYTE_LIMIT", 2214), COL_TICKET_ALLOWED_HOST_TICKET_ID(
																																																																																																																																																																																																																																																					"TICKET_ALLOWED_HOST_TICKET_ID", 2220), COL_TICKET_ALLOWED_HOST(
																																																																																																																																																																																																																																																							"TICKET_ALLOWED_HOST", 2221), COL_TICKET_ALLOWED_USER_TICKET_ID(
																																																																																																																																																																																																																																																									"TICKET_ALLOWED_USER_TICKET_ID", 2222), COL_TICKET_ALLOWED_USER_NAME(
																																																																																																																																																																																																																																																											"TICKET_ALLOWED_USER_NAME", 2223), COL_TICKET_ALLOWED_GROUP_TICKET_ID(
																																																																																																																																																																																																																																																													"TICKET_ALLOWED_GROUP_TICKET_ID", 2224), COL_TICKET_ALLOWED_GROUP_NAME(
																																																																																																																																																																																																																																																															"TICKET_ALLOWED_GROUP_NAME", 2225), COL_TICKET_DATA_NAME(
																																																																																																																																																																																																																																																																	"TICKET_DATA_NAME", 2226), COL_TICKET_DATA_COLL_NAME(
																																																																																																																																																																																																																																																																			"TICKET_DATA_COLL_NAME", 2227), COL_TICKET_COLL_NAME(
																																																																																																																																																																																																																																																																					"TICKET_COLL_NAME", 2228), COL_TICKET_OWNER_NAME(
																																																																																																																																																																																																																																																																							"TICKET_OWNER_NAME", 2229), COL_TICKET_OWNER_ZONE(
																																																																																																																																																																																																																																																																									"TICKET_OWNER_ZONE", 2230);

	private String name;
	private int numericValue;

	RodsGenQueryEnum(final String name, final int numericValue) {
		this.name = name;
		this.numericValue = numericValue;
	}

	static int getNumericFromStringValue(final String stringValue) {
		int queryVal = -1;
		for (RodsGenQueryEnum rodsGenQueryEnum : RodsGenQueryEnum.values()) {
			if (rodsGenQueryEnum.getName().equals(stringValue)) {
				queryVal = rodsGenQueryEnum.getNumericValue();
				break;
			}
		}
		return queryVal;
	}

	static RodsGenQueryEnum getAttributeBasedOnId(
			final String attribNumericValue) throws JargonException {
		if (attribNumericValue == null) {
			throw new JargonException("null attribute value");
		}

		int attribAsInt = 0;
		RodsGenQueryEnum returnRodsGenQueryEnum = null;

		try {
			attribAsInt = Integer.parseInt(attribNumericValue);
		} catch (NumberFormatException e) {
			throw new JargonException(
					"unable to translate attrib value to an int.  Given value ="
							+ attribNumericValue);
		}

		for (RodsGenQueryEnum rodsGenQueryEnum : RodsGenQueryEnum.values()) {
			if (rodsGenQueryEnum.getNumericValue() == attribAsInt) {
				returnRodsGenQueryEnum = rodsGenQueryEnum;
				break;
			}
		}

		// this cannot happen, but still check
		if (returnRodsGenQueryEnum == null) {
			throw new JargonException(
					"logic error - derived a null value for the RodsGenQuery");
		}

		return returnRodsGenQueryEnum;

	}

	/**
	 * Given a String column name, translate to the specific pre-defined field
	 * value. If there is no match, null will be returned.
	 *
	 * @param attribName
	 *            <code>String</code> that contains the attibuteName to look up
	 * @return {@link org.irods.jargon.core.query.RodsGenQueryEnum
	 *         RodsGenQueryEnum} that gives information about the query field
	 * @throws JargonException
	 */
	static RodsGenQueryEnum getAttributeBasedOnName(final String attribName)
			throws JargonException {
		if (attribName == null || attribName.length() == 0) {
			throw new JargonException("missing attribute name");
		}

		RodsGenQueryEnum returnRodsGenQueryEnum = null;

		for (RodsGenQueryEnum rodsGenQueryEnum : RodsGenQueryEnum.values()) {
			if (rodsGenQueryEnum.getName().equals(attribName)) {
				returnRodsGenQueryEnum = rodsGenQueryEnum;
				break;
			}
		}
		return returnRodsGenQueryEnum;

	}

	public String getName() {
		return name;
	}

	public int getNumericValue() {
		return numericValue;
	}

}
