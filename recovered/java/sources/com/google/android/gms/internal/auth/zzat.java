            package com.google.android.gms.internal.auth;

            import android.os.IInterface;
            import android.os.RemoteException;
            import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
            import com.google.android.gms.common.api.Status;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface zzat extends IInterface {
                void zzb(byte[] bArr) throws RemoteException;

                void zzc(DeviceMetaData deviceMetaData) throws RemoteException;

                void zzd(Status status) throws RemoteException;

                void zze() throws RemoteException;

                void zzf(Status status, com.google.android.gms.auth.api.accounttransfer.zzw zzwVar) throws RemoteException;

                void zzg(Status status, com.google.android.gms.auth.api.accounttransfer.zzo zzoVar) throws RemoteException;

                void zzh(Status status) throws RemoteException;
            }
