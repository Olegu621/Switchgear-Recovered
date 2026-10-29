            package p000;

            import java.util.ArrayList;
            import kotlin.Unit;
            import kotlin.collections.CollectionsKt;
            import kotlin.coroutines.C1846g;
            import kotlin.coroutines.CoroutineContext;
            
            /* JADX INFO: renamed from: at */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC0155at implements wo0 {

                /* JADX INFO: renamed from: a */
                public final CoroutineContext f2086a;

                /* JADX INFO: renamed from: b */
                public final int f2087b;

                /* JADX INFO: renamed from: c */
                public final EnumC2464xk f2088c;

                public AbstractC0155at(CoroutineContext coroutineContext, int i, EnumC2464xk enumC2464xk) {
/* 4 */             this.f2086a = coroutineContext;
/* 6 */             this.f2087b = i;
/* 8 */             this.f2088c = enumC2464xk;
                }

                /* JADX INFO: renamed from: a */
                public abstract Object mo1162a(xx1 xx1Var, c10 c10Var);

                @Override // p000.fk0
                public Object collect(hk0 hk0Var, c10 c10Var) throws Throwable {
/* 8 */             Object objM5966c = k50.m5966c(new C2562zs(hk0Var, this, null, 0), c10Var);
                    return objM5966c == z10.f19902a ? objM5966c : Unit.f12910a;
                }

                public String toString() {
/* 4 */             ArrayList arrayList = new ArrayList(4);
/* 7 */             C1846g c1846g = C1846g.f12919a;
/* 9 */             CoroutineContext coroutineContext = this.f2086a;
/* 11 */            if (coroutineContext != c1846g) {
/* 27 */                arrayList.add("context=" + coroutineContext);
                    }
/* 31 */            int i = this.f2087b;
/* 33 */            if (i != -3) {
/* 49 */                arrayList.add("capacity=" + i);
                    }
/* 52 */            EnumC2464xk enumC2464xk = EnumC2464xk.f19232a;
/* 54 */            EnumC2464xk enumC2464xk2 = this.f2088c;
/* 56 */            if (enumC2464xk2 != enumC2464xk) {
/* 72 */                arrayList.add("onBufferOverflow=" + enumC2464xk2);
                    }
/* 115 */           return getClass().getSimpleName() + '[' + CollectionsKt.m6203x(arrayList, ", ", null, null, null, 62) + ']';
                }
            }
