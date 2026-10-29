            package p000;

            import android.content.Context;
            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteOpenHelper;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class at0 extends SQLiteOpenHelper {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2089a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ at0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, int i2) {
/* 3 */             super(context, str, cursorFactory, i);
/* 1 */             this.f2089a = i2;
                }

                /* JADX INFO: renamed from: c */
                private final void m1163c(SQLiteDatabase sQLiteDatabase) {
                }

                /* JADX INFO: renamed from: f */
                private final void m1164f(SQLiteDatabase sQLiteDatabase) {
                }

                /* JADX INFO: renamed from: g */
                private final void m1165g(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                }

                /* JADX INFO: renamed from: h */
                private final void m1166h(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onCreate(SQLiteDatabase sQLiteDatabase) {
/* 1 */             int i = this.f2089a;
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
/* 1 */             int i3 = this.f2089a;
                }
            }
