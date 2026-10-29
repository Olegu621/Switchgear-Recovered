            package com.pichillilorenzo.flutter_inappwebview_android.credential_database;

            import android.content.ContentValues;
            import android.database.Cursor;
            import com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential;
            import java.util.ArrayList;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class URLCredentialDao {
                CredentialDatabaseHelper credentialDatabaseHelper;
                String[] projection = {"_id", URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME, URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, URLCredentialContract.FeedEntry.COLUMN_NAME_PROTECTION_SPACE_ID};

                public URLCredentialDao(CredentialDatabaseHelper credentialDatabaseHelper) {
/* 18 */            this.credentialDatabaseHelper = credentialDatabaseHelper;
                }

                public long delete(URLCredential uRLCredential) {
/* 27 */            return this.credentialDatabaseHelper.getWritableDatabase().delete(URLCredentialContract.FeedEntry.TABLE_NAME, "_id = ?", new String[]{uRLCredential.getId().toString()});
                }

                public URLCredential find(String str, String str2, Long l) {
/* 24 */            Cursor cursorQuery = this.credentialDatabaseHelper.getReadableDatabase().query(URLCredentialContract.FeedEntry.TABLE_NAME, this.projection, "username = ? AND password = ? AND protection_space_id = ?", new String[]{str, str2, l.toString()}, null, null, null);
/* 74 */            URLCredential uRLCredential = cursorQuery.moveToNext() ? new URLCredential(Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id"))), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME)), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD)), l) : null;
/* 75 */            cursorQuery.close();
/* 78 */            return uRLCredential;
                }

                public List<URLCredential> getAllByProtectionSpaceId(Long l) {
/* 24 */            Cursor cursorQuery = this.credentialDatabaseHelper.getReadableDatabase().query(URLCredentialContract.FeedEntry.TABLE_NAME, this.projection, "protection_space_id = ?", new String[]{l.toString()}, null, null, null);
/* 30 */            ArrayList arrayList = new ArrayList();
/* 37 */            while (cursorQuery.moveToNext()) {
/* 78 */                arrayList.add(new URLCredential(Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id"))), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME)), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD)), l));
                    }
/* 82 */            cursorQuery.close();
/* 85 */            return arrayList;
                }

                public long insert(URLCredential uRLCredential) {
/* 3 */             ContentValues contentValues = new ContentValues();
/* 12 */            contentValues.put(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME, uRLCredential.getUsername());
/* 21 */            contentValues.put(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, uRLCredential.getPassword());
/* 30 */            contentValues.put(URLCredentialContract.FeedEntry.COLUMN_NAME_PROTECTION_SPACE_ID, uRLCredential.getProtectionSpaceId());
/* 42 */            return this.credentialDatabaseHelper.getWritableDatabase().insert(URLCredentialContract.FeedEntry.TABLE_NAME, null, contentValues);
                }

                public long update(URLCredential uRLCredential) {
/* 3 */             ContentValues contentValues = new ContentValues();
/* 12 */            contentValues.put(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME, uRLCredential.getUsername());
/* 21 */            contentValues.put(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, uRLCredential.getPassword());
/* 50 */            return this.credentialDatabaseHelper.getWritableDatabase().update(URLCredentialContract.FeedEntry.TABLE_NAME, contentValues, "protection_space_id = ?", new String[]{uRLCredential.getProtectionSpaceId().toString()});
                }
            }
