            package com.google.android.gms.internal.measurement;

            import android.content.Context;
            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteOpenHelper;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzby extends SQLiteOpenHelper {
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzby(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
/* 17 */            super(context, true == str.equals(HttpUrl.FRAGMENT_ENCODE_SET) ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
/* 1 */             int i2 = zzca.zzb;
/* 3 */             zzbv.zza();
                }
            }
