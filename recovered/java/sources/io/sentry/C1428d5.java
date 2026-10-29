            package io.sentry;

            import io.sentry.exception.C1440a;
            import io.sentry.protocol.C1594c0;
            import io.sentry.protocol.C1598e0;
            import io.sentry.protocol.C1615o;
            import io.sentry.protocol.C1625v;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.atomic.AtomicInteger;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: io.sentry.d5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1428d5 {

                /* JADX INFO: renamed from: a */
                public final C1666s6 f10850a;

                /* JADX INFO: renamed from: c */
                public static C1625v m5195c(Throwable th, C1615o c1615o, Long l, List list, boolean z) {
/* 5 */             Package r0 = th.getClass().getPackage();
/* 13 */            String name = th.getClass().getName();
/* 19 */            C1625v c1625v = new C1625v();
/* 22 */            String message = th.getMessage();
/* 26 */            if (r0 != null) {
/* 51 */                name = name.replace(r0.getName() + ".", HttpUrl.FRAGMENT_ENCODE_SET);
                    }
/* 62 */            String name2 = r0 != null ? r0.getName() : null;
/* 63 */            if (list != null && !list.isEmpty()) {
/* 73 */                C1594c0 c1594c0 = new C1594c0(list);
/* 76 */                if (z) {
/* 80 */                    c1594c0.f11287c = Boolean.TRUE;
                        }
/* 82 */                c1625v.f11475e = c1594c0;
                    }
/* 84 */            c1625v.f11474d = l;
/* 86 */            c1625v.f11471a = name;
/* 88 */            c1625v.f11476f = c1615o;
/* 90 */            c1625v.f11473c = name2;
/* 92 */            c1625v.f11472b = message;
/* 94 */            return c1625v;
                }

                /* JADX INFO: renamed from: a */
                public void m5196a(Throwable th, AtomicInteger atomicInteger, HashSet hashSet, ArrayDeque arrayDeque, String str) {
                    Thread threadCurrentThread;
                    C1615o c1615o;
                    boolean z;
/* 1 */             int iIncrementAndGet = atomicInteger.get();
/* 6 */             String str2 = str;
/* 8 */             while (th != null && hashSet.add(th)) {
/* 16 */                if (str2 == null) {
/* 18 */                    str2 = "chained";
                        }
/* 23 */                if (th instanceof C1440a) {
/* 25 */                    C1440a c1440a = (C1440a) th;
/* 27 */                    C1615o c1615o2 = c1440a.f10920a;
/* 29 */                    Throwable th2 = c1440a.f10921b;
/* 31 */                    threadCurrentThread = c1440a.f10922c;
/* 33 */                    z = c1440a.f10923d;
/* 37 */                    th = th2;
/* 38 */                    c1615o = c1615o2;
                        } else {
/* 42 */                    C1615o c1615o3 = new C1615o();
/* 45 */                    threadCurrentThread = Thread.currentThread();
/* 49 */                    c1615o = c1615o3;
/* 50 */                    z = false;
                        }
/* 82 */                C1625v c1625vM5195c = m5195c(th, c1615o, threadCurrentThread != null ? Long.valueOf(threadCurrentThread.getId()) : null, this.f10850a.m5409m(th.getStackTrace(), Boolean.FALSE.equals(c1615o.f11414d)), z);
/* 86 */                ArrayDeque arrayDeque2 = arrayDeque;
/* 88 */                arrayDeque2.addFirst(c1625vM5195c);
/* 93 */                if (c1615o.f11411a == null) {
/* 95 */                    c1615o.f11411a = str2;
                        }
/* 101 */               if (atomicInteger.get() >= 0) {
/* 107 */                   c1615o.f11419w = Integer.valueOf(iIncrementAndGet);
                        }
/* 109 */               iIncrementAndGet = atomicInteger.incrementAndGet();
/* 117 */               c1615o.f11418v = Integer.valueOf(iIncrementAndGet);
/* 119 */               Throwable[] suppressed = th.getSuppressed();
/* 123 */               if (suppressed != null && suppressed.length > 0) {
/* 128 */                   int length = suppressed.length;
/* 129 */                   int i = 0;
/* 130 */                   while (i < length) {
/* 139 */                       m5196a(suppressed[i], atomicInteger, hashSet, arrayDeque2, "suppressed");
/* 142 */                       i++;
/* 144 */                       arrayDeque2 = arrayDeque;
                            }
                        }
/* 147 */               th = th.getCause();
/* 151 */               str2 = null;
                    }
                }

                /* JADX INFO: renamed from: b */
                public ArrayList m5197b(Map map, ArrayList arrayList, boolean z, boolean z2) {
                    ArrayList arrayListM5409m;
/* 1 */             Thread threadCurrentThread = Thread.currentThread();
/* 9 */             if (map.isEmpty()) {
/* 183 */               return null;
                    }
/* 13 */            ArrayList arrayList2 = new ArrayList();
/* 20 */            if (!map.containsKey(threadCurrentThread)) {
/* 26 */                map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
                    }
/* 41 */            for (Map.Entry entry : map.entrySet()) {
/* 53 */                Thread thread = (Thread) entry.getKey();
/* 80 */                boolean z3 = (thread == threadCurrentThread && !z) || !(arrayList == null || !arrayList.contains(Long.valueOf(thread.getId())) || z);
/* 85 */                StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
/* 91 */                Thread thread2 = (Thread) entry.getKey();
/* 95 */                C1598e0 c1598e0 = new C1598e0();
/* 102 */               c1598e0.f11300c = thread2.getName();
/* 112 */               c1598e0.f11299b = Integer.valueOf(thread2.getPriority());
/* 122 */               c1598e0.f11298a = Long.valueOf(thread2.getId());
/* 132 */               c1598e0.f11304i = Boolean.valueOf(thread2.isDaemon());
/* 142 */               c1598e0.f11301d = thread2.getState().name();
/* 148 */               c1598e0.f11302e = Boolean.valueOf(z3);
/* 150 */               if (z2 && (arrayListM5409m = this.f10850a.m5409m(stackTraceElementArr, false)) != null && !arrayListM5409m.isEmpty()) {
/* 168 */                   C1594c0 c1594c0 = new C1594c0(arrayListM5409m);
/* 173 */                   c1594c0.f11287c = Boolean.TRUE;
/* 175 */                   c1598e0.f11306w = c1594c0;
                        }
/* 177 */               arrayList2.add(c1598e0);
                    }
/* 182 */           return arrayList2;
                }
            }
