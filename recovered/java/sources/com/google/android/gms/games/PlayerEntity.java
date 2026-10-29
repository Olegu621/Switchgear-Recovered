            package com.google.android.gms.games;

            import android.net.Uri;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
            import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
            import java.util.Arrays;
            import p000.C1951n4;
            import p000.cl3;
            import p000.de3;
            import p000.kb1;
            import p000.w11;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 206 */   public final class PlayerEntity extends GamesDowngradeableSafeParcel implements Player {
                public static final Parcelable.Creator<PlayerEntity> CREATOR = new cl3(22);

                /* JADX INFO: renamed from: U */
                public final String f3935U;

                /* JADX INFO: renamed from: V */
                public final String f3936V;

                /* JADX INFO: renamed from: W */
                public final MostRecentGameInfoEntity f3937W;

                /* JADX INFO: renamed from: X */
                public final PlayerLevelInfo f3938X;

                /* JADX INFO: renamed from: Y */
                public final boolean f3939Y;

                /* JADX INFO: renamed from: Z */
                public final boolean f3940Z;

                /* JADX INFO: renamed from: a0 */
                public final String f3941a0;

                /* JADX INFO: renamed from: b */
                public final String f3942b;

                /* JADX INFO: renamed from: b0 */
                public final String f3943b0;

                /* JADX INFO: renamed from: c */
                public final String f3944c;

                /* JADX INFO: renamed from: c0 */
                public final Uri f3945c0;

                /* JADX INFO: renamed from: d */
                public final Uri f3946d;

                /* JADX INFO: renamed from: d0 */
                public final String f3947d0;

                /* JADX INFO: renamed from: e */
                public final Uri f3948e;

                /* JADX INFO: renamed from: e0 */
                public final Uri f3949e0;

                /* JADX INFO: renamed from: f */
                public final long f3950f;

                /* JADX INFO: renamed from: f0 */
                public final String f3951f0;

                /* JADX INFO: renamed from: g0 */
                public final long f3952g0;

                /* JADX INFO: renamed from: h0 */
                public final zzt f3953h0;

                /* JADX INFO: renamed from: i */
                public final int f3954i;

                /* JADX INFO: renamed from: i0 */
                public final zza f3955i0;

                /* JADX INFO: renamed from: j0 */
                public final boolean f3956j0;

                /* JADX INFO: renamed from: v */
                public final long f3957v;

                /* JADX INFO: renamed from: w */
                public final String f3958w;

                /* JADX WARN: Type inference failed for: r4v14, types: [com.google.android.gms.games.PlayerRelationshipInfo, java.lang.Object] */
                public PlayerEntity(Player player) {
/* 4 */             String strMo2089t1 = player.mo2089t1();
/* 8 */             this.f3942b = strMo2089t1;
/* 10 */            String strMo2085f = player.mo2085f();
/* 14 */            this.f3944c = strMo2085f;
/* 20 */            this.f3946d = player.mo2084c();
/* 26 */            this.f3958w = player.getIconImageUrl();
/* 32 */            this.f3948e = player.mo2087h();
/* 38 */            this.f3935U = player.getHiResImageUrl();
/* 40 */            long jMo2079C = player.mo2079C();
/* 44 */            this.f3950f = jMo2079C;
/* 50 */            this.f3954i = player.zza();
/* 56 */            this.f3957v = player.mo2083X();
/* 62 */            this.f3936V = player.getTitle();
/* 68 */            this.f3939Y = player.zzh();
/* 70 */            com.google.android.gms.games.internal.player.zza zzaVarZzc = player.zzc();
/* 84 */            this.f3937W = zzaVarZzc == null ? null : new MostRecentGameInfoEntity(zzaVarZzc);
/* 90 */            this.f3938X = player.mo2086f0();
/* 96 */            this.f3940Z = player.zzf();
/* 102 */           this.f3941a0 = player.zzd();
/* 108 */           this.f3943b0 = player.zze();
/* 114 */           this.f3945c0 = player.mo2088l();
/* 120 */           this.f3947d0 = player.getBannerImageLandscapeUrl();
/* 126 */           this.f3949e0 = player.mo2080F();
/* 132 */           this.f3951f0 = player.getBannerImagePortraitUrl();
/* 138 */           this.f3952g0 = player.zzb();
/* 140 */           PlayerRelationshipInfo playerRelationshipInfoMo2081L0 = player.mo2081L0();
/* 157 */           this.f3953h0 = playerRelationshipInfoMo2081L0 == null ? null : new zzt(playerRelationshipInfoMo2081L0.freeze());
/* 159 */           CurrentPlayerInfo currentPlayerInfoMo2082P = player.mo2082P();
/* 173 */           this.f3955i0 = (zza) (currentPlayerInfoMo2082P == null ? null : currentPlayerInfoMo2082P.freeze());
/* 179 */           this.f3956j0 = player.zzg();
/* 183 */           if (strMo2089t1 == null) {
/* 204 */               C1951n4.m6859j("null reference");
/* 207 */               throw null;
                    }
/* 185 */           if (strMo2085f != null) {
/* 196 */               kb1.m6064q(jMo2079C > 0);
                    } else {
/* 200 */               C1951n4.m6859j("null reference");
/* 203 */               throw null;
                    }
                }

                /* JADX INFO: renamed from: F1 */
                public static int m2090F1(Player player) {
/* 85 */            return Arrays.hashCode(new Object[]{player.mo2089t1(), player.mo2085f(), Boolean.valueOf(player.zzf()), player.mo2084c(), player.mo2087h(), Long.valueOf(player.mo2079C()), player.getTitle(), player.mo2086f0(), player.zzd(), player.zze(), player.mo2088l(), player.mo2080F(), Long.valueOf(player.zzb()), player.mo2081L0(), player.mo2082P(), Boolean.valueOf(player.zzg())});
                }

                /* JADX INFO: renamed from: G1 */
                public static String m2091G1(Player player) {
/* 3 */             wc0 wc0Var = new wc0(player);
/* 12 */            wc0Var.m9529d(player.mo2089t1(), "PlayerId");
/* 21 */            wc0Var.m9529d(player.mo2085f(), "DisplayName");
/* 34 */            wc0Var.m9529d(Boolean.valueOf(player.zzf()), "HasDebugAccess");
/* 43 */            wc0Var.m9529d(player.mo2084c(), "IconImageUri");
/* 52 */            wc0Var.m9529d(player.getIconImageUrl(), "IconImageUrl");
/* 61 */            wc0Var.m9529d(player.mo2087h(), "HiResImageUri");
/* 70 */            wc0Var.m9529d(player.getHiResImageUrl(), "HiResImageUrl");
/* 83 */            wc0Var.m9529d(Long.valueOf(player.mo2079C()), "RetrievedTimestamp");
/* 92 */            wc0Var.m9529d(player.getTitle(), "Title");
/* 101 */           wc0Var.m9529d(player.mo2086f0(), "LevelInfo");
/* 110 */           wc0Var.m9529d(player.zzd(), "GamerTag");
/* 119 */           wc0Var.m9529d(player.zze(), "Name");
/* 128 */           wc0Var.m9529d(player.mo2088l(), "BannerImageLandscapeUri");
/* 137 */           wc0Var.m9529d(player.getBannerImageLandscapeUrl(), "BannerImageLandscapeUrl");
/* 146 */           wc0Var.m9529d(player.mo2080F(), "BannerImagePortraitUri");
/* 155 */           wc0Var.m9529d(player.getBannerImagePortraitUrl(), "BannerImagePortraitUrl");
/* 164 */           wc0Var.m9529d(player.mo2082P(), "CurrentPlayerInfo");
/* 177 */           wc0Var.m9529d(Long.valueOf(player.zzb()), "TotalUnlockedAchievement");
/* 184 */           if (player.zzg()) {
/* 196 */               wc0Var.m9529d(Boolean.valueOf(player.zzg()), "AlwaysAutoSignIn");
                    }
/* 203 */           if (player.mo2081L0() != null) {
/* 211 */               wc0Var.m9529d(player.mo2081L0(), "RelationshipInfo");
                    }
/* 214 */           return wc0Var.toString();
                }

                /* JADX INFO: renamed from: H1 */
                public static boolean m2092H1(Player player, Object obj) {
/* 3 */             if (!(obj instanceof Player)) {
/* 271 */               return false;
                    }
/* 7 */             if (player == obj) {
/* 269 */               return true;
                    }
/* 11 */            Player player2 = (Player) obj;
                    return de3.m3029k(player2.mo2089t1(), player.mo2089t1()) && de3.m3029k(player2.mo2085f(), player.mo2085f()) && de3.m3029k(Boolean.valueOf(player2.zzf()), Boolean.valueOf(player.zzf())) && de3.m3029k(player2.mo2084c(), player.mo2084c()) && de3.m3029k(player2.mo2087h(), player.mo2087h()) && de3.m3029k(Long.valueOf(player2.mo2079C()), Long.valueOf(player.mo2079C())) && de3.m3029k(player2.getTitle(), player.getTitle()) && de3.m3029k(player2.mo2086f0(), player.mo2086f0()) && de3.m3029k(player2.zzd(), player.zzd()) && de3.m3029k(player2.zze(), player.zze()) && de3.m3029k(player2.mo2088l(), player.mo2088l()) && de3.m3029k(player2.mo2080F(), player.mo2080F()) && de3.m3029k(Long.valueOf(player2.zzb()), Long.valueOf(player.zzb())) && de3.m3029k(player2.mo2082P(), player.mo2082P()) && de3.m3029k(player2.mo2081L0(), player.mo2081L0()) && de3.m3029k(Boolean.valueOf(player2.zzg()), Boolean.valueOf(player.zzg()));
                }

                @Override // com.google.android.gms.games.Player
                /* JADX INFO: renamed from: C */
                public final long mo2079C() {
/* 1 */             return this.f3950f;
                }

                @Override // com.google.android.gms.games.Player
                /* JADX INFO: renamed from: F */
                public final Uri mo2080F() {
/* 1 */             return this.f3949e0;
                }

                @Override // com.google.android.gms.games.Player
                /* JADX INFO: renamed from: L0 */
                public final PlayerRelationshipInfo mo2081L0() {
/* 1 */             return this.f3953h0;
                }

                @Override // com.google.android.gms.games.Player
                /* JADX INFO: renamed from: P */
                public final CurrentPlayerInfo mo2082P() {
/* 1 */             return this.f3955i0;
                }

                @Override // com.google.android.gms.games.Player
                /* JADX INFO: renamed from: X */
                public final long mo2083X() {
/* 1 */             return this.f3957v;
                }

                @Override // com.google.android.gms.games.Player
                /* JADX INFO: renamed from: c */
                public final Uri mo2084c() {
/* 1 */             return this.f3946d;
                }

                public final boolean equals(Object obj) {
/* 1 */             return m2092H1(this, obj);
                }

                @Override // com.google.android.gms.games.Player
                /* JADX INFO: renamed from: f */
                public final String mo2085f() {
/* 1 */             return this.f3944c;
                }

                @Override // com.google.android.gms.games.Player
                /* JADX INFO: renamed from: f0 */
                public final PlayerLevelInfo mo2086f0() {
/* 1 */             return this.f3938X;
                }

                @Override // p000.un0
                public final /* bridge */ /* synthetic */ Object freeze() {
/* 1 */             return this;
                }

                @Override // com.google.android.gms.games.Player
                public final String getBannerImageLandscapeUrl() {
/* 1 */             return this.f3947d0;
                }

                @Override // com.google.android.gms.games.Player
                public final String getBannerImagePortraitUrl() {
/* 1 */             return this.f3951f0;
                }

                @Override // com.google.android.gms.games.Player
                public final String getHiResImageUrl() {
/* 1 */             return this.f3935U;
                }

                @Override // com.google.android.gms.games.Player
                public final String getIconImageUrl() {
/* 1 */             return this.f3958w;
                }

                @Override // com.google.android.gms.games.Player
                public final String getTitle() {
/* 1 */             return this.f3936V;
                }

                @Override // com.google.android.gms.games.Player
                /* JADX INFO: renamed from: h */
                public final Uri mo2087h() {
/* 1 */             return this.f3948e;
                }

                public final int hashCode() {
/* 1 */             return m2090F1(this);
                }

                @Override // com.google.android.gms.games.Player
                /* JADX INFO: renamed from: l */
                public final Uri mo2088l() {
/* 1 */             return this.f3945c0;
                }

                @Override // com.google.android.gms.games.Player
                /* JADX INFO: renamed from: t1 */
                public final String mo2089t1() {
/* 1 */             return this.f3942b;
                }

                public final String toString() {
/* 1 */             return m2091G1(this);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.f3942b, false);
/* 17 */            w11.m9410T(parcel, 2, this.f3944c, false);
/* 23 */            w11.m9409S(parcel, 3, this.f3946d, i, false);
/* 29 */            w11.m9409S(parcel, 4, this.f3948e, i, false);
/* 35 */            w11.m9420b0(parcel, 5, 8);
/* 40 */            parcel.writeLong(this.f3950f);
/* 44 */            w11.m9420b0(parcel, 6, 4);
/* 49 */            parcel.writeInt(this.f3954i);
/* 53 */            w11.m9420b0(parcel, 7, 8);
/* 58 */            parcel.writeLong(this.f3957v);
/* 63 */            w11.m9410T(parcel, 8, this.f3958w, false);
/* 70 */            w11.m9410T(parcel, 9, this.f3935U, false);
/* 77 */            w11.m9410T(parcel, 14, this.f3936V, false);
/* 84 */            w11.m9409S(parcel, 15, this.f3937W, i, false);
/* 91 */            w11.m9409S(parcel, 16, this.f3938X, i, false);
/* 96 */            w11.m9420b0(parcel, 18, 4);
/* 101 */           parcel.writeInt(this.f3939Y ? 1 : 0);
/* 106 */           w11.m9420b0(parcel, 19, 4);
/* 111 */           parcel.writeInt(this.f3940Z ? 1 : 0);
/* 118 */           w11.m9410T(parcel, 20, this.f3941a0, false);
/* 125 */           w11.m9410T(parcel, 21, this.f3943b0, false);
/* 132 */           w11.m9409S(parcel, 22, this.f3945c0, i, false);
/* 139 */           w11.m9410T(parcel, 23, this.f3947d0, false);
/* 146 */           w11.m9409S(parcel, 24, this.f3949e0, i, false);
/* 153 */           w11.m9410T(parcel, 25, this.f3951f0, false);
/* 158 */           w11.m9420b0(parcel, 29, 8);
/* 163 */           parcel.writeLong(this.f3952g0);
/* 170 */           w11.m9409S(parcel, 33, this.f3953h0, i, false);
/* 177 */           w11.m9409S(parcel, 35, this.f3955i0, i, false);
/* 182 */           w11.m9420b0(parcel, 36, 4);
/* 187 */           parcel.writeInt(this.f3956j0 ? 1 : 0);
/* 190 */           w11.m9428f0(iM9422c0, parcel);
                }

                @Override // com.google.android.gms.games.Player
                public final int zza() {
/* 1 */             return this.f3954i;
                }

                @Override // com.google.android.gms.games.Player
                public final long zzb() {
/* 1 */             return this.f3952g0;
                }

                @Override // com.google.android.gms.games.Player
                public final com.google.android.gms.games.internal.player.zza zzc() {
/* 1 */             return this.f3937W;
                }

                @Override // com.google.android.gms.games.Player
                public final String zzd() {
/* 1 */             return this.f3941a0;
                }

                @Override // com.google.android.gms.games.Player
                public final String zze() {
/* 1 */             return this.f3943b0;
                }

                @Override // com.google.android.gms.games.Player
                public final boolean zzf() {
/* 1 */             return this.f3940Z;
                }

                @Override // com.google.android.gms.games.Player
                public final boolean zzg() {
/* 1 */             return this.f3956j0;
                }

                @Override // com.google.android.gms.games.Player
                public final boolean zzh() {
/* 1 */             return this.f3939Y;
                }

