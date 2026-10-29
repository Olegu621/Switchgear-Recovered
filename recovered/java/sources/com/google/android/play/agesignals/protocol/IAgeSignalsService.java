            package com.google.android.play.agesignals.protocol;

            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.internal.playcore_age_signals.zza;
            import com.google.android.gms.internal.playcore_age_signals.zzb;
            import com.google.android.gms.internal.playcore_age_signals.zzc;
            import p000.fg3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface IAgeSignalsService extends IInterface {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Stub extends zzb implements IAgeSignalsService {

                    /* JADX INFO: renamed from: a */
                    public static final /* synthetic */ int f5141a = 0;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static class Proxy extends zza implements IAgeSignalsService {
                        @Override // com.google.android.play.agesignals.protocol.IAgeSignalsService
                        /* JADX INFO: renamed from: n0 */
                        public final void mo2439n0(String str, Bundle bundle, fg3 fg3Var) throws RemoteException {
/* 1 */                     Parcel parcelZza = zza();
/* 5 */                     parcelZza.writeString(str);
/* 8 */                     zzc.zzc(parcelZza, bundle);
/* 15 */                    parcelZza.writeStrongBinder(fg3Var.asBinder());
/* 19 */                    zzb(1, parcelZza);
                        }
                    }

                    @Override // com.google.android.gms.internal.playcore_age_signals.zzb
                    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
                        IAgeSignalsServiceCallback proxy;
/* 2 */                 if (i != 1) {
/* 53 */                    return false;
                        }
/* 4 */                 String string = parcel.readString();
/* 14 */                Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
/* 16 */                IBinder strongBinder = parcel.readStrongBinder();
/* 20 */                if (strongBinder == null) {
/* 22 */                    proxy = null;
                        } else {
/* 26 */                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback");
/* 40 */                    proxy = iInterfaceQueryLocalInterface instanceof IAgeSignalsServiceCallback ? (IAgeSignalsServiceCallback) iInterfaceQueryLocalInterface : new IAgeSignalsServiceCallback.Stub.Proxy(strongBinder, "com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback");
                        }
/* 44 */                zzc.zzb(parcel);
/* 49 */                mo2439n0(string, bundle, (fg3) proxy);
/* 1 */                 return true;
                    }
                }

                /* JADX INFO: renamed from: n0 */
                void mo2439n0(String str, Bundle bundle, fg3 fg3Var);
            }
