            package p000;

            import android.content.ContentValues;
            import android.database.sqlite.SQLiteDatabase;
            import io.sentry.instrumentation.file.C1498e;
            import io.sentry.instrumentation.file.InterfaceC1494a;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     public final /* synthetic */ class p52 implements q52, InterfaceC1494a {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ long f14965a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f14966b;

                public /* synthetic */ p52(long j, C2497yg c2497yg) {
/* 4 */             this.f14965a = j;
/* 6 */             this.f14966b = c2497yg;
                }

                @Override // p000.q52
                public Object apply(Object obj) {
/* 3 */             C2497yg c2497yg = (C2497yg) this.f14966b;
/* 5 */             SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
/* 9 */             ContentValues contentValues = new ContentValues();
/* 20 */            contentValues.put("next_request_ms", Long.valueOf(this.f14965a));
/* 23 */            String str = c2497yg.f19600a;
/* 25 */            px1 px1Var = c2497yg.f19602c;
/* 49 */            if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(rx1.m8316a(px1Var))}) < 1) {
/* 53 */                contentValues.put("backend_name", str);
/* 66 */                contentValues.put("priority", Integer.valueOf(rx1.m8316a(px1Var)));
/* 69 */                sQLiteDatabase.insert("transport_contexts", null, contentValues);
                    }
/* 48 */            return null;
                }

                @Override // io.sentry.instrumentation.file.InterfaceC1494a
                public Object call() {
/* 3 */             C1498e c1498e = (C1498e) this.f14966b;
/* 13 */            return Long.valueOf(c1498e.f11030a.skip(this.f14965a));
                }

/* 8 */         public /* synthetic */ p52(C1498e c1498e, long j) {
                    this.f14966b = c1498e;
                    this.f14965a = j;
                }
            }
