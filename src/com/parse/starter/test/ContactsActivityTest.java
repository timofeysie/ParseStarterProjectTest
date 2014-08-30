package com.parse.starter.test;

import com.parse.starter.ContactsActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.ImageButton;
import junit.framework.TestCase;

public class ContactsActivityTest extends ActivityInstrumentationTestCase2<ContactsActivity> 
{
	
	private ContactsActivity activity;
	private ImageButton add_contact_button;
	
	public ContactsActivityTest() 
	{
	        super(ContactsActivity.class);
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
    }
    
    /**
     * Make sure the fixtures are loaded.
     */
    public void testPreconditions() 
    {
        assertNotNull(activity);
        assertNotNull(add_contact_button);
    }
    
    /**
     * @TODO test image button.
     */
    public void testAddContactButton()
    {
    	final String expected = "image";
        final String actual = "image";
        assertEquals(expected, actual);
    }
    
}
