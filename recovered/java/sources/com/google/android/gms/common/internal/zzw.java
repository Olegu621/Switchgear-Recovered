            package com.google.android.gms.common.internal;

            import android.os.Parcel;
            import com.google.android.gms.dynamic.IObjectWrapper;
            import com.google.android.gms.internal.common.zzb;
            import com.google.android.gms.internal.common.zzc;
            import p000.dk3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzw extends zzb implements zzx {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int f3547a = 0;

                @Override // com.google.android.gms.internal.common.zzb
                public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
/* 2 */             if (i == 1) {
/* 22 */                IObjectWrapper iObjectWrapperZzd = ((dk3) this).zzd();
/* 26 */                parcel2.writeNoException();
/* 29 */                zzc.zze(parcel2, iObjectWrapperZzd);
                    } else {
/* 5 */                 if (i != 2) {
/* 7 */                     return false;
                        }
/* 11 */                parcel2.writeNoException();
/* 16 */                parcel2.writeInt(((dk3) this).f7292b);
                    }
/* 1 */             return true;
                }
            }
