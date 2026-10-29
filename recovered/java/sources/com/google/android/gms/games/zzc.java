            package com.google.android.gms.games;

            import android.os.Parcel;
            import com.google.android.gms.common.data.DataHolder;
            import java.util.Arrays;
            import p000.io3;
            import p000.nf3;
            import p000.w11;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzc extends io3 implements CurrentPlayerInfo {

                /* JADX INFO: renamed from: d */
                public final nf3 f4088d;

                public zzc(DataHolder dataHolder, int i, nf3 nf3Var) {
/* 1 */             super(dataHolder, i);
/* 4 */             this.f4088d = nf3Var;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // p000.z30
                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof CurrentPlayerInfo) {
                        return obj == this || ((CurrentPlayerInfo) obj).mo2062s1() == mo2062s1();
                    }
/* 23 */            return false;
                }

                @Override // p000.un0
                public final /* synthetic */ Object freeze() {
/* 3 */             return new zza(this);
                }

                @Override // p000.z30
                public final int hashCode() {
/* 13 */            return Arrays.hashCode(new Object[]{Integer.valueOf(mo2062s1())});
                }

                @Override // com.google.android.gms.games.CurrentPlayerInfo
                /* JADX INFO: renamed from: s1 */
                public final int mo2062s1() {
/* 3 */             String str = this.f4088d.f14228K;
/* 9 */             if (!m10271r(str) || m10272u(str)) {
/* 23 */                return 0;
                    }
/* 18 */            return m10268d(str);
                }

                public final String toString() {
/* 3 */             wc0 wc0Var = new wc0(this);
/* 16 */            wc0Var.m9529d(Integer.valueOf(mo2062s1()), "FriendsListVisibilityStatus");
/* 19 */            return wc0Var.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             zza zzaVar = new zza(this);
/* 8 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 14 */            w11.m9420b0(parcel, 1, 4);
/* 19 */            parcel.writeInt(zzaVar.f4087a);
/* 22 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
