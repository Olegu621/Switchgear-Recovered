            package com.google.android.gms.internal.internal;

            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.recaptchabase.ExecuteResult;
            import com.google.android.gms.recaptchabase.InitResult;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzd extends zzb implements zze {
                public zzd() {
/* 3 */             super("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
                }

                @Override // com.google.android.gms.internal.internal.zzb
                public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 2 */             if (i == 1) {
/* 38 */                Status status = (Status) zzc.zza(parcel, Status.CREATOR);
/* 46 */                InitResult initResult = (InitResult) zzc.zza(parcel, InitResult.CREATOR);
/* 48 */                zzc.zzb(parcel);
/* 51 */                zzc(status, initResult);
                    } else {
/* 5 */                 if (i != 2) {
/* 7 */                     return false;
                        }
/* 15 */                Status status2 = (Status) zzc.zza(parcel, Status.CREATOR);
/* 23 */                ExecuteResult executeResult = (ExecuteResult) zzc.zza(parcel, ExecuteResult.CREATOR);
/* 25 */                zzc.zzb(parcel);
/* 28 */                zzb(status2, executeResult);
                    }
/* 1 */             return true;
                }
            }
