            package p000;

            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Objects;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class i02 {

                /* JADX INFO: renamed from: a */
                public final boolean f9384a;

                /* JADX INFO: renamed from: b */
                public final Set f9385b;

                /* JADX INFO: renamed from: c */
                public final Set f9386c;

                public i02(boolean z, HashSet hashSet, HashSet hashSet2) {
/* 4 */             this.f9384a = z;
/* 16 */            this.f9385b = hashSet == null ? Collections.EMPTY_SET : new HashSet(hashSet);
/* 28 */            this.f9386c = hashSet2 == null ? Collections.EMPTY_SET : new HashSet(hashSet2);
                }

                /* JADX INFO: renamed from: a */
                public final boolean m4414a(Class cls, boolean z) {
/* 7 */             if (this.f9385b.contains(cls)) {
/* 25 */                return true;
                    }
                    return !this.f9386c.contains(cls) && this.f9384a && z;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof i02)) {
/* 3 */                 return false;
                    }
/* 8 */             if (this == obj) {
/* 7 */                 return true;
                    }
/* 11 */            i02 i02Var = (i02) obj;
                    return this.f9384a == i02Var.f9384a && Objects.equals(this.f9385b, i02Var.f9385b) && Objects.equals(this.f9386c, i02Var.f9386c);
                }

                public final int hashCode() {
/* 15 */            return Objects.hash(Boolean.valueOf(this.f9384a), this.f9385b, this.f9386c);
                }

                public final String toString() {
/* 38 */            return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f9384a + ", forceEnabledQuirks=" + this.f9385b + ", forceDisabledQuirks=" + this.f9386c + '}';
                }
            }
