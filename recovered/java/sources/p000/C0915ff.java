            package p000;
            
            /* JADX INFO: renamed from: ff */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0915ff {

                /* JADX INFO: renamed from: a */
                public final int f8183a;

                /* JADX INFO: renamed from: b */
                public final Throwable f8184b;

                public C0915ff(int i, Throwable th) {
/* 4 */             this.f8183a = i;
/* 6 */             this.f8184b = th;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof C0915ff) {
/* 10 */                C0915ff c0915ff = (C0915ff) obj;
/* 16 */                if (this.f8183a == c0915ff.f8183a) {
/* 18 */                    Throwable th = c0915ff.f8184b;
/* 20 */                    Throwable th2 = this.f8184b;
/* 22 */                    if (th2 != null ? th2.equals(th) : th == null) {
/* 1 */                         return true;
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 7 */             int i = (this.f8183a ^ 1000003) * 1000003;
/* 8 */             Throwable th = this.f8184b;
/* 18 */            return (th == null ? 0 : th.hashCode()) ^ i;
                }

                public final String toString() {
/* 28 */            return "StateError{code=" + this.f8183a + ", cause=" + this.f8184b + "}";
                }
            }
