            package io.sentry.internal.gestures;

            import android.view.View;
            import io.sentry.util.AbstractC1704c;
            import java.lang.ref.WeakReference;
            import java.util.Arrays;
            
            /* JADX INFO: renamed from: io.sentry.internal.gestures.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1507b {

                /* JADX INFO: renamed from: a */
                public final WeakReference f11044a;

                /* JADX INFO: renamed from: b */
                public final String f11045b;

                /* JADX INFO: renamed from: c */
                public final String f11046c;

                /* JADX INFO: renamed from: d */
                public final String f11047d = "old_view_system";

                public C1507b(View view, String str, String str2) {
/* 9 */             this.f11044a = new WeakReference(view);
/* 11 */            this.f11045b = str;
/* 13 */            this.f11046c = str2;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 44 */                return true;
                    }
/* 4 */             if (obj == null || C1507b.class != obj.getClass()) {
/* 46 */                return false;
                    }
/* 15 */            C1507b c1507b = (C1507b) obj;
                    return AbstractC1704c.m5453h(this.f11045b, c1507b.f11045b) && AbstractC1704c.m5453h(this.f11046c, c1507b.f11046c) && AbstractC1704c.m5453h(null, null);
                }

                public final int hashCode() {
/* 10 */            return Arrays.hashCode(new Object[]{this.f11044a, this.f11046c, null});
                }
            }
