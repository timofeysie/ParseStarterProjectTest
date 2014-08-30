package com.parse.starter.test;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.parse.starter.AddTemplateActivity;
import com.parse.starter.R;

/**
 * Test the UI elements for the AddTexmplateActivity.
 * @author timothy
 *
 */
public class AddTemplateActivityTest extends ActivityInstrumentationTestCase2<AddTemplateActivity> 
{
	private static final String DEBUG_TAG = "AddTemplateActivityTest";
	private AddTemplateActivity activity;
	private Button back_button;
	private Button done_button;
	private Button location_button;
	private Button date_button;
	private Button time_button;
	private Button text_button;
	private Button signature_button;
	private EditText template_name_edit_text;
	 
	 public AddTemplateActivityTest() 
	 {
	        super(AddTemplateActivity.class);
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
        back_button = (Button)activity.findViewById(R.id.back_button);
        done_button = (Button)activity.findViewById(R.id.done_button);
        location_button = (Button)activity.findViewById(R.id.location_button);
        date_button = (Button)activity.findViewById(R.id.date_button);
        time_button = (Button)activity.findViewById(R.id.time_button);
        text_button = (Button)activity.findViewById(R.id.text_button);
        signature_button = (Button)activity.findViewById(R.id.sign_button);
        template_name_edit_text = (EditText)activity.findViewById(R.id.template_name_edit_text);
        Log.i(DEBUG_TAG, "setUp: finished init of test fixtures");
    }
    
    /**
     * Make sure the fixtures are loaded.
     */
    public void testPreconditions() 
    {
        assertNotNull(activity);
        assertNotNull(back_button);
        assertNotNull(done_button);
        assertNotNull(location_button);
        assertNotNull(date_button);
        assertNotNull(time_button);
        assertNotNull(text_button);
        assertNotNull(signature_button);
    }
    
    public void testBackButton()
    {
    	final String expected = activity.getString(com.parse.starter.R.string.back_button_label);
    	Log.i(DEBUG_TAG, "onCreate: done string "+expected);
        final String actual = back_button.getText().toString();
        Log.i(DEBUG_TAG, "onCreate: button label "+expected);
        assertEquals(expected, actual);
    }
    
    private void testTemplateNameEditText()
    {
		String actual = template_name_edit_text.getText().toString();
		String expected = "";
		assertEquals(expected, actual);
		
		
    }

}
