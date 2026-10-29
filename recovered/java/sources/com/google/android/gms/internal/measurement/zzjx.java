            package com.google.android.gms.internal.measurement;

            import android.content.Context;
            import android.database.ContentObserver;
            import io.sentry.android.core.AbstractC1245n0;
            import p000.qj3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 16 */    final class zzjx implements zzju {
                private static zzjx zza;
                private final Context zzb;
                private final ContentObserver zzc;
                private boolean zzd;

                private zzjx(Context context) {
/* 5 */             this.zzd = false;
/* 7 */             this.zzb = context;
/* 15 */            this.zzc = new zzjv(this, null);
                }

                public static zzjx zza(Context context) {
                    zzjx zzjxVar;
                    synchronized (zzjx.class) {
                        try {
/* 6 */                     if (zza == null) {
/* 29 */                        zza = qj3.m7891b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzjx(context) : new zzjx();
                            }
/* 31 */                    zzjx zzjxVar2 = zza;
/* 33 */                    if (zzjxVar2 != null && zzjxVar2.zzc != null && !zzjxVar2.zzd) {
                                try {
/* 54 */                            context.getContentResolver().registerContentObserver(zzjg.zza, true, zza.zzc);
/* 57 */                            zzjx zzjxVar3 = zza;
/* 59 */                            zzjxVar3.getClass();
/* 62 */                            zzjxVar3.zzd = true;
                                } catch (SecurityException e) {
/* 70 */                            AbstractC1245n0.m4877e("GservicesLoader", "Unable to register Gservices content observer", e);
                                }
                            }
/* 73 */                    zzjxVar = zza;
/* 75 */                    zzjxVar.getClass();
                        } catch (Throwable th) {
/* 81 */                    throw th;
                        }
                    }
/* 79 */            return zzjxVar;
                }

                public static synchronized void zzc() {
                    Context context;
                    try {
/* 4 */                 zzjx zzjxVar = zza;
/* 6 */                 if (zzjxVar != null && (context = zzjxVar.zzb) != null && zzjxVar.zzc != null && zzjxVar.zzd) {
/* 28 */                    context.getContentResolver().unregisterContentObserver(zza.zzc);
                        }
/* 35 */                zza = null;
                    } catch (Throwable th) {
/* 40 */                throw th;
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzju
                /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
                public final String zze(final String str) {
/* 1 */             Context context = this.zzb;
/* 4 */             if (context != null && !zzjm.zzb(context)) {
                        try {
/* 22 */                    return (String) zzju.zzg(new zzjt() { // from class: com.google.android.gms.internal.measurement.zzjw
                                @Override // com.google.android.gms.internal.measurement.zzjt
                                public final /* synthetic */ Object zza() {
/* 5 */                             return this.zza.zzd(str);
                                }
                            });
                        } catch (IllegalStateException | NullPointerException | SecurityException e) {
/* 38 */                    AbstractC1245n0.m4877e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                        }
                    }
/* 3 */             return null;
                }

                public final String zzd(String str) {
/* 1 */             Context context = this.zzb;
/* 3 */             context.getClass();
/* 11 */            return zzjf.zza(context.getContentResolver(), str, null);
                }

/* 17 */        private zzjx() {
                    this.zzd = false;
                    this.zzb = null;
                    this.zzc = null;
                }
            }
