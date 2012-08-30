package by.yakimchiks.activity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import by.yakimchiks.db.TProvider;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.widget.RemoteViews;
import android.widget.Toast;

public class MainActivity extends AppWidgetProvider
{

	String[] days = {"вс", "пн", "вт", "ср", "чт", "пт", "сб"};
	private Cursor mCursor;	
	
	public static String ACTION_WIDGET_RECEIVER = "ActionReceiverWidget";
	
	private static int week;
	private static int day_of_week;
	
	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] appWidgetIds){ 
		
		Calendar now = new GregorianCalendar();
		RemoteViews remoteView = new RemoteViews(context.getPackageName(), R.layout.activity_main);
		day_of_week = now.get(Calendar.DAY_OF_WEEK)-1;
		remoteView.setTextViewText(R.id.mButtonDay, days[day_of_week]);
		week = getWeekOfMonth();
		remoteView.setTextViewText(R.id.mButtonWeek, ""+week);
		
		String sql = null;
		sql = "select SubjName, TimeOfPair.Start, TimeOfPair.Finish, TypeOfSubject.SubjType, " +
				"Audiences.Number from UnivTimetable inner join Subjects, TimeOfPair, TypeOfSubject, " +
				"Audiences on Subject_ID=Subjects.Id and Time_ID=TimeOfPair.ID and Type_ID=" +
				"TypeOfSubject.ID and Audience_ID=Audiences.ID where Week="+week+" and DayOfWeek_ID="+
				day_of_week+" ORDER BY Start";
		
		mCursor = TProvider.getMyQuery(sql);
		int counter = 1;
		Calendar start = Calendar.getInstance();
		Calendar finish = Calendar.getInstance();
		while (mCursor.moveToNext())
	    { 
			if(counter==1){
				remoteView.setTextViewText(R.id.subject1, mCursor.getString(0));
				remoteView.setTextViewText(R.id.time1, mCursor.getString(1)+"-"+mCursor.getString(2));
				remoteView.setTextViewText(R.id.type1, mCursor.getString(3));
				remoteView.setTextViewText(R.id.audience1, mCursor.getString(4));
				
				remoteView.setTextColor(R.id.subject1, Color.rgb(169, 169, 169));
				remoteView.setTextColor(R.id.time1, Color.rgb(255, 140, 0));
				remoteView.setTextColor(R.id.type1, Color.rgb(255, 140, 0));
				remoteView.setTextColor(R.id.audience1, Color.rgb(169, 169, 169));
				
				SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
				Date s_date = null;
				Date f_date = null;
				try {
					s_date = formatter.parse(mCursor.getString(1)+":00");
					f_date = formatter.parse(mCursor.getString(2)+":00");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				start.setTime(s_date);
				finish.setTime(f_date);
				if(start.get(Calendar.HOUR_OF_DAY)<now.get(Calendar.HOUR_OF_DAY) && 
						finish.get(Calendar.HOUR_OF_DAY)>now.get(Calendar.HOUR_OF_DAY)){
					remoteView.setTextColor(R.id.subject1, Color.WHITE);
					remoteView.setTextColor(R.id.time1, Color.GREEN);
					remoteView.setTextColor(R.id.type1, Color.GREEN);
					remoteView.setTextColor(R.id.audience1, Color.WHITE);
				}
			}
			if(counter==2){
				remoteView.setTextViewText(R.id.subject2, mCursor.getString(0));
				remoteView.setTextViewText(R.id.time2, mCursor.getString(1)+"-"+mCursor.getString(2));
				remoteView.setTextViewText(R.id.type2, mCursor.getString(3));
				remoteView.setTextViewText(R.id.audience2, mCursor.getString(4));
				
				remoteView.setTextColor(R.id.subject2, Color.rgb(169, 169, 169));
				remoteView.setTextColor(R.id.time2, Color.rgb(255, 140, 0));
				remoteView.setTextColor(R.id.type2, Color.rgb(255, 140, 0));
				remoteView.setTextColor(R.id.audience2, Color.rgb(169, 169, 169));
				
				SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
				Date s_date = null;
				Date f_date = null;
				try {
					s_date = formatter.parse(mCursor.getString(1)+":00");
					f_date = formatter.parse(mCursor.getString(2)+":00");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				start.setTime(s_date);
				finish.setTime(f_date);
				if(start.get(Calendar.HOUR_OF_DAY)<now.get(Calendar.HOUR_OF_DAY) && 
						finish.get(Calendar.HOUR_OF_DAY)>now.get(Calendar.HOUR_OF_DAY)){
					remoteView.setTextColor(R.id.subject2, Color.WHITE);
					remoteView.setTextColor(R.id.time2, Color.GREEN);
					remoteView.setTextColor(R.id.type2, Color.GREEN);
					remoteView.setTextColor(R.id.audience2, Color.WHITE);
				}
			}
			if(counter==3){
				remoteView.setTextViewText(R.id.subject3, mCursor.getString(0));
				remoteView.setTextViewText(R.id.time3, mCursor.getString(1)+"-"+mCursor.getString(2));
				remoteView.setTextViewText(R.id.type3, mCursor.getString(3));
				remoteView.setTextViewText(R.id.audience3, mCursor.getString(4));
				
				remoteView.setTextColor(R.id.subject3, Color.rgb(169, 169, 169));
				remoteView.setTextColor(R.id.time3, Color.rgb(255, 140, 0));
				remoteView.setTextColor(R.id.type3, Color.rgb(255, 140, 0));
				remoteView.setTextColor(R.id.audience3, Color.rgb(169, 169, 169));
				
				SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
				Date s_date = null;
				Date f_date = null;
				try {
					s_date = formatter.parse(mCursor.getString(1)+":00");
					f_date = formatter.parse(mCursor.getString(2)+":00");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				start.setTime(s_date);
				finish.setTime(f_date);
				if(start.get(Calendar.HOUR_OF_DAY)<now.get(Calendar.HOUR_OF_DAY) && 
						finish.get(Calendar.HOUR_OF_DAY)>now.get(Calendar.HOUR_OF_DAY)){
					remoteView.setTextColor(R.id.subject3, Color.WHITE);
					remoteView.setTextColor(R.id.time3, Color.GREEN);
					remoteView.setTextColor(R.id.type3, Color.GREEN);
					remoteView.setTextColor(R.id.audience3, Color.WHITE);
				}
			}
			if(counter==4){
				remoteView.setTextViewText(R.id.subject4, mCursor.getString(0));
				remoteView.setTextViewText(R.id.time4, mCursor.getString(1)+"-"+mCursor.getString(2));
				remoteView.setTextViewText(R.id.type4, mCursor.getString(3));
				remoteView.setTextViewText(R.id.audience4, mCursor.getString(4));
				
				remoteView.setTextColor(R.id.subject4, Color.rgb(169, 169, 169));
				remoteView.setTextColor(R.id.time4, Color.rgb(255, 140, 0));
				remoteView.setTextColor(R.id.type4, Color.rgb(255, 140, 0));
				remoteView.setTextColor(R.id.audience4, Color.rgb(169, 169, 169));
				
				SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
				Date s_date = null;
				Date f_date = null;
				try {
					s_date = formatter.parse(mCursor.getString(1)+":00");
					f_date = formatter.parse(mCursor.getString(2)+":00");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				start.setTime(s_date);
				finish.setTime(f_date);
				if(start.get(Calendar.HOUR_OF_DAY)<now.get(Calendar.HOUR_OF_DAY) && 
						finish.get(Calendar.HOUR_OF_DAY)>now.get(Calendar.HOUR_OF_DAY)){
					remoteView.setTextColor(R.id.subject4, Color.WHITE);
					remoteView.setTextColor(R.id.time4, Color.GREEN);
					remoteView.setTextColor(R.id.type4, Color.GREEN);
					remoteView.setTextColor(R.id.audience4, Color.WHITE);
				}
			}
	        counter++;
	    }
		
		Intent active = new Intent(context, MainActivity.class);
        active.setAction(ACTION_WIDGET_RECEIVER);
        
        PendingIntent actionPendingIntent = PendingIntent.getBroadcast(context, 0, active, 0);        
        remoteView.setOnClickPendingIntent(R.id.update, actionPendingIntent);
        
        appWidgetManager.updateAppWidget(appWidgetIds, remoteView);
	}
	
	
	
	private int getWeekOfMonth(){
		Calendar now = new GregorianCalendar();
		int w = 35-now.get(Calendar.WEEK_OF_YEAR)+1;
		while(w>4){
			w-=4;
		}
		return w;
	}
	
	@Override
	public void onReceive(Context context, Intent intent){
		
		final String action = intent.getAction();
        if (ACTION_WIDGET_RECEIVER.equals(action)) {
             String msg = "\t\t\t\tОбновлено!\nТекущая пара будет выделена.";
             Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
        } 
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        ComponentName thisAppWidget = new ComponentName(context.getPackageName(), MainActivity.class.getName());
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(thisAppWidget);
        onUpdate(context, appWidgetManager, appWidgetIds);
        super.onReceive(context, intent);
		
	}
}
