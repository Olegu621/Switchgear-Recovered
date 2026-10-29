            package p000;

            import java.io.Serializable;
            import java.util.Comparator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class oi0 implements Serializable, Comparator {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14768a;

                /* JADX INFO: renamed from: b */
                public final float f14769b;

                public /* synthetic */ oi0(float f, int i) {
/* 1 */             this.f14768a = i;
/* 3 */             this.f14769b = f;
                }

                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
/* 1 */             int i = this.f14768a;
/* 3 */             float f = this.f14769b;
                    switch (i) {
                        case 0:
/* 31 */                    ni0 ni0Var = (ni0) obj;
/* 33 */                    ni0 ni0Var2 = (ni0) obj2;
/* 39 */                    int iCompare = Integer.compare(ni0Var2.f14275d, ni0Var.f14275d);
                            return iCompare == 0 ? Float.compare(Math.abs(ni0Var.f14274c - f), Math.abs(ni0Var2.f14274c - f)) : iCompare;
                        default:
/* 26 */                    return Float.compare(Math.abs(((ni0) obj2).f14274c - f), Math.abs(((ni0) obj).f14274c - f));
                    }
                }
            }
