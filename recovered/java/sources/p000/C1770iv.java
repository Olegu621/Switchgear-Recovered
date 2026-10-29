            package p000;

            import java.lang.reflect.Method;
            
            /* JADX INFO: renamed from: iv */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1770iv {

                /* JADX INFO: renamed from: a */
                public final int f11940a;

                /* JADX INFO: renamed from: b */
                public final Method f11941b;

                public C1770iv(Method method, int i) {
/* 4 */             this.f11940a = i;
/* 6 */             this.f11941b = method;
/* 9 */             method.setAccessible(true);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 35 */                return true;
                    }
/* 6 */             if (!(obj instanceof C1770iv)) {
/* 37 */                return false;
                    }
/* 9 */             C1770iv c1770iv = (C1770iv) obj;
                    return this.f11940a == c1770iv.f11940a && this.f11941b.getName().equals(c1770iv.f11941b.getName());
                }

                public final int hashCode() {
/* 15 */            return this.f11941b.getName().hashCode() + (this.f11940a * 31);
                }
            }
