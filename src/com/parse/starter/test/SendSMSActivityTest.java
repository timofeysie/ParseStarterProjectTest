package com.parse.starter.test;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.parse.starter.AddTemplateActivity;
import com.parse.starter.R;
import com.parse.starter.SendSMSActivity;

import junit.framework.TestCase;

public class SendSMSActivityTest extends ActivityInstrumentationTestCase2<SendSMSActivity> 
{
	
	private SendSMSActivity activity;
	private Spinner templates_spinner;
	private TextView templates_spinner_label;
	private TextView send_finished_sms_label;

	public SendSMSActivityTest() 
	{
	        super(SendSMSActivity.class);
	}
	
	/**
     * Initialize test fixtures.
     */
    @Override
    protected void setUp() throws Exception 
    {
        super.setUp();
        setActivityInitialTouchMode(true);
        activity = getActivity();
        templates_spinner_label = (TextView)activity.findViewById(R.id.templates_spinner_label);
        send_finished_sms_label = (TextView)activity.findViewById(R.id.send_finished_sms_label);
    }
	
    /**
     * Make sure the fixtures are loaded.
     */
    public void testPreconditions() 
    {
        assertNotNull(activity);
        assertNotNull(templates_spinner);
    }
    
    /**
     * @TODO implement Spinner test.
     */
    public void testSpinner() 
    {
        /*
         * request focus for the Spinner, so that the test can send key events to it
         * This request must be run on the UI thread. To do this, use the runOnUiThread method
         * and pass it a Runnable that contains a call to requestFocus on the Spinner.
         */
        activity.runOnUiThread(new Runnable() {
            public void run() {
            	templates_spinner.requestFocus();
            }
        });
        //mInstrumentation.waitForIdleSync();
        //this.sendKeys(KeyEvent.KEYCODE_DPAD_CENTER);
        assertEquals(true, false);
    }
    
    /**
     * Test templates_spinner_label.
     */
    public void testTemplatesSpinnerLabel()
    {
    	final String expected = activity.getString(com.parse.starter.R.string.choose_your_template);
        final String actual = templates_spinner_label.getText().toString();
        assertEquals(expected, actual);
    }
    
    /**
     * Test send_finished_sms_label
     */
    public void testSendFinishedSMSLabel()
    {
    	final String expected = activity.getString(com.parse.starter.R.string.send_sms_to_phone_contacts);
        final String actual = send_finished_sms_label.getText().toString();
        assertEquals(expected, actual);
    }
}
