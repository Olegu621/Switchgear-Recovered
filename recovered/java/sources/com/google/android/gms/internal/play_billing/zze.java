            package com.google.android.gms.internal.play_billing;

            import android.content.Intent;
            import android.os.Bundle;
            import android.util.Log;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.List;
            import okhttp3.HttpUrl;
            import org.json.JSONException;
            import p000.C1795jj;
            import p000.C1833kj;
            import p000.gx0;
            import p000.sz1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zze {
                public static final int zza = Runtime.getRuntime().availableProcessors();

                public static int zza(Intent intent, String str) {
/* 3 */             if (intent != null) {
/* 16 */                return zzp(intent.getExtras(), "ProxyBillingActivity");
                    }
/* 7 */             zzl("ProxyBillingActivity", "Got null intent!");
/* 10 */            return 0;
                }

                public static int zzb(Bundle bundle, String str) {
/* 2 */             if (bundle == null) {
/* 6 */                 zzl(str, "Unexpected null bundle received!");
/* 1 */                 return 6;
                    }
/* 12 */            Object obj = bundle.get("RESPONSE_CODE");
/* 16 */            if (obj == null) {
/* 20 */                zzk(str, "getResponseCodeFromBundle() got null response code, assuming OK");
/* 23 */                return 0;
                    }
/* 27 */            if (obj instanceof Integer) {
/* 31 */                return ((Integer) obj).intValue();
                    }
/* 50 */            zzl(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
/* 1 */             return 6;
                }

                public static Bundle zzc(Bundle bundle, String str, long j) {
/* 3 */             bundle.putString("playBillingLibraryVersion", str);
/* 8 */             bundle.putLong("billingClientSessionId", j);
/* 11 */            return bundle;
                }

                public static Bundle zzd(boolean z, boolean z2, boolean z3, boolean z4, String str, long j) {
/* 3 */             Bundle bundle = new Bundle();
/* 6 */             zzc(bundle, str, j);
/* 10 */            if (z && z3) {
/* 16 */                bundle.putBoolean("enablePendingPurchases", true);
                    }
/* 19 */            if (z2 && z4) {
/* 25 */                bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
                    }
/* 28 */            return bundle;
                }

                public static Bundle zze(String str, long j) {
/* 3 */             Bundle bundle = new Bundle();
/* 6 */             zzc(bundle, str, j);
/* 9 */             return bundle;
                }

                public static C1833kj zzf(Intent intent, String str) {
/* 1 */             if (intent != null) {
/* 26 */                C1795jj c1795jjM6120a = C1833kj.m6120a();
/* 38 */                c1795jjM6120a.f12324a = zzb(intent.getExtras(), str);
/* 48 */                c1795jjM6120a.f12325b = zzh(intent.getExtras(), str);
/* 50 */                return c1795jjM6120a.m5841a();
                    }
/* 7 */             zzl("BillingHelper", "Got null intent!");
/* 10 */            C1795jj c1795jjM6120a2 = C1833kj.m6120a();
/* 15 */            c1795jjM6120a2.f12324a = 6;
/* 19 */            c1795jjM6120a2.f12325b = "An internal error occurred.";
/* 21 */            return c1795jjM6120a2.m5841a();
                }

                public static gx0 zzg(Bundle bundle, String str) {
/* 1 */             if (bundle == null) {
/* 5 */                 return new gx0();
                    }
/* 13 */            zzp(bundle, "BillingClient");
/* 18 */            bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN");
/* 21 */            return new gx0();
                }

                public static String zzh(Bundle bundle, String str) {
/* 3 */             if (bundle == null) {
/* 7 */                 zzl(str, "Unexpected null bundle received!");
/* 1 */                 return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 13 */            Object obj = bundle.get("DEBUG_MESSAGE");
/* 17 */            if (obj == null) {
/* 21 */                zzk(str, "getDebugMessageFromBundle() got null response code, assuming OK");
/* 1 */                 return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 27 */            if (obj instanceof String) {
/* 29 */                return (String) obj;
                    }
/* 46 */            zzl(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
/* 1 */             return HttpUrl.FRAGMENT_ENCODE_SET;
                }

                public static String zzi(int i) {
/* 5 */             return zzd.zza(i).toString();
                }

                public static List zzj(Bundle bundle) {
/* 3 */             ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
/* 9 */             ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
/* 15 */            ArrayList arrayList = new ArrayList();
/* 20 */            if (stringArrayList == null || stringArrayList2 == null) {
/* 101 */               sz1 sz1VarZzq = zzq(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
/* 105 */               if (sz1VarZzq == null) {
/* 109 */                   zzk("BillingHelper", "Couldn't find single purchase data as well.");
/* 112 */                   return null;
                        }
/* 114 */               arrayList.add(sz1VarZzq);
/* 117 */               return arrayList;
                    }
/* 48 */            zzk("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
/* 56 */            for (int i = 0; i < stringArrayList.size() && i < stringArrayList2.size(); i++) {
/* 76 */                sz1 sz1VarZzq2 = zzq(stringArrayList.get(i), stringArrayList2.get(i));
/* 80 */                if (sz1VarZzq2 != null) {
/* 82 */                    arrayList.add(sz1VarZzq2);
                        }
                    }
/* 88 */            return arrayList;
                }

                public static void zzk(String str, String str2) {
/* 6 */             if (!Log.isLoggable(str, 2) || str2.isEmpty()) {
/* 49 */                return;
                    }
/* 14 */            int i = 40000;
/* 21 */            while (!str2.isEmpty() && i > 0) {
/* 35 */                int iMin = Math.min(str2.length(), Math.min(4000, i));
/* 40 */                str2.substring(0, iMin);
/* 43 */                str2 = str2.substring(iMin);
/* 47 */                i -= iMin;
                    }
                }

                public static void zzl(String str, String str2) {
/* 6 */             if (Log.isLoggable(str, 5)) {
/* 8 */                 AbstractC1245n0.m4889q(str, str2);
                    }
                }

                public static void zzm(String str, String str2, Throwable th) {
                    try {
/* 6 */                 if (Log.isLoggable(str, 5)) {
/* 9 */                     if (th == null) {
/* 11 */                        AbstractC1245n0.m4889q(str, str2);
                            } else {
/* 15 */                        AbstractC1245n0.m4891s(str, str2, th);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }

                public static Bundle zzn(C1833kj c1833kj, int i) {
/* 3 */             Bundle bundle = new Bundle();
/* 10 */            bundle.putInt("RESPONSE_CODE", c1833kj.f12818a);
/* 17 */            bundle.putString("DEBUG_MESSAGE", c1833kj.f12819b);
/* 24 */            bundle.putInt("LOG_REASON", i - 1);
/* 27 */            return bundle;
                }

                public static Bundle zzo(C1833kj c1833kj, int i, String str) {
/* 2 */             Bundle bundleZzn = zzn(c1833kj, 5);
/* 6 */             if (str != null) {
/* 10 */                bundleZzn.putString("ADDITIONAL_LOG_DETAILS", str);
                    }
/* 13 */            return bundleZzn;
                }

                private static int zzp(Bundle bundle, String str) {
/* 2 */             if (bundle != null) {
/* 12 */                return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                    }
/* 6 */             zzl(str, "Unexpected null bundle received!");
/* 1 */             return 0;
                }

                private static sz1 zzq(String str, String str2) {
/* 4 */             if (str == null || str2 == null) {
/* 32 */                zzk("BillingHelper", "Received a null purchase data.");
/* 1 */                 return null;
                    }
                    try {
/* 11 */                return new sz1(str, str2);
                    } catch (JSONException e) {
/* 26 */                zzl("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
/* 1 */                 return null;
                    }
                }
            }