/* 207 */       public PlayerEntity(String str, String str2, Uri uri, Uri uri2, long j, int i, long j2, String str3, String str4, String str5, MostRecentGameInfoEntity mostRecentGameInfoEntity, PlayerLevelInfo playerLevelInfo, boolean z, boolean z2, String str6, String str7, Uri uri3, String str8, Uri uri4, String str9, long j3, zzt zztVar, zza zzaVar, boolean z3) {
/* 209 */           this.f3942b = str;
                    this.f3944c = str2;
                    this.f3946d = uri;
                    this.f3958w = str3;
                    this.f3948e = uri2;
                    this.f3935U = str4;
                    this.f3950f = j;
                    this.f3954i = i;
                    this.f3957v = j2;
                    this.f3936V = str5;
                    this.f3939Y = z;
                    this.f3937W = mostRecentGameInfoEntity;
                    this.f3938X = playerLevelInfo;
                    this.f3940Z = z2;
                    this.f3941a0 = str6;
                    this.f3943b0 = str7;
                    this.f3945c0 = uri3;
                    this.f3947d0 = str8;
                    this.f3949e0 = uri4;
                    this.f3951f0 = str9;
                    this.f3952g0 = j3;
                    this.f3953h0 = zztVar;
                    this.f3955i0 = zzaVar;
                    this.f3956j0 = z3;
                }
            }
