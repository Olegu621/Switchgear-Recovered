            package p000;

            import java.io.Closeable;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class t33 {

                /* JADX INFO: renamed from: a */
                public final LinkedHashMap f16912a = new LinkedHashMap();

                /* JADX INFO: renamed from: a */
                public final void m8686a() {
/* 15 */            for (q33 q33Var : this.f16912a.values()) {
/* 24 */                q33Var.f15384c = true;
/* 26 */                HashMap map = q33Var.f15382a;
/* 28 */                if (map != null) {
                            synchronized (map) {
                                try {
/* 37 */                            Iterator it = q33Var.f15382a.values().iterator();
/* 45 */                            while (it.hasNext()) {
/* 51 */                                q33.m7694a(it.next());
                                    }
                                } catch (Throwable th) {
/* 60 */                            throw th;
                                }
                            }
                        }
/* 61 */                LinkedHashSet linkedHashSet = q33Var.f15383b;
/* 63 */                if (linkedHashSet != null) {
                            synchronized (linkedHashSet) {
                                try {
/* 68 */                            Iterator it2 = q33Var.f15383b.iterator();
/* 76 */                            while (it2.hasNext()) {
/* 84 */                                q33.m7694a((Closeable) it2.next());
                                    }
                                } catch (Throwable th2) {
/* 98 */                            throw th2;
                                }
                            }
/* 93 */                    q33Var.f15383b.clear();
                        }
/* 99 */                q33Var.mo729b();
                    }
/* 105 */           this.f16912a.clear();
                }
            }
