            package com.google.android.gms.internal.location;

            import android.app.PendingIntent;
            import android.content.Context;
            import android.location.Location;
            import android.os.Looper;
            import android.os.RemoteException;
            import com.google.android.gms.common.Feature;
            import com.google.android.gms.common.api.internal.StatusCallback;
            import com.google.android.gms.location.ActivityTransitionRequest;
            import com.google.android.gms.location.GeofencingRequest;
            import com.google.android.gms.location.LocationAvailability;
            import com.google.android.gms.location.LocationRequest;
            import com.google.android.gms.location.LocationSettingsRequest;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.List;
            import p000.C2345wv;
            import p000.InterfaceC0992hi;
            import p000.de3;
            import p000.k50;
            import p000.kb1;
            import p000.rr0;
            import p000.sr0;
            import p000.t81;
            import p000.v81;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzaz extends zzi {
                private final zzav zzf;

                public zzaz(Context context, Looper looper, rr0 rr0Var, sr0 sr0Var, String str, C2345wv c2345wv) {
/* 1 */             super(context, looper, rr0Var, sr0Var, str, c2345wv);
/* 11 */            this.zzf = new zzav(context, this.zze);
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a, p000.InterfaceC0836d9
                public final void disconnect() {
                    synchronized (this.zzf) {
/* 8 */                 if (isConnected()) {
                            try {
/* 12 */                        this.zzf.zzn();
/* 17 */                        this.zzf.zzo();
                            } catch (Exception e) {
/* 28 */                        AbstractC1245n0.m4877e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                            }
/* 31 */                    super.disconnect();
                        } else {
/* 31 */                    super.disconnect();
                        }
/* 37 */                throw th;
                    }
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final boolean usesClientTelemetry() {
/* 1 */             return true;
                }

                public final LocationAvailability zzA() throws RemoteException {
/* 3 */             return this.zzf.zzc();
                }

                public final void zzB(zzba zzbaVar, v81 v81Var, zzai zzaiVar) throws RemoteException {
                    synchronized (this.zzf) {
/* 6 */                 this.zzf.zze(zzbaVar, v81Var, zzaiVar);
                    }
                }

                public final void zzC(LocationRequest locationRequest, v81 v81Var, zzai zzaiVar) throws RemoteException {
                    synchronized (this.zzf) {
/* 6 */                 this.zzf.zzd(locationRequest, v81Var, zzaiVar);
                    }
                }

                public final void zzD(zzba zzbaVar, PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
/* 3 */             this.zzf.zzf(zzbaVar, pendingIntent, zzaiVar);
                }

                public final void zzE(LocationRequest locationRequest, PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
/* 3 */             this.zzf.zzg(locationRequest, pendingIntent, zzaiVar);
                }

                public final void zzF(t81 t81Var, zzai zzaiVar) throws RemoteException {
/* 3 */             this.zzf.zzh(t81Var, zzaiVar);
                }

                public final void zzG(PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
/* 3 */             this.zzf.zzj(pendingIntent, zzaiVar);
                }

                public final void zzH(t81 t81Var, zzai zzaiVar) throws RemoteException {
/* 3 */             this.zzf.zzi(t81Var, zzaiVar);
                }

                public final void zzI(boolean z) throws RemoteException {
/* 3 */             this.zzf.zzk(z);
                }

                public final void zzJ(Location location) throws RemoteException {
/* 3 */             this.zzf.zzl(location);
                }

                public final void zzK(zzai zzaiVar) throws RemoteException {
/* 3 */             this.zzf.zzm(zzaiVar);
                }

                public final void zzL(LocationSettingsRequest locationSettingsRequest, InterfaceC0992hi interfaceC0992hi, String str) throws RemoteException {
/* 1 */             checkConnected();
/* 13 */            kb1.m6053f("locationSettingsRequest can't be null nor empty.", locationSettingsRequest != null);
/* 21 */            kb1.m6053f("listener can't be null.", interfaceC0992hi != null);
/* 36 */            ((zzam) getService()).zzt(locationSettingsRequest, new zzay(interfaceC0992hi), null);
                }

                public final void zzq(long j, PendingIntent pendingIntent) throws RemoteException {
/* 1 */             checkConnected();
/* 4 */             kb1.m6061n(pendingIntent);
/* 19 */            kb1.m6053f("detectionIntervalMillis must be >= 0", j >= 0);
/* 28 */            ((zzam) getService()).zzh(j, true, pendingIntent);
                }

                public final void zzr(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, InterfaceC0992hi interfaceC0992hi) throws RemoteException {
/* 1 */             checkConnected();
/* 6 */             kb1.m6062o(activityTransitionRequest, "activityTransitionRequest must be specified.");
/* 11 */            kb1.m6062o(pendingIntent, "PendingIntent must be specified.");
/* 16 */            kb1.m6062o(interfaceC0992hi, "ResultHolder not provided.");
/* 30 */            ((zzam) getService()).zzi(activityTransitionRequest, pendingIntent, new StatusCallback(interfaceC0992hi));
                }

                public final void zzs(PendingIntent pendingIntent, InterfaceC0992hi interfaceC0992hi) throws RemoteException {
/* 1 */             checkConnected();
/* 6 */             kb1.m6062o(interfaceC0992hi, "ResultHolder not provided.");
/* 20 */            ((zzam) getService()).zzj(pendingIntent, new StatusCallback(interfaceC0992hi));
                }

                public final void zzt(PendingIntent pendingIntent) throws RemoteException {
/* 1 */             checkConnected();
/* 4 */             kb1.m6061n(pendingIntent);
/* 13 */            ((zzam) getService()).zzk(pendingIntent);
                }

                public final void zzu(PendingIntent pendingIntent, InterfaceC0992hi interfaceC0992hi) throws RemoteException {
/* 1 */             checkConnected();
/* 6 */             kb1.m6062o(pendingIntent, "PendingIntent must be specified.");
/* 11 */            kb1.m6062o(interfaceC0992hi, "ResultHolder not provided.");
/* 25 */            ((zzam) getService()).zzl(pendingIntent, new StatusCallback(interfaceC0992hi));
                }

                public final void zzv(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, InterfaceC0992hi interfaceC0992hi) throws RemoteException {
/* 1 */             checkConnected();
/* 6 */             kb1.m6062o(geofencingRequest, "geofencingRequest can't be null.");
/* 11 */            kb1.m6062o(pendingIntent, "PendingIntent must be specified.");
/* 16 */            kb1.m6062o(interfaceC0992hi, "ResultHolder not provided.");
/* 30 */            ((zzam) getService()).zzd(geofencingRequest, pendingIntent, new zzaw(interfaceC0992hi));
                }

                public final void zzw(com.google.android.gms.location.zzbq zzbqVar, InterfaceC0992hi interfaceC0992hi) throws RemoteException {
/* 1 */             checkConnected();
/* 6 */             kb1.m6062o(zzbqVar, "removeGeofencingRequest can't be null.");
/* 11 */            kb1.m6062o(interfaceC0992hi, "ResultHolder not provided.");
/* 25 */            ((zzam) getService()).zzg(zzbqVar, new zzax(interfaceC0992hi));
                }

                public final void zzx(PendingIntent pendingIntent, InterfaceC0992hi interfaceC0992hi) throws RemoteException {
/* 1 */             checkConnected();
/* 6 */             kb1.m6062o(pendingIntent, "PendingIntent must be specified.");
/* 11 */            kb1.m6062o(interfaceC0992hi, "ResultHolder not provided.");
/* 33 */            ((zzam) getService()).zze(pendingIntent, new zzax(interfaceC0992hi), getContext().getPackageName());
                }

                public final void zzy(List<String> list, InterfaceC0992hi interfaceC0992hi) throws RemoteException {
/* 1 */             checkConnected();
/* 18 */            kb1.m6053f("geofenceRequestIds can't be null nor empty.", list != null && list.size() > 0);
/* 23 */            kb1.m6062o(interfaceC0992hi, "ResultHolder not provided.");
/* 53 */            ((zzam) getService()).zzf((String[]) list.toArray(new String[0]), new zzax(interfaceC0992hi), getContext().getPackageName());
                }

                public final Location zzz(String str) throws RemoteException {
/* 1 */             Feature[] availableFeatures = getAvailableFeatures();
/* 5 */             Feature feature = k50.f12597l;
/* 7 */             boolean z = false;
/* 12 */            int length = availableFeatures != null ? availableFeatures.length : 0;
/* 14 */            for (int i = 0; i < length; i++) {
/* 22 */                if (de3.m3029k(availableFeatures[i], feature)) {
/* 24 */                    if (i < 0) {
                                break;
                            }
/* 26 */                    z = true;
                            break;
                        }
                    }
/* 31 */            zzav zzavVar = this.zzf;
                    return z ? zzavVar.zza(str) : zzavVar.zzb();
                }
            }
