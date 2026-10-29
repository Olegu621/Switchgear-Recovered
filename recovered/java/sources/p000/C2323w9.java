            package p000;

            import java.util.Arrays;
            
            /* JADX INFO: renamed from: w9 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2323w9 {

                /* JADX INFO: renamed from: a */
                public final int f18479a;

                /* JADX INFO: renamed from: b */
                public final C0983h9 f18480b;

                /* JADX INFO: renamed from: c */
                public final InterfaceC0172b9 f18481c;

                /* JADX INFO: renamed from: d */
                public final String f18482d;

                public C2323w9(C0983h9 c0983h9, InterfaceC0172b9 interfaceC0172b9, String str) {
/* 4 */             this.f18480b = c0983h9;
/* 6 */             this.f18481c = interfaceC0172b9;
/* 8 */             this.f18482d = str;
/* 18 */            this.f18479a = Arrays.hashCode(new Object[]{c0983h9, interfaceC0172b9, str});
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == null) {
/* 1 */                 return false;
                    }
/* 6 */             if (obj == this) {
/* 5 */                 return true;
                    }
/* 11 */            if (!(obj instanceof C2323w9)) {
/* 1 */                 return false;
                    }
/* 14 */            C2323w9 c2323w9 = (C2323w9) obj;
                    return de3.m3029k(this.f18480b, c2323w9.f18480b) && de3.m3029k(this.f18481c, c2323w9.f18481c) && de3.m3029k(this.f18482d, c2323w9.f18482d);
                }

                public final int hashCode() {
/* 1 */             return this.f18479a;
                }
            }
