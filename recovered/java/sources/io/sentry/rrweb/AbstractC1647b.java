            package io.sentry.rrweb;

            import java.util.Arrays;
            
            /* JADX INFO: renamed from: io.sentry.rrweb.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class AbstractC1647b {

                /* JADX INFO: renamed from: a */
                public EnumC1648c f11588a;

                /* JADX INFO: renamed from: b */
                public long f11589b = System.currentTimeMillis();

                public AbstractC1647b(EnumC1648c enumC1648c) {
/* 4 */             this.f11588a = enumC1648c;
                }

                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof AbstractC1647b)) {
/* 7 */                 return false;
                    }
/* 11 */            AbstractC1647b abstractC1647b = (AbstractC1647b) obj;
                    return this.f11589b == abstractC1647b.f11589b && this.f11588a == abstractC1647b.f11588a;
                }

                public int hashCode() {
/* 13 */            return Arrays.hashCode(new Object[]{this.f11588a, Long.valueOf(this.f11589b)});
                }
            }
