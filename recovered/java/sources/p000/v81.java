            package p000;

            import android.os.Looper;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class v81 {

                /* JADX INFO: renamed from: a */
                public final wz0 f17914a;

                /* JADX INFO: renamed from: b */
                public volatile Object f17915b;

                /* JADX INFO: renamed from: c */
                public volatile t81 f17916c;

                public v81(Looper looper, Object obj, String str) {
/* 9 */             this.f17914a = new wz0(looper);
/* 13 */            kb1.m6062o(obj, "Listener must not be null");
/* 16 */            this.f17915b = obj;
/* 20 */            kb1.m6058k(str);
/* 26 */            this.f17916c = new t81(obj, str);
                }

                /* JADX INFO: renamed from: a */
                public final void m9229a(u81 u81Var) {
/* 10 */            this.f17914a.execute(new cp0(21, this, u81Var));
                }
            }
