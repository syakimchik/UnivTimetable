package by.yakimchiks.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

public class THelper extends SQLiteOpenHelper implements BaseColumns{

	public THelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, TProvider.DB_TIMETABLE, null, 1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL("CREATE TABLE Audiences (ID INTEGER PRIMARY KEY, Number TEXT);");
		
		ContentValues audienceValues = new ContentValues();
		
		audienceValues.put("Number", "605-2");
		db.insert("Audiences", "Number", audienceValues);
		
		audienceValues.put("Number", "211-3");
		db.insert("Audiences", "Number", audienceValues);
		
		audienceValues.put("Number", "612¿-5");
		db.insert("Audiences", "Number", audienceValues);
		
		audienceValues.put("Number", "612-5");
		db.insert("Audiences", "Number", audienceValues);
		
		audienceValues.put("Number", "106-4");
		db.insert("Audiences", "Number", audienceValues);
		
		audienceValues.put("Number", "607-5");
		db.insert("Audiences", "Number", audienceValues);
		
		audienceValues.put("Number", "318-5");
		db.insert("Audiences", "Number", audienceValues);
		
		audienceValues.put("Number", "207¡-5");
		db.insert("Audiences", "Number", audienceValues);
		
		audienceValues.put("Number", "514-4");
		db.insert("Audiences", "Number", audienceValues);
		
		audienceValues.put("Number", "209-4");
		db.insert("Audiences", "Number", audienceValues);
		
		audienceValues.put("Number", "310‡-4");
		db.insert("Audiences", "Number", audienceValues);
		
		audienceValues.put("Number", "206-3");
		db.insert("Audiences", "Number", audienceValues);
		
		audienceValues.put("Number", "114-3");
		db.insert("Audiences", "Number", audienceValues);
		
		audienceValues.put("Number", "3Í");
		db.insert("Audiences", "Number", audienceValues);
		
		db.execSQL("CREATE TABLE Subjects (ID INTEGER PRIMARY KEY, SubjName TEXT);");
		
		ContentValues subjectValues = new ContentValues();
		
		subjectValues.put("SubjName", "«ÕËŒÓÚ◊—.–¡");
		db.insert("Subjects", "SubjName", subjectValues);
		
		subjectValues.put("SubjName", "‘ -«Œ∆ —œ»ƒËÕ");
		db.insert("Subjects", "SubjName", subjectValues);
		
		subjectValues.put("SubjName", "√»»—");
		db.insert("Subjects", "SubjName", subjectValues);
		
		subjectValues.put("SubjName", "ÀŒ»—");
		db.insert("Subjects", "SubjName", subjectValues);
		
		subjectValues.put("SubjName", "Œ·»");
		db.insert("Subjects", "SubjName", subjectValues);
		
		subjectValues.put("SubjName", "›œ");
		db.insert("Subjects", "SubjName", subjectValues);
		
		subjectValues.put("SubjName", "Œ»¡√");
		db.insert("Subjects", "SubjName", subjectValues);
		
		subjectValues.put("SubjName", "≈ﬂ»»—");
		db.insert("Subjects", "SubjName", subjectValues);
		
		subjectValues.put("SubjName", "œ¡«");
		db.insert("Subjects", "SubjName", subjectValues);
		
		subjectValues.put("SubjName", "¬ÓÂÌÍ‡");
		db.insert("Subjects", "SubjName", subjectValues);
		
		
		db.execSQL("CREATE TABLE TimeOfPair (ConsecutiveNumber INTEGER, Finish TIME, ID INTEGER " +
				"PRIMARY KEY, Start TIME);");
		
		ContentValues timeValues = new ContentValues();
		
		timeValues.put("Start", "08:00");
		timeValues.put("Finish", "09:35");
		timeValues.put("ConsecutiveNumber", "1");
		db.insert("TimeOfPair", "ConsecutiveNumber", timeValues);
		
		timeValues.put("Start", "09:45");
		timeValues.put("Finish", "11:20");
		timeValues.put("ConsecutiveNumber", "2");
		db.insert("TimeOfPair", "ConsecutiveNumber", timeValues);
		
		timeValues.put("Start", "11:40");
		timeValues.put("Finish", "13:15");
		timeValues.put("ConsecutiveNumber", "3");
		db.insert("TimeOfPair", "ConsecutiveNumber", timeValues);
		
		timeValues.put("Start", "13:25");
		timeValues.put("Finish", "15:00");
		timeValues.put("ConsecutiveNumber", "4");
		db.insert("TimeOfPair", "ConsecutiveNumber", timeValues);
		
