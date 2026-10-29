            package com.google.android.gms.internal.measurement;

            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.content.pm.ProviderInfo;
            import android.net.Uri;
            import android.os.Build;
            import io.sentry.android.core.AbstractC1245n0;
            import p000.C0826d;
            import p000.lq1;
            import p000.sw1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzjz {
                static volatile lq1 zza = C0826d.f6944a;
                private static final Object zzb = new Object();

                /* JADX WARN: Code duplicated, block: B:29:0x0079 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #1 {all -> 0x004b, blocks: (B:12:0x0035, B:14:0x003d, B:15:0x0049, B:19:0x004d, B:21:0x0059, B:25:0x0069, B:27:0x006f, B:34:0x008a, B:35:0x0095, B:29:0x0079, B:30:0x007d, B:31:0x0083), top: B:43:0x0035 }] */
                /* JADX WARN: Code duplicated, block: B:33:0x0089  */
                public static boolean zza(Context context, Uri uri) {
/* 3 */             String authority = uri.getAuthority();
/* 11 */            boolean z = false;
/* 12 */            if (!"com.google.android.gms.phenotype".equals(authority)) {
/* 26 */                AbstractC1245n0.m4876d("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
/* 11 */                return false;
                    }
/* 36 */            if (zza.mo2902b()) {
/* 46 */                return ((Boolean) zza.mo2901a()).booleanValue();
                    }
                    synchronized (zzb) {
                        try {
/* 60 */                    if (zza.mo2902b()) {
/* 70 */                        return ((Boolean) zza.mo2901a()).booleanValue();
                            }
/* 88 */                    if (!"com.google.android.gms".equals(context.getPackageName())) {
/* 106 */                       ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
/* 110 */                       if (providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                                    try {
/* 136 */                               if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
/* 138 */                                   z = true;
                                        }
                                    } catch (PackageManager.NameNotFoundException unused) {
                                    }
                                }
                            } else if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
/* 138 */                       z = true;
                            }
/* 148 */                   zza = new sw1(Boolean.valueOf(z));
/* 159 */                   return ((Boolean) zza.mo2901a()).booleanValue();
                        } catch (Throwable th) {
/* 165 */                   throw th;
                        }
                    }
                }
            }
