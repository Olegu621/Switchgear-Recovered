            package p000;

            import android.util.Size;
            import java.util.Comparator;
            
            /* JADX INFO: renamed from: hx */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1007hx implements Comparator {

                /* JADX INFO: renamed from: a */
                public final boolean f9354a;

                public C1007hx(boolean z) {
/* 4 */             this.f9354a = z;
                }

                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
/* 1 */             Size size = (Size) obj;
/* 3 */             Size size2 = (Size) obj2;
/* 28 */            int iSignum = Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
                    return this.f9354a ? iSignum * (-1) : iSignum;
                }
            }
