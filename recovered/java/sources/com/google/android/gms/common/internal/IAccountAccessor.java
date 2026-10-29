            package com.google.android.gms.common.internal;

            import android.accounts.Account;
            import android.os.IInterface;
            import android.os.Parcel;
            import com.google.android.gms.internal.common.zzb;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface IAccountAccessor extends IInterface {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Stub extends zzb implements IAccountAccessor {

                    /* JADX INFO: renamed from: a */
                    public static final /* synthetic */ int f3503a = 0;

                    @Override // com.google.android.gms.internal.common.zzb
                    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
/* 2 */                 if (i != 2) {
/* 4 */                     return false;
                        }
/* 7 */                 throw null;
                    }
                }

                Account zzb();
            }
