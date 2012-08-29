package by.yakimchiks.activity;

import java.util.Calendar;
import java.util.GregorianCalendar;

import by.yakimchiks.db.TProvider;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.database.Cursor;
import android.widget.RemoteViews;

public class MainActivity extends AppWidgetProvider
{

	String[] days = {"âñ", "ïí", "âò", "ñğ", "÷ò", "ïò", "ñá"};
	private Cursor mCursor;	
	
	private static int week;
	private static int day_of_week;
	
	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] appWidgetIds){ 
		
		Calendar now = new GregorianCalendar();
		RemoteViews remoteView = new RemoteViews(context.getPackageName(), R.layout.activity_main);
		day_of_week = now.get(Calendar.DAY_OF_WEEK);
		remoteView.setTextViewText(R.id.mButtonDay, days[day_of_week]);
		week = getWeekOfMonth();
		remoteView.setTextViewText(R.id.mButtonWeek, ""+week);
		
		String sql = null;
		sql = "select SubjName, TimeOfPair.Start, TimeOfPair.Finish, TypeOfSubject.SubjType, " +
				"Audiences.Number from UnivTimetable inner join Subjects, TimeOfPair, TypeOfSubject, " +
				"Audiences on Subject_ID=Subjects.Id and Time_ID=TimeOfPair.ID and Type_ID=" +
				"TypeOfSubject.ID and Audience_ID=Audiences.ID where Week="+week+" and DayOfWeek_ID="+
				day_of_week;
		
		mCursor = TProvider.getMyQuery(sql);
		int counter = 1;
		while (mCursor.moveToNext())
	    { 
			if(counter==1){
				remoteView.setTextViewText(R.id.subject1, mCursor.getString(0));
				remoteView.setTextViewText(R.id.time1, mCursor.getString(1)+"-"+mCursor.getString(2));
				remoteView.setTextViewText(R.id.type1, mCursor.getString(3));
				remoteView.setTextViewText(R.id.audience1, mCursor.getString(4));
			}
			if(counter==2){
				remoteView.setTextViewText(R.id.subject2, mCursor.getString(0));
				remoteView.setTextViewText(R.id.time2, mCursor.getString(1)+"-"+mCursor.getString(2));
				remoteView.setTextViewText(R.id.type2, mCursor.getString(3));
				remoteView.setTextViewText(R.id.audience2, mCursor.getString(4));
			}
			if(counter==3){
				remoteView.setTextViewText(R.id.subject3, mCursor.getString(0));
				remoteView.setTextViewText(R.id.time3, mCursor.getString(1)+"-"+mCursor.getString(2));
				remoteView.setTextViewText(R.id.type3, mCursor.getString(3));
				remoteView.setTextViewText(R.id.audience3, mCursor.getString(4));
			}
			if(counter==4){
				remoteView.setTextViewText(R.id.subject4, mCursor.getString(0));
				remoteView.setTextViewText(R.id.time4, mCursor.getString(1)+"-"+mCursor.getString(2));
				remoteView.setTextViewText(R.id.type4, mCursor.getString(3));
				remoteView.setTextViewText(R.id.audience4, mCursor.getString(4));
			}
	        counter++;
	    }
		
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
}
