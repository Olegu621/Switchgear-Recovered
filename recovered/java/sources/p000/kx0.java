            package p000;

            import java.lang.reflect.Array;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 64 */    public abstract class kx0 {

                /* JADX INFO: renamed from: a */
                public Object f13033a;

                /* JADX INFO: renamed from: b */
                public Object f13034b;

                /* JADX INFO: renamed from: c */
                public Object f13035c;

                public kx0(Class cls, C1988o4... c1988o4Arr) {
/* 4 */             this.f13033a = cls;
/* 8 */             HashMap map = new HashMap();
/* 14 */            for (C1988o4 c1988o4 : c1988o4Arr) {
/* 20 */                boolean zContainsKey = map.containsKey(c1988o4.f14607a);
/* 24 */                Class cls2 = c1988o4.f14607a;
/* 26 */                if (zContainsKey) {
/* 40 */                    C1951n4.m6865p(cls2.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
/* 44 */                    throw null;
                        }
/* 28 */                map.put(cls2, c1988o4);
                    }
/* 46 */            if (c1988o4Arr.length > 0) {
/* 52 */                this.f13035c = c1988o4Arr[0].f14607a;
                    } else {
/* 57 */                this.f13035c = Void.class;
                    }
/* 63 */            this.f13034b = Collections.unmodifiableMap(map);
                }

                /* JADX INFO: renamed from: k */
                public static boolean m6290k(Set set, Object obj) {
/* 1 */             if (set == obj) {
/* 26 */                return true;
                    }
/* 6 */             if (!(obj instanceof Set)) {
/* 28 */                return false;
                    }
/* 8 */             Set set2 = (Set) obj;
                    try {
                        return set.size() == set2.size() && set.containsAll(set2);
                    } catch (ClassCastException | NullPointerException unused) {
/* 28 */                return false;
                    }
                }

                /* JADX INFO: renamed from: t */
                public static boolean m6291t(Map map, Collection collection) {
/* 1 */             int size = map.size();
/* 9 */             Iterator it = map.keySet().iterator();
/* 17 */            while (it.hasNext()) {
/* 27 */                if (!collection.contains(it.next())) {
/* 29 */                    it.remove();
                        }
                    }
                    return size != map.size();
                }

                /* JADX INFO: renamed from: a */
                public abstract void mo6292a();

                /* JADX INFO: renamed from: b */
                public abstract void mo4166b();

                /* JADX INFO: renamed from: c */
                public abstract Object mo4167c(int i, int i2);

                /* JADX INFO: renamed from: d */
                public abstract Map mo4168d();

                /* JADX INFO: renamed from: e */
                public abstract int mo4169e();

                /* JADX INFO: renamed from: f */
                public abstract int mo4170f(Object obj);

                /* JADX INFO: renamed from: g */
                public abstract int mo4171g(Object obj);

                /* JADX INFO: renamed from: h */
                public abstract void mo4172h(Object obj, Object obj2);

                /* JADX INFO: renamed from: i */
                public abstract void mo4173i(int i);

                /* JADX INFO: renamed from: j */
                public abstract Object mo4174j(int i, Object obj);

                /* JADX INFO: renamed from: l */
                public int mo6293l() {
/* 1 */             return 1;
                }

                /* JADX INFO: renamed from: m */
                public abstract String mo6294m();

                /* JADX INFO: renamed from: n */
                public abstract void mo6295n();

                /* JADX INFO: renamed from: o */
                public abstract sq3 mo6296o();

                /* JADX INFO: renamed from: p */
                public abstract h31 mo6297p();

                /* JADX INFO: renamed from: q */
                public abstract AbstractC2313w mo6298q(AbstractC2298vl abstractC2298vl);

                /* JADX INFO: renamed from: r */
                public abstract void mo6299r(C1965ni c1965ni);

                /* JADX INFO: renamed from: s */
                public abstract void mo6300s();

                /* JADX INFO: renamed from: u */
                public abstract void mo6301u();

                /* JADX INFO: renamed from: v */
                public Object[] m6302v(int i, Object[] objArr) {
/* 1 */             int iMo4169e = mo4169e();
/* 6 */             if (objArr.length < iMo4169e) {
/* 20 */                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iMo4169e);
                    }
/* 23 */            for (int i2 = 0; i2 < iMo4169e; i2++) {
/* 29 */                objArr[i2] = mo4167c(i2, i);
                    }
/* 35 */            if (objArr.length > iMo4169e) {
/* 38 */                objArr[iMo4169e] = null;
                    }
/* 40 */            return objArr;
                }

                /* JADX INFO: renamed from: w */
                public abstract void mo6303w();

                /* JADX INFO: renamed from: x */
                public abstract void mo6304x(AbstractC2313w abstractC2313w);

/* 65 */        public kx0(int i) {
/* 67 */            this.f13034b = new float[i * 2];
/* 68 */            this.f13035c = new int[i];
                }
            }
