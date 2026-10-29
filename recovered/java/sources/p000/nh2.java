            package p000;

            import android.os.Build;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class nh2 {

                /* JADX INFO: renamed from: a */
                public static final C1888lf f14269a = new C1888lf("camera2.streamSpec.streamUseCase", Long.TYPE, null);

                /* JADX INFO: renamed from: b */
                public static final HashMap f14270b;

                /* JADX INFO: renamed from: c */
                public static final HashMap f14271c;

                static {
/* 27 */            HashMap map = new HashMap();
/* 30 */            f14270b = map;
/* 34 */            HashMap map2 = new HashMap();
/* 37 */            f14271c = map2;
/* 43 */            if (Build.VERSION.SDK_INT >= 33) {
/* 47 */                HashSet hashSet = new HashSet();
/* 50 */                bz2 bz2Var = bz2.f2640b;
/* 52 */                hashSet.add(bz2Var);
/* 55 */                bz2 bz2Var2 = bz2.f2644f;
/* 57 */                hashSet.add(bz2Var2);
/* 60 */                map.put(4L, hashSet);
/* 65 */                HashSet hashSet2 = new HashSet();
/* 68 */                hashSet2.add(bz2Var);
/* 71 */                hashSet2.add(bz2Var2);
/* 76 */                hashSet2.add(bz2.f2641c);
/* 85 */                map.put(1L, hashSet2);
/* 90 */                HashSet hashSet3 = new HashSet();
/* 93 */                bz2 bz2Var3 = bz2.f2639a;
/* 95 */                hashSet3.add(bz2Var3);
/* 104 */               map.put(2L, hashSet3);
/* 109 */               HashSet hashSet4 = new HashSet();
/* 112 */               bz2 bz2Var4 = bz2.f2642d;
/* 114 */               hashSet4.add(bz2Var4);
/* 117 */               map.put(3L, hashSet4);
/* 122 */               HashSet hashSet5 = new HashSet();
/* 125 */               hashSet5.add(bz2Var);
/* 128 */               hashSet5.add(bz2Var3);
/* 131 */               hashSet5.add(bz2Var4);
/* 134 */               map2.put(4L, hashSet5);
/* 139 */               HashSet hashSet6 = new HashSet();
/* 142 */               hashSet6.add(bz2Var);
/* 145 */               hashSet6.add(bz2Var4);
/* 148 */               map2.put(3L, hashSet6);
                    }
                }

                /* JADX INFO: renamed from: a */
                public static C0998ho m6979a(InterfaceC2235ty interfaceC2235ty, long j) {
/* 1 */             C1888lf c1888lf = f14269a;
/* 7 */             if (interfaceC2235ty.mo7028h(c1888lf) && ((Long) interfaceC2235ty.mo7025e(c1888lf)).longValue() == j) {
/* 23 */                return null;
                    }
/* 25 */            uk1 uk1VarM9035m = uk1.m9035m(interfaceC2235ty);
/* 33 */            uk1VarM9035m.m9037p(c1888lf, Long.valueOf(j));
/* 38 */            return new C0998ho(uk1VarM9035m);
                }

                /* JADX INFO: renamed from: b */
                public static boolean m6980b(bz2 bz2Var, long j, List list) {
/* 5 */             if (Build.VERSION.SDK_INT < 33) {
/* 99 */                return false;
                    }
/* 10 */            if (bz2Var != bz2.f2643e) {
/* 69 */                Long lValueOf = Long.valueOf(j);
/* 73 */                HashMap map = f14270b;
                        return map.containsKey(lValueOf) && ((Set) map.get(Long.valueOf(j))).contains(bz2Var);
                    }
/* 12 */            Long lValueOf2 = Long.valueOf(j);
/* 16 */            HashMap map2 = f14271c;
/* 22 */            if (!map2.containsKey(lValueOf2)) {
/* 99 */                return false;
                    }
/* 33 */            Set set = (Set) map2.get(Long.valueOf(j));
/* 43 */            if (list.size() != set.size()) {
/* 99 */                return false;
                    }
/* 46 */            Iterator it = list.iterator();
/* 54 */            while (it.hasNext()) {
/* 66 */                if (!set.contains((bz2) it.next())) {
/* 99 */                    return false;
                        }
                    }
/* 97 */            return true;
                }

                /* JADX INFO: renamed from: c */
                public static boolean m6981c(InterfaceC2235ty interfaceC2235ty, bz2 bz2Var) {
/* 15 */            if (((Boolean) interfaceC2235ty.mo7023b(zy2.f20390M, Boolean.FALSE)).booleanValue()) {
/* 49 */                return false;
                    }
/* 18 */            C1888lf c1888lf = aw0.f2117b;
/* 24 */            if (interfaceC2235ty.mo7028h(c1888lf)) {
                        return bz2Var.ordinal() == 0 && ((Integer) interfaceC2235ty.mo7025e(c1888lf)).intValue() == 2;
                    }
/* 49 */            return false;
                }
            }
