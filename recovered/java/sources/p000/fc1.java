            package p000;

            import java.nio.charset.Charset;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fc1 extends LinkedHashMap {

                /* JADX INFO: renamed from: b */
                public static final fc1 f8122b;

                /* JADX INFO: renamed from: a */
                public boolean f8123a = true;

                static {
/* 3 */             fc1 fc1Var = new fc1();
/* 6 */             f8122b = fc1Var;
/* 9 */             fc1Var.f8123a = false;
                }

                /* JADX INFO: renamed from: a */
                public static int m3711a(Object obj) {
/* 4 */             if (!(obj instanceof byte[])) {
/* 29 */                if (!(obj instanceof bz0)) {
/* 31 */                    return obj.hashCode();
                        }
/* 36 */                f42.m3660p();
/* 3 */                 return 0;
                    }
/* 6 */             byte[] bArr = (byte[]) obj;
/* 8 */             int length = bArr.length;
/* 9 */             Charset charset = ez0.f7923a;
/* 11 */            int i = length;
/* 12 */            for (byte b : bArr) {
/* 18 */                i = (i * 31) + b;
                    }
/* 22 */            if (i == 0) {
/* 24 */                return 1;
                    }
/* 26 */            return i;
                }

                /* JADX INFO: renamed from: b */
                public final void m3712b() {
/* 3 */             if (this.f8123a) {
/* 5 */                 return;
                    }
/* 6 */             f42.m3660p();
                }

                /* JADX INFO: renamed from: c */
                public final fc1 m3713c() {
/* 5 */             if (isEmpty()) {
/* 9 */                 return new fc1();
                    }
/* 15 */            fc1 fc1Var = new fc1(this);
/* 19 */            fc1Var.f8123a = true;
/* 21 */            return fc1Var;
                }

                @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final void clear() {
/* 1 */             m3712b();
/* 4 */             super.clear();
                }

                @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final Set entrySet() {
                    return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof Map)) {
/* 90 */                return false;
                    }
/* 5 */             Map map = (Map) obj;
/* 7 */             if (this == map) {
/* 88 */                return true;
                    }
/* 18 */            if (size() != map.size()) {
/* 90 */                return false;
                    }
/* 33 */            for (Map.Entry entry : entrySet()) {
/* 49 */                if (!map.containsKey(entry.getKey())) {
/* 90 */                    return false;
                        }
/* 52 */                Object value = entry.getValue();
/* 60 */                Object obj2 = map.get(entry.getKey());
/* 85 */                if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
/* 90 */                    return false;
                        }
                    }
/* 88 */            return true;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final int hashCode() {
/* 9 */             int iM3711a = 0;
/* 14 */            for (Map.Entry entry : entrySet()) {
/* 39 */                iM3711a += m3711a(entry.getValue()) ^ m3711a(entry.getKey());
                    }
/* 41 */            return iM3711a;
                }

                @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final Object put(Object obj, Object obj2) {
/* 1 */             m3712b();
/* 4 */             Charset charset = ez0.f7923a;
/* 6 */             obj.getClass();
/* 9 */             obj2.getClass();
/* 12 */            return super.put(obj, obj2);
                }

                @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final void putAll(Map map) {
/* 1 */             m3712b();
/* 16 */            for (Object obj : map.keySet()) {
/* 22 */                Charset charset = ez0.f7923a;
/* 24 */                obj.getClass();
/* 31 */                map.get(obj).getClass();
                    }
/* 35 */            super.putAll(map);
                }

                @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final Object remove(Object obj) {
/* 1 */             m3712b();
/* 4 */             return super.remove(obj);
                }
            }
