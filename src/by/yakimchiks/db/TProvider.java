package by.yakimchiks.db;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

public class TProvider extends ContentProvider{

	public static final String DB_TIMETABLE = "Timetable.db";
	
	public static final Uri CONTENT_URI = Uri.parse(
			"content://by.yakimchiks.db.tprovider");
	
	private static SQLiteDatabase db;
	
	private static String table;
	
	@Override
	public int delete(Uri arg0, String arg1, String[] arg2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getType(Uri arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Uri insert(Uri arg0, ContentValues arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean onCreate() {
		// TODO Auto-generated method stub
		db = new THelper(getContext(), null, null, 0).getWritableDatabase();
		return (db==null)?false:true;
	}

	@Override
	public Cursor query(Uri uri, String[] columns, String selection, String[] selectionArgs,
			String sort) {
		// TODO Auto-generated method stub
		Cursor cursor = db.query(table, columns, selection, selectionArgs, null, null, sort);
		cursor.setNotificationUri(getContext().getContentResolver(), uri);
		return cursor;
	}

	@Override
	public int update(Uri arg0, ContentValues arg1, String arg2, String[] arg3) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static Cursor getMyQuery(String sql)
	{
		Cursor result = null;
		if(db!=null)
		{
			result = db.rawQuery(sql, null);
		}
		return result;
	}

}
