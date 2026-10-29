            package p000;

            import java.nio.charset.Charset;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class lp3 extends LinkedHashMap {

                /* JADX INFO: renamed from: b */
                public static final lp3 f13448b;

                /* JADX INFO: renamed from: a */
                public boolean f13449a = true;

                static {
/* 3 */             lp3 lp3Var = new lp3();
/* 6 */             f13448b = lp3Var;
/* 9 */             lp3Var.f13449a = false;
                }

                /* JADX INFO: renamed from: a */
                public final void m6517a() {
/* 3 */             if (this.f13449a) {
/* 5 */                 return;
                    }
/* 6 */             f42.m3660p();
                }

                @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final void clear() {
/* 1 */             m6517a();
/* 4 */             super.clear();
                }

                @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final Set entrySet() {
                    return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof Map)) {
/* 89 */                return false;
                    }
/* 5 */             Map map = (Map) obj;
/* 7 */             if (this == map) {
/* 87 */                return true;
                    }
/* 18 */            if (size() != map.size()) {
/* 89 */                return false;
                    }
/* 33 */            for (Map.Entry entry : entrySet()) {
/* 49 */                if (!map.containsKey(entry.getKey())) {
/* 89 */                    return false;
                        }
/* 51 */                Object value = entry.getValue();
/* 59 */                Object obj2 = map.get(entry.getKey());
/* 84 */                if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
/* 89 */                    return false;
                        }
                    }
/* 87 */            return true;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final int hashCode() {
                    int iHashCode;
/* 10 */            int i = 0;
/* 15 */            for (Map.Entry entry : entrySet()) {
/* 23 */                Object key = entry.getKey();
/* 29 */                int iHashCode2 = 1;
/* 30 */                if (key instanceof byte[]) {
/* 32 */                    byte[] bArr = (byte[]) key;
/* 34 */                    int length = bArr.length;
/* 35 */                    Charset charset = so3.f16726a;
/* 38 */                    iHashCode = length;
/* 39 */                    for (byte b : bArr) {
/* 45 */                        iHashCode = (iHashCode * 31) + b;
                            }
/* 49 */                    if (iHashCode == 0) {
/* 51 */                        iHashCode = 1;
                            }
                        } else {
/* 53 */                    iHashCode = key.hashCode();
                        }
/* 57 */                Object value = entry.getValue();
/* 63 */                if (value instanceof byte[]) {
/* 65 */                    byte[] bArr2 = (byte[]) value;
/* 67 */                    int length2 = bArr2.length;
/* 68 */                    Charset charset2 = so3.f16726a;
/* 71 */                    int i2 = length2;
/* 72 */                    for (byte b2 : bArr2) {
/* 78 */                        i2 = (i2 * 31) + b2;
                            }
/* 82 */                    if (i2 != 0) {
/* 85 */                        iHashCode2 = i2;
                            }
                        } else {
/* 87 */                    iHashCode2 = value.hashCode();
                        }
/* 93 */                i += iHashCode ^ iHashCode2;
                    }
/* 95 */            return i;
                }

                @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final Object put(Object obj, Object obj2) {
/* 1 */             m6517a();
/* 4 */             Charset charset = so3.f16726a;
/* 6 */             obj.getClass();
/* 9 */             obj2.getClass();
/* 12 */            return super.put(obj, obj2);
                }

                @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final void putAll(Map map) {
/* 1 */             m6517a();
/* 16 */            for (Object obj : map.keySet()) {
/* 22 */                Charset charset = so3.f16726a;
/* 24 */                obj.getClass();
/* 31 */                map.get(obj).getClass();
                    }
/* 35 */            super.putAll(map);
                }

                @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final Object remove(Object obj) {
/* 1 */             m6517a();
/* 4 */             return super.remove(obj);
                }
            }
