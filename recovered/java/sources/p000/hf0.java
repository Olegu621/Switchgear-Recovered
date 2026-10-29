            package p000;

            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteOpenHelper;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hf0 extends SQLiteOpenHelper {

                /* JADX INFO: renamed from: a */
                public static final zb0 f9052a = new zb0(6);

                /* JADX INFO: renamed from: b */
                public static final HashMap f9053b = new HashMap();

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onCreate(SQLiteDatabase sQLiteDatabase) {
/* 1 */             sQLiteDatabase.getClass();
/* 6 */             sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS 'events' (id INTEGER PRIMARY KEY, eventData BLOB, dateCreated TIMESTAMP DEFAULT CURRENT_TIMESTAMP)");
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
/* 1 */             sQLiteDatabase.getClass();
/* 11 */            k50.m5968e("hf0", "Upgrade not implemented, resetting database...", new Object[0]);
/* 16 */            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'events'");
/* 21 */            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS 'events' (id INTEGER PRIMARY KEY, eventData BLOB, dateCreated TIMESTAMP DEFAULT CURRENT_TIMESTAMP)");
                }
            }
