            package com.google.android.play.core.appupdate.internal;

            import android.os.Bundle;
            import android.os.Parcel;
            import p000.ef3;
            import p000.fp3;
            import p000.gq3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzd extends zza implements zzf {
                @Override // com.google.android.play.core.appupdate.internal.zzf
                /* JADX INFO: renamed from: r */
                public final void mo2441r(String str, Bundle bundle, gq3 gq3Var) {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
/* 7 */             parcelObtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
/* 10 */            parcelObtain.writeString(str);
/* 13 */            int i = ef3.f7674a;
/* 16 */            parcelObtain.writeInt(1);
/* 20 */            bundle.writeToParcel(parcelObtain, 0);
/* 23 */            parcelObtain.writeStrongBinder(gq3Var);
                    try {
/* 30 */                this.f5142a.transact(2, parcelObtain, null, 1);
                    } finally {
/* 38 */                parcelObtain.recycle();
                    }
                }

                @Override // com.google.android.play.core.appupdate.internal.zzf
                /* JADX INFO: renamed from: w */
                public final void mo2442w(String str, Bundle bundle, fp3 fp3Var) {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
/* 7 */             parcelObtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
/* 10 */            parcelObtain.writeString(str);
/* 13 */            int i = ef3.f7674a;
/* 16 */            parcelObtain.writeInt(1);
/* 20 */            bundle.writeToParcel(parcelObtain, 0);
/* 23 */            parcelObtain.writeStrongBinder(fp3Var);
                    try {
/* 30 */                this.f5142a.transact(3, parcelObtain, null, 1);
                    } finally {
/* 38 */                parcelObtain.recycle();
                    }
                }
            }
