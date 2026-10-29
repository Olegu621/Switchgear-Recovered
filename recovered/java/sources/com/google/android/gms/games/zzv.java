            package com.google.android.gms.games;

            import android.os.Parcel;
            import com.google.android.gms.common.data.DataHolder;
            import java.util.Arrays;
            import p000.dr3;
            import p000.io3;
            import p000.nf3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzv extends io3 implements PlayerRelationshipInfo {

                /* JADX INFO: renamed from: d */
                public final nf3 f4093d;

                public zzv(DataHolder dataHolder, int i, nf3 nf3Var) {
/* 1 */             super(dataHolder, i);
/* 4 */             this.f4093d = nf3Var;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // p000.z30
                public final boolean equals(Object obj) {
/* 1 */             return zzt.m2155E1(this, obj);
                }

                @Override // p000.un0
                public final /* synthetic */ Object freeze() {
/* 3 */             return new zzt(this);
                }

                @Override // p000.z30
                public final int hashCode() {
/* 25 */            return Arrays.hashCode(new Object[]{Integer.valueOf(mo2093z()), zzb(), zza(), zzc()});
                }

                public final String toString() {
/* 1 */             return zzt.m2154D1(this);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 6 */             dr3.m3185a(new zzt(this), parcel);
                }

                @Override // com.google.android.gms.games.PlayerRelationshipInfo
                /* JADX INFO: renamed from: z */
                public final int mo2093z() {
/* 3 */             String str = this.f4093d.f14224G;
/* 9 */             if (!m10271r(str) || m10272u(str)) {
/* 23 */                return -1;
                    }
/* 18 */            return m10268d(str);
                }

                @Override // com.google.android.gms.games.PlayerRelationshipInfo
                public final String zza() {
/* 5 */             return m5531x(this.f4093d.f14226I);
                }

                @Override // com.google.android.gms.games.PlayerRelationshipInfo
                public final String zzb() {
/* 5 */             return m5531x(this.f4093d.f14225H);
                }

                @Override // com.google.android.gms.games.PlayerRelationshipInfo
                public final String zzc() {
/* 5 */             return m5531x(this.f4093d.f14227J);
                }
            }
