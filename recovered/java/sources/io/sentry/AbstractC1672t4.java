            package io.sentry;
            
            /* JADX INFO: renamed from: io.sentry.t4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1672t4 implements Comparable {
                @Override // java.lang.Comparable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public int compareTo(AbstractC1672t4 abstractC1672t4) {
/* 9 */             return Long.compare(mo5278d(), abstractC1672t4.mo5278d());
                }

                /* JADX INFO: renamed from: b */
                public long mo5412b(AbstractC1672t4 abstractC1672t4) {
/* 9 */             return mo5278d() - abstractC1672t4.mo5278d();
                }

                /* JADX INFO: renamed from: c */
                public long mo5413c(AbstractC1672t4 abstractC1672t4) {
                    return (abstractC1672t4 == null || compareTo(abstractC1672t4) >= 0) ? mo5278d() : abstractC1672t4.mo5278d();
                }

                /* JADX INFO: renamed from: d */
                public abstract long mo5278d();
            }
