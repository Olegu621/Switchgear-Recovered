            package com.google.firebase.analytics.connector.internal;

            import android.os.Bundle;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.Arrays;
            import p000.fx0;
            import p000.kb1;
            import p000.mn0;
            import p000.ww0;
            import p000.xe2;
            import p000.zw0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzc {
                public static final /* synthetic */ int zza = 0;
                private static final fx0 zzb;
                private static final zw0 zzc;
                private static final zw0 zzd;
                private static final zw0 zze;
                private static final zw0 zzf;
                private static final zw0 zzg;

                static {
/* 19 */            String[] strArr = {"_ac", FirebaseAnalytics.Event.CAMPAIGN_DETAILS, "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"};
/* 23 */            int i = fx0.f8391c;
/* 27 */            Object[] objArr = new Object[15];
/* 32 */            objArr[0] = "_in";
/* 37 */            objArr[1] = "_xa";
/* 42 */            objArr[2] = "_xu";
/* 47 */            objArr[3] = "_aq";
/* 52 */            objArr[4] = "_aa";
/* 57 */            objArr[5] = "_ai";
/* 62 */            System.arraycopy(strArr, 0, objArr, 6, 9);
/* 69 */            zzb = fx0.m3851h(15, objArr);
/* 71 */            ww0 ww0Var = zw0.f20360b;
/* 87 */            Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
/* 92 */            xe2.m9768f(7, objArr2);
/* 99 */            zzc = zw0.m10447f(7, objArr2);
/* 107 */           Object[] objArr3 = {"auto", "app", "am"};
/* 111 */           xe2.m9768f(3, objArr3);
/* 118 */           zzd = zw0.m10447f(3, objArr3);
/* 124 */           Object[] objArr4 = {"_r", "_dbg"};
/* 128 */           xe2.m9768f(2, objArr4);
/* 135 */           zze = zw0.m10447f(2, objArr4);
/* 139 */           kb1.m6057j(4, "initialCapacity");
/* 144 */           String[] strArr2 = mn0.f13873h;
/* 146 */           xe2.m9768f(15, strArr2);
/* 153 */           Object[] objArrCopyOf = Arrays.copyOf(new Object[4], mn0.m6698n(4, 15));
/* 157 */           System.arraycopy(strArr2, 0, objArrCopyOf, 0, 15);
/* 160 */           String[] strArr3 = mn0.f13874i;
/* 162 */           xe2.m9768f(15, strArr3);
/* 168 */           if (objArrCopyOf.length < 30) {
/* 175 */               objArrCopyOf = Arrays.copyOf(objArrCopyOf, mn0.m6698n(objArrCopyOf.length, 30));
                    }
/* 179 */           System.arraycopy(strArr3, 0, objArrCopyOf, 15, 15);
/* 186 */           zzf = zw0.m10447f(30, objArrCopyOf);
/* 192 */           Object[] objArr5 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
/* 196 */           xe2.m9768f(2, objArr5);
/* 203 */           zzg = zw0.m10447f(2, objArr5);
                }

                public static boolean zza(String str) {
                    return !zzd.contains(str);
                }

                public static boolean zzb(String str, Bundle bundle) {
/* 8 */             if (zzc.contains(str)) {
/* 7 */                 return false;
                    }
/* 11 */            if (bundle == null) {
/* 37 */                return true;
                    }
/* 13 */            zw0 zw0Var = zze;
/* 15 */            int size = zw0Var.size();
/* 19 */            int i = 0;
/* 20 */            while (i < size) {
/* 28 */                boolean zContainsKey = bundle.containsKey((String) zw0Var.get(i));
/* 32 */                i++;
/* 34 */                if (zContainsKey) {
/* 7 */                     return false;
                        }
                    }
/* 37 */            return true;
                }

                public static boolean zzc(String str) {
                    return !zzb.contains(str);
                }

                public static boolean zzd(String str, String str2) {
/* 11 */            if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
                        return str.equals("fcm") || str.equals("frc");
                    }
/* 28 */            if ("_ln".equals(str2)) {
                        return str.equals("fcm") || str.equals("fiam");
                    }
/* 53 */            if (zzf.contains(str2)) {
/* 10 */                return false;
                    }
/* 56 */            zw0 zw0Var = zzg;
/* 58 */            int size = zw0Var.size();
/* 62 */            int i = 0;
/* 63 */            while (i < size) {
/* 71 */                boolean zMatches = str2.matches((String) zw0Var.get(i));
/* 75 */                i++;
/* 77 */                if (zMatches) {
/* 10 */                    return false;
                        }
                    }
/* 9 */             return true;
                }

                public static boolean zze(String str, String str2, Bundle bundle) {
/* 8 */             if (!"_cmp".equals(str2)) {
/* 7 */                 return true;
                    }
/* 16 */            if (!zza(str) || bundle == null) {
/* 15 */                return false;
                    }
/* 22 */            zw0 zw0Var = zze;
/* 24 */            int size = zw0Var.size();
/* 28 */            int i = 0;
/* 29 */            while (i < size) {
/* 37 */                boolean zContainsKey = bundle.containsKey((String) zw0Var.get(i));
/* 41 */                i++;
/* 43 */                if (zContainsKey) {
/* 15 */                    return false;
                        }
                    }
/* 46 */            int iHashCode = str.hashCode();
/* 55 */            if (iHashCode != 101200) {
/* 60 */                if (iHashCode != 101230) {
/* 65 */                    if (iHashCode == 3142703 && str.equals("fiam")) {
/* 78 */                        bundle.putString("_cis", "fiam_integration");
/* 7 */                         return true;
                            }
                        } else if (str.equals("fdl")) {
/* 92 */                    bundle.putString("_cis", "fdl_integration");
/* 7 */                     return true;
                        }
                    } else if (str.equals("fcm")) {
/* 106 */               bundle.putString("_cis", "fcm_integration");
/* 7 */                 return true;
                    }
/* 15 */            return false;
                }
            }
