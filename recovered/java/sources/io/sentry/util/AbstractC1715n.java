            package io.sentry.util;

            import io.sentry.C1456g0;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.regex.Pattern;
            
            /* JADX INFO: renamed from: io.sentry.util.n */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class AbstractC1715n {

                /* JADX INFO: renamed from: a */
                public static final ConcurrentHashMap f11742a = new ConcurrentHashMap();

                /* JADX INFO: renamed from: a */
                public static boolean m5482a(String str, List list) {
/* 2 */             if (str != null && list != null && !list.isEmpty()) {
/* 13 */                ConcurrentHashMap concurrentHashMap = f11742a;
/* 19 */                if (concurrentHashMap.containsKey(str)) {
/* 27 */                    return ((Boolean) concurrentHashMap.get(str)).booleanValue();
                        }
/* 32 */                Iterator it = list.iterator();
/* 41 */                while (it.hasNext()) {
/* 55 */                    if (((C1456g0) it.next()).f10950a.equalsIgnoreCase(str)) {
/* 59 */                        concurrentHashMap.put(str, Boolean.TRUE);
/* 40 */                        return true;
                            }
                        }
/* 63 */                Iterator it2 = list.iterator();
/* 71 */                while (it2.hasNext()) {
                            try {
/* 79 */                        Pattern pattern = ((C1456g0) it2.next()).f10951b;
/* 93 */                        if (pattern == null ? false : pattern.matcher(str).matches()) {
/* 97 */                            concurrentHashMap.put(str, Boolean.TRUE);
/* 40 */                            return true;
                                }
                                continue;
                            } catch (Throwable unused) {
                            }
                        }
/* 103 */               concurrentHashMap.put(str, Boolean.FALSE);
                    }
/* 1 */             return false;
                }
            }
