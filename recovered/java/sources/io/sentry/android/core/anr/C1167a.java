            package io.sentry.android.core.anr;
            
            /* JADX INFO: renamed from: io.sentry.android.core.anr.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1167a {

                /* JADX INFO: renamed from: a */
                public final int f9945a;

                /* JADX INFO: renamed from: b */
                public final float f9946b;

                /* JADX INFO: renamed from: c */
                public final StackTraceElement[] f9947c;

                /* JADX INFO: renamed from: d */
                public final int f9948d;

                /* JADX INFO: renamed from: e */
                public final int f9949e;

                /* JADX INFO: renamed from: f */
                public int f9950f = 1;

                /* JADX INFO: renamed from: g */
                public long f9951g;

                /* JADX INFO: renamed from: h */
                public long f9952h;

                public C1167a(StackTraceElement[] stackTraceElementArr, int i, int i2, long j, float f) {
/* 4 */             this.f9947c = stackTraceElementArr;
/* 6 */             this.f9948d = i;
/* 8 */             this.f9949e = i2;
/* 13 */            this.f9945a = (i2 - i) + 1;
/* 15 */            this.f9951g = j;
/* 17 */            this.f9952h = j;
/* 21 */            this.f9946b = f;
                }
            }
