            package com.google.android.gms.internal.play_billing;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.RemoteException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzaf extends zzar implements zzag {
                public zzaf() {
/* 3 */             super("com.android.vending.billing.IInAppBillingGetExternalPaymentDialogIntentCallback");
                }

                @Override // com.google.android.gms.internal.play_billing.zzar
                public final boolean zzb(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 2 */             if (i != 1) {
/* 19 */                return false;
                    }
/* 10 */            Bundle bundle = (Bundle) zzas.zza(parcel, Bundle.CREATOR);
/* 12 */            zzas.zzb(parcel);
/* 15 */            zza(bundle);
/* 1 */             return true;
                }
            }
