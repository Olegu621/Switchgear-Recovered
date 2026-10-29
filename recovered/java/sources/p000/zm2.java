            package p000;

            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zm2 implements InterfaceC0172b9 {

                /* JADX INFO: renamed from: b */
                public static final zm2 f20264b = new zm2(null);

                /* JADX INFO: renamed from: a */
                public final String f20265a;

                public /* synthetic */ zm2(String str) {
/* 4 */             this.f20265a = str;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof zm2) {
/* 17 */                return de3.m3029k(this.f20265a, ((zm2) obj).f20265a);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 7 */             return Arrays.hashCode(new Object[]{this.f20265a});
                }
            }
