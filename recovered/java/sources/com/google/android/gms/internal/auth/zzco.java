            package com.google.android.gms.internal.auth;

            import android.content.Context;
            import android.database.ContentObserver;
            import io.sentry.android.core.AbstractC1245n0;
            import p000.qj3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 23 */    final class zzco implements zzcl {
                private static zzco zza;
                private final Context zzb;
                private final ContentObserver zzc;

                private zzco(Context context) {
/* 4 */             this.zzb = context;
/* 9 */             zzcn zzcnVar = new zzcn(this, null);
/* 12 */            this.zzc = zzcnVar;
/* 21 */            context.getContentResolver().registerContentObserver(zzcb.zza, true, zzcnVar);
                }

                public static zzco zza(Context context) {
                    zzco zzcoVar;
                    synchronized (zzco.class) {
                        try {
/* 6 */                     if (zza == null) {
/* 29 */                        zza = qj3.m7891b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzco(context) : new zzco();
                            }
/* 31 */                    zzcoVar = zza;
                        } catch (Throwable th) {
/* 36 */                    throw th;
                        }
                    }
/* 34 */            return zzcoVar;
                }

                public static synchronized void zze() {
                    Context context;
                    try {
/* 4 */                 zzco zzcoVar = zza;
/* 6 */                 if (zzcoVar != null && (context = zzcoVar.zzb) != null && zzcoVar.zzc != null) {
/* 24 */                    context.getContentResolver().unregisterContentObserver(zza.zzc);
                        }
/* 31 */                zza = null;
                    } catch (Throwable th) {
/* 36 */                throw th;
                    }
                }

                @Override // com.google.android.gms.internal.auth.zzcl
                /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
                public final String zzb(final String str) {
/* 1 */             Context context = this.zzb;
/* 4 */             if (context != null && !zzcc.zza(context)) {
                        try {
/* 22 */                    return (String) zzcj.zza(new zzck() { // from class: com.google.android.gms.internal.auth.zzcm
                                @Override // com.google.android.gms.internal.auth.zzck
                                public final Object zza() {
/* 5 */                             return this.zza.zzd(str);
                                }
                            });
                        } catch (IllegalStateException | NullPointerException | SecurityException e) {
/* 42 */                    AbstractC1245n0.m4877e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
                        }
                    }
/* 3 */             return null;
                }

                public final /* synthetic */ String zzd(String str) {
/* 8 */             return zzcb.zza(this.zzb.getContentResolver(), str, null);
                }

/* 24 */        private zzco() {
                    this.zzb = null;
                    this.zzc = null;
                }
            }
