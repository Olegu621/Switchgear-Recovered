            package com.google.android.gms.internal.playcore_age_signals;

            import android.content.Context;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.content.pm.Signature;
            import android.os.Build;
            import java.util.ArrayList;
            import java.util.Iterator;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzr {
                private static final zzd zza = new zzd("PhoneskyVerificationUtils");

                public static int zza(Context context) {
                    try {
/* 9 */                 PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
/* 13 */                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
/* 15 */                if (applicationInfo != null && applicationInfo.enabled && zzc(packageInfo.signatures)) {
/* 30 */                    return packageInfo.versionCode;
                        }
/* 33 */                return 0;
                    } catch (PackageManager.NameNotFoundException unused) {
/* 33 */                return 0;
                    }
                }

                public static boolean zzb(Context context) {
                    try {
/* 16 */                if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                            try {
/* 44 */                        if (zzc(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
/* 46 */                            return true;
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
/* 52 */                        zza.zzd("Play Store package is not found.", new Object[0]);
                            }
                        } else {
/* 24 */                    zza.zzd("Play Store package is disabled.", new Object[0]);
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
/* 60 */                zza.zzd("Play Store package is not found.", new Object[0]);
                    }
/* 5 */             return false;
                }

                private static boolean zzc(Signature[] signatureArr) {
/* 2 */             if (signatureArr == null || (signatureArr.length) == 0) {
/* 132 */               zza.zzd("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
/* 1 */                 return false;
                    }
/* 11 */            ArrayList arrayList = new ArrayList();
/* 15 */            for (Signature signature : signatureArr) {
/* 23 */                String strZza = zzq.zza(signature.toByteArray());
/* 27 */                arrayList.add(strZza);
/* 36 */                if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strZza)) {
/* 68 */                    return true;
                        }
/* 38 */                String str = Build.TAGS;
/* 46 */                if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strZza)) {
/* 68 */                    return true;
                        }
                    }
/* 70 */            zzd zzdVar = zza;
/* 74 */            StringBuilder sb = new StringBuilder();
/* 77 */            Iterator it = arrayList.iterator();
/* 85 */            if (it.hasNext()) {
                        while (true) {
/* 93 */                    sb.append((CharSequence) it.next());
/* 100 */                   if (!it.hasNext()) {
                                break;
                            }
/* 104 */                   sb.append((CharSequence) ", ");
                        }
                    }
/* 122 */           zzdVar.zzd(fm0.m3784j("Play Store package certs are not valid. Found these sha256 certs: [", sb.toString(), "]."), new Object[0]);
/* 1 */             return false;
                }
            }
