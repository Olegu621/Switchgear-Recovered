            package com.google.android.recaptcha.internal;

            import android.content.Context;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.os.Build;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import p000.qr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     public final class zzcz implements zzda {
                private final qr0 zza;

                public zzcz() {
/* 6 */             this.zza = qr0.f15712b;
                }

                @Override // com.google.android.recaptcha.internal.zzda
                public final String zza(Context context) {
                    try {
/* 1 */                 PackageManager packageManager = context.getPackageManager();
/* 5 */                 String packageName = context.getPackageName();
/* 13 */                if (Build.VERSION.SDK_INT >= 30) {
/* 1 */                     String initiatingPackageName = packageManager.getInstallSourceInfo(packageName).getInitiatingPackageName();
/* 23 */                    if (initiatingPackageName != null) {
/* 26 */                        return initiatingPackageName;
                            }
                        } else {
/* 27 */                    String installerPackageName = packageManager.getInstallerPackageName(packageName);
/* 31 */                    if (installerPackageName != null) {
/* 34 */                        return installerPackageName;
                            }
                        }
/* 35 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    } catch (Exception unused) {
/* 35 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzda
                public final boolean zzb(Context context) {
                    return zzd(context) == 3;
                }

                @Override // com.google.android.recaptcha.internal.zzda
                public final boolean zzc(Context context) {
                    try {
/* 6 */                 List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
/* 10 */                if (installedPackages != null && installedPackages.isEmpty()) {
/* 1 */                     return false;
                        }
/* 19 */                Iterator<T> it = installedPackages.iterator();
/* 27 */                while (it.hasNext()) {
/* 43 */                    if (Intrinsics.m6216a(((PackageInfo) it.next()).packageName, "com.android.vending")) {
/* 45 */                        return true;
                            }
                        }
/* 1 */                 return false;
                    } catch (Exception unused) {
/* 1 */                 return false;
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzda
                public final int zzd(Context context) {
/* 3 */             int iMo7541b = this.zza.mo7541b(context);
                    return (iMo7541b == 1 || iMo7541b == 3 || iMo7541b == 9) ? 4 : 3;
                }

/* 8 */         public zzcz(qr0 qr0Var) {
                    this.zza = qr0Var;
                }
            }
