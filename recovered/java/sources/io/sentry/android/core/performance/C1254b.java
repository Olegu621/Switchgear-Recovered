            package io.sentry.android.core.performance;
            
            /* JADX INFO: renamed from: io.sentry.android.core.performance.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1254b implements Comparable {

                /* JADX INFO: renamed from: a */
                public final C1260h f10249a = new C1260h();

                /* JADX INFO: renamed from: b */
                public final C1260h f10250b = new C1260h();

                @Override // java.lang.Comparable
                public final int compareTo(Object obj) {
/* 1 */             C1254b c1254b = (C1254b) obj;
/* 11 */            int iCompare = Long.compare(this.f10249a.f10283c, c1254b.f10249a.f10283c);
                    return iCompare == 0 ? Long.compare(this.f10250b.f10283c, c1254b.f10250b.f10283c) : iCompare;
                }
            }
