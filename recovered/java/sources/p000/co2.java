            package p000;

            import io.sentry.C1697u2;
            import kotlin.coroutines.CoroutineContext;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class co2 {

                /* JADX INFO: renamed from: a */
                public static final C2131r4 f3022a = new C2131r4("NO_THREAD_ELEMENTS", 8);

                /* JADX INFO: renamed from: a */
                public static final void m1739a(CoroutineContext coroutineContext, Object obj) {
/* 3 */             if (obj == f3022a) {
/* 20 */                return;
                    }
/* 9 */             if (!(obj instanceof fo2)) {
/* 30 */                coroutineContext.fold(null, ao2.f2044a).getClass();
/* 33 */                C1697u2.m5431g();
/* 36 */                return;
                    }
/* 13 */            yn2[] yn2VarArr = ((fo2) obj).f8297c;
/* 16 */            int length = yn2VarArr.length - 1;
/* 18 */            if (length < 0) {
/* 20 */                return;
                    }
/* 21 */            yn2 yn2Var = yn2VarArr[length];
/* 23 */            throw null;
                }

                /* JADX INFO: renamed from: b */
                public static final Object m1740b(CoroutineContext coroutineContext) {
/* 8 */             Object objFold = coroutineContext.fold(0, zn2.f20273a);
/* 12 */            objFold.getClass();
/* 15 */            return objFold;
                }

                /* JADX INFO: renamed from: c */
                public static final Object m1741c(CoroutineContext coroutineContext, Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 obj = m1740b(coroutineContext);
                    }
/* 12 */            if (obj == 0) {
/* 14 */                return f3022a;
                    }
/* 19 */            if (obj instanceof Integer) {
/* 34 */                return coroutineContext.fold(new fo2(((Number) obj).intValue(), coroutineContext), bo2.f2555a);
                    }
/* 39 */            C1697u2.m5431g();
/* 42 */            return null;
                }
            }
