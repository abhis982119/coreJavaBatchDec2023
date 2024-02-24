package com.batchDec2023.coreJava.userenum.constant;

public enum ErrorCode {

    ERROR_CODE_101 ("Number greater than 5"),
    ERROR_CODE_102("Server error"),

    ERROR_CODE_103("Database error "),
    ERROR_CODE_104("Random error"),
    ERROR_CODE_105("Param error");

   private  String errorMsg ;

    ErrorCode(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
