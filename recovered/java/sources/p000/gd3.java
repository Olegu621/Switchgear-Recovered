            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gd3 implements jd3 {

                /* JADX INFO: renamed from: c */
                public static final Object f8553c = new Object();

                /* JADX INFO: renamed from: a */
                public volatile jd3 f8554a;

                /* JADX INFO: renamed from: b */
                public volatile Object f8555b;

                /* JADX INFO: renamed from: a */
                public static jd3 m3912a(jd3 jd3Var) {
/* 3 */             if (jd3Var instanceof gd3) {
/* 5 */                 return jd3Var;
                    }
/* 8 */             gd3 gd3Var = new gd3();
/* 13 */            gd3Var.f8555b = f8553c;
/* 15 */            gd3Var.f8554a = jd3Var;
/* 17 */            return gd3Var;
                }

                @Override // p000.jd3
                public final Object zza() {
                    Object objZza;
/* 3 */             Object obj = this.f8555b;
/* 5 */             Object obj2 = f8553c;
/* 7 */             if (obj != obj2) {
/* 69 */                return obj;
                    }
                    synchronized (this) {
                        try {
/* 10 */                    objZza = this.f8555b;
/* 12 */                    if (objZza == obj2) {
/* 16 */                        objZza = this.f8554a.zza();
/* 20 */                        Object obj3 = this.f8555b;
/* 22 */                        if (obj3 != obj2 && obj3 != objZza) {
/* 57 */                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
                                }
/* 60 */                        this.f8555b = objZza;
/* 63 */                        this.f8554a = null;
                            }
                        } catch (Throwable th) {
/* 68 */                    throw th;
                        }
                    }
/* 66 */            return objZza;
                }
            }
