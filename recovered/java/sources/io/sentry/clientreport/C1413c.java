            package io.sentry.clientreport;

            import io.sentry.util.AbstractC1704c;
            import java.util.Arrays;
            
            /* JADX INFO: renamed from: io.sentry.clientreport.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1413c {

                /* JADX INFO: renamed from: a */
                public final String f10838a;

                /* JADX INFO: renamed from: b */
                public final String f10839b;

                public C1413c(String str, String str2) {
/* 4 */             this.f10838a = str;
/* 6 */             this.f10839b = str2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof C1413c)) {
/* 7 */                 return false;
                    }
/* 11 */            C1413c c1413c = (C1413c) obj;
                    return AbstractC1704c.m5453h(this.f10838a, c1413c.f10838a) && AbstractC1704c.m5453h(this.f10839b, c1413c.f10839b);
                }

                public final int hashCode() {
/* 9 */             return Arrays.hashCode(new Object[]{this.f10838a, this.f10839b});
                }
            }
