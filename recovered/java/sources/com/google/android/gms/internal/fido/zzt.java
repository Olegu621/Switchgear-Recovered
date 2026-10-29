            package com.google.android.gms.internal.fido;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.ParcelFileDescriptor;
            import android.os.RemoteException;
            import com.google.android.gms.fido.sourcedevice.SourceStartDirectTransferOptions;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzt extends zza implements IInterface {
                public zzt(IBinder iBinder) {
/* 3 */             super(iBinder, "com.google.android.gms.fido.sourcedevice.internal.ISourceDirectTransferService");
                }

                public final void zzc(zzv zzvVar, SourceStartDirectTransferOptions sourceStartDirectTransferOptions, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zze(parcelZza, zzvVar);
/* 8 */             zzc.zzd(parcelZza, sourceStartDirectTransferOptions);
/* 11 */            zzc.zzd(parcelZza, parcelFileDescriptor);
/* 14 */            zzc.zzd(parcelZza, parcelFileDescriptor2);
/* 18 */            zzb(1, parcelZza);
                }
            }
