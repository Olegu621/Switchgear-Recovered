            package com.google.android.gms.games;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.games.internal.zzh;
            import java.util.Arrays;
            import p000.de3;
            import p000.dr3;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 27 */    public final class zzt extends zzh implements PlayerRelationshipInfo {
                public static final Parcelable.Creator<zzt> CREATOR = new dr3(15);

                /* JADX INFO: renamed from: a */
                public final int f4089a;

                /* JADX INFO: renamed from: b */
                public final String f4090b;

                /* JADX INFO: renamed from: c */
                public final String f4091c;

                /* JADX INFO: renamed from: d */
                public final String f4092d;

                public zzt(PlayerRelationshipInfo playerRelationshipInfo) {
/* 8 */             this.f4089a = playerRelationshipInfo.mo2093z();
/* 14 */            this.f4090b = playerRelationshipInfo.zzb();
/* 20 */            this.f4091c = playerRelationshipInfo.zza();
/* 26 */            this.f4092d = playerRelationshipInfo.zzc();
                }

                /* JADX INFO: renamed from: D1 */
                public static String m2154D1(PlayerRelationshipInfo playerRelationshipInfo) {
/* 3 */             wc0 wc0Var = new wc0(playerRelationshipInfo);
/* 16 */            wc0Var.m9529d(Integer.valueOf(playerRelationshipInfo.mo2093z()), "FriendStatus");
/* 23 */            if (playerRelationshipInfo.zzb() != null) {
/* 31 */                wc0Var.m9529d(playerRelationshipInfo.zzb(), "Nickname");
                    }
/* 38 */            if (playerRelationshipInfo.zza() != null) {
/* 46 */                wc0Var.m9529d(playerRelationshipInfo.zza(), "InvitationNickname");
                    }
/* 53 */            if (playerRelationshipInfo.zzc() != null) {
/* 61 */                wc0Var.m9529d(playerRelationshipInfo.zza(), "NicknameAbuseReportToken");
                    }
/* 64 */            return wc0Var.toString();
                }

                /* JADX INFO: renamed from: E1 */
                public static boolean m2155E1(PlayerRelationshipInfo playerRelationshipInfo, Object obj) {
/* 3 */             if (!(obj instanceof PlayerRelationshipInfo)) {
/* 65 */                return false;
                    }
/* 6 */             if (obj == playerRelationshipInfo) {
/* 63 */                return true;
                    }
/* 9 */             PlayerRelationshipInfo playerRelationshipInfo2 = (PlayerRelationshipInfo) obj;
                    return playerRelationshipInfo2.mo2093z() == playerRelationshipInfo.mo2093z() && de3.m3029k(playerRelationshipInfo2.zzb(), playerRelationshipInfo.zzb()) && de3.m3029k(playerRelationshipInfo2.zza(), playerRelationshipInfo.zza()) && de3.m3029k(playerRelationshipInfo2.zzc(), playerRelationshipInfo.zzc());
                }

                public final boolean equals(Object obj) {
/* 1 */             return m2155E1(this, obj);
                }

                @Override // p000.un0
                public final /* bridge */ /* synthetic */ Object freeze() {
/* 1 */             return this;
                }

                public final int hashCode() {
/* 25 */            return Arrays.hashCode(new Object[]{Integer.valueOf(mo2093z()), zzb(), zza(), zzc()});
                }

                public final String toString() {
/* 1 */             return m2154D1(this);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             dr3.m3185a(this, parcel);
                }

                @Override // com.google.android.gms.games.PlayerRelationshipInfo
                /* JADX INFO: renamed from: z */
                public final int mo2093z() {
/* 1 */             return this.f4089a;
                }

                @Override // com.google.android.gms.games.PlayerRelationshipInfo
                public final String zza() {
/* 1 */             return this.f4091c;
                }

                @Override // com.google.android.gms.games.PlayerRelationshipInfo
                public final String zzb() {
/* 1 */             return this.f4090b;
                }

                @Override // com.google.android.gms.games.PlayerRelationshipInfo
                public final String zzc() {
/* 1 */             return this.f4092d;
                }

/* 28 */        public zzt(int i, String str, String str2, String str3) {
/* 30 */            this.f4089a = i;
                    this.f4090b = str;
                    this.f4091c = str2;
                    this.f4092d = str3;
                }
            }
