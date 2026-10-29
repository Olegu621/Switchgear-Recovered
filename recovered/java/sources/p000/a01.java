            package p000;

            import java.lang.reflect.InvocationTargetException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class a01 extends ps1 {
                @Override // p000.ps1
                /* JADX INFO: renamed from: a */
                public final void mo12a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
/* 1 */             th.getClass();
/* 4 */             th2.getClass();
/* 7 */             Integer num = zz0.f20468b;
/* 9 */             if (num == null || num.intValue() >= 19) {
/* 24 */                th.addSuppressed(th2);
                    } else {
/* 20 */                super.mo12a(th, th2);
                    }
                }
            }
