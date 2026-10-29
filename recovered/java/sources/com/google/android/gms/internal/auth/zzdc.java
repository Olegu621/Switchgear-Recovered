            package com.google.android.gms.internal.auth;

            import android.content.Context;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicReference;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzdc {
                public static final /* synthetic */ int zzd = 0;
                private static volatile zzda zze;
                private static volatile boolean zzf;
                final zzcz zzb;
                final String zzc;
                private final Object zzj;
                private volatile int zzk = -1;
                private volatile Object zzl;
                private final boolean zzm;
                private static final Object zza = new Object();
                private static final AtomicReference zzg = new AtomicReference();
                private static final zzde zzh = new zzde(zzcu.zza, null);
                private static final AtomicInteger zzi = new AtomicInteger();

                public /* synthetic */ zzdc(zzcz zzczVar, String str, Object obj, boolean z, zzdb zzdbVar) {
/* 9 */             if (zzczVar.zzb == null) {
/* 23 */                C1951n4.m6859j("Must pass a valid SharedPreferences file name or ContentProvider URI");
/* 27 */                throw null;
                    }
/* 11 */            this.zzb = zzczVar;
/* 13 */            this.zzc = str;
/* 15 */            this.zzj = obj;
/* 18 */            this.zzm = true;
                }

                public static void zzd() {
/* 3 */             zzi.incrementAndGet();
                }

                public static void zze(final Context context) {
/* 3 */             if (zze == null) {
/* 5 */                 Object obj = zza;
                        synchronized (obj) {
                            try {
/* 10 */                        if (zze == null) {
                                    synchronized (obj) {
                                        try {
/* 13 */                                    zzda zzdaVar = zze;
/* 15 */                                    Context applicationContext = context.getApplicationContext();
/* 19 */                                    if (applicationContext != null) {
/* 21 */                                        context = applicationContext;
                                            }
/* 22 */                                    if (zzdaVar == null || zzdaVar.zza() != context) {
/* 33 */                                        zzcg.zzd();
/* 36 */                                        zzdd.zzc();
/* 39 */                                        zzco.zze();
/* 56 */                                        zze = new zzcd(context, zzdn.zza(new zzdj() { // from class: com.google.android.gms.internal.auth.zzct
                                                    @Override // com.google.android.gms.internal.auth.zzdj
                                                    public final Object zza() {
/* 1 */                                                 Context context2 = context;
/* 3 */                                                 int i = zzdc.zzd;
/* 5 */                                                 return zzcp.zza(context2);
                                                    }
                                                }));
/* 60 */                                        zzi.incrementAndGet();
                                            }
                                        } catch (Throwable th) {
/* 66 */                                    throw th;
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
/* 72 */                        throw th2;
                            }
                        }
                    }
                }

                public abstract Object zza(Object obj);

                /* JADX WARN: Code duplicated, block: B:41:0x009d  */
                public final Object zzb() {
                    zzcl zzclVarZza;
                    Object objZzb;
/* 4 */             if (!this.zzm && this.zzc == null) {
/* 13 */                C1951n4.m6868s("flagName must not be null");
/* 3 */                 return null;
                    }
/* 19 */            int i = zzi.get();
/* 25 */            if (this.zzk < i) {
                        synchronized (this) {
                            try {
/* 30 */                        if (this.zzk < i) {
/* 32 */                            zzda zzdaVar = zze;
/* 36 */                            if (zzdaVar == null) {
/* 216 */                               throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                                    }
/* 38 */                            zzcz zzczVar = this.zzb;
/* 40 */                            boolean z = zzczVar.zzf;
/* 44 */                            if (zzczVar.zzb == null) {
/* 88 */                                Context contextZza = zzdaVar.zza();
/* 94 */                                String str = this.zzb.zza;
/* 98 */                                zzclVarZza = zzdd.zza(contextZza, null, new Runnable() { // from class: com.google.android.gms.internal.auth.zzcs
                                            @Override // java.lang.Runnable
                                            public final void run() {
/* 1 */                                         zzdc.zzd();
                                            }
                                        });
                                    } else if (zzcq.zza(zzdaVar.zza(), this.zzb.zzb)) {
/* 62 */                                boolean z2 = this.zzb.zzh;
/* 78 */                                zzclVarZza = zzcg.zza(zzdaVar.zza().getContentResolver(), this.zzb.zzb, new Runnable() { // from class: com.google.android.gms.internal.auth.zzcs
                                            @Override // java.lang.Runnable
                                            public final void run() {
/* 1 */                                         zzdc.zzd();
                                            }
                                        });
                                    } else {
/* 86 */                                zzclVarZza = null;
                                    }
/* 119 */                           Object objZza = (zzclVarZza == null || (objZzb = zzclVarZza.zzb(zzc())) == null) ? null : zza(objZzb);
/* 120 */                           if (objZza == null) {
/* 127 */                               if (this.zzb.zze) {
/* 158 */                                   objZza = null;
                                        } else {
/* 147 */                                   String strZzc = zzco.zza(zzdaVar.zza()).zzb(this.zzb.zze ? null : this.zzc);
/* 151 */                                   if (strZzc != null) {
/* 153 */                                       objZza = zza(strZzc);
                                            } else {
/* 158 */                                       objZza = null;
                                            }
                                        }
/* 159 */                               if (objZza == null) {
/* 161 */                                   objZza = this.zzj;
                                        }
                                    }
/* 171 */                           zzdh zzdhVar = (zzdh) zzdaVar.zzb().zza();
/* 177 */                           if (zzdhVar.zzb()) {
/* 183 */                               zzci zzciVar = (zzci) zzdhVar.zza();
/* 185 */                               zzcz zzczVar2 = this.zzb;
/* 193 */                               String strZza = zzciVar.zza(zzczVar2.zzb, null, zzczVar2.zzd, this.zzc);
/* 202 */                               objZza = strZza == null ? this.zzj : zza(strZza);
                                    }
/* 206 */                           this.zzl = objZza;
/* 208 */                           this.zzk = i;
                                }
                            } catch (Throwable th) {
/* 220 */                       throw th;
                            }
                        }
                    }
/* 221 */           return this.zzl;
                }

                public final String zzc() {
/* 3 */             String str = this.zzb.zzd;
/* 5 */             return this.zzc;
                }
            }
