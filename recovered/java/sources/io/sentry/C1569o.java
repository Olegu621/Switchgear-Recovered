            package io.sentry;

            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.hints.EnumC1477e;
            import io.sentry.protocol.C1625v;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.WeakHashMap;
            
            /* JADX INFO: renamed from: io.sentry.o */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 19 */    public final class C1569o implements InterfaceC1388c0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f11183a;

                /* JADX INFO: renamed from: b */
                public final Map f11184b;

                /* JADX INFO: renamed from: c */
                public final C1554m6 f11185c;

                public C1569o(C1554m6 c1554m6) {
/* 2 */             this.f11183a = 1;
/* 16 */            this.f11184b = Collections.synchronizedMap(new WeakHashMap());
/* 18 */            this.f11185c = c1554m6;
                }

                @Override // io.sentry.InterfaceC1388c0
                /* JADX INFO: renamed from: f */
                public final C1393c5 mo4754f(C1393c5 c1393c5, C1486i0 c1486i0) {
                    C1625v c1625vM5109f;
                    String str;
                    Long l;
/* 1 */             int i = this.f11183a;
/* 3 */             C1554m6 c1554m6 = this.f11185c;
/* 5 */             Map map = this.f11184b;
                    switch (i) {
                        case 0:
/* 124 */                   if (!C1540l7.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint")) || (c1625vM5109f = c1393c5.m5109f()) == null || (str = c1625vM5109f.f11471a) == null || (l = c1625vM5109f.f11474d) == null) {
/* 189 */                       return c1393c5;
                            }
/* 148 */                   Long l2 = (Long) map.get(str);
/* 150 */                   if (l2 == null || l2.equals(l)) {
/* 186 */                       map.put(str, l);
/* 189 */                       return c1393c5;
                            }
/* 174 */                   ((SentryAndroidOptions) c1554m6).getLogger().mo4672k(EnumC1553m5.INFO, "Event %s has been dropped due to multi-threaded deduplication", c1393c5.f11516a);
/* 181 */                   c1486i0.m5275d(EnumC1477e.MULTITHREADED_DEDUPLICATION, "sentry:eventDropReason");
/* 7 */                     return null;
                        default:
/* 15 */                    if (!c1554m6.isEnableDeduplication()) {
/* 108 */                       c1554m6.getLogger().mo4672k(EnumC1553m5.DEBUG, "Event deduplication is disabled.", new Object[0]);
/* 111 */                       return c1393c5;
                            }
/* 17 */                    Throwable thM5381a = c1393c5.m5381a();
/* 21 */                    if (thM5381a == null) {
/* 111 */                       return c1393c5;
                            }
/* 27 */                    if (!map.containsKey(thM5381a)) {
/* 31 */                        ArrayList arrayList = new ArrayList();
/* 39 */                        for (Throwable cause = thM5381a; cause.getCause() != null; cause = cause.getCause()) {
/* 45 */                            arrayList.add(cause.getCause());
                                }
/* 53 */                        Iterator it = arrayList.iterator();
/* 61 */                        while (it.hasNext()) {
/* 71 */                            if (map.containsKey(it.next())) {
                                    }
                                }
/* 74 */                        map.put(thM5381a, null);
/* 111 */                       return c1393c5;
                            }
/* 92 */                    c1554m6.getLogger().mo4672k(EnumC1553m5.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", c1393c5.f11516a);
/* 7 */                     return null;
                    }
                }

/* 20 */        public C1569o(SentryAndroidOptions sentryAndroidOptions) {
                    this.f11183a = 0;
/* 23 */            this.f11184b = Collections.synchronizedMap(new HashMap());
/* 24 */            this.f11185c = sentryAndroidOptions;
                }
            }
