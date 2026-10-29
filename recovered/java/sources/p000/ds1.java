            package p000;

            import android.util.Pair;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ds1 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7396a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Pair f7397b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ ds1(Pair pair, int i) {
/* 6 */             super(0);
/* 1 */             this.f7396a = i;
/* 3 */             this.f7397b = pair;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             int i = this.f7396a;
/* 4 */             Pair pair = this.f7397b;
                    switch (i) {
                        case 0:
/* 33 */                    if (pair != null) {
/* 38 */                        return (String) pair.first;
                            }
/* 3 */                     return null;
                        case 1:
/* 25 */                    if (pair != null) {
/* 30 */                        return (String) pair.second;
                            }
/* 3 */                     return null;
                        case 2:
/* 17 */                    if (pair != null) {
/* 22 */                        return (String) pair.first;
                            }
/* 3 */                     return null;
                        default:
/* 9 */                     if (pair != null) {
/* 14 */                        return (Integer) pair.second;
                            }
/* 3 */                     return null;
                    }
                }
            }
