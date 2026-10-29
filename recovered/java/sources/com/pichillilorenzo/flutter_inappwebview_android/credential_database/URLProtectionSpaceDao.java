            package com.pichillilorenzo.flutter_inappwebview_android.credential_database;

            import android.content.ContentValues;
            import android.database.Cursor;
            import com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace;
            import java.util.ArrayList;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class URLProtectionSpaceDao {
                CredentialDatabaseHelper credentialDatabaseHelper;
                String[] projection = {"_id", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT};

                public URLProtectionSpaceDao(CredentialDatabaseHelper credentialDatabaseHelper) {
/* 20 */            this.credentialDatabaseHelper = credentialDatabaseHelper;
                }

                public long delete(URLProtectionSpace uRLProtectionSpace) {
/* 27 */            return this.credentialDatabaseHelper.getWritableDatabase().delete(URLProtectionSpaceContract.FeedEntry.TABLE_NAME, "_id = ?", new String[]{uRLProtectionSpace.getId().toString()});
                }

                public URLProtectionSpace find(String str, String str2, String str3, Integer num) {
/* 24 */            Cursor cursorQuery = this.credentialDatabaseHelper.getReadableDatabase().query(URLProtectionSpaceContract.FeedEntry.TABLE_NAME, this.projection, "host = ? AND protocol = ? AND realm = ? AND port = ?", new String[]{str, str2, str3, num.toString()}, null, null, null);
/* 94 */            URLProtectionSpace uRLProtectionSpace = cursorQuery.moveToNext() ? new URLProtectionSpace(Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id"))), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST)), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL)), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM)), cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT))) : null;
/* 95 */            cursorQuery.close();
/* 98 */            return uRLProtectionSpace;
                }

                public List<URLProtectionSpace> getAll() {
/* 16 */            Cursor cursorQuery = this.credentialDatabaseHelper.getReadableDatabase().query(URLProtectionSpaceContract.FeedEntry.TABLE_NAME, this.projection, null, null, null, null, null);
/* 22 */            ArrayList arrayList = new ArrayList();
/* 29 */            while (cursorQuery.moveToNext()) {
/* 90 */                arrayList.add(new URLProtectionSpace(Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id"))), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST)), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL)), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM)), cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT))));
                    }
/* 94 */            cursorQuery.close();
/* 97 */            return arrayList;
                }

                public long insert(URLProtectionSpace uRLProtectionSpace) {
/* 3 */             ContentValues contentValues = new ContentValues();
/* 12 */            contentValues.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, uRLProtectionSpace.getHost());
/* 21 */            contentValues.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, uRLProtectionSpace.getProtocol());
/* 30 */            contentValues.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM, uRLProtectionSpace.getRealm());
/* 43 */            contentValues.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT, Integer.valueOf(uRLProtectionSpace.getPort()));
/* 55 */            return this.credentialDatabaseHelper.getWritableDatabase().insert(URLProtectionSpaceContract.FeedEntry.TABLE_NAME, null, contentValues);
                }
            }
