package apc.examples;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
@author aandrei
**/
public class AboutMeActivity extends Activity {
   
    private boolean fuzzyImage = false;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void showAboutMessage(View v) {
    	Toast.makeText(this, "About me!", 
    			Toast.LENGTH_LONG).show();
    }
    public void showMyMessage(View v) {
    	Toast.makeText(this, "Hello!", 
    			Toast.LENGTH_LONG).show();
    }
    
    public void flipImage(View v) {
    	ImageView portrait = (ImageView) findViewById(R.id.faceImageView);
    	if (fuzzyImage) {
    		portrait.setImageResource(R.drawable.baby_mic);
    	}
    	else {
    		portrait.setImageResource(R.drawable.eushor);
    	}
    	fuzzyImage = !fuzzyImage; // flip the state for next time
    }
    
}