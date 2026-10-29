            package p000;

            import javax.inject.Provider;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class m90 implements Provider {

                /* JADX INFO: renamed from: c */
                public static final Object f13663c = new Object();

                /* JADX INFO: renamed from: a */
                public volatile sg0 f13664a;

                /* JADX INFO: renamed from: b */
                public volatile Object f13665b;

                /* JADX INFO: renamed from: a */
                public static Provider m6627a(sg0 sg0Var) {
/* 3 */             if (sg0Var instanceof m90) {
/* 5 */                 return sg0Var;
                    }
/* 8 */             m90 m90Var = new m90();
/* 13 */            m90Var.f13665b = f13663c;
/* 15 */            m90Var.f13664a = sg0Var;
/* 17 */            return m90Var;
                }

                @Override // javax.inject.Provider
                public final Object get() {
                    Object obj;
/* 1 */             Object obj2 = this.f13665b;
/* 3 */             Object obj3 = f13663c;
/* 5 */             if (obj2 != obj3) {
/* 70 */                return obj2;
                    }
                    synchronized (this) {
                        try {
/* 8 */                     obj = this.f13665b;
/* 10 */                    if (obj == obj3) {
/* 14 */                        obj = this.f13664a.get();
/* 18 */                        Object obj4 = this.f13665b;
/* 20 */                        if (obj4 != obj3 && obj4 != obj) {
/* 57 */                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                                }
/* 58 */                        this.f13665b = obj;
/* 61 */                        this.f13664a = null;
                            }
                        } catch (Throwable th) {
/* 69 */                    throw th;
                        }
                    }
/* 67 */            return obj;
                }
            }
