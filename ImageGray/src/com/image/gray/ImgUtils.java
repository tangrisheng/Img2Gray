package com.image.gray;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;

public class ImgUtils {
	
	public static Bitmap bitmap2Gray(Bitmap source) {
		
		int width, height;
		height = source.getHeight();
		width = source.getWidth();
		Bitmap dest = null;
		dest = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
		Canvas c = new Canvas(dest);
		Paint paint = new Paint();
		ColorMatrix cm = new ColorMatrix();
		cm.setSaturation(0);
		ColorMatrixColorFilter f = new ColorMatrixColorFilter(cm);
		paint.setColorFilter(f);
		c.drawBitmap(source, 0, 0, paint);

		return dest;
	}
}
