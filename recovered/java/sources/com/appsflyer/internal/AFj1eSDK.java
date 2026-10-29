            package com.appsflyer.internal;

            import android.database.Cursor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFj1eSDK {
                /* JADX INFO: renamed from: P_ */
                public static final String m1824P_(Cursor cursor, String str) {
/* 1 */             cursor.getClass();
/* 4 */             str.getClass();
/* 7 */             int columnIndex = cursor.getColumnIndex(str);
/* 12 */            if (columnIndex != -1) {
/* 14 */                return cursor.getString(columnIndex);
                    }
/* 19 */            return null;
                }
            }
