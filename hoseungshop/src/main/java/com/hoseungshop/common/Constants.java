package com.hoseungshop.common;

public interface Constants {
	
	public interface SESSION {
		public static final String SQ_USER = "sqUser";
		public static final String ID_USER = "id";
		public static final String CD_COMPANY = "cdCompany";		
		public static final String NM_COMPANY = "nmCompany";
		public static final String NM_CEO = "nmCeo";
		public static final String BC_ADDRESS = "bcAddress";		
		public static final String NM_USER = "nmUser";
		public static final String TXT_EMAIL = "txtEmail";
		public static final String NO_CELL = "noCell";
		public static final String NO_CELL1 = "noCell1";
		public static final String NO_CELL2 = "noCell2";
		public static final String NO_CELL3 = "noCell3";
	}
	
	public interface AUTH {
		public static final String NOT_EXIST_USER="-110";
		public static final String NOT_EXIST_PASSWORD="-111";
		public static final String WRONG_PASSWORD="-112";
		public static final String NO_AUTH="111";
		public static final String NO_SMS_AUTH="112";
		public static final String NO_EMAIL_AUTH="113";		
		public static final String SMS_EMAIL_AUTH="114";
		public static final String DB_ERR="120";
		public static final String DB_ERR_NOT_INSERT="121";
		public static final String DB_ERR_NOT_UPDATE="122";
		public static final String CERT_ERR="130";
		public static final String CERT_ERR_NOT_EXIST_UID_SEQ="131";
		public static final String CERT_ERR_MISMATCH="132";
		public static final String CERT_ERR_INTIME="133";
		public static final String NON_MEMBER_EMPTY_AUTH_NUM="140";
		public static final String NON_MEMBER_WRONG_AUTH_NUM="141";
		public static final String NOT_USER_ENABLE="N";
		public static final String NO_NOT_USER_ENABLE="150";
		public static final String CHECK_ADMIN="ADMIN";
	}
	
	public interface ROLE {
		public static final String PREFIX= "ROLE_";
		public interface CODE {
			public static final String BACK = "00";		// 백도어 계정 
			public static final String MASTER = "100";		// 전체 시스템 권한 ( 최초 가입 유저 ) 
			public static final String ADMIN = "101";		// 관리자 권한
			public static final String IN = "102";	// 사내 접근 권한
			public static final String OUT = "103";	// 사외 접근 권한
			
		}
	}

}
