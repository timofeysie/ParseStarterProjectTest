package com.parse.starter.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.ImageButton;

import com.parse.starter.TemplatesActivity;

import junit.framework.TestCase;

public class TemplatesActivityTest extends ActivityInstrumentationTestCase2<TemplatesActivity> 
{
	
	private TemplatesActivity activity;
	private ImageButton add_template_button;

	public TemplatesActivityTest() 
	{
	        super(TemplatesActivity.class);
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
        assertNotNull(add_template_button);
    }
    
    /**
     * @TODO Test image button.
     */
    public void testBackButton()
    {
    	final String expected = "image";
        final String actual = "image";
        assertEquals(expected, actual);
    }
    
}
