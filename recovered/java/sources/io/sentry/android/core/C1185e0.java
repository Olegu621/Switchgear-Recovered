            package io.sentry.android.core;

            import android.view.View;
            import io.sentry.android.replay.C1346u;
            import io.sentry.android.replay.InterfaceC1317f;
            import io.sentry.util.C1702a;
            import java.util.concurrent.CopyOnWriteArrayList;
            import p000.xe2;
            
            /* JADX INFO: renamed from: io.sentry.android.core.e0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1185e0 extends CopyOnWriteArrayList {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10000a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f10001b;

                public /* synthetic */ C1185e0(Object obj, int i) {
/* 1 */             this.f10000a = i;
/* 3 */             this.f10001b = obj;
                }

                @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
                public final boolean add(Object obj) throws Exception {
                    switch (this.f10000a) {
                        case 0:
/* 59 */                    InterfaceC1182d0 interfaceC1182d0 = (InterfaceC1182d0) obj;
/* 61 */                    boolean zAdd = super.add(interfaceC1182d0);
/* 79 */                    if (Boolean.FALSE.equals(((C1188f0) this.f10001b).f10012b.f10021d)) {
/* 81 */                        interfaceC1182d0.mo4761c();
                            } else if (Boolean.TRUE.equals(((C1188f0) this.f10001b).f10012b.f10021d)) {
/* 101 */                       interfaceC1182d0.mo4762f();
                            }
/* 104 */                   return zAdd;
                        default:
/* 6 */                     InterfaceC1317f interfaceC1317f = (InterfaceC1317f) obj;
/* 10 */                    C1346u c1346u = (C1346u) this.f10001b;
/* 12 */                    C1702a c1702a = c1346u.f10641b;
/* 14 */                    c1702a.m5443c();
                            try {
/* 27 */                        for (View view : c1346u.f10643d) {
/* 35 */                            if (interfaceC1317f != null) {
/* 38 */                                interfaceC1317f.mo5002c(view, true);
                                    }
                                }
/* 45 */                        xe2.m9770h(c1702a, null);
/* 48 */                        return super.add(interfaceC1317f);
                            } catch (Throwable th) {
                                try {
/* 53 */                            throw th;
                                } catch (Throwable th2) {
/* 55 */                            xe2.m9770h(c1702a, th);
/* 58 */                            throw th2;
                                }
                            }
                    }
                }

                @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
                public /* bridge */ boolean contains(Object obj) {
                    switch (this.f10000a) {
                        case 1:
/* 17 */                    if (obj == null ? true : obj instanceof InterfaceC1317f) {
/* 23 */                        return super.contains((InterfaceC1317f) obj);
                            }
/* 19 */                    return false;
                        default:
/* 6 */                     return super.contains(obj);
                    }
                }

                @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
                public /* bridge */ int indexOf(Object obj) {
                    switch (this.f10000a) {
                        case 1:
/* 17 */                    if (obj == null ? true : obj instanceof InterfaceC1317f) {
/* 23 */                        return super.indexOf((InterfaceC1317f) obj);
                            }
/* 19 */                    return -1;
                        default:
/* 6 */                     return super.indexOf(obj);
                    }
                }

                @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
                public /* bridge */ int lastIndexOf(Object obj) {
                    switch (this.f10000a) {
                        case 1:
/* 17 */                    if (obj == null ? true : obj instanceof InterfaceC1317f) {
/* 23 */                        return super.lastIndexOf((InterfaceC1317f) obj);
                            }
/* 19 */                    return -1;
                        default:
/* 6 */                     return super.lastIndexOf(obj);
                    }
                }

                @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
                public /* bridge */ boolean remove(Object obj) {
                    switch (this.f10000a) {
                        case 1:
/* 17 */                    if (obj == null ? true : obj instanceof InterfaceC1317f) {
/* 23 */                        return super.remove((InterfaceC1317f) obj);
                            }
/* 19 */                    return false;
                        default:
/* 6 */                     return super.remove(obj);
                    }
                }
            }