		timeValues.put("Start", "15:20");
		timeValues.put("Finish", "16:55");
		timeValues.put("ConsecutiveNumber", "5");
		db.insert("TimeOfPair", "ConsecutiveNumber", timeValues);
		
		timeValues.put("Start", "17:05");
		timeValues.put("Finish", "18:45");
		timeValues.put("ConsecutiveNumber", "6");
		db.insert("TimeOfPair", "ConsecutiveNumber", timeValues);
		
		
		db.execSQL("CREATE TABLE TypeOfSubject (ID INTEGER PRIMARY KEY, SubjType TEXT);");
		
		ContentValues typeValues = new ContentValues();
		
		typeValues.put("SubjType", "Î");
		db.insert("TypeOfSubject", "SubjType", typeValues);
		
		typeValues.put("SubjType", "ÎÍ");
		db.insert("TypeOfSubject", "SubjType", typeValues);
		
		typeValues.put("SubjType", "ÔÁ");
		db.insert("TypeOfSubject", "SubjType", typeValues);
		
		typeValues.put("SubjType", "ÍÔ");
		db.insert("TypeOfSubject", "SubjType", typeValues);
		
		typeValues.put("SubjType", "‚");
		db.insert("TypeOfSubject", "SubjType", typeValues);
		
		db.execSQL("CREATE TABLE DayOfWeek (ID INTEGER PRIMARY KEY, Day TEXT);");
		
		ContentValues dayValues = new ContentValues();
		
		dayValues.put("Day", "ÔÌ");
		db.insert("DayOfWeek", "Day", dayValues);
		
		dayValues.put("Day", "‚Ú");
		db.insert("DayOfWeek", "Day", dayValues);
		
		dayValues.put("Day", "Ò");
		db.insert("DayOfWeek", "Day", dayValues);
		
		dayValues.put("Day", "˜Ú");
		db.insert("DayOfWeek", "Day", dayValues);
		
		dayValues.put("Day", "ÔÚ");
		db.insert("DayOfWeek", "Day", dayValues);
		
		dayValues.put("Day", "Ò·");
		db.insert("DayOfWeek", "Day", dayValues);
		
		db.execSQL("CREATE TABLE UnivTimetable (ID INTEGER PRIMARY KEY, Time_ID INTEGER, " +
				"Subject_ID INTEGER, Audience_ID INTEGER, Type_ID INTEGER, PairInDay INTEGER, " +
				"Week INTEGER, DayOfWeek_ID INTEGER);");
		
		ContentValues allValues = new ContentValues();
		
		allValues.put("Time_ID", "1");
		allValues.put("Subject_ID", "10");
		allValues.put("Audience_ID", "14");
		allValues.put("Type_ID", "5");
		allValues.put("PairInDay", "1");
		allValues.put("Week", "1");
		allValues.put("DayOfWeek_ID", "4");
		db.insert("UnivTimetable", null, allValues);
		
		allValues.put("Time_ID", "2");
		allValues.put("Subject_ID", "10");
		allValues.put("Audience_ID", "14");
		allValues.put("Type_ID", "5");
		allValues.put("PairInDay", "2");
		allValues.put("Week", "1");
		allValues.put("DayOfWeek_ID", "4");
		db.insert("UnivTimetable", null, allValues);
		
		allValues.put("Time_ID", "3");
		allValues.put("Subject_ID", "10");
		allValues.put("Audience_ID", "14");
		allValues.put("Type_ID", "5");
		allValues.put("PairInDay", "3");
		allValues.put("Week", "1");
		allValues.put("DayOfWeek_ID", "4");
		db.insert("UnivTimetable", null, allValues);
		
		allValues.put("Time_ID", "4");
		allValues.put("Subject_ID", "10");
		allValues.put("Audience_ID", "14");
		allValues.put("Type_ID", "5");
		allValues.put("PairInDay", "4");
		allValues.put("Week", "1");
		allValues.put("DayOfWeek_ID", "4");
		db.insert("UnivTimetable", null, allValues);
	} 

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF NOT EXISTS Audiences");
		db.execSQL("DROP TABLE IF NOT EXISTS Subjects");
		db.execSQL("DROP TABLE IF NOT EXISTS TimeOfPair");
		db.execSQL("DROP TABLE IF NOT EXISTS TypeOfSubject");
		db.execSQL("DROP TABLE IF NOT EXISTS UnivTimetable");
		onCreate(db);
	}

	
}
