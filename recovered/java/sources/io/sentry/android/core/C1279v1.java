            package io.sentry.android.core;

            import io.sentry.util.AbstractC1704c;
            import java.util.Arrays;
            
            /* JADX INFO: renamed from: io.sentry.android.core.v1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1279v1 {

                /* JADX INFO: renamed from: a */
                public final Integer f10374a;

                /* JADX INFO: renamed from: b */
                public final Boolean f10375b;

                public C1279v1(Boolean bool, Integer num) {
/* 4 */             this.f10374a = num;
/* 6 */             this.f10375b = bool;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof C1279v1)) {
/* 3 */                 return false;
                    }
/* 7 */             C1279v1 c1279v1 = (C1279v1) obj;
                    return AbstractC1704c.m5453h(this.f10374a, c1279v1.f10374a) && AbstractC1704c.m5453h(this.f10375b, c1279v1.f10375b);
                }

                public final int hashCode() {
/* 9 */             return Arrays.hashCode(new Object[]{this.f10374a, this.f10375b});
                }
            }
