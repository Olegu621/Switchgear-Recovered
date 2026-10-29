            package p000;

            import java.util.Iterator;
            
            /* JADX INFO: renamed from: ot */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class AbstractC2045ot implements Iterable, r21 {

                /* JADX INFO: renamed from: d */
                public static final C1976nt f14887d = new C1976nt(null);

                /* JADX INFO: renamed from: a */
                public final char f14888a;

                /* JADX INFO: renamed from: b */
                public final char f14889b;

                /* JADX INFO: renamed from: c */
                public final int f14890c = 1;

                public AbstractC2045ot(char c, char c2) {
/* 4 */             this.f14888a = c;
/* 12 */            this.f14889b = (char) k50.m5985v(c, c2, 1);
                }

                @Override // java.lang.Iterable
                public final Iterator iterator() {
/* 9 */             return new C2082pt(this.f14888a, this.f14889b, this.f14890c);
                }
            }
