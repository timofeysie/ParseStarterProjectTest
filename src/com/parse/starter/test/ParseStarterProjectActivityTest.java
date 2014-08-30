package com.parse.starter.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.parse.starter.ParseStarterProjectActivity;
import com.parse.starter.R;

public class ParseStarterProjectActivityTest
extends ActivityInstrumentationTestCase2<ParseStarterProjectActivity>
{
	private ParseStarterProjectActivity activity;
	private TextView hello_text_view;
	private Button sync_contacts_button;
	private ImageButton sync_image_button;
	private ImageButton contacts_image_button;
	private ImageButton templates_image_button;
	private TextView phone_contacts_count;
 	private TextView app_contacts_count;
    private TextView sync_text_view;

	    public ParseStarterProjectActivityTest() 
	    {
	        super(ParseStarterProjectActivity.class);
	    }

	    /**
	     * Initialize test fixtures.
	     */
	    @Override
	    protected void setUp() throws Exception 
	    {
	        super.setUp();
	        setActivityInitialTouchMode(true); //  prevents the UI control from taking focus when you click it programmatically in the test method later
	        activity = getActivity();
	        hello_text_view = (TextView)activity.findViewById(com.parse.starter.R.id.hello_text_view);
	        contacts_image_button = (ImageButton)activity.findViewById(R.id.contacts_image_button);
	        templates_image_button = (ImageButton)activity.findViewById(R.id.templates_image_button);
	        sync_image_button = (ImageButton)activity.findViewById(R.id.sync_image_button);
	        app_contacts_count = (TextView)activity.findViewById(R.id.app_contacts);
	        phone_contacts_count = (TextView)activity.findViewById(R.id.phone_contacts);
	        sync_text_view = (TextView)activity.findViewById(R.id.sync_text_view);
	    }
	    
	    /**
	     * Make sure the fixtures are loaded.
	     */
	    public void testPreconditions() 
	    {
	        assertNotNull(activity);
	        assertNotNull(hello_text_view);
	        assertNotNull(contacts_image_button);
	        assertNotNull(templates_image_button);
	        assertNotNull(sync_image_button);
	        assertNotNull(app_contacts_count);
	        assertNotNull(phone_contacts_count);
	    }
	    
	    /**
	     * Test the hello string in the main.xml and strings.xml is loaded.
	     */
	    public void testTextViewLabel() 
	    {
	        final String expected = activity.getString(com.parse.starter.R.string.hello);
	        final String actual = hello_text_view.getText().toString();
	        assertEquals(expected, actual);
	    }
	    
	    /**
	     * We can't test Parse.com like this as the update is done with a call back.
	     * Not enough time right now to figure out how to test asynchronous methods.
	     * @TODO Test Parse.com methods.
	     *
	    public void testUpdateData()
	    {
	    	String expected = new Date().toString();
	    	activity.setFoobie(expected);
	    	activity.updateData();
	    	final String actual = foobie_text_view_value.getText().toString();
	    	assertEquals(expected, actual);
	    }
	    */
	    
	    public void testSyncContactsButton()
	    {
	    	final String expected = activity.getString(com.parse.starter.R.string.sync_contacts);
	        final String actual = sync_contacts_button.getText().toString();
	        assertEquals(expected, actual);
	    }
	    
	    public void testSyncContactsImageButton()
	    {
	    	final String expected = activity.getString(com.parse.starter.R.string.sync_with_contacts);
	        final String actual = sync_text_view.getText().toString();
	        assertEquals(expected, actual);
	    }
}
