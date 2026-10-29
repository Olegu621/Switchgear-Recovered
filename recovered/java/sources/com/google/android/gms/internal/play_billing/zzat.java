            package com.google.android.gms.internal.play_billing;

            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.RemoteException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzat extends zzaq implements zzav {
                public zzat(IBinder iBinder) {
/* 3 */             super(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.play_billing.zzav
                public final void zza(String str, String str2, zzax zzaxVar) throws RemoteException {
/* 1 */             Parcel parcelZzu = zzu();
/* 5 */             parcelZzu.writeString(str);
/* 8 */             parcelZzu.writeString(str2);
/* 11 */            int i = zzas.zza;
/* 13 */            parcelZzu.writeStrongBinder(zzaxVar);
/* 17 */            zzx(1, parcelZzu);
                }
            }
