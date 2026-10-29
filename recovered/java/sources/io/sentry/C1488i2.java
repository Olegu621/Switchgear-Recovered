            package io.sentry;

            import io.sentry.hints.InterfaceC1473a;
            import io.sentry.hints.InterfaceC1476d;
            import io.sentry.protocol.C1599f;
            import io.sentry.protocol.C1600f0;
            import io.sentry.protocol.C1608j0;
            import io.sentry.protocol.C1624u;
            import io.sentry.protocol.C1625v;
            import io.sentry.util.AbstractC1704c;
            import java.io.Closeable;
            import java.util.AbstractMap;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Map;
            import java.util.concurrent.atomic.AtomicInteger;
            
            /* JADX INFO: renamed from: io.sentry.i2 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1488i2 implements InterfaceC1388c0, Closeable {

                /* JADX INFO: renamed from: a */
                public final C1554m6 f11009a;

                /* JADX INFO: renamed from: b */
                public final C1428d5 f11010b;

                /* JADX INFO: renamed from: c */
                public final C1428d5 f11011c;

                /* JADX INFO: renamed from: d */
                public volatile C1533l0 f11012d = null;

                public C1488i2(C1554m6 c1554m6) {
/* 7 */             this.f11009a = c1554m6;
/* 12 */            C1666s6 c1666s6 = new C1666s6(c1554m6, 0);
/* 20 */            this.f11011c = new C1428d5(c1666s6);
/* 27 */            this.f11010b = new C1428d5(c1666s6);
                }

                @Override // io.sentry.InterfaceC1388c0
                /* JADX INFO: renamed from: c */
                public final C1576o6 mo4925c(C1576o6 c1576o6, C1486i0 c1486i0) {
/* 3 */             if (c1576o6.f11523v == null) {
/* 7 */                 c1576o6.f11523v = "java";
                    }
/* 13 */            if (m5277k(c1576o6, c1486i0)) {
/* 15 */                m5276i(c1576o6);
/* 24 */                C1624u c1624u = this.f11009a.getSessionReplay().f11535l;
/* 26 */                if (c1624u != null) {
/* 28 */                    c1576o6.f11518c = c1624u;
                        }
                    }
/* 30 */            return c1576o6;
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 3 */             if (this.f11012d != null) {
/* 9 */                 this.f11012d.f11110f.shutdown();
                    }
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // io.sentry.InterfaceC1388c0
                /* JADX INFO: renamed from: f */
                public final C1393c5 mo4754f(C1393c5 c1393c5, C1486i0 c1486i0) {
                    ArrayList arrayList;
/* 3 */             if (c1393c5.f11523v == null) {
/* 7 */                 c1393c5.f11523v = "java";
                    }
/* 9 */             Throwable th = c1393c5.f11510U;
/* 11 */            if (th != null) {
/* 16 */                AtomicInteger atomicInteger = new AtomicInteger(-1);
/* 21 */                HashSet hashSet = new HashSet();
/* 26 */                ArrayDeque arrayDeque = new ArrayDeque();
/* 32 */                this.f11011c.m5196a(th, atomicInteger, hashSet, arrayDeque, null);
/* 45 */                c1393c5.f10786e0 = new C1425d2(new ArrayList(arrayDeque));
                    }
/* 47 */            C1599f c1599f = c1393c5.f11514Y;
/* 49 */            C1554m6 c1554m6 = this.f11009a;
/* 51 */            C1599f c1599fM5377a = C1599f.m5377a(c1599f, c1554m6);
/* 55 */            if (c1599fM5377a != null) {
/* 57 */                c1393c5.f11514Y = c1599fM5377a;
                    }
/* 63 */            Map mapMo5302a = c1554m6.getModulesLoader().mo5302a();
/* 67 */            if (mapMo5302a != null) {
/* 70 */                AbstractMap abstractMap = c1393c5.f10791j0;
/* 72 */                if (abstractMap == null) {
/* 79 */                    c1393c5.f10791j0 = new HashMap(mapMo5302a);
                        } else {
/* 82 */                    abstractMap.putAll(mapMo5302a);
                        }
                    }
/* 89 */            if (m5277k(c1393c5, c1486i0)) {
/* 91 */                m5276i(c1393c5);
/* 98 */                if (c1393c5.m5108e() == null) {
/* 100 */                   ArrayList<C1625v> arrayListM5107d = c1393c5.m5107d();
/* 105 */                   if (arrayListM5107d == null || arrayListM5107d.isEmpty()) {
/* 151 */                       arrayList = null;
                            } else {
/* 117 */                       arrayList = null;
/* 122 */                       for (C1625v c1625v : arrayListM5107d) {
/* 132 */                           if (c1625v.f11476f != null && c1625v.f11474d != null) {
/* 138 */                               if (arrayList == null) {
/* 142 */                                   arrayList = new ArrayList();
                                        }
/* 147 */                               arrayList.add(c1625v.f11474d);
                                    }
                                }
                            }
/* 152 */                   boolean zIsAttachThreads = c1554m6.isAttachThreads();
/* 158 */                   boolean zMo4961c = false;
/* 159 */                   C1428d5 c1428d5 = this.f11010b;
/* 161 */                   if (zIsAttachThreads || InterfaceC1473a.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint"))) {
/* 234 */                       Object objM5273b = c1486i0.m5273b("sentry:typeCheckHint");
/* 238 */                       boolean zIsAttachStacktrace = c1554m6.isAttachStacktrace();
/* 244 */                       if (objM5273b instanceof InterfaceC1473a) {
/* 248 */                           zMo4961c = ((InterfaceC1473a) objM5273b).mo4961c();
/* 252 */                           zIsAttachStacktrace = true;
                                }
/* 266 */                       c1393c5.f10785d0 = new C1425d2(c1428d5.m5197b(Thread.getAllStackTraces(), arrayList, zMo4961c, zIsAttachStacktrace));
                            } else if (c1554m6.isAttachStacktrace() && ((arrayListM5107d == null || arrayListM5107d.isEmpty()) && !InterfaceC1476d.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint")))) {
/* 202 */                       boolean zIsAttachStacktrace2 = c1554m6.isAttachStacktrace();
/* 208 */                       HashMap map = new HashMap();
/* 211 */                       Thread threadCurrentThread = Thread.currentThread();
/* 219 */                       map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
/* 231 */                       c1393c5.f10785d0 = new C1425d2(c1428d5.m5197b(map, null, false, zIsAttachStacktrace2));
/* 233 */                       return c1393c5;
                            }
                        }
                    }
/* 268 */           return c1393c5;
                }

                @Override // io.sentry.InterfaceC1388c0
                /* JADX INFO: renamed from: g */
                public final C1600f0 mo4755g(C1600f0 c1600f0, C1486i0 c1486i0) {
/* 3 */             if (c1600f0.f11523v == null) {
/* 7 */                 c1600f0.f11523v = "java";
                    }
/* 13 */            C1599f c1599fM5377a = C1599f.m5377a(c1600f0.f11514Y, this.f11009a);
/* 17 */            if (c1599fM5377a != null) {
/* 19 */                c1600f0.f11514Y = c1599fM5377a;
                    }
/* 25 */            if (m5277k(c1600f0, c1486i0)) {
/* 27 */                m5276i(c1600f0);
                    }
/* 30 */            return c1600f0;
                }

                @Override // io.sentry.InterfaceC1388c0
                /* JADX INFO: renamed from: h */
                public final C1575o5 mo4927h(C1575o5 c1575o5) {
/* 1 */             return c1575o5;
                }

                /* JADX INFO: renamed from: i */
                public final void m5276i(AbstractC1635q4 abstractC1635q4) {
/* 3 */             if (abstractC1635q4.f11521f == null) {
/* 11 */                abstractC1635q4.f11521f = this.f11009a.getRelease();
                    }
/* 15 */            if (abstractC1635q4.f11522i == null) {
/* 23 */                abstractC1635q4.f11522i = this.f11009a.getEnvironment();
                    }
/* 27 */            if (abstractC1635q4.f11511V == null) {
/* 35 */                abstractC1635q4.f11511V = this.f11009a.getServerName();
                    }
/* 43 */            if (this.f11009a.isAttachServerName() && abstractC1635q4.f11511V == null) {
/* 51 */                if (this.f11012d == null) {
/* 57 */                    this.f11012d = C1533l0.m5343a();
                        }
/* 61 */                if (this.f11012d != null) {
/* 63 */                    C1533l0 c1533l0 = this.f11012d;
/* 73 */                    if (c1533l0.f11107c < System.currentTimeMillis() && c1533l0.f11108d.compareAndSet(false, true)) {
/* 85 */                        c1533l0.m5344b();
                            }
/* 90 */                    abstractC1635q4.f11511V = c1533l0.f11106b;
                        }
                    }
/* 94 */            if (abstractC1635q4.f11512W == null) {
/* 102 */               abstractC1635q4.f11512W = this.f11009a.getDist();
                    }
/* 106 */           if (abstractC1635q4.f11518c == null) {
/* 114 */               abstractC1635q4.f11518c = this.f11009a.getSdkVersion();
                    }
/* 116 */           AbstractMap abstractMap = abstractC1635q4.f11520e;
/* 118 */           C1554m6 c1554m6 = this.f11009a;
/* 120 */           if (abstractMap == null) {
/* 126 */               abstractC1635q4.m5383c(c1554m6.getTags());
                    } else {
/* 146 */               for (Map.Entry<String, String> entry : c1554m6.getTags().entrySet()) {
/* 164 */                   if (!abstractC1635q4.f11520e.containsKey(entry.getKey())) {
/* 178 */                       abstractC1635q4.m5382b(entry.getKey(), entry.getValue());
                            }
                        }
                    }
/* 182 */           C1608j0 c1608j0 = abstractC1635q4.f11524w;
/* 184 */           if (c1608j0 == null) {
/* 188 */               c1608j0 = new C1608j0();
/* 191 */               abstractC1635q4.f11524w = c1608j0;
                    }
/* 195 */           if (c1608j0.f11364d == null && this.f11009a.isSendDefaultPii()) {
/* 207 */               c1608j0.f11364d = "{{auto}}";
                    }
                }

                /* JADX INFO: renamed from: k */
                public final boolean m5277k(AbstractC1635q4 abstractC1635q4, C1486i0 c1486i0) {
/* 5 */             if (AbstractC1704c.m5463r(c1486i0)) {
/* 7 */                 return true;
                    }
/* 25 */            this.f11009a.getLogger().mo4672k(EnumC1553m5.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", abstractC1635q4.f11516a);
/* 28 */            return false;
                }
            }
