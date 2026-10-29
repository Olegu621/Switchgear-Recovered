            package p000;

            import android.database.Cursor;
            import android.database.sqlite.SQLiteDatabase;
            import java.util.ArrayList;
            import java.util.HashMap;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class ty2 implements bk2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17304a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ s52 f17305b;

                public /* synthetic */ ty2(s52 s52Var, int i) {
/* 1 */             this.f17304a = i;
/* 3 */             this.f17305b = s52Var;
                }

                @Override // p000.bk2
                public final Object execute() {
/* 1 */             int i = this.f17304a;
/* 4 */             s52 s52Var = this.f17305b;
                    switch (i) {
                        case 0:
/* 96 */                    s52Var.getClass();
/* 99 */                    int i2 = C2232tv.f17276e;
/* 103 */                   ra2 ra2Var = new ra2();
/* 107 */                   ra2Var.f15956b = null;
/* 114 */                   ra2Var.f15957c = new ArrayList();
/* 116 */                   ra2Var.f15958d = null;
/* 120 */                   ra2Var.f15955a = HttpUrl.FRAGMENT_ENCODE_SET;
/* 124 */                   HashMap map = new HashMap();
/* 129 */                   SQLiteDatabase sQLiteDatabaseM8404c = s52Var.m8404c();
/* 133 */                   sQLiteDatabaseM8404c.beginTransaction();
                            try {
/* 152 */                       C2232tv c2232tv = (C2232tv) s52.m8403m(sQLiteDatabaseM8404c.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C2080pr(6, s52Var, map, ra2Var));
/* 154 */                       sQLiteDatabaseM8404c.setTransactionSuccessful();
/* 160 */                       return c2232tv;
                            } finally {
/* 162 */                       sQLiteDatabaseM8404c.endTransaction();
                            }
                        default:
/* 19 */                    long jMo7340a = s52Var.f16432b.mo7340a() - s52Var.f16434d.f16557d;
/* 20 */                    SQLiteDatabase sQLiteDatabaseM8404c2 = s52Var.m8404c();
/* 24 */                    sQLiteDatabaseM8404c2.beginTransaction();
                            try {
/* 33 */                        String[] strArr = {String.valueOf(jMo7340a)};
/* 37 */                        Cursor cursorRawQuery = sQLiteDatabaseM8404c2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
/* 45 */                        while (cursorRawQuery.moveToNext()) {
                                    try {
/* 59 */                                s52Var.m8407i(cursorRawQuery.getInt(0), ca1.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                                    } catch (Throwable th) {
/* 88 */                                cursorRawQuery.close();
/* 91 */                                throw th;
                                    }
                                }
/* 63 */                        cursorRawQuery.close();
/* 70 */                        int iDelete = sQLiteDatabaseM8404c2.delete("events", "timestamp_ms < ?", strArr);
/* 74 */                        sQLiteDatabaseM8404c2.setTransactionSuccessful();
/* 77 */                        sQLiteDatabaseM8404c2.endTransaction();
/* 80 */                        return Integer.valueOf(iDelete);
                            } catch (Throwable th2) {
/* 92 */                        sQLiteDatabaseM8404c2.endTransaction();
/* 95 */                        throw th2;
                            }
                    }
                }
            }
