            package io.sentry.cache.tape;

            import java.io.Closeable;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            
            /* JADX INFO: renamed from: io.sentry.cache.tape.f */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1407f implements Iterable, Closeable {
                /* JADX INFO: renamed from: c */
                public abstract void mo5130c(Object obj);

                public void clear() {
/* 5 */             mo5131g(size());
                }

                /* JADX INFO: renamed from: f */
                public final List m5134f() {
/* 9 */             int iMin = Math.min(size(), size());
/* 15 */            ArrayList arrayList = new ArrayList(iMin);
/* 18 */            Iterator it = iterator();
/* 23 */            for (int i = 0; i < iMin; i++) {
/* 29 */                arrayList.add(it.next());
                    }
/* 35 */            return Collections.unmodifiableList(arrayList);
                }

                /* JADX INFO: renamed from: g */
                public abstract void mo5131g(int i);

                public abstract int size();
            }
