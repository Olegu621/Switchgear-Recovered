            package io.sentry.config;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.config.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1418b implements InterfaceC1420d {

                /* JADX INFO: renamed from: a */
                public final ArrayList f10844a;

                public C1418b(ArrayList arrayList) {
/* 4 */             this.f10844a = arrayList;
                }

                @Override // io.sentry.config.InterfaceC1420d
                /* JADX INFO: renamed from: c */
                public final Map mo5185c() {
/* 3 */             ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
/* 8 */             Iterator it = this.f10844a.iterator();
/* 16 */            while (it.hasNext()) {
/* 28 */                concurrentHashMap.putAll(((InterfaceC1420d) it.next()).mo5185c());
                    }
/* 32 */            return concurrentHashMap;
                }

                @Override // io.sentry.config.InterfaceC1420d
                public final String getProperty(String str) {
/* 3 */             Iterator it = this.f10844a.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                String property = ((InterfaceC1420d) it.next()).getProperty(str);
/* 23 */                if (property != null) {
/* 25 */                    return property;
                        }
                    }
/* 26 */            return null;
                }
            }
