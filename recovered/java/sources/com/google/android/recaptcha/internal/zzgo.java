            package com.google.android.recaptcha.internal;

            import android.content.Context;
            import android.database.Cursor;
            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteOpenHelper;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.collections.C1839a;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.nd0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgo extends SQLiteOpenHelper {
                public static final zzgn zza = new zzgn(null);
                private static final int zzb = zzgn.zzc("18.7.1");
                private static final String zzc = zzgn.zzd("18.7.1");
                private static zzgo zzd;

                public /* synthetic */ zzgo(Context context, DefaultConstructorMarker defaultConstructorMarker) {
/* 6 */             super(context, zzc, (SQLiteDatabase.CursorFactory) null, zzb);
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onCreate(SQLiteDatabase sQLiteDatabase) {
/* 3 */             sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
/* 3 */             sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
/* 8 */             sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
/* 3 */             sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
/* 8 */             sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
                }

                public final int zza(List list) {
/* 5 */             if (list.isEmpty()) {
/* 7 */                 return 0;
                    }
/* 40 */            return getWritableDatabase().delete("ce", "id IN ".concat(CollectionsKt.m6203x(list, ", ", "(", ")", new Function1() { // from class: com.google.android.recaptcha.internal.zzgm
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
/* 3 */                     zzgn zzgnVar = zzgo.zza;
/* 9 */                     return String.valueOf(((zzgp) obj).zza());
                        }
                    }, 24)), null);
                }

                public final int zzb() {
/* 8 */             Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM ce", null);
/* 12 */            int i = -1;
                    try {
/* 17 */                if (cursorRawQuery.moveToNext()) {
/* 20 */                    i = cursorRawQuery.getInt(0);
                        }
                    } catch (Exception unused) {
                    } finally {
/* 26 */                cursorRawQuery.close();
                    }
/* 33 */            return i;
                }

                public final List zzd() {
/* 14 */            Cursor cursorQuery = getReadableDatabase().query("ce", null, null, null, null, null, "ts ASC");
/* 20 */            List arrayList = new ArrayList();
/* 27 */            while (cursorQuery.moveToNext()) {
                        try {
                            try {
/* 35 */                        int i = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("id"));
/* 45 */                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("ss"));
/* 55 */                        long j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("ts"));
/* 61 */                        string.getClass();
/* 67 */                        arrayList.add(new zzgp(string, j, i));
                            } catch (Exception unused) {
/* 73 */                        arrayList = nd0.f14189a;
                            }
                        } catch (Throwable th) {
/* 79 */                    cursorQuery.close();
/* 82 */                    throw th;
                        }
                    }
/* 75 */            cursorQuery.close();
/* 78 */            return arrayList;
                }

                public final boolean zzf(zzgp zzgpVar) {
                    return zza(C1839a.m6210b(zzgpVar)) == 1;
                }
            }
