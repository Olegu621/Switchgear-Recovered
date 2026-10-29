            package p000;

            import java.util.Collections;
            import java.util.Iterator;
            import java.util.Set;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class s51 implements iz1 {

                /* JADX INFO: renamed from: a */
                public volatile Set f16428a;

                /* JADX INFO: renamed from: b */
                public volatile Set f16429b;

                @Override // p000.iz1
                public final Object get() {
/* 3 */             if (this.f16429b == null) {
                        synchronized (this) {
                            try {
/* 8 */                         if (this.f16429b == null) {
/* 19 */                            this.f16429b = Collections.newSetFromMap(new ConcurrentHashMap());
                                    synchronized (this) {
                                        try {
/* 24 */                                    Iterator it = this.f16428a.iterator();
/* 32 */                                    while (it.hasNext()) {
/* 46 */                                        this.f16429b.add(((iz1) it.next()).get());
                                            }
/* 53 */                                    this.f16428a = null;
                                        } catch (Throwable th) {
/* 58 */                                    throw th;
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
/* 64 */                        throw th2;
                            }
                        }
                    }
/* 67 */            return Collections.unmodifiableSet(this.f16429b);
                }
            }
