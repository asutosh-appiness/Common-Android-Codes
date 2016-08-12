package com.adaptiz.snapcard.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Environment;
import android.view.View;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ViewToImage {

    // Class tested by passing a FrameLayout here
    // Class also tested by passing a LinearLayout here
    // Class also tested by passing a RelativeLayout here

       public ViewToImage(View view){

        Bitmap bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        view.draw(canvas);

        try {
            FileOutputStream output = new FileOutputStream(Environment.getExternalStorageDirectory() + "/1.png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, output);
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

/*

 Intro - This class converts any Layout or View to image and saves in Phone.
 ---------------------------------------------------------------------------

    usage -->

       mLin_FramePreview1 = (FrameLayout)findViewById(R.id.lin_FramePreview1);

       ViewToImage v = new ViewToImage(mLin_FramePreview1);

*/

