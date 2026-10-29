            package com.google.android.gms.common.internal.service;

            import android.os.Parcel;
            import com.google.android.gms.internal.base.zab;
            import com.google.android.gms.internal.base.zac;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zaj extends zab implements zak {
                @Override // com.google.android.gms.internal.base.zab
                public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) {
/* 2 */             if (i != 1) {
/* 11 */                return false;
                    }
/* 4 */             parcel.readInt();
/* 7 */             zac.zab(parcel);
/* 1 */             return true;
                }
            }
