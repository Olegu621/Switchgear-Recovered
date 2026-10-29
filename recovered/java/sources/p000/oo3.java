            package p000;

            import android.content.SharedPreferences;
            import android.text.TextUtils;
            import com.google.android.gms.internal.measurement.zzko;
            import com.google.android.gms.internal.measurement.zzkp;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class oo3 {

                /* JADX INFO: renamed from: a */
                public static final t22 f14853a;

                static {
/* 29 */            ww0 ww0Var = zw0.f20360b;
/* 33 */            Object[] objArr = new Object[24];
/* 38 */            objArr[0] = "Version";
/* 43 */            objArr[1] = "GoogleConsent";
/* 48 */            objArr[2] = "VendorConsent";
/* 53 */            objArr[3] = "VendorLegitimateInterest";
/* 58 */            objArr[4] = "gdprApplies";
/* 63 */            objArr[5] = "EnableAdvertiserConsentMode";
/* 68 */            objArr[6] = "PolicyVersion";
/* 73 */            objArr[7] = "PurposeConsents";
/* 79 */            objArr[8] = "PurposeOneTreatment";
/* 85 */            objArr[9] = "Purpose1";
/* 91 */            objArr[10] = "Purpose3";
/* 97 */            objArr[11] = "Purpose4";
/* 101 */           System.arraycopy(new String[]{"Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics"}, 0, objArr, 12, 12);
/* 104 */           xe2.m9768f(24, objArr);
/* 111 */           f14853a = zw0.m10447f(24, objArr);
                }

                /* JADX INFO: renamed from: a */
                public static String m7223a(SharedPreferences sharedPreferences, String str) {
                    try {
/* 3 */                 return sharedPreferences.getString(str, HttpUrl.FRAGMENT_ENCODE_SET);
                    } catch (ClassCastException unused) {
/* 1 */                 return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                }

                /* JADX INFO: renamed from: b */
                public static final boolean m7224b(zzko zzkoVar, y22 y22Var, y22 y22Var2, re2 re2Var, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
                    no3 no3Var;
                    char c;
/* 1 */             int iM7225c = m7225c(zzkoVar);
/* 8 */             if (iM7225c > 0 && (i2 != 1 || i != 1)) {
/* 14 */                cArr[iM7225c] = '2';
                    }
/* 22 */            if (m7229g(zzkoVar, y22Var2) == zzkp.PURPOSE_RESTRICTION_NOT_ALLOWED) {
/* 24 */                c = '3';
                    } else {
/* 30 */                if (zzkoVar == zzko.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i3 == 1 && re2Var.f16028d.equals(str)) {
/* 42 */                    if (iM7225c > 0 && cArr[iM7225c] != '2') {
/* 50 */                        cArr[iM7225c] = '1';
                            }
/* 7 */                     return true;
                        }
/* 59 */                if (y22Var.containsKey(zzkoVar) && (no3Var = (no3) y22Var.get(zzkoVar)) != null) {
/* 72 */                    int iOrdinal = no3Var.ordinal();
/* 78 */                    if (iOrdinal != 0) {
/* 80 */                        if (iOrdinal != 1) {
/* 83 */                            if (iOrdinal == 2) {
                                        return m7229g(zzkoVar, y22Var2) == zzkp.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? m7228f(zzkoVar, cArr, str3, z2) : m7227e(zzkoVar, cArr, str2, z);
                                    }
/* 86 */                            if (iOrdinal == 3) {
                                        return m7229g(zzkoVar, y22Var2) == zzkp.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? m7227e(zzkoVar, cArr, str2, z) : m7228f(zzkoVar, cArr, str3, z2);
                                    }
/* 61 */                            c = '0';
                                } else if (m7229g(zzkoVar, y22Var2) != zzkp.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
/* 135 */                           return m7228f(zzkoVar, cArr, str3, z2);
                                }
                            } else if (m7229g(zzkoVar, y22Var2) != zzkp.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
/* 159 */                       return m7227e(zzkoVar, cArr, str2, z);
                            }
/* 133 */                   c = '8';
                        } else {
/* 61 */                    c = '0';
                        }
                    }
/* 149 */           if (iM7225c <= 0 || cArr[iM7225c] == '2') {
/* 157 */               return false;
                    }
/* 155 */           cArr[iM7225c] = c;
/* 157 */           return false;
                }

                /* JADX INFO: renamed from: c */
                public static final int m7225c(zzko zzkoVar) {
/* 3 */             if (zzkoVar == zzko.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
/* 5 */                 return 1;
                    }
/* 9 */             if (zzkoVar == zzko.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
/* 11 */                return 2;
                    }
/* 15 */            if (zzkoVar == zzko.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
/* 17 */                return 3;
                    }
                    return zzkoVar == zzko.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
                }

                /* JADX INFO: renamed from: d */
                public static final String m7226d(zzko zzkoVar, String str, String str2) {
/* 5 */             String strValueOf = "0";
/* 29 */            String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < zzkoVar.zza()) ? "0" : String.valueOf(str.charAt(zzkoVar.zza() - 1));
/* 39 */            if (!TextUtils.isEmpty(str2) && str2.length() >= zzkoVar.zza()) {
/* 61 */                strValueOf = String.valueOf(str2.charAt(zzkoVar.zza() - 1));
                    }
/* 73 */            return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
                }

                /* JADX INFO: renamed from: e */
                public static final boolean m7227e(zzko zzkoVar, char[] cArr, String str, boolean z) {
                    char c;
/* 1 */             int iM7225c = m7225c(zzkoVar);
/* 8 */             if (!z) {
/* 10 */                c = '4';
                    } else {
/* 21 */                if (str.length() >= zzkoVar.zza()) {
/* 40 */                    char cCharAt = str.charAt(zzkoVar.zza() - 1);
/* 46 */                    boolean z2 = cCharAt == '1';
/* 49 */                    if (iM7225c > 0 && cArr[iM7225c] != '2') {
/* 60 */                        cArr[iM7225c] = cCharAt != '1' ? '6' : '1';
                            }
/* 62 */                    return z2;
                        }
/* 23 */                c = '0';
                    }
/* 25 */            if (iM7225c > 0 && cArr[iM7225c] != '2') {
/* 31 */                cArr[iM7225c] = c;
                    }
/* 5 */             return false;
                }

                /* JADX INFO: renamed from: f */
                public static final boolean m7228f(zzko zzkoVar, char[] cArr, String str, boolean z) {
                    char c;
/* 1 */             int iM7225c = m7225c(zzkoVar);
/* 8 */             if (!z) {
/* 10 */                c = '5';
                    } else {
/* 21 */                if (str.length() >= zzkoVar.zza()) {
/* 40 */                    char cCharAt = str.charAt(zzkoVar.zza() - 1);
/* 46 */                    boolean z2 = cCharAt == '1';
/* 49 */                    if (iM7225c > 0 && cArr[iM7225c] != '2') {
/* 60 */                        cArr[iM7225c] = cCharAt != '1' ? '7' : '1';
                            }
/* 62 */                    return z2;
                        }
/* 23 */                c = '0';
                    }
/* 25 */            if (iM7225c > 0 && cArr[iM7225c] != '2') {
/* 31 */                cArr[iM7225c] = c;
                    }
/* 5 */             return false;
                }

                /* JADX INFO: renamed from: g */
                public static final zzkp m7229g(zzko zzkoVar, y22 y22Var) {
/* 1 */             Object obj = zzkp.PURPOSE_RESTRICTION_UNDEFINED;
/* 3 */             Object obj2 = y22Var.get(zzkoVar);
/* 7 */             if (obj2 != null) {
/* 9 */                 obj = obj2;
                    }
/* 10 */            return (zzkp) obj;
                }
            }
