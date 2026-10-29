            package io.sentry.android.core.internal.util;
            
            /* JADX INFO: renamed from: io.sentry.android.core.internal.util.p */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1229p implements Comparable {

                /* JADX INFO: renamed from: a */
                public final long f10189a;

                /* JADX INFO: renamed from: b */
                public final long f10190b;

                public C1229p(long j, long j2) {
/* 4 */             this.f10189a = j;
/* 6 */             this.f10190b = j2;
                }

                @Override // java.lang.Comparable
                public final int compareTo(Object obj) {
/* 1 */             C1229p c1229p = (C1229p) obj;
/* 7 */             int iCompare = Long.compare(this.f10190b, c1229p.f10190b);
                    return iCompare != 0 ? iCompare : Long.compare(this.f10189a, c1229p.f10189a);
                }
            }
