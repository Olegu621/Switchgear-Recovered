            package p000;

            import android.util.ArrayMap;
            import java.util.Collections;
            import java.util.Map;
            import java.util.Set;
            import java.util.TreeMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class nq1 implements InterfaceC2235ty {

                /* JADX INFO: renamed from: b */
                public static final kl0 f14409b;

                /* JADX INFO: renamed from: c */
                public static final nq1 f14410c;

                /* JADX INFO: renamed from: a */
                public final TreeMap f14411a;

                static {
/* 4 */             kl0 kl0Var = new kl0(2);
/* 7 */             f14409b = kl0Var;
/* 19 */            f14410c = new nq1(new TreeMap(kl0Var));
                }

                public nq1(TreeMap treeMap) {
/* 4 */             this.f14411a = treeMap;
                }

                /* JADX INFO: renamed from: d */
                public static nq1 m7021d(InterfaceC2235ty interfaceC2235ty) {
/* 11 */            if (nq1.class.equals(interfaceC2235ty.getClass())) {
/* 13 */                return (nq1) interfaceC2235ty;
                    }
/* 20 */            TreeMap treeMap = new TreeMap(f14409b);
/* 35 */            for (C1888lf c1888lf : interfaceC2235ty.mo7024c()) {
/* 43 */                Set<EnumC2198sy> setMo7026f = interfaceC2235ty.mo7026f(c1888lf);
/* 49 */                ArrayMap arrayMap = new ArrayMap();
/* 60 */                for (EnumC2198sy enumC2198sy : setMo7026f) {
/* 72 */                    arrayMap.put(enumC2198sy, interfaceC2235ty.mo7027g(c1888lf, enumC2198sy));
                        }
/* 76 */                treeMap.put(c1888lf, arrayMap);
                    }
/* 82 */            return new nq1(treeMap);
                }

                @Override // p000.InterfaceC2235ty
                /* JADX INFO: renamed from: a */
                public final void mo7022a(C2076pn c2076pn) {
/* 29 */            for (Map.Entry entry : this.f14411a.tailMap(new C1888lf("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
/* 49 */                if (!((C1888lf) entry.getKey()).f13218a.startsWith("camera2.captureRequest.option.")) {
/* 80 */                    return;
                        }
/* 56 */                C1888lf c1888lf = (C1888lf) entry.getKey();
/* 60 */                C1974nr c1974nr = (C1974nr) c2076pn.f15182b;
/* 64 */                InterfaceC2235ty interfaceC2235ty = (InterfaceC2235ty) c2076pn.f15183c;
/* 76 */                c1974nr.f14413b.m9036o(c1888lf, interfaceC2235ty.mo7029i(c1888lf), interfaceC2235ty.mo7025e(c1888lf));
                    }
                }

                @Override // p000.InterfaceC2235ty
                /* JADX INFO: renamed from: b */
                public final Object mo7023b(C1888lf c1888lf, Object obj) {
                    try {
/* 1 */                 return mo7025e(c1888lf);
                    } catch (IllegalArgumentException unused) {
/* 6 */                 return obj;
                    }
                }

                @Override // p000.InterfaceC2235ty
                /* JADX INFO: renamed from: c */
                public final Set mo7024c() {
/* 7 */             return Collections.unmodifiableSet(this.f14411a.keySet());
                }

                @Override // p000.InterfaceC2235ty
                /* JADX INFO: renamed from: e */
                public final Object mo7025e(C1888lf c1888lf) {
/* 7 */             Map map = (Map) this.f14411a.get(c1888lf);
/* 9 */             if (map != null) {
/* 21 */                return map.get((EnumC2198sy) Collections.min(map.keySet()));
                    }
/* 28 */            s80.m8430k(c1888lf, "Option does not exist: ");
/* 31 */            return null;
                }

                @Override // p000.InterfaceC2235ty
                /* JADX INFO: renamed from: f */
                public final Set mo7026f(C1888lf c1888lf) {
/* 7 */             Map map = (Map) this.f14411a.get(c1888lf);
                    return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
                }

                @Override // p000.InterfaceC2235ty
                /* JADX INFO: renamed from: g */
                public final Object mo7027g(C1888lf c1888lf, EnumC2198sy enumC2198sy) {
/* 7 */             Map map = (Map) this.f14411a.get(c1888lf);
/* 12 */            if (map == null) {
/* 31 */                s80.m8430k(c1888lf, "Option does not exist: ");
/* 9 */                 return null;
                    }
/* 18 */            if (map.containsKey(enumC2198sy)) {
/* 20 */                return map.get(enumC2198sy);
                    }
/* 27 */            ds0.m3196m("Option does not exist: ", c1888lf, " with priority=", enumC2198sy);
/* 9 */             return null;
                }

                @Override // p000.InterfaceC2235ty
                /* JADX INFO: renamed from: h */
                public final boolean mo7028h(C1888lf c1888lf) {
/* 3 */             return this.f14411a.containsKey(c1888lf);
                }

                @Override // p000.InterfaceC2235ty
                /* JADX INFO: renamed from: i */
                public final EnumC2198sy mo7029i(C1888lf c1888lf) {
/* 7 */             Map map = (Map) this.f14411a.get(c1888lf);
/* 9 */             if (map != null) {
/* 19 */                return (EnumC2198sy) Collections.min(map.keySet());
                    }
/* 24 */            s80.m8430k(c1888lf, "Option does not exist: ");
/* 27 */            return null;
                }
            }
