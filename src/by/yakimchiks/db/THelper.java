package by.yakimchiks.db;

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
		db.execSQL("CREATE TABLE Subjects (ID INTEGER PRIMARY KEY, SubjName TEXT);");
		db.execSQL("CREATE TABLE TimeOfPair (ConsecutiveNumber INTEGER, Finish TIME, ID INTEGER PRIMARY KEY, Start TIME);");
		db.execSQL("CREATE TABLE TypeOfSubject (ID INTEGER PRIMARY KEY, SubjType TEXT);");
		db.execSQL("CREATE TABLE UnivTimetable (ID INTEGER PRIMARY KEY, Time_ID INTEGER, Subject_ID INTEGER, Audience_ID INTEGER, Type_ID INTEGER);");
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
