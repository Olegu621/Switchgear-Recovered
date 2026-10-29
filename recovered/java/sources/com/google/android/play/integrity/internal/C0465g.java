            package com.google.android.play.integrity.internal;

            import android.os.Bundle;
            import android.os.Parcel;
            import p000.na3;
            
            /* JADX INFO: renamed from: com.google.android.play.integrity.internal.g */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0465g extends C0463a implements InterfaceC0467i {
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.play.integrity.internal.InterfaceC0467i
                /* JADX INFO: renamed from: J */
                public final void mo2507J(Bundle bundle, InterfaceC0469k interfaceC0469k) {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
/* 7 */             parcelObtain.writeInterfaceToken(this.f5279b);
/* 10 */            int i = na3.f14174a;
/* 13 */            parcelObtain.writeInt(1);
/* 17 */            bundle.writeToParcel(parcelObtain, 0);
/* 20 */            parcelObtain.writeStrongBinder(interfaceC0469k);
/* 24 */            m2505a(2, parcelObtain);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.play.integrity.internal.InterfaceC0467i
                /* JADX INFO: renamed from: T */
                public final void mo2508T(Bundle bundle, InterfaceC0469k interfaceC0469k) {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
/* 7 */             parcelObtain.writeInterfaceToken(this.f5279b);
/* 10 */            int i = na3.f14174a;
/* 13 */            parcelObtain.writeInt(1);
/* 17 */            bundle.writeToParcel(parcelObtain, 0);
/* 20 */            parcelObtain.writeStrongBinder(interfaceC0469k);
/* 24 */            m2505a(3, parcelObtain);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.play.integrity.internal.InterfaceC0467i
                /* JADX INFO: renamed from: c */
                public final void mo2509c(Bundle bundle, InterfaceC0476r interfaceC0476r) {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
/* 7 */             parcelObtain.writeInterfaceToken(this.f5279b);
/* 10 */            int i = na3.f14174a;
/* 13 */            parcelObtain.writeInt(1);
/* 17 */            bundle.writeToParcel(parcelObtain, 0);
/* 20 */            parcelObtain.writeStrongBinder(interfaceC0476r);
/* 24 */            m2505a(6, parcelObtain);
                }
            }
