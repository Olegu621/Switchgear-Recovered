            package p000;

            import android.content.ContentValues;
            import android.database.Cursor;
            import android.database.sqlite.SQLiteDatabase;
            import java.util.concurrent.Callable;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class bp0 implements InterfaceC2299vm, q52, bk2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ long f2556a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f2557b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f2558c;

                public /* synthetic */ bp0(Object obj, long j, Object obj2) {
/* 1 */             this.f2557b = obj;
/* 3 */             this.f2558c = obj2;
/* 5 */             this.f2556a = j;
                }

                @Override // p000.q52
                public Object apply(Object obj) {
/* 3 */             String str = (String) this.f2557b;
/* 9 */             SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
/* 11 */            int i = ((ca1) this.f2558c).f2797a;
/* 23 */            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                    try {
/* 35 */                boolean z = cursorRawQuery.getCount() > 0;
/* 36 */                cursorRawQuery.close();
/* 39 */                long j = this.f2556a;
/* 42 */                if (z) {
/* 105 */                   sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
/* 41 */                    return null;
                        }
/* 46 */                ContentValues contentValues = new ContentValues();
/* 51 */                contentValues.put("log_source", str);
/* 60 */                contentValues.put("reason", Integer.valueOf(i));
/* 69 */                contentValues.put("events_dropped_count", Long.valueOf(j));
/* 74 */                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
/* 41 */                return null;
                    } catch (Throwable th) {
/* 110 */               cursorRawQuery.close();
/* 113 */               throw th;
                    }
                }

                @Override // p000.bk2
                public Object execute() {
/* 3 */             f31 f31Var = (f31) this.f2557b;
/* 7 */             C2497yg c2497yg = (C2497yg) this.f2558c;
/* 11 */            s52 s52Var = (s52) f31Var.f7985c;
/* 23 */            long jMo7340a = ((InterfaceC2512yv) f31Var.f7989g).mo7340a() + this.f2556a;
/* 24 */            s52Var.getClass();
/* 32 */            s52Var.m8405g(new p52(jMo7340a, c2497yg));
/* 35 */            return null;
                }

                @Override // p000.InterfaceC2299vm
                /* JADX INFO: renamed from: w */
                public Object mo1148w(final C2260um c2260um) {
/* 3 */             final s81 s81Var = (s81) this.f2557b;
/* 7 */             ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f2558c;
/* 14 */            w11.m9392B(true, s81Var, c2260um, pg3.m7428g());
/* 21 */            if (!s81Var.isDone()) {
/* 25 */                final long j = this.f2556a;
/* 47 */                s81Var.mo3676a(new RunnableC2166s2(scheduledExecutorService.schedule(new Callable() { // from class: zo0
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
/* 43 */                        return Boolean.valueOf(c2260um.m9041b(new TimeoutException("Future[" + s81Var + "] is not done within " + j + " ms.")));
                            }
                        }, j, TimeUnit.MILLISECONDS), 23), pg3.m7428g());
                    }
/* 65 */            return "TimeoutFuture[" + s81Var + "]";
                }
            }
