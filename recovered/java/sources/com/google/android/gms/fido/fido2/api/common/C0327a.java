            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.ds0;
            import p000.sp2;
            
            /* JADX INFO: renamed from: com.google.android.gms.fido.fido2.api.common.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0327a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                    try {
/* 5 */                 return TokenBinding.TokenBindingStatus.m2058a(parcel.readString());
                    } catch (sp2 e) {
/* 11 */                ds0.m3199p(e);
/* 14 */                return null;
                    }
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Object[] newArray(int i) {
/* 1 */             return new TokenBinding.TokenBindingStatus[i];
                }
            }
