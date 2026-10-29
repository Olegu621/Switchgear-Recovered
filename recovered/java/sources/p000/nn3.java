            package p000;

            import okhttp3.internal.http2.Settings;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class nn3 {

                /* JADX INFO: renamed from: a */
                public final Object f14391a;

                /* JADX INFO: renamed from: b */
                public final int f14392b;

                public nn3(tm3 tm3Var, int i) {
/* 4 */             this.f14391a = tm3Var;
/* 6 */             this.f14392b = i;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof nn3)) {
/* 3 */                 return false;
                    }
/* 7 */             nn3 nn3Var = (nn3) obj;
                    return this.f14391a == nn3Var.f14391a && this.f14392b == nn3Var.f14392b;
                }

                public final int hashCode() {
/* 13 */            return (System.identityHashCode(this.f14391a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f14392b;
                }
            }
