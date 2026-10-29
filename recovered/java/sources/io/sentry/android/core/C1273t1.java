            package io.sentry.android.core;
            
            /* JADX INFO: renamed from: io.sentry.android.core.t1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 17 */    public final class C1273t1 implements Comparable {

                /* JADX INFO: renamed from: a */
                public final long f10334a;

                /* JADX INFO: renamed from: b */
                public final long f10335b;

                /* JADX INFO: renamed from: c */
                public final long f10336c;

                /* JADX INFO: renamed from: d */
                public final long f10337d;

                /* JADX INFO: renamed from: e */
                public final boolean f10338e;

                /* JADX INFO: renamed from: f */
                public final boolean f10339f;

                /* JADX INFO: renamed from: i */
                public final long f10340i;

                public C1273t1(long j, long j2, long j3, long j4, boolean z, boolean z2, long j5) {
/* 4 */             this.f10334a = j;
/* 6 */             this.f10335b = j2;
/* 8 */             this.f10336c = j3;
/* 10 */            this.f10337d = j4;
/* 12 */            this.f10338e = z;
/* 14 */            this.f10339f = z2;
/* 16 */            this.f10340i = j5;
                }

                @Override // java.lang.Comparable
                public final int compareTo(Object obj) {
/* 7 */             return Long.compare(this.f10335b, ((C1273t1) obj).f10335b);
                }

/* 18 */        public C1273t1(long j) {
/* 19 */            this(j, j, 0L, 0L, false, false, 0L);
                }
            }
