            package p000;

            import android.util.ArrayMap;
            import java.util.Collections;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import java.util.TreeMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class uk1 extends nq1 {
                /* JADX INFO: renamed from: j */
                public static uk1 m9034j() {
/* 10 */            return new uk1(new TreeMap(nq1.f14409b));
                }

                /* JADX INFO: renamed from: m */
                public static uk1 m9035m(InterfaceC2235ty interfaceC2235ty) {
/* 5 */             TreeMap treeMap = new TreeMap(nq1.f14409b);
/* 20 */            for (C1888lf c1888lf : interfaceC2235ty.mo7024c()) {
/* 28 */                Set<EnumC2198sy> setMo7026f = interfaceC2235ty.mo7026f(c1888lf);
/* 34 */                ArrayMap arrayMap = new ArrayMap();
/* 45 */                for (EnumC2198sy enumC2198sy : setMo7026f) {
/* 57 */                    arrayMap.put(enumC2198sy, interfaceC2235ty.mo7027g(c1888lf, enumC2198sy));
                        }
/* 61 */                treeMap.put(c1888lf, arrayMap);
                    }
/* 67 */            return new uk1(treeMap);
                }

                /* JADX INFO: renamed from: o */
                public final void m9036o(C1888lf c1888lf, EnumC2198sy enumC2198sy, Object obj) {
                    EnumC2198sy enumC2198sy2;
/* 1 */             TreeMap treeMap = this.f14411a;
/* 7 */             Map map = (Map) treeMap.get(c1888lf);
/* 9 */             if (map == null) {
/* 13 */                ArrayMap arrayMap = new ArrayMap();
/* 16 */                treeMap.put(c1888lf, arrayMap);
/* 19 */                arrayMap.put(enumC2198sy, obj);
/* 22 */                return;
                    }
/* 31 */            EnumC2198sy enumC2198sy3 = (EnumC2198sy) Collections.min(map.keySet());
/* 41 */            if (Objects.equals(map.get(enumC2198sy3), obj) || enumC2198sy3 != (enumC2198sy2 = EnumC2198sy.f16865b) || enumC2198sy != enumC2198sy2) {
/* 106 */               map.put(enumC2198sy, obj);
/* 109 */               return;
                    }
/* 56 */            StringBuilder sb = new StringBuilder("Option values conflicts: ");
/* 61 */            sb.append(c1888lf.f13218a);
/* 66 */            sb.append(", existing value (");
/* 69 */            sb.append(enumC2198sy3);
/* 72 */            Object obj2 = map.get(enumC2198sy3);
/* 78 */            sb.append(")=");
/* 81 */            sb.append(obj2);
/* 86 */            sb.append(", conflicting (");
/* 89 */            sb.append(enumC2198sy);
/* 92 */            sb.append(")=");
/* 95 */            sb.append(obj);
/* 105 */           throw new IllegalArgumentException(sb.toString());
                }

                /* JADX INFO: renamed from: p */
                public final void m9037p(C1888lf c1888lf, Object obj) {
/* 3 */             m9036o(c1888lf, EnumC2198sy.f16866c, obj);
                }
            }
