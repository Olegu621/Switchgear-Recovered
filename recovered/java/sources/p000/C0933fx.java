            package p000;

            import java.io.Serializable;
            import kotlin.coroutines.C1846g;
            import kotlin.coroutines.CoroutineContext;
            
            /* JADX INFO: renamed from: fx */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C0933fx implements Serializable {

                /* JADX INFO: renamed from: b */
                public static final C0896ex f8389b = new C0896ex(null);

                /* JADX INFO: renamed from: a */
                public final CoroutineContext[] f8390a;

                public C0933fx(CoroutineContext[] coroutineContextArr) {
/* 4 */             this.f8390a = coroutineContextArr;
                }

                private final Object readResolve() {
/* 1 */             CoroutineContext coroutineContextPlus = C1846g.f12919a;
/* 7 */             for (CoroutineContext coroutineContext : this.f8390a) {
/* 11 */                coroutineContextPlus = coroutineContextPlus.plus(coroutineContext);
                    }
/* 18 */            return coroutineContextPlus;
                }
            }
