            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ti0 implements InterfaceC1793jh {

                /* JADX INFO: renamed from: a */
                public static final AtomicReference f17112a = new AtomicReference();

                @Override // p000.InterfaceC1793jh
                /* JADX INFO: renamed from: a */
                public final void mo149a(boolean z) {
                    synchronized (vi0.f18190j) {
                        try {
/* 23 */                    for (vi0 vi0Var : new ArrayList(vi0.f18191k.values())) {
/* 37 */                        if (vi0Var.f18196e.get()) {
/* 41 */                            Iterator it = vi0Var.f18200i.iterator();
/* 49 */                            while (it.hasNext()) {
/* 57 */                                vi0 vi0Var2 = ((si0) it.next()).f16645a;
/* 59 */                                if (!z) {
/* 69 */                                    ((b60) vi0Var2.f18199h.get()).m1292b();
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th) {
/* 78 */                    throw th;
                        }
                    }
                }
            }
