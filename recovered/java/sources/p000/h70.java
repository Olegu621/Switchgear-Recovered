            package p000;

            import android.database.Cursor;
            import android.database.sqlite.SQLiteDatabase;
            import java.util.concurrent.Callable;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 14 */    public final /* synthetic */ class h70 implements n70, bk2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8941a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f8942b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ long f8943c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f8944d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Object f8945e;

                public /* synthetic */ h70(f31 f31Var, Iterable iterable, C2497yg c2497yg, long j) {
/* 2 */             this.f8941a = 2;
/* 7 */             this.f8942b = f31Var;
/* 9 */             this.f8945e = iterable;
/* 11 */            this.f8944d = c2497yg;
/* 13 */            this.f8943c = j;
                }

                @Override // p000.n70
                /* JADX INFO: renamed from: a */
                public ScheduledFuture mo4121a(final gr0 gr0Var) {
/* 1 */             int i = this.f8941a;
/* 3 */             Object obj = this.f8944d;
/* 5 */             long j = this.f8943c;
/* 7 */             Object obj2 = this.f8945e;
/* 11 */            final m70 m70Var = (m70) this.f8942b;
                    switch (i) {
                        case 0:
/* 44 */                    return m70Var.f13640b.schedule(new k70(m70Var, (Runnable) obj2, gr0Var, 1), j, (TimeUnit) obj);
                        default:
/* 16 */                    final Callable callable = (Callable) obj2;
/* 27 */                    return m70Var.f13640b.schedule(new Callable() { // from class: l70
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
/* 16 */                            return m70Var.f13639a.submit(new RunnableC1784j8(18, callable, gr0Var));
                                }
                            }, j, (TimeUnit) obj);
                    }
                }

                @Override // p000.bk2
                public Object execute() {
/* 3 */             f31 f31Var = (f31) this.f8942b;
/* 7 */             Iterable iterable = (Iterable) this.f8945e;
/* 11 */            C2497yg c2497yg = (C2497yg) this.f8944d;
/* 15 */            s52 s52Var = (s52) f31Var.f7985c;
/* 17 */            s52Var.getClass();
/* 29 */            if (iterable.iterator().hasNext()) {
/* 38 */                String strConcat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(s52.m8402l(iterable));
/* 44 */                SQLiteDatabase sQLiteDatabaseM8404c = s52Var.m8404c();
/* 48 */                sQLiteDatabaseM8404c.beginTransaction();
                        try {
/* 55 */                    sQLiteDatabaseM8404c.compileStatement(strConcat).execute();
/* 58 */                    Cursor cursorRawQuery = sQLiteDatabaseM8404c.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
/* 66 */                    while (cursorRawQuery.moveToNext()) {
                                try {
/* 81 */                            s52Var.m8407i(cursorRawQuery.getInt(0), ca1.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                                } catch (Throwable th) {
/* 126 */                           cursorRawQuery.close();
/* 129 */                           throw th;
                                }
                            }
/* 85 */                    cursorRawQuery.close();
/* 94 */                    sQLiteDatabaseM8404c.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
/* 97 */                    sQLiteDatabaseM8404c.setTransactionSuccessful();
/* 100 */                   sQLiteDatabaseM8404c.endTransaction();
                        } catch (Throwable th2) {
/* 130 */                   sQLiteDatabaseM8404c.endTransaction();
/* 133 */                   throw th2;
                        }
                    }
/* 119 */           s52Var.m8405g(new p52(((InterfaceC2512yv) f31Var.f7989g).mo7340a() + this.f8943c, c2497yg));
/* 28 */            return null;
                }

/* 15 */        public /* synthetic */ h70(m70 m70Var, Object obj, long j, TimeUnit timeUnit, int i) {
/* 16 */            this.f8941a = i;
                    this.f8942b = m70Var;
                    this.f8945e = obj;
                    this.f8943c = j;
                    this.f8944d = timeUnit;
                }
            }
