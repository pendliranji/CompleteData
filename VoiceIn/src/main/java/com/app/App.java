package com.app;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;

import java.net.URI;
/**
 * Hello world!
 *
 */
public class App {
	// Find your Account Sid and Token at twilio.com/console
    // DANGER! This is insecure. See http://twil.io/secure
    public static final String ACCOUNT_SID = "AC81188752922cdc954655793b3554b63c";
    public static final String AUTH_TOKEN = "5fc9dd94500ff0df24bc4828212e5451";

    public static void main(String[] args) {
    	String from="+918143999267",to="+919538772247";
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Call call = Call.creator(
                new com.twilio.type.PhoneNumber(to),
                new com.twilio.type.PhoneNumber(from),
                URI.create("http://demo.twilio.com/docs/voice.xml"))
            .create();

        System.out.println(call.getSid());
    }
}