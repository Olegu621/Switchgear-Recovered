            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ug3 {

                /* JADX INFO: renamed from: f */
                public static final Object f17520f = new Object();

                /* JADX INFO: renamed from: a */
                public final String f17521a;

                /* JADX INFO: renamed from: b */
                public final te3 f17522b;

                /* JADX INFO: renamed from: c */
                public final Object f17523c;

                /* JADX INFO: renamed from: d */
                public final Object f17524d = new Object();

                /* JADX INFO: renamed from: e */
                public volatile Object f17525e = null;

                public /* synthetic */ ug3(String str, Object obj, te3 te3Var) {
/* 14 */            this.f17521a = str;
/* 16 */            this.f17523c = obj;
/* 18 */            this.f17522b = te3Var;
                }

                /* JADX INFO: renamed from: a */
                public final Object m9011a(Object obj) {
                    synchronized (this.f17524d) {
                    }
/* 5 */             if (obj != null) {
/* 7 */                 return obj;
                    }
/* 10 */            if (jb1.f12173e == null) {
/* 12 */                return this.f17523c;
                    }
                    synchronized (f17520f) {
                        try {
/* 22 */                    if (q62.m7734g()) {
/* 33 */                        return this.f17525e == null ? this.f17523c : this.f17525e;
                            }
                            try {
/* 48 */                        for (ug3 ug3Var : vg3.f18115a) {
/* 60 */                            if (q62.m7734g()) {
/* 88 */                                throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                                    }
/* 62 */                            Object objZza = null;
                                    try {
/* 63 */                                te3 te3Var = ug3Var.f17522b;
/* 65 */                                if (te3Var != null) {
/* 67 */                                    objZza = te3Var.zza();
                                        }
                                    } catch (IllegalStateException unused) {
                                    }
                                    synchronized (f17520f) {
/* 74 */                                ug3Var.f17525e = objZza;
                                    }
                                }
                            } catch (SecurityException unused2) {
                            }
/* 89 */                    te3 te3Var2 = this.f17522b;
/* 91 */                    if (te3Var2 != null) {
                                try {
/* 96 */                            return te3Var2.zza();
                                } catch (IllegalStateException | SecurityException unused3) {
                                }
                            }
/* 93 */                    return this.f17523c;
                        } catch (Throwable th) {
/* 102 */                   throw th;
                        }
                    }
                }
            }
