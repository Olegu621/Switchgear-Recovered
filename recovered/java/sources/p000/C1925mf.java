            package p000;

            import android.content.Context;
            
            /* JADX INFO: renamed from: mf */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1925mf extends k20 {

                /* JADX INFO: renamed from: a */
                public final Context f13711a;

                /* JADX INFO: renamed from: b */
                public final InterfaceC2512yv f13712b;

                /* JADX INFO: renamed from: c */
                public final InterfaceC2512yv f13713c;

                /* JADX INFO: renamed from: d */
                public final String f13714d;

                public C1925mf(Context context, InterfaceC2512yv interfaceC2512yv, InterfaceC2512yv interfaceC2512yv2, String str) {
/* 5 */             if (context == null) {
/* 42 */                C1951n4.m6868s("Null applicationContext");
/* 45 */                throw null;
                    }
/* 7 */             this.f13711a = context;
/* 9 */             if (interfaceC2512yv == null) {
/* 36 */                C1951n4.m6868s("Null wallClock");
/* 39 */                throw null;
                    }
/* 11 */            this.f13712b = interfaceC2512yv;
/* 13 */            if (interfaceC2512yv2 == null) {
/* 30 */                C1951n4.m6868s("Null monotonicClock");
/* 33 */                throw null;
                    }
/* 15 */            this.f13713c = interfaceC2512yv2;
/* 17 */            if (str != null) {
/* 19 */                this.f13714d = str;
                    } else {
/* 24 */                C1951n4.m6868s("Null backendName");
/* 27 */                throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof k20) {
/* 12 */                C1925mf c1925mf = (C1925mf) ((k20) obj);
/* 22 */                if (this.f13711a.equals(c1925mf.f13711a) && this.f13712b.equals(c1925mf.f13712b) && this.f13713c.equals(c1925mf.f13713c) && this.f13714d.equals(c1925mf.f13714d)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 34 */            return this.f13714d.hashCode() ^ ((((((this.f13711a.hashCode() ^ 1000003) * 1000003) ^ this.f13712b.hashCode()) * 1000003) ^ this.f13713c.hashCode()) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
/* 10 */            sb.append(this.f13711a);
/* 15 */            sb.append(", wallClock=");
/* 20 */            sb.append(this.f13712b);
/* 25 */            sb.append(", monotonicClock=");
/* 30 */            sb.append(this.f13713c);
/* 35 */            sb.append(", backendName=");
/* 42 */            return fm0.m3789o(sb, this.f13714d, "}");
                }
            }
