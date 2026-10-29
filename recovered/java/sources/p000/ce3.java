            package p000;

            import android.os.Bundle;
            import java.util.EnumMap;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 45 */    public final class ce3 {

                /* JADX INFO: renamed from: f */
                public static final ce3 f2865f = new ce3((Boolean) null, 100, (Boolean) null, (String) null);

                /* JADX INFO: renamed from: a */
                public final int f2866a;

                /* JADX INFO: renamed from: b */
                public final String f2867b;

                /* JADX INFO: renamed from: c */
                public final Boolean f2868c;

                /* JADX INFO: renamed from: d */
                public final String f2869d;

                /* JADX INFO: renamed from: e */
                public final EnumMap f2870e;

                public ce3(Boolean bool, int i, Boolean bool2, String str) {
/* 8 */             EnumMap enumMap = new EnumMap(nk3.class);
/* 11 */            this.f2870e = enumMap;
/* 31 */            enumMap.put(nk3.AD_USER_DATA, bool == null ? lk3.UNINITIALIZED : bool.booleanValue() ? lk3.GRANTED : lk3.DENIED);
/* 34 */            this.f2866a = i;
/* 40 */            this.f2867b = m1649d();
/* 42 */            this.f2868c = bool2;
/* 44 */            this.f2869d = str;
                }

                /* JADX INFO: renamed from: b */
                public static ce3 m1646b(String str) {
/* 1 */             if (str == null || str.length() <= 0) {
/* 67 */                return f2865f;
                    }
/* 12 */            String[] strArrSplit = str.split(":");
/* 19 */            int i = Integer.parseInt(strArrSplit[0]);
/* 27 */            EnumMap enumMap = new EnumMap(nk3.class);
/* 32 */            nk3[] nk3VarArr = mk3.DMA.f13844a;
/* 34 */            int length = nk3VarArr.length;
/* 35 */            int i2 = 1;
/* 36 */            int i3 = 0;
/* 37 */            while (i3 < length) {
/* 53 */                enumMap.put(nk3VarArr[i3], ok3.m7184e(strArrSplit[i2].charAt(0)));
/* 56 */                i3++;
/* 41 */                i2++;
                    }
/* 63 */            return new ce3(enumMap, i, (Boolean) null, (String) null);
                }

                /* JADX INFO: renamed from: c */
                public static ce3 m1647c(int i, Bundle bundle) {
/* 2 */             if (bundle == null) {
/* 6 */                 return new ce3((Boolean) null, i, (Boolean) null, (String) null);
                    }
/* 14 */            EnumMap enumMap = new EnumMap(nk3.class);
/* 23 */            for (nk3 nk3Var : mk3.DMA.f13844a) {
/* 37 */                enumMap.put(nk3Var, ok3.m7183d(bundle.getString(nk3Var.f14353a)));
                    }
/* 67 */            return new ce3(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
                }

                /* JADX INFO: renamed from: a */
                public final lk3 m1648a() {
/* 9 */             lk3 lk3Var = (lk3) this.f2870e.get(nk3.AD_USER_DATA);
                    return lk3Var == null ? lk3.UNINITIALIZED : lk3Var;
                }

                /* JADX INFO: renamed from: d */
                public final String m1649d() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append(this.f2866a);
/* 17 */            for (nk3 nk3Var : mk3.DMA.f13844a) {
/* 23 */                sb.append(":");
/* 38 */                sb.append(ok3.m7185h((lk3) this.f2870e.get(nk3Var)));
                    }
/* 44 */            return sb.toString();
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof ce3)) {
/* 37 */                return false;
                    }
/* 6 */             ce3 ce3Var = (ce3) obj;
/* 16 */            if (this.f2867b.equalsIgnoreCase(ce3Var.f2867b) && Objects.equals(this.f2868c, ce3Var.f2868c)) {
/* 32 */                return Objects.equals(this.f2869d, ce3Var.f2869d);
                    }
/* 37 */            return false;
                }

                public final int hashCode() {
                    int i;
/* 1 */             Boolean bool = this.f2868c;
/* 3 */             if (bool == null) {
/* 5 */                 i = 3;
                    } else {
/* 17 */                i = true != bool.booleanValue() ? 13 : 7;
                    }
/* 18 */            String str = this.f2869d;
/* 40 */            return ((str == null ? 17 : str.hashCode()) * 137) + this.f2867b.hashCode() + (i * 29);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("source=");
/* 14 */            sb.append(ok3.m7180a(this.f2866a));
/* 23 */            for (nk3 nk3Var : mk3.DMA.f13844a) {
/* 29 */                sb.append(",");
/* 34 */                sb.append(nk3Var.f14353a);
/* 39 */                sb.append("=");
/* 48 */                lk3 lk3Var = (lk3) this.f2870e.get(nk3Var);
/* 52 */                if (lk3Var == null) {
/* 54 */                    sb.append("uninitialized");
                        } else {
/* 58 */                    int iOrdinal = lk3Var.ordinal();
/* 62 */                    if (iOrdinal == 0) {
/* 92 */                        sb.append("uninitialized");
                            } else if (iOrdinal == 1) {
/* 88 */                        sb.append("eu_consent_policy");
                            } else if (iOrdinal == 2) {
/* 82 */                        sb.append("denied");
                            } else if (iOrdinal == 3) {
/* 76 */                        sb.append("granted");
                            }
                        }
                    }
/* 98 */            Boolean bool = this.f2868c;
/* 100 */           if (bool != null) {
/* 104 */               sb.append(",isDmaRegion=");
/* 107 */               sb.append(bool);
                    }
/* 110 */           String str = this.f2869d;
/* 112 */           if (str != null) {
/* 116 */               sb.append(",cpsDisplayStr=");
/* 119 */               sb.append(str);
                    }
/* 122 */           return sb.toString();
                }

/* 46 */        public ce3(EnumMap enumMap, int i, Boolean bool, String str) {
                    EnumMap enumMap2 = new EnumMap(nk3.class);
                    this.f2870e = enumMap2;
/* 48 */            enumMap2.putAll(enumMap);
                    this.f2866a = i;
/* 49 */            this.f2867b = m1649d();
                    this.f2868c = bool;
                    this.f2869d = str;
                }
            }
