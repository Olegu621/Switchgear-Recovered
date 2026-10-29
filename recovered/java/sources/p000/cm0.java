            package p000;

            import android.media.Image;
            import java.util.HashSet;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class cm0 implements mw0 {

                /* JADX INFO: renamed from: b */
                public final mw0 f2998b;

                /* JADX INFO: renamed from: a */
                public final Object f2997a = new Object();

                /* JADX INFO: renamed from: c */
                public final HashSet f2999c = new HashSet();

                public cm0(mw0 mw0Var) {
/* 18 */            this.f2998b = mw0Var;
                }

                @Override // p000.mw0
                /* JADX INFO: renamed from: P0 */
                public final Image mo1724P0() {
/* 3 */             return this.f2998b.mo1724P0();
                }

                /* JADX INFO: renamed from: c */
                public final void m1725c(bm0 bm0Var) {
                    synchronized (this.f2997a) {
/* 6 */                 this.f2999c.add(bm0Var);
                    }
                }

                @Override // java.lang.AutoCloseable
                public void close() {
                    HashSet hashSet;
/* 3 */             this.f2998b.close();
                    synchronized (this.f2997a) {
/* 13 */                hashSet = new HashSet(this.f2999c);
                    }
/* 17 */            Iterator it = hashSet.iterator();
/* 25 */            while (it.hasNext()) {
/* 33 */                ((bm0) it.next()).mo1394b(this);
                    }
                }

                @Override // p000.mw0
                public final int getFormat() {
/* 3 */             return this.f2998b.getFormat();
                }

                @Override // p000.mw0
                public int getHeight() {
/* 3 */             return this.f2998b.getHeight();
                }

                @Override // p000.mw0
                public int getWidth() {
/* 3 */             return this.f2998b.getWidth();
                }

                @Override // p000.mw0
                /* JADX INFO: renamed from: j */
                public final lw0[] mo1726j() {
/* 3 */             return this.f2998b.mo1726j();
                }

                @Override // p000.mw0
                /* JADX INFO: renamed from: x0 */
                public gw0 mo1727x0() {
/* 3 */             return this.f2998b.mo1727x0();
                }
            }
