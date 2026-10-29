            package com.google.android.recaptcha.internal;

            import android.content.ContentResolver;
            import android.database.Cursor;
            import android.net.Uri;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbs {
                public static final String zza(ContentResolver contentResolver) {
/* 17 */            Cursor cursorQuery = contentResolver.query(Uri.parse("content://com.google.android.gsf.gservices"), null, null, new String[]{"android_id"}, null);
/* 21 */            String strValueOf = HttpUrl.FRAGMENT_ENCODE_SET;
/* 23 */            if (cursorQuery != null && cursorQuery.moveToFirst() && cursorQuery.getColumnCount() >= 2) {
                        try {
/* 48 */                    strValueOf = String.valueOf(Long.parseLong(cursorQuery.getString(1)));
                        } catch (Exception unused) {
                        }
/* 52 */                cursorQuery.close();
                    }
/* 55 */            return strValueOf;
                }
            }
