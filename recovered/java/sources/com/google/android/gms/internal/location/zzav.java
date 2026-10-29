            package com.google.android.gms.internal.location;

            import android.app.PendingIntent;
            import android.content.Context;
            import android.location.Location;
            import android.os.RemoteException;
            import com.google.android.gms.location.LocationAvailability;
            import com.google.android.gms.location.LocationRequest;
            import java.util.HashMap;
            import java.util.Map;
            import p000.kb1;
            import p000.t81;
            import p000.v81;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzav {
                private final zzbg<zzam> zza;
                private final Context zzb;
                private boolean zzc = false;
                private final Map<t81, zzau> zzd = new HashMap();
                private final Map<t81, zzas> zze = new HashMap();
                private final Map<t81, zzar> zzf = new HashMap();

                public zzav(Context context, zzbg<zzam> zzbgVar) {
/* 28 */            this.zzb = context;
/* 30 */            this.zza = zzbgVar;
                }

                public final Location zza(String str) throws RemoteException {
/* 1 */             ((zzh) this.zza).zza.checkConnected();
/* 18 */            return ((zzh) this.zza).zza().zzn(str);
                }

                @Deprecated
                public final Location zzb() throws RemoteException {
/* 1 */             ((zzh) this.zza).zza.checkConnected();
/* 18 */            return ((zzh) this.zza).zza().zzm();
                }

                public final LocationAvailability zzc() throws RemoteException {
/* 1 */             ((zzh) this.zza).zza.checkConnected();
/* 24 */            return ((zzh) this.zza).zza().zzs(this.zzb.getPackageName());
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void zzd(LocationRequest locationRequest, v81 v81Var, zzai zzaiVar) throws RemoteException {
                    zzau zzauVar;
                    zzau zzauVar2;
/* 1 */             ((zzh) this.zza).zza.checkConnected();
/* 10 */            t81 t81Var = v81Var.f17916c;
/* 13 */            if (t81Var == null) {
/* 15 */                zzauVar2 = null;
                    } else {
                        synchronized (this.zzd) {
                            try {
/* 22 */                        zzauVar = this.zzd.get(t81Var);
/* 28 */                        if (zzauVar == null) {
/* 32 */                            zzauVar = new zzau(v81Var);
                                }
/* 41 */                        this.zzd.put(t81Var, zzauVar);
                            } catch (Throwable th) {
/* 75 */                        throw th;
                            }
                        }
/* 45 */                zzauVar2 = zzauVar;
                    }
/* 46 */            if (zzauVar2 == null) {
/* 48 */                return;
                    }
/* 70 */            ((zzh) this.zza).zza().zzo(new zzbc(1, zzba.zza(null, locationRequest), zzauVar2, null, null, zzaiVar));
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void zze(zzba zzbaVar, v81 v81Var, zzai zzaiVar) throws RemoteException {
                    zzar zzarVar;
/* 1 */             ((zzh) this.zza).zza.checkConnected();
/* 10 */            t81 t81Var = v81Var.f17916c;
/* 12 */            if (t81Var == null) {
/* 14 */                zzarVar = null;
                    } else {
                        synchronized (this.zzf) {
                            try {
/* 22 */                        zzar zzarVar2 = this.zzf.get(t81Var);
/* 28 */                        if (zzarVar2 == null) {
/* 32 */                            zzarVar2 = new zzar(v81Var);
                                }
/* 35 */                        zzarVar = zzarVar2;
/* 42 */                        this.zzf.put(t81Var, zzarVar);
                            } catch (Throwable th) {
/* 73 */                        throw th;
                            }
                        }
                    }
/* 15 */            zzar zzarVar3 = zzarVar;
/* 47 */            if (zzarVar3 == null) {
/* 49 */                return;
                    }
/* 68 */            ((zzh) this.zza).zza().zzo(new zzbc(1, zzbaVar, null, null, zzarVar3, zzaiVar));
                }

                public final void zzf(zzba zzbaVar, PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
/* 1 */             ((zzh) this.zza).zza.checkConnected();
/* 22 */            ((zzh) this.zza).zza().zzo(zzbc.zzb(zzbaVar, pendingIntent, zzaiVar));
                }

                public final void zzg(LocationRequest locationRequest, PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
/* 1 */             ((zzh) this.zza).zza.checkConnected();
/* 27 */            ((zzh) this.zza).zza().zzo(zzbc.zzb(zzba.zza(null, locationRequest), pendingIntent, zzaiVar));
                }

                public final void zzh(t81 t81Var, zzai zzaiVar) throws RemoteException {
/* 1 */             ((zzh) this.zza).zza.checkConnected();
/* 12 */            kb1.m6062o(t81Var, "Invalid null listener key");
                    synchronized (this.zzd) {
                        try {
/* 20 */                    zzau zzauVarRemove = this.zzd.remove(t81Var);
/* 26 */                    if (zzauVarRemove != null) {
/* 28 */                        zzauVarRemove.zzc();
/* 43 */                        ((zzh) this.zza).zza().zzo(zzbc.zza(zzauVarRemove, zzaiVar));
                            }
                        } catch (Throwable th) {
/* 52 */                    throw th;
                        }
                    }
                }

                public final void zzi(t81 t81Var, zzai zzaiVar) throws RemoteException {
/* 1 */             ((zzh) this.zza).zza.checkConnected();
/* 12 */            kb1.m6062o(t81Var, "Invalid null listener key");
                    synchronized (this.zzf) {
                        try {
/* 20 */                    zzar zzarVarRemove = this.zzf.remove(t81Var);
/* 26 */                    if (zzarVarRemove != null) {
/* 28 */                        zzarVarRemove.zzc();
/* 43 */                        ((zzh) this.zza).zza().zzo(zzbc.zzc(zzarVarRemove, zzaiVar));
                            }
                        } catch (Throwable th) {
/* 52 */                    throw th;
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void zzj(PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
/* 1 */             ((zzh) this.zza).zza.checkConnected();
/* 29 */            ((zzh) this.zza).zza().zzo(new zzbc(2, null, null, pendingIntent, null, zzaiVar));
                }

                public final void zzk(boolean z) throws RemoteException {
/* 1 */             ((zzh) this.zza).zza.checkConnected();
/* 18 */            ((zzh) this.zza).zza().zzp(z);
/* 21 */            this.zzc = z;
                }

                public final void zzl(Location location) throws RemoteException {
/* 1 */             ((zzh) this.zza).zza.checkConnected();
/* 18 */            ((zzh) this.zza).zza().zzq(location);
                }

                public final void zzm(zzai zzaiVar) throws RemoteException {
/* 1 */             ((zzh) this.zza).zza.checkConnected();
/* 18 */            ((zzh) this.zza).zza().zzr(zzaiVar);
                }

                public final void zzn() throws RemoteException {
                    synchronized (this.zzd) {
                        try {
/* 19 */                    for (zzau zzauVar : this.zzd.values()) {
/* 27 */                        if (zzauVar != null) {
/* 41 */                            ((zzh) this.zza).zza().zzo(zzbc.zza(zzauVar, null));
                                }
                            }
/* 50 */                    this.zzd.clear();
                        } catch (Throwable th) {
/* 164 */                   throw th;
                        }
                    }
                    synchronized (this.zzf) {
                        try {
/* 71 */                    for (zzar zzarVar : this.zzf.values()) {
/* 79 */                        if (zzarVar != null) {
/* 93 */                            ((zzh) this.zza).zza().zzo(zzbc.zzc(zzarVar, null));
                                }
                            }
/* 101 */                   this.zzf.clear();
                        } catch (Throwable th2) {
/* 162 */                   throw th2;
                        }
                    }
                    synchronized (this.zze) {
                        try {
/* 122 */                   for (zzas zzasVar : this.zze.values()) {
/* 130 */                       if (zzasVar != null) {
/* 146 */                           ((zzh) this.zza).zza().zzu(new zzl(2, null, zzasVar, null));
                                }
                            }
/* 154 */                   this.zze.clear();
                        } catch (Throwable th3) {
/* 160 */                   throw th3;
                        }
                    }
                }

                public final void zzo() throws RemoteException {
/* 3 */             if (this.zzc) {
/* 6 */                 zzk(false);
                    }
                }
            }
