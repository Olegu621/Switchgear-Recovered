            package p000;

            import android.app.Activity;
            import android.app.Application;
            import android.content.Context;
            import android.os.Looper;
            import com.google.android.gms.tasks.TaskExecutors;
            import java.util.Collections;
            import java.util.List;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ah3 extends AbstractC2322w8 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f287a = 0;

                @Override // p000.AbstractC2322w8
                public final InterfaceC0836d9 buildClient(Context context, Looper looper, C2345wv c2345wv, Object obj, rr0 rr0Var, sr0 sr0Var) {
/* 1 */             in3 in3VarM6675a = (in3) obj;
/* 3 */             if (in3VarM6675a == null) {
/* 10 */                in3VarM6675a = new ml3().m6675a();
                    }
/* 14 */            in3 in3Var = in3VarM6675a;
/* 17 */            td3 td3Var = td3.f17052b;
/* 24 */            nd3 nd3Var = new nd3(context, looper, c2345wv, in3Var, rr0Var, sr0Var);
/* 31 */            if (in3Var.f9733e.f14370a) {
/* 33 */                AtomicReference atomicReference = bh3.f2426g;
/* 41 */                bh3 bh3VarM1359b = bh3.m1359b((Application) context.getApplicationContext());
/* 45 */                sd3 sd3Var = nd3Var.f14197d;
/* 47 */                bh3VarM1359b.getClass();
/* 50 */                kb1.m6061n(sd3Var);
                        synchronized (bh3VarM1359b.f2429c) {
/* 58 */                    bh3VarM1359b.f2430d.add(sd3Var);
                        }
/* 70 */                if (Looper.myLooper() != Looper.getMainLooper()) {
/* 92 */                    TaskExecutors.MAIN_THREAD.execute(new dp0(25, bh3VarM1359b, sd3Var));
/* 95 */                    return nd3Var;
                        }
/* 72 */                Activity activityM1361a = bh3VarM1359b.m1361a();
/* 76 */                if (activityM1361a != null) {
/* 79 */                    sd3Var.m8482a(activityM1361a);
/* 82 */                    return nd3Var;
                        }
                    }
/* 100 */           return nd3Var;
                }

                @Override // p000.AbstractC0208c9
                public final /* synthetic */ List getImpliedScopes(Object obj) {
                    switch (this.f287a) {
                        case 0:
/* 19 */                    return Collections.singletonList(fq0.f8313a);
                        default:
/* 10 */                    return Collections.singletonList(fq0.f8315c);
                    }
                }

                @Override // p000.AbstractC0208c9
                public final int getPriority() {
/* 1 */             return 1;
                }
            }
