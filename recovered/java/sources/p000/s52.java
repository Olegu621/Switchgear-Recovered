            package p000;

            import android.database.Cursor;
            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteDatabaseLockedException;
            import android.os.SystemClock;
            import android.util.Base64;
            import java.io.Closeable;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.Objects;
            import javax.inject.Provider;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class s52 implements Closeable {

                /* JADX INFO: renamed from: f */
                public static final vd0 f16430f = new vd0("proto");

                /* JADX INFO: renamed from: a */
                public final k72 f16431a;

                /* JADX INFO: renamed from: b */
                public final InterfaceC2512yv f16432b;

                /* JADX INFO: renamed from: c */
                public final InterfaceC2512yv f16433c;

                /* JADX INFO: renamed from: d */
                public final C2179sf f16434d;

                /* JADX INFO: renamed from: e */
                public final Provider f16435e;

                public s52(InterfaceC2512yv interfaceC2512yv, InterfaceC2512yv interfaceC2512yv2, C2179sf c2179sf, k72 k72Var, Provider provider) {
/* 4 */             this.f16431a = k72Var;
/* 6 */             this.f16432b = interfaceC2512yv;
/* 8 */             this.f16433c = interfaceC2512yv2;
/* 10 */            this.f16434d = c2179sf;
/* 12 */            this.f16435e = provider;
                }

                /* JADX INFO: renamed from: f */
                public static Long m8401f(SQLiteDatabase sQLiteDatabase, C2497yg c2497yg) {
/* 5 */             StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
/* 30 */            ArrayList arrayList = new ArrayList(Arrays.asList(c2497yg.f19600a, String.valueOf(rx1.m8316a(c2497yg.f19602c))));
/* 33 */            byte[] bArr = c2497yg.f19601b;
/* 36 */            if (bArr != null) {
/* 40 */                sb.append(" and extras = ?");
/* 47 */                arrayList.add(Base64.encodeToString(bArr, 0));
                    } else {
/* 53 */                sb.append(" and extras is null");
                    }
/* 81 */            Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
                    try {
/* 97 */                return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
                    } finally {
/* 107 */               cursorQuery.close();
                    }
                }

                /* JADX INFO: renamed from: l */
                public static String m8402l(Iterable iterable) {
/* 5 */             StringBuilder sb = new StringBuilder("(");
/* 8 */             Iterator it = iterable.iterator();
/* 16 */            while (it.hasNext()) {
/* 26 */                sb.append(((C0990hg) it.next()).f9063a);
/* 33 */                if (it.hasNext()) {
/* 37 */                    sb.append(',');
                        }
                    }
/* 43 */            sb.append(')');
/* 46 */            return sb.toString();
                }

                /* JADX INFO: renamed from: m */
                public static Object m8403m(Cursor cursor, q52 q52Var) {
                    try {
/* 1 */                 return q52Var.apply(cursor);
                    } finally {
/* 10 */                cursor.close();
                    }
                }

                /* JADX INFO: renamed from: c */
                public final SQLiteDatabase m8404c() {
/* 1 */             k72 k72Var = this.f16431a;
/* 3 */             Objects.requireNonNull(k72Var);
/* 6 */             InterfaceC2512yv interfaceC2512yv = this.f16433c;
/* 8 */             long jMo7340a = interfaceC2512yv.mo7340a();
                    while (true) {
                        try {
/* 12 */                    return k72Var.getWritableDatabase();
                        } catch (SQLiteDatabaseLockedException e) {
/* 30 */                    if (interfaceC2512yv.mo7340a() >= ((long) this.f16434d.f16556c) + jMo7340a) {
/* 45 */                        throw new ak2("Timed out while trying to open db.", e);
                            }
/* 34 */                    SystemClock.sleep(50L);
                        }
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 3 */             this.f16431a.close();
                }

                /* JADX INFO: renamed from: g */
                public final Object m8405g(q52 q52Var) {
/* 1 */             SQLiteDatabase sQLiteDatabaseM8404c = m8404c();
/* 5 */             sQLiteDatabaseM8404c.beginTransaction();
                    try {
/* 8 */                 Object objApply = q52Var.apply(sQLiteDatabaseM8404c);
/* 12 */                sQLiteDatabaseM8404c.setTransactionSuccessful();
/* 18 */                return objApply;
                    } finally {
/* 20 */                sQLiteDatabaseM8404c.endTransaction();
                    }
                }

                /* JADX INFO: renamed from: h */
                public final ArrayList m8406h(SQLiteDatabase sQLiteDatabase, C2497yg c2497yg, int i) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             Long lM8401f = m8401f(sQLiteDatabase, c2497yg);
/* 10 */            if (lM8401f == null) {
/* 12 */                return arrayList;
                    }
/* 70 */            m8403m(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lM8401f.toString()}, null, null, null, String.valueOf(i)), new C2080pr(5, this, arrayList, c2497yg));
/* 73 */            return arrayList;
                }

                /* JADX INFO: renamed from: i */
                public final void m8407i(long j, ca1 ca1Var, String str) {
/* 6 */             m8405g(new bp0(str, j, ca1Var));
                }

                /* JADX INFO: renamed from: k */
                public final Object m8408k(bk2 bk2Var) {
/* 1 */             SQLiteDatabase sQLiteDatabaseM8404c = m8404c();
/* 5 */             InterfaceC2512yv interfaceC2512yv = this.f16433c;
/* 7 */             long jMo7340a = interfaceC2512yv.mo7340a();
                    while (true) {
                        try {
/* 11 */                    sQLiteDatabaseM8404c.beginTransaction();
                            try {
/* 14 */                        Object objExecute = bk2Var.execute();
/* 18 */                        sQLiteDatabaseM8404c.setTransactionSuccessful();
/* 24 */                        return objExecute;
                            } finally {
/* 26 */                        sQLiteDatabaseM8404c.endTransaction();
                            }
                        } catch (SQLiteDatabaseLockedException e) {
/* 43 */                    if (interfaceC2512yv.mo7340a() >= ((long) this.f16434d.f16556c) + jMo7340a) {
/* 58 */                        throw new ak2("Timed out while trying to acquire the lock.", e);
                            }
/* 47 */                    SystemClock.sleep(50L);
                        }
                    }
                }
            }
