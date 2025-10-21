package com.mmd.educationandroidgame;

import android.app.Activity;
import android.os.Bundle;
import java.io.IOException;
import java.io.InputStream;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.view.Gravity;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;


public class Season0 extends Activity {
	
	private LinearLayout lls0;
	
	public static Typeface yekan,nazanin,koodak,homa,titr;
	
	
	@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.season0);
	
	TextView Onvans0  = (TextView) findViewById(R.id.onvans0);
	lls0=(LinearLayout) findViewById(R.id.mylls0);
	
	homa = Typeface.createFromAsset(getAssets(), "font/homa.ttf");
	nazanin = Typeface.createFromAsset(getAssets(), "font/nazanin.ttf");
	koodak = Typeface.createFromAsset(getAssets(), "font/koodak.ttf");
	yekan = Typeface.createFromAsset(getAssets(), "font/yekan.ttf");
	titr = Typeface.createFromAsset(getAssets(), "font/titr.ttf");
	
			
	Onvans0.setText("معرفی");
	Onvans0.setTypeface(homa);
	
	String text = "<html><body>" +
			" <p align='center'><B><font color='#050b95'>نکات کلیدی</font></B></p> " +
			" [img2.png] " +
			
			" <p dir='rtl'><B><font color='#050b95'>نقاط پیکسل</font></B></p> " +
			
			"<p dir='rtl' align='justify'> <font color='#6503a3'>در طراحی گیم و بازی اندروید اصل مهم شناخت ابعاد صفحه نمایش در دستگاه های مختلف است . اینکه تصاویر و Bitmap بازی در کجای صفحه باید نمایش داده شوند . اصل صفحات نمایش دستگاه های اندروید این است که نقطه ی صفر و یا (0,0) در صفحه نمایش ، نقطه ی بالا و چپ صفحه نمایش میباشد . افزایش این مقادیر یعنی محور x در جهت افقی ، به طرف راست میباشد و افزایش این مقادیر یعنی محور y در جهت عمودی ، بطرف پایین میباشد . برای مثال اگر قرار است یک Bitmap در نقطه ی (10,10) تشکیل شود یعنی اینکه فاصله حاشیه ی تصویر(Bitmap) از طرف چپ صفحه نمایش برابر 10 پیکسل و فاصله حاشیه از بالای صفحه نمایش نیز برابر 10 پیکسل میباشد .</font></p>" +
			
            "<p dir='ltr' align='justify'><font color='#0414b3'> canvas.drawBitmap(BitmapName,10,10,null) </font></p> </br>" +
			
			" [inform1.png] </br> " +
			
			"<p dir='rtl' align='justify'><font color='#6503a3'>نقاط منفی در این نمودار نقاطی هستند که در سمت چپ محور y (یعنی xهای منفی) و بالای محور x (یعنی yهای منفی) قرار دارند . بعنوان مثال اگر تصویر(Bitmap) قرار است در نقطه ی(50-,50) تشکیل شود ، این تصویر را شما نخواهید دید زیرا در سمت چپ و با فاصله 50 پیکسل از صفحه نمایش تشکیل میشود . این خاصیت در بازیها زیاد استفاده میشود زیرا میتوان با آن تصاویری را که کد آنها در کنار سایر کدها اجرا میشود ولی تصاویر آنها را نمیتوان دید و این یعنی در زمانهایی تصویر مشخص شود و در زمانهایی نامرئی باشد و این یعنی جادوگری در بازی . فرق این محور مختصات با محور مختصات دکارتی در ریاضیات این است که محور yها در این مختصات برعکس میباشد . یعنی محور yها بطرف پایین افزایش می یابد و بطرف بالا کم میشود .</font></p>" +
			
			"</br><p dir='rtl' align='justify'><B><font color='#050b95'>طرح اولیه ی بازی</font></B></p> " +
			"<p dir='rtl' align='justify'><font color='#6503a3'>اولین گام قبل از کدنویسی بازی طراحی طرح اولیه ی بازی میباشد . طرحی که صرفا روی کاغذ و بشکل اولیه و بمنظور مشخص شدن متغیرها و داده ها و سایر قسمتهای بازی و همچنین مکان و ابعاد اشیاء در صفحات بازی میباشد .</font></p>" +
			
			"</br> [inform2.png]</br>" +
			
			"<p dir='rtl' align='justify'><font color='#6503a3'>استفاده از View بمنظور نمایش و اجرائیات محیط بازی باعث میشود که هم نتیجه ی عکس العملهای کاربر مثل لمس صفحه نمایش که نتیجه ی آن مثلا طراحی های محیط بازی که توسط متد ()onDraw صورت میگیرد میباشد و هم سایر فعالیتهای برنامه همه در یک Thread یعنی Thread اصلی برنامه انجام شود و این باعث کند شدن بازی و منطبق نبودن عکس العملهای کاربر با زمان بازی میشود . که این مشکل در برنامه ها و بازیهای بزرگ خود را بیشتر نشان میدهد . راه حل این مشکل استفاده از SurfaceView میباشد که نتیجه ی عکس العملهای کاربر از قبیل لمس صفحه نمایش و طراحی های زمان بازی در Thread جداگانه انجام گیرد و Thread اصلی برنامه به کارهای دیگر برنامه میپردازد .  اجرا کردن(implements) اینترفیس  SurfaceHolder.Callback به منظور دریافت اطلاعات در مورد تغییر سطح یا صفحه نمایشی میباشد . یعنی اینکه تغییر یا طراحی ایی در صفحه انجام دهیم و سپس آنرا برای همین اکتیویتی که در آن هستیم بفرستیم(callback کنیم) :</font></p>" +
			
			"<p dir='ltr'><font color='#0414b3'>public class ClassName extends SurfaceView implements  SurfaceHolder.Callback {//body class}</font></p> " +
			
			"</br><p dir='rtl' align='justify'><B><font color='#050b95'>متدهای متداول که در طراحی اغلب بازیها متدهای مهمی هستند:</font></B></p>" +
			
			"<p dir='ltr' align='justify'><font color='#0414b3'> protected void onDraw(Canvas canvas)</font></p>" +
			"<p dir='rtl' align='justify'><font color='#6503a3'> این متد طراحیهای لازم را انجام میدهد . از طراحی اشکال مختلف نظیر دایره ، مربع تا طراحی نقطه و خط و Bitmap و ... در محیط بازی و در صفحه نمایش و حتی در پشت صفحه نمایش(نقاط با ابعاد منفی) . این متد یک متد اساسی و با کارآیی زیاد است</font></p>" +
			
			"</br><p dir='ltr' align='justify'><font color='#0414b3'> public void onSizeChanged (int w, int h, int oldw, int oldh){ super.onSizeChanged(w, h, oldw, oldh)</font></p>" +
			"<p dir='rtl' align='justify'><font color='#6503a3'> این متد w و h را برابر عرض و طول صفحه  نمایش همان دستگاه برمیگرداند . استفاده از این متد باعث یکسان بودن ظاهر بازی و محل قرارگیری اشیاء بشکل یکسان در دستگاه های مختلف میشود .</font></p>" +
			
			"</br><p dir='ltr' align='justify'><font color='#0414b3'> setKeepScreenOn(true)</font></p>" +
			"<p dir='rtl' align='justify'> <font color='#6503a3'> نگهداشتن صفحه نمایش بصورت آماده به کار(روشن) و خواب نرفتن صفحه(این قابلیت در بازیها لازم است تا صفحه نمایش در زمانیکه بمدت طولانی لمس نمیشود ، بحالت خواب نرود) :</font></p>" +						
			
			"</br><p dir='ltr' align='justify'><font color='#0414b3'> requestWindowFeature(Window.FEATURE _NO_TITLE)</font></p>" +
			"<p dir='rtl' align='justify'><font color='#6503a3'> حذف کردن تیتر صفحه نمایش ، تا فضای بیشتری برای محیط بازی موجود باشد :</font></p>" +
			"</br><p dir='ltr' align='justify'><font color='#0414b3'> getWindow().setFlags(WindowManager. LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_ FULLSCREEN)</font></p>" +
			"<p dir='rtl' align='justify'><font color='#6503a3'> بعد از حذف تیتر صفحه ، لازم است با این دستور صفحه نمایش را تمام صفحه تعیین کرد تا فضایی که با حذف تیتر ایجاد شده ، به صفحه نمایش اضافه شود :</font></p>" +
			
            "</br><p dir='ltr' align='justify'><font color='#0414b3'> img=BitmapFactory.decodeResource (myContext.getResources(), R.drawable.image_name) canvas.drawBitmap(img,x,y,null)</font></p>" +
			"<p dir='rtl' align='justify'><font color='#6503a3'>جهت نمایش تصویر(Bitmap) در صفحه نمایش از دستور و متدهای زیر استفاده میشود . x و y به ترتیب فاصله ی حاشیه ی تصویر ، از سمت چپ و از بالای حاشیه ی صفحه نمایش میباشند .</font></p>" +
			
            "</br><p dir='ltr' align='justify'><font color='#0414b3'>setVolumeControlStream (AudioManager.STREAM_MUSIC)</font></P>" +
			"<p dir='rtl' align='justify'><font color='#6503a3'> توسط این متد میتوان صداهای بازی را بوسیله ی کلیدهای(سخت افزارهای) دستگاه کم یا زیاد کرد : </font></p>" +
			
			" [img1.png] " +
			
			"</body></html>";
	
	/*
	String text="نقاط پیکسل
					
					<p>در طراحی گیم و بازی اندروید اصل مهم شناخت ابعاد صفحه نمایش در دستگاه های مختلف است . اینکه تصاویر و Bitmap بازی در کجای صفحه باید نمایش داده شوند . اصل صفحات نمایش دستگاه های اندروید این است که نقطه ی صفر و یا (0,0) در صفحه نمایش ، نقطه ی بالا و چپ صفحه نمایش میباشد . افزایش این مقادیر یعنی محور x در جهت افقی ، به طرف راست میباشد و افزایش این مقادیر یعنی محور y در جهت عمودی ، بطرف پایین میباشد . برای مثال اگر قرار است یک Bitmap در نقطه ی (10,10) تشکیل شود یعنی اینکه فاصله حاشیه ی تصویر(Bitmap) از طرف چپ صفحه نمایش برابر 10 پیکسل و فاصله حاشیه از بالای صفحه نمایش نیز برابر 10 پیکسل میباشد .
	               canvas.drawBitmap(BitmapName,10,10,null)</p>                  
                   
	                												
					
					[inform1.png]	
					
					
					<p>نقاط منفی در این نمودار نقاطی هستند که در سمت چپ محور y (یعنی xهای منفی) و بالای محور x (یعنی yهای منفی) قرار دارند . بعنوان مثال اگر تصویر(Bitmap) قرار است در نقطه ی(50-,50) تشکیل شود ، این تصویر را شما نخواهید دید زیرا در سمت چپ و با فاصله 50 پیکسل از صفحه نمایش تشکیل میشود . این خاصیت در بازیها زیاد استفاده میشود زیرا میتوان با آن تصاویری را که کد آنها در کنار سایر کدها اجرا میشود ولی تصاویر آنها را نمیتوان دید و این یعنی در زمانهایی تصویر مشخص شود و در زمانهایی نامرئی باشد و این یعنی جادوگری در بازی .
					فرق این محور مختصات با محور مختصات دکارتی در ریاضیات این است که محور yها در این مختصات برعکس میباشد . یعنی محور yها بطرف پایین افزایش می یابد و بطرف بالا کم میشود .</p>
						
					
	               طرح اولیه ی بازی					
						               
	              	                
					
					<p>اولین گام قبل از کدنویسی بازی طراحی طرح اولیه ی بازی میباشد . طرحی که صرفا روی کاغذ و بشکل اولیه و بمنظور مشخص شدن متغیرها و داده ها و سایر قسمتهای بازی و همچنین مکان و ابعاد اشیاء در صفحات بازی میباشد .</p>
					
					
					
					[inform2.png]
					
					
					<p>استفاده از View بمنظور نمایش و اجرائیات محیط بازی باعث میشود که هم نتیجه ی عکس العملهای کاربر مثل لمس صفحه نمایش که نتیجه ی آن مثلا طراحی های محیط بازی که توسط متد ()onDraw صورت میگیرد میباشد و هم سایر فعالیتهای برنامه همه در یک Thread یعنی Thread اصلی برنامه انجام شود و این باعث کند شدن بازی و منطبق نبودن عکس العملهای کاربر با زمان بازی میشود . که این مشکل در برنامه ها و بازیهای بزرگ خود را بیشتر نشان میدهد . راه حل این مشکل استفاده از SurfaceView میباشد که نتیجه ی عکس العملهای کاربر از قبیل لمس صفحه نمایش و طراحی های زمان بازی در Thread جداگانه انجام گیرد و Thread اصلی برنامه به کارهای دیگر برنامه میپردازد .
					اجرا کردن(implements) اینترفیس  SurfaceHolder.Callback به منظور دریافت اطلاعات در مورد تغییر سطح یا صفحه نمایشی میباشد . یعنی اینکه تغییر یا طراحی ایی در صفحه انجام دهیم و سپس آنرا برای همین اکتیویتی که در آن هستیم بفرستیم(callback کنیم) :
					public class ClassName extends SurfaceView implements 
					SurfaceHolder.Callback {//body class}</p>
					
					

					متدهای متداول که در اغلب بازیها متدهای مهمی هستند :
					
					
					<p>protected void onDraw(Canvas canvas)				
					این متد طراحیهای لازم را انجام میدهد . از طراحی اشکال مختلف نظیر دایره ، مربع تا طراحی نقطه و خط و Bitmap و ... در محیط بازی و در صفحه نمایش و حتی در پشت صفحه نمایش(نقاط با ابعاد منفی) .</p>					
					
				

					<p>این متد یک متد اساسی و با کارآیی زیاد است
					public void onSizeChanged (int w, int h, int oldw, int oldh){
					super.onSizeChanged(w, h, oldw, oldh)
					اگر برنامه در هر دستگاهی اجرا شود ، این متد w و h را برابر عرض و طول صفحه  نمایش همان دستگاه برمیگرداند . استفاده از این متد باعث یکسان بودن ظاهر بازی و محل قرارگیری اشیاء بشکل یکسان در دستگاه های مختلف میشود .</p>
					
					

					<p>نگهداشتن صفحه نمایش بصورت آماده به کار(روشن) و خواب نرفتن صفحه(این قابلیت در بازیها لازم است تا صفحه نمایش در زمانیکه بمدت طولانی لمس نمیشود ، بحالت خواب نرود) :
					setKeepScreenOn(true);
					حذف کردن تیتر صفحه نمایش ، تا فضای بیشتری برای محیط بازی موجود باشد : requestWindowFeature(Window.FEATURE_NO_TITLE)
					بعد از حذف تیتر صفحه ، لازم است با این دستور صفحه نمایش را تمام صفحه تعیین کرد تا فضایی که با حذف تیتر ایجاد شده ، به صفحه نمایش اضافه شود : getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)</p>
					
					

					<p>جهت نمایش تصویر(Bitmap) در صفحه نمایش از دستور و متدهای زیر استفاده میشود . x و y به ترتیب فاصله ی حاشیه ی تصویر ، از سمت چپ و از بالای حاشیه ی صفحه نمایش میباشند .
					img = BitmapFactory.decodeResource(myContext.getResources(), R.drawable.image_name)
					canvas.drawBitmap(img, x, y, null)</p>
					
					

					<p>توسط این متد میتوان صداهای بازی را بوسیله ی کلیدهای(سخت افزارهای) دستگاه کم یا زیاد کرد : setVolumeControlStream(AudioManager.STREAM_MUSIC)</p>
					
					
					
                    [img2.png] ";

	               
	                
	               
		*/	
          int c1=0,c2=0,c3=0;
			
			for(int i=0;i<text.length();i++){
				
			
				if(text.charAt(i)=='['){
					c2=i;					
						ctext(text.substring(c1,c2));										
				}
				if(text.charAt(i)==']'){
					c3=i;
					cimg(text.substring(c2+1,c3));
					c1=i+1;
				}
				
				
				
			}
		
			
		
		}
	
	
		
	private void ctext(String text){
		
		WebView wv=new WebView(Season0.this);
		LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
		lp.setMargins(0, 5, 0, 5);
		wv.setPadding(10, 10, 10, 10);
		lp.gravity=Gravity.RIGHT;
		wv.loadData(text, "text/html", null);
		lls0.addView(wv,lp);
		//wv.setTextSize((float) 20);
		//wv.setTypeface(nazanin);
	}
		
		
		
		private void cimg(String name){
			
			ImageView img=new ImageView(Season0.this);
			
			LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
			lp.gravity=Gravity.CENTER;
			AssetManager am=getAssets();
			InputStream is=null;
			
			
			try {
				is=am.open("image/"+name);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			Bitmap bi=BitmapFactory.decodeStream(is);
			
			if(bi!=null){
				img.setImageBitmap(bi);
				lls0.addView(img, lp);
			}
			
		}
		
		
		

	
	
	}
	