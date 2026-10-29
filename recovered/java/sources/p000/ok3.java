            package p000;

            import android.os.Bundle;
            import java.util.EnumMap;
            import java.util.Iterator;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 26 */    public final class ok3 {

                /* JADX INFO: renamed from: c */
                public static final ok3 f14791c = new ok3(100);

                /* JADX INFO: renamed from: a */
                public final EnumMap f14792a;

                /* JADX INFO: renamed from: b */
                public final int f14793b;

                public ok3(int i) {
/* 8 */             EnumMap enumMap = new EnumMap(nk3.class);
/* 11 */            this.f14792a = enumMap;
/* 13 */            nk3 nk3Var = nk3.AD_STORAGE;
/* 15 */            lk3 lk3Var = lk3.UNINITIALIZED;
/* 17 */            enumMap.put(nk3Var, lk3Var);
/* 22 */            enumMap.put(nk3.ANALYTICS_STORAGE, lk3Var);
/* 25 */            this.f14793b = i;
                }

                /* JADX INFO: renamed from: a */
                public static String m7180a(int i) {
/* 3 */             if (i == -30) {
/* 48 */                return "TCF";
                    }
/* 7 */             if (i == -20) {
/* 45 */                return "API";
                    }
/* 11 */            if (i == -10) {
/* 42 */                return "MANIFEST";
                    }
/* 13 */            if (i == 0) {
/* 39 */                return "1P_API";
                    }
/* 17 */            if (i == 30) {
/* 36 */                return "1P_INIT";
                    }
/* 21 */            if (i != 90) {
                        return i != 100 ? "OTHER" : "UNKNOWN";
                    }
/* 33 */            return "REMOTE_CONFIG";
                }

                /* JADX INFO: renamed from: b */
                public static ok3 m7181b(int i, Bundle bundle) {
/* 1 */             if (bundle == null) {
/* 5 */                 return new ok3(i);
                    }
/* 13 */            EnumMap enumMap = new EnumMap(nk3.class);
/* 22 */            for (nk3 nk3Var : mk3.STORAGE.f13844a) {
/* 36 */                enumMap.put(nk3Var, m7183d(bundle.getString(nk3Var.f14353a)));
                    }
/* 44 */            return new ok3(enumMap, i);
                }

                /* JADX INFO: renamed from: c */
                public static ok3 m7182c(int i, String str) {
/* 5 */             EnumMap enumMap = new EnumMap(nk3.class);
/* 10 */            nk3[] nk3VarArr = mk3.STORAGE.f13844a;
/* 14 */            for (int i2 = 0; i2 < nk3VarArr.length; i2++) {
/* 21 */                String str2 = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
/* 22 */                nk3 nk3Var = nk3VarArr[i2];
/* 24 */                int i3 = i2 + 2;
/* 30 */                if (i3 < str2.length()) {
/* 40 */                    enumMap.put(nk3Var, m7184e(str2.charAt(i3)));
                        } else {
/* 46 */                    enumMap.put(nk3Var, lk3.UNINITIALIZED);
                        }
                    }
/* 54 */            return new ok3(enumMap, i);
                }

                /* JADX INFO: renamed from: d */
                public static lk3 m7183d(String str) {
/* 1 */             lk3 lk3Var = lk3.UNINITIALIZED;
/* 3 */             if (str == null) {
/* 5 */                 return lk3Var;
                    }
/* 12 */            if (str.equals("granted")) {
/* 14 */                return lk3.GRANTED;
                    }
                    return str.equals("denied") ? lk3.DENIED : lk3Var;
                }

                /* JADX INFO: renamed from: e */
                public static lk3 m7184e(char c) {
/* 3 */             if (c == '+') {
/* 22 */                return lk3.POLICY;
                    }
/* 7 */             if (c != '0') {
                        return c != '1' ? lk3.UNINITIALIZED : lk3.GRANTED;
                    }
/* 19 */            return lk3.DENIED;
                }

                /* JADX INFO: renamed from: h */
                public static char m7185h(lk3 lk3Var) {
/* 1 */             if (lk3Var == null) {
/* 26 */                return '-';
                    }
/* 3 */             int iOrdinal = lk3Var.ordinal();
/* 8 */             if (iOrdinal == 1) {
/* 23 */                return '+';
                    }
/* 11 */            if (iOrdinal != 2) {
                        return iOrdinal != 3 ? '-' : '1';
                    }
/* 20 */            return '0';
                }

                /* JADX INFO: renamed from: l */
                public static boolean m7186l(int i, int i2) {
/* 1 */             int i3 = -30;
/* 5 */             if (i == -20) {
/* 7 */                 if (i2 == -30) {
/* 23 */                    return true;
                        }
/* 9 */                 i = -20;
                    }
/* 10 */            if (i != -30) {
/* 15 */                i3 = i;
                    } else if (i2 == -20) {
/* 23 */                return true;
                    }
                    return i3 == i2 || i < i2;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof ok3) {
/* 7 */                 ok3 ok3Var = (ok3) obj;
/* 15 */                for (nk3 nk3Var : mk3.STORAGE.f13844a) {
/* 31 */                    if (this.f14792a.get(nk3Var) == ok3Var.f14792a.get(nk3Var)) {
                            }
                        }
/* 41 */                if (this.f14793b == ok3Var.f14793b) {
/* 43 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0030  */
                /* JADX INFO: renamed from: f */
                public final String m7187f() {
                    int iOrdinal;
/* 5 */             StringBuilder sb = new StringBuilder("G1");
/* 14 */            for (nk3 nk3Var : mk3.STORAGE.f13844a) {
/* 24 */                lk3 lk3Var = (lk3) this.f14792a.get(nk3Var);
/* 26 */                char c = '-';
/* 28 */                if (lk3Var != null && (iOrdinal = lk3Var.ordinal()) != 0) {
/* 37 */                    if (iOrdinal == 1) {
/* 49 */                        c = '1';
                            } else if (iOrdinal == 2) {
/* 46 */                        c = '0';
                            } else if (iOrdinal == 3) {
/* 49 */                        c = '1';
                            }
                        }
/* 51 */                sb.append(c);
                    }
/* 57 */            return sb.toString();
                }

                /* JADX INFO: renamed from: g */
                public final String m7188g() {
/* 5 */             StringBuilder sb = new StringBuilder("G1");
/* 14 */            for (nk3 nk3Var : mk3.STORAGE.f13844a) {
/* 30 */                sb.append(m7185h((lk3) this.f14792a.get(nk3Var)));
                    }
/* 36 */            return sb.toString();
                }

                public final int hashCode() {
/* 7 */             Iterator it = this.f14792a.values().iterator();
/* 13 */            int iHashCode = this.f14793b * 17;
/* 19 */            while (it.hasNext()) {
/* 33 */                iHashCode = (iHashCode * 31) + ((lk3) it.next()).hashCode();
                    }
/* 35 */            return iHashCode;
                }

                /* JADX INFO: renamed from: i */
                public final boolean m7189i(nk3 nk3Var) {
                    return ((lk3) this.f14792a.get(nk3Var)) != lk3.DENIED;
                }

                /* JADX WARN: Code duplicated, block: B:14:0x0031  */
                /* JADX INFO: renamed from: j */
                public final ok3 m7190j(ok3 ok3Var) {
/* 5 */             EnumMap enumMap = new EnumMap(nk3.class);
/* 14 */            for (nk3 nk3Var : mk3.STORAGE.f13844a) {
/* 24 */                lk3 lk3Var = (lk3) this.f14792a.get(nk3Var);
/* 32 */                lk3 lk3Var2 = (lk3) ok3Var.f14792a.get(nk3Var);
/* 34 */                if (lk3Var == null) {
/* 50 */                    lk3Var = lk3Var2;
                        } else if (lk3Var2 != null) {
/* 39 */                    lk3 lk3Var3 = lk3.UNINITIALIZED;
/* 41 */                    if (lk3Var == lk3Var3) {
/* 50 */                        lk3Var = lk3Var2;
                            } else if (lk3Var2 != lk3Var3) {
/* 46 */                        lk3 lk3Var4 = lk3.POLICY;
/* 48 */                        if (lk3Var == lk3Var4) {
/* 50 */                            lk3Var = lk3Var2;
                                } else if (lk3Var2 != lk3Var4) {
/* 54 */                            lk3 lk3Var5 = lk3.DENIED;
/* 64 */                            lk3Var = (lk3Var == lk3Var5 || lk3Var2 == lk3Var5) ? lk3Var5 : lk3.GRANTED;
                                }
                            }
                        }
/* 65 */                if (lk3Var != null) {
/* 67 */                    enumMap.put(nk3Var, lk3Var);
                        }
                    }
/* 77 */            return new ok3(enumMap, 100);
                }

                /* JADX INFO: renamed from: k */
                public final ok3 m7191k(ok3 ok3Var) {
/* 5 */             EnumMap enumMap = new EnumMap(nk3.class);
/* 14 */            for (nk3 nk3Var : mk3.STORAGE.f13844a) {
/* 24 */                lk3 lk3Var = (lk3) this.f14792a.get(nk3Var);
/* 28 */                if (lk3Var == lk3.UNINITIALIZED) {
/* 36 */                    lk3Var = (lk3) ok3Var.f14792a.get(nk3Var);
                        }
/* 38 */                if (lk3Var != null) {
/* 40 */                    enumMap.put(nk3Var, lk3Var);
                        }
                    }
/* 50 */            return new ok3(enumMap, this.f14793b);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("source=");
/* 14 */            sb.append(m7180a(this.f14793b));
/* 23 */            for (nk3 nk3Var : mk3.STORAGE.f13844a) {
/* 29 */                sb.append(",");
/* 34 */                sb.append(nk3Var.f14353a);
/* 39 */                sb.append("=");
/* 48 */                lk3 lk3Var = (lk3) this.f14792a.get(nk3Var);
/* 50 */                if (lk3Var == null) {
/* 52 */                    lk3Var = lk3.UNINITIALIZED;
                        }
/* 54 */                sb.append(lk3Var);
                    }
/* 60 */            return sb.toString();
                }

/* 27 */        public ok3(EnumMap enumMap, int i) {
                    EnumMap enumMap2 = new EnumMap(nk3.class);
                    this.f14792a = enumMap2;
/* 29 */            enumMap2.putAll(enumMap);
                    this.f14793b = i;
                }
            }
