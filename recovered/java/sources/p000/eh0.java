            package p000;

            import java.util.Collections;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class eh0 {

                /* JADX INFO: renamed from: a */
                public final String f7687a;

                /* JADX INFO: renamed from: b */
                public final Map f7688b;

                public eh0(String str, Map map) {
/* 4 */             this.f7687a = str;
/* 6 */             this.f7688b = map;
                }

                /* JADX INFO: renamed from: a */
                public static eh0 m3430a(String str) {
/* 5 */             return new eh0(str, Collections.EMPTY_MAP);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 31 */                return true;
                    }
/* 6 */             if (!(obj instanceof eh0)) {
/* 33 */                return false;
                    }
/* 9 */             eh0 eh0Var = (eh0) obj;
                    return this.f7687a.equals(eh0Var.f7687a) && this.f7688b.equals(eh0Var.f7688b);
                }

                public final int hashCode() {
/* 15 */            return this.f7688b.hashCode() + (this.f7687a.hashCode() * 31);
                }

                public final String toString() {
/* 32 */            return "FieldDescriptor{name=" + this.f7687a + ", properties=" + this.f7688b.values() + "}";
                }
            }
