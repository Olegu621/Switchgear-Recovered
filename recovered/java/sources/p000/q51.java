            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class q51 implements iz1 {

                /* JADX INFO: renamed from: c */
                public static final Object f15400c = new Object();

                /* JADX INFO: renamed from: a */
                public volatile Object f15401a = f15400c;

                /* JADX INFO: renamed from: b */
                public volatile iz1 f15402b;

                public q51(iz1 iz1Var) {
/* 8 */             this.f15402b = iz1Var;
                }

                @Override // p000.iz1
                public final Object get() {
                    Object obj;
/* 1 */             Object obj2 = this.f15401a;
/* 3 */             Object obj3 = f15400c;
/* 5 */             if (obj2 != obj3) {
/* 30 */                return obj2;
                    }
                    synchronized (this) {
                        try {
/* 8 */                     obj = this.f15401a;
/* 10 */                    if (obj == obj3) {
/* 14 */                        obj = this.f15402b.get();
/* 18 */                        this.f15401a = obj;
/* 21 */                        this.f15402b = null;
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
/* 27 */            return obj;
                }
            }
