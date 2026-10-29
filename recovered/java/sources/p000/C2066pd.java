            package p000;

            import java.util.Iterator;
            import kotlin.jvm.functions.Function2;
            import kotlin.sequences.Sequence;
            
            /* JADX INFO: renamed from: pd */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C2066pd implements Sequence {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15069a;

                /* JADX INFO: renamed from: b */
                public final Object f15070b;

                public /* synthetic */ C2066pd(Object obj, int i) {
/* 1 */             this.f15069a = i;
/* 3 */             this.f15070b = obj;
                }

                @Override // kotlin.sequences.Sequence
                public final Iterator iterator() {
/* 1 */             int i = this.f15069a;
/* 3 */             Object obj = this.f15070b;
                    switch (i) {
                        case 0:
/* 42 */                    return new C2126r((Object[]) obj);
                        case 1:
/* 33 */                    return ((Iterable) obj).iterator();
                        case 2:
/* 27 */                    return new v71(this);
                        case 3:
/* 15 */                    q92 q92Var = new q92();
/* 22 */                    q92Var.f15452c = mz0.m6833a(q92Var, q92Var, (Function2) obj);
/* 24 */                    return q92Var;
                        default:
/* 8 */                     return (Iterator) obj;
                    }
                }
            }
