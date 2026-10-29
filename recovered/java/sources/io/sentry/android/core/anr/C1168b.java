            package io.sentry.android.core.anr;
            
            /* JADX INFO: renamed from: io.sentry.android.core.anr.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1168b {

                /* JADX INFO: renamed from: a */
                public final StackTraceElement[] f9953a;

                /* JADX INFO: renamed from: b */
                public final int f9954b;

                /* JADX INFO: renamed from: c */
                public final int f9955c;

                /* JADX INFO: renamed from: d */
                public final int f9956d;

                public C1168b(StackTraceElement[] stackTraceElementArr, int i, int i2) {
/* 4 */             this.f9953a = stackTraceElementArr;
/* 6 */             this.f9954b = i;
/* 8 */             this.f9955c = i2;
/* 10 */            int iHashCode = 1;
/* 13 */            while (i <= this.f9955c) {
/* 25 */                iHashCode = (iHashCode * 31) + this.f9953a[i].hashCode();
/* 26 */                i++;
                    }
/* 29 */            this.f9956d = iHashCode;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof C1168b)) {
/* 7 */                 return false;
                    }
/* 11 */            C1168b c1168b = (C1168b) obj;
/* 13 */            int i = c1168b.f9954b;
/* 19 */            if (this.f9956d != c1168b.f9956d) {
/* 7 */                 return false;
                    }
/* 22 */            int i2 = this.f9955c;
/* 24 */            int i3 = this.f9954b;
/* 27 */            int i4 = (i2 - i3) + 1;
/* 32 */            if (i4 != (c1168b.f9955c - i) + 1) {
/* 7 */                 return false;
                    }
/* 36 */            for (int i5 = 0; i5 < i4; i5++) {
/* 54 */                if (!this.f9953a[i3 + i5].equals(c1168b.f9953a[i + i5])) {
/* 7 */                     return false;
                        }
                    }
/* 1 */             return true;
                }

                public final int hashCode() {
/* 1 */             return this.f9956d;
                }
            }
