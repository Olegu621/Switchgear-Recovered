            package com.google.android.gms.internal.auth;

            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.content.pm.ProviderInfo;
            import android.net.Uri;
            import android.os.Build;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzcq {
                static volatile zzdh zza = zzdh.zzc();
                private static final Object zzb = new Object();

                public static boolean zza(Context context, Uri uri) {
/* 1 */             String authority = uri.getAuthority();
/* 11 */            boolean z = false;
/* 12 */            if (!"com.google.android.gms.phenotype".equals(authority)) {
/* 26 */                AbstractC1245n0.m4876d("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
/* 11 */                return false;
                    }
/* 36 */            if (zza.zzb()) {
/* 46 */                return ((Boolean) zza.zza()).booleanValue();
                    }
                    synchronized (zzb) {
                        try {
/* 60 */                    if (zza.zzb()) {
/* 70 */                        return ((Boolean) zza.zza()).booleanValue();
                            }
                            try {
/* 88 */                        if (!"com.google.android.gms".equals(context.getPackageName())) {
/* 107 */                           ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
/* 111 */                           if (providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                                    }
/* 149 */                           zza = zzdh.zzd(Boolean.valueOf(z));
/* 160 */                           return ((Boolean) zza.zza()).booleanValue();
                                }
/* 138 */                       if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
/* 140 */                           z = true;
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
/* 149 */                   zza = zzdh.zzd(Boolean.valueOf(z));
/* 160 */                   return ((Boolean) zza.zza()).booleanValue();
                        } catch (Throwable th) {
/* 166 */                   throw th;
                        }
                    }
                }
            }
