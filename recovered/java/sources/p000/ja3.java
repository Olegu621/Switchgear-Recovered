            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ja3 implements la3 {

                /* JADX INFO: renamed from: c */
                public static final Object f12164c = new Object();

                /* JADX INFO: renamed from: a */
                public volatile la3 f12165a;

                /* JADX INFO: renamed from: b */
                public volatile Object f12166b;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: b */
                public static ja3 m5733b(ka3 ka3Var) {
/* 3 */             if (ka3Var instanceof ja3) {
/* 5 */                 return (ja3) ka3Var;
                    }
/* 10 */            ja3 ja3Var = new ja3();
/* 15 */            ja3Var.f12166b = f12164c;
/* 17 */            ja3Var.f12165a = ka3Var;
/* 19 */            return ja3Var;
                }

                @Override // p000.ma3
                /* JADX INFO: renamed from: a */
                public final Object mo2449a() {
                    Object objMo2449a;
/* 3 */             Object obj = this.f12166b;
/* 5 */             Object obj2 = f12164c;
/* 7 */             if (obj != obj2) {
/* 69 */                return obj;
                    }
                    synchronized (this) {
                        try {
/* 10 */                    objMo2449a = this.f12166b;
/* 12 */                    if (objMo2449a == obj2) {
/* 16 */                        objMo2449a = this.f12165a.mo2449a();
/* 20 */                        Object obj3 = this.f12166b;
/* 22 */                        if (obj3 != obj2 && obj3 != objMo2449a) {
/* 57 */                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objMo2449a + ". This is likely due to a circular dependency.");
                                }
/* 60 */                        this.f12166b = objMo2449a;
/* 63 */                        this.f12165a = null;
                            }
                        } catch (Throwable th) {
/* 68 */                    throw th;
                        }
                    }
/* 66 */            return objMo2449a;
                }
            }
