            package p000;

            import android.view.MenuItem;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.concurrent.CopyOnWriteArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pg1 {

                /* JADX INFO: renamed from: a */
                public final Runnable f15111a;

                /* JADX INFO: renamed from: b */
                public final CopyOnWriteArrayList f15112b = new CopyOnWriteArrayList();

                /* JADX INFO: renamed from: c */
                public final HashMap f15113c = new HashMap();

                public pg1(Runnable runnable) {
/* 18 */            this.f15111a = runnable;
                }

                /* JADX INFO: renamed from: a */
                public final boolean m7415a(MenuItem menuItem) {
/* 3 */             Iterator it = this.f15112b.iterator();
/* 11 */            while (it.hasNext()) {
/* 27 */                if (((qm0) ((fh1) it.next())).f15653a.m718p(menuItem)) {
/* 29 */                    return true;
                        }
                    }
/* 31 */            return false;
                }

                /* JADX INFO: renamed from: b */
                public final void m7416b(fh1 fh1Var) {
/* 3 */             this.f15112b.remove(fh1Var);
/* 12 */            og1 og1Var = (og1) this.f15113c.remove(fh1Var);
/* 14 */            if (og1Var != null) {
/* 20 */                og1Var.f14741a.mo4484b(og1Var.f14742b);
/* 24 */                og1Var.f14742b = null;
                    }
/* 28 */            this.f15111a.run();
                }
            }
