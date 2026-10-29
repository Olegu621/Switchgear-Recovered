            package p000;

            import android.os.Bundle;
            import android.text.TextUtils;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mo3 {

                /* JADX INFO: renamed from: a */
                public final HashMap f13895a;

                public mo3(Map map) {
/* 6 */             HashMap map2 = new HashMap();
/* 9 */             this.f13895a = map2;
/* 11 */            map2.putAll(map);
                }

                /* JADX INFO: renamed from: a */
                public final String m6718a() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             t22 t22Var = oo3.f14853a;
/* 8 */             int i = t22Var.f16901d;
/* 11 */            for (int i2 = 0; i2 < i; i2++) {
/* 17 */                String str = (String) t22Var.get(i2);
/* 19 */                HashMap map = this.f13895a;
/* 25 */                if (map.containsKey(str)) {
/* 32 */                    if (sb.length() > 0) {
/* 36 */                        sb.append(";");
                            }
/* 39 */                    sb.append(str);
/* 44 */                    sb.append("=");
/* 53 */                    sb.append((String) map.get(str));
                        }
                    }
/* 59 */            return sb.toString();
                }

                /* JADX INFO: renamed from: b */
                public final Bundle m6719b() {
/* 1 */             ug3 ug3Var = vg3.f18114Z0;
/* 10 */            boolean zBooleanValue = ((Boolean) ug3Var.m9011a(null)).booleanValue();
/* 20 */            HashMap map = this.f13895a;
/* 22 */            if (!zBooleanValue ? !(!"1".equals(map.get("GoogleConsent")) || !"1".equals(map.get("gdprApplies")) || !"1".equals(map.get("EnableAdvertiserConsentMode"))) : !(!"1".equals(map.get("gdprApplies")) || !"1".equals(map.get("EnableAdvertiserConsentMode")))) {
/* 87 */                if (!((Boolean) ug3Var.m9011a(null)).booleanValue()) {
/* 209 */                   return m6721d();
                        }
/* 95 */                if (map.get("Version") == null) {
/* 97 */                    return m6721d();
                        }
/* 106 */               if (m6722e() >= 0) {
/* 112 */                   Bundle bundle = new Bundle();
/* 137 */                   bundle.putString("ad_storage", true != Objects.equals(map.get("AuthorizePurpose1"), "1") ? "denied" : "granted");
/* 169 */                   bundle.putString("ad_personalization", (Objects.equals(map.get("AuthorizePurpose3"), "1") && Objects.equals(map.get("AuthorizePurpose4"), "1")) ? "granted" : "denied");
/* 177 */                   if (m6722e() >= 4) {
/* 205 */                       bundle.putString("ad_user_data", (Objects.equals(map.get("AuthorizePurpose1"), "1") && Objects.equals(map.get("AuthorizePurpose7"), "1")) ? "granted" : "denied");
                            }
/* 208 */                   return bundle;
                        }
                    }
/* 214 */           return Bundle.EMPTY;
                }

                /* JADX INFO: renamed from: c */
                public final String m6720c() {
/* 1 */             HashMap map = this.f13895a;
/* 7 */             StringBuilder sb = new StringBuilder("1");
/* 10 */            int i = -1;
                    try {
/* 17 */                String str = (String) map.get("CmpSdkID");
/* 23 */                if (!TextUtils.isEmpty(str)) {
/* 25 */                    i = Integer.parseInt(str);
                        }
                    } catch (NumberFormatException unused) {
                    }
/* 33 */            if (i < 0 || i > 4095) {
/* 59 */                sb.append("00");
                    } else {
/* 45 */                sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i >> 6));
/* 53 */                sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i & 63));
                    }
/* 62 */            int iM6722e = m6722e();
/* 66 */            if (iM6722e < 0 || iM6722e > 63) {
/* 80 */                sb.append("0");
                    } else {
/* 74 */                sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iM6722e));
                    }
/* 98 */            int i2 = true != "1".equals(map.get("gdprApplies")) ? 0 : 2;
/* 109 */           int i3 = i2 | 4;
/* 111 */           if ("1".equals(map.get("EnableAdvertiserConsentMode"))) {
/* 113 */               i3 = i2 | 12;
                    }
/* 119 */           sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i3));
/* 122 */           return sb.toString();
                }

                /* JADX INFO: renamed from: d */
                public final Bundle m6721d() {
                    int iM6722e;
/* 3 */             HashMap map = this.f13895a;
/* 15 */            if ("1".equals(map.get("GoogleConsent")) && (iM6722e = m6722e()) >= 0) {
/* 31 */                String str = (String) map.get("PurposeConsents");
/* 37 */                if (!TextUtils.isEmpty(str)) {
/* 41 */                    Bundle bundle = new Bundle();
/* 49 */                    String str2 = "denied";
/* 55 */                    if (str.length() > 0) {
/* 68 */                        bundle.putString("ad_storage", str.charAt(0) == '1' ? "granted" : "denied");
                            }
/* 76 */                    if (str.length() > 3) {
/* 96 */                        bundle.putString("ad_personalization", (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                            }
/* 104 */                   if (str.length() > 6 && iM6722e >= 4) {
/* 113 */                       if (str.charAt(0) == '1' && str.charAt(6) == '1') {
/* 51 */                            str2 = "granted";
                                }
/* 124 */                       bundle.putString("ad_user_data", str2);
                            }
/* 127 */                   return bundle;
                        }
                    }
/* 128 */           return Bundle.EMPTY;
                }

                /* JADX INFO: renamed from: e */
                public final int m6722e() {
                    try {
/* 9 */                 String str = (String) this.f13895a.get("PolicyVersion");
/* 15 */                if (TextUtils.isEmpty(str)) {
/* 22 */                    return -1;
                        }
/* 17 */                return Integer.parseInt(str);
                    } catch (NumberFormatException unused) {
/* 22 */                return -1;
                    }
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof mo3) {
/* 17 */                return m6718a().equalsIgnoreCase(((mo3) obj).m6718a());
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 5 */             return m6718a().hashCode();
                }

                public final String toString() {
/* 1 */             return m6718a();
                }
            }
