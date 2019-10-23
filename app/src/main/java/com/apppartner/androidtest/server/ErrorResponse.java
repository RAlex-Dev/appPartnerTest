package com.apppartner.androidtest.server;

/**
 * Created by mr.alexander on 2/22/17.
 */

public class ErrorResponse {

    //==============================================================================================
    // Class Properties
    //==============================================================================================

    private String mErrorMessage;

    //==============================================================================================
    // Constructor
    //==============================================================================================

    public ErrorResponse(String errorMessage) {
        mErrorMessage = errorMessage;
    }

    //==============================================================================================
    // Getter Methods
    //==============================================================================================


    public String getErrorMessage() {
        return mErrorMessage;
    }

}