            package com.google.android.gms.games;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.games.internal.zzh;
            import java.util.Arrays;
            import p000.md3;
            import p000.w11;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public final class zza extends zzh implements CurrentPlayerInfo {
                public static final Parcelable.Creator<zza> CREATOR = new md3(16);

                /* JADX INFO: renamed from: a */
                public final int f4087a;

                public zza(zzc zzcVar) {
/* 8 */             this.f4087a = zzcVar.mo2062s1();
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof CurrentPlayerInfo) {
                        return obj == this || ((CurrentPlayerInfo) obj).mo2062s1() == mo2062s1();
                    }
/* 23 */            return false;
                }

                @Override // p000.un0
                public final /* bridge */ /* synthetic */ Object freeze() {
/* 1 */             return this;
                }

                public final int hashCode() {
/* 13 */            return Arrays.hashCode(new Object[]{Integer.valueOf(mo2062s1())});
                }

                @Override // com.google.android.gms.games.CurrentPlayerInfo
                /* JADX INFO: renamed from: s1 */
                public final int mo2062s1() {
/* 1 */             return this.f4087a;
                }

                public final String toString() {
/* 3 */             wc0 wc0Var = new wc0(this);
/* 16 */            wc0Var.m9529d(Integer.valueOf(mo2062s1()), "FriendsListVisibilityStatus");
/* 19 */            return wc0Var.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f4087a);
/* 17 */            w11.m9428f0(iM9422c0, parcel);
                }

/* 10 */        public zza(int i) {
/* 12 */            this.f4087a = i;
                }
            }
