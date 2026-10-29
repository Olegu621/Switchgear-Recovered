            package com.google.android.gms.games;

            import android.net.Uri;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
            import java.util.Arrays;
            import p000.de3;
            import p000.tf3;
            import p000.w11;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 150 */   public final class GameEntity extends GamesDowngradeableSafeParcel implements Game {
                public static final Parcelable.Creator<GameEntity> CREATOR = new tf3(7);

                /* JADX INFO: renamed from: U */
                public final Uri f3910U;

                /* JADX INFO: renamed from: V */
                public final boolean f3911V;

                /* JADX INFO: renamed from: W */
                public final boolean f3912W;

                /* JADX INFO: renamed from: X */
                public final String f3913X;

                /* JADX INFO: renamed from: Y */
                public final int f3914Y;

                /* JADX INFO: renamed from: Z */
                public final int f3915Z;

                /* JADX INFO: renamed from: a0 */
                public final int f3916a0;

                /* JADX INFO: renamed from: b */
                public final String f3917b;

                /* JADX INFO: renamed from: b0 */
                public final boolean f3918b0;

                /* JADX INFO: renamed from: c */
                public final String f3919c;

                /* JADX INFO: renamed from: c0 */
                public final boolean f3920c0;

                /* JADX INFO: renamed from: d */
                public final String f3921d;

                /* JADX INFO: renamed from: d0 */
                public final String f3922d0;

                /* JADX INFO: renamed from: e */
                public final String f3923e;

                /* JADX INFO: renamed from: e0 */
                public final String f3924e0;

                /* JADX INFO: renamed from: f */
                public final String f3925f;

                /* JADX INFO: renamed from: f0 */
                public final String f3926f0;

                /* JADX INFO: renamed from: g0 */
                public final boolean f3927g0;

                /* JADX INFO: renamed from: h0 */
                public final boolean f3928h0;

                /* JADX INFO: renamed from: i */
                public final String f3929i;

                /* JADX INFO: renamed from: i0 */
                public final boolean f3930i0;

                /* JADX INFO: renamed from: j0 */
                public final String f3931j0;

                /* JADX INFO: renamed from: k0 */
                public final boolean f3932k0;

                /* JADX INFO: renamed from: v */
                public final Uri f3933v;

                /* JADX INFO: renamed from: w */
                public final Uri f3934w;

                public GameEntity(Game game) {
/* 8 */             this.f3917b = game.mo2072q();
/* 14 */            this.f3921d = game.mo2063A();
/* 20 */            this.f3923e = game.mo2074y0();
/* 26 */            this.f3925f = game.getDescription();
/* 32 */            this.f3929i = game.mo2064O();
/* 38 */            this.f3919c = game.mo2067f();
/* 44 */            this.f3933v = game.mo2066c();
/* 50 */            this.f3922d0 = game.getIconImageUrl();
/* 56 */            this.f3934w = game.mo2068h();
/* 62 */            this.f3924e0 = game.getHiResImageUrl();
/* 68 */            this.f3910U = game.mo2075y1();
/* 74 */            this.f3926f0 = game.getFeaturedImageUrl();
/* 80 */            this.f3911V = game.zze();
/* 86 */            this.f3912W = game.zzc();
/* 92 */            this.f3913X = game.zza();
/* 95 */            this.f3914Y = 1;
/* 101 */           this.f3915Z = game.mo2073w0();
/* 107 */           this.f3916a0 = game.mo2065Q();
/* 113 */           this.f3918b0 = game.zzf();
/* 119 */           this.f3920c0 = game.zzg();
/* 125 */           this.f3927g0 = game.zzd();
/* 131 */           this.f3928h0 = game.zzb();
/* 137 */           this.f3930i0 = game.mo2070k0();
/* 143 */           this.f3931j0 = game.mo2069h0();
/* 149 */           this.f3932k0 = game.mo2071l1();
                }

                /* JADX INFO: renamed from: F1 */
                public static int m2076F1(Game game) {
/* 129 */           return Arrays.hashCode(new Object[]{game.mo2072q(), game.mo2067f(), game.mo2063A(), game.mo2074y0(), game.getDescription(), game.mo2064O(), game.mo2066c(), game.mo2068h(), game.mo2075y1(), Boolean.valueOf(game.zze()), Boolean.valueOf(game.zzc()), game.zza(), Integer.valueOf(game.mo2073w0()), Integer.valueOf(game.mo2065Q()), Boolean.valueOf(game.zzf()), Boolean.valueOf(game.zzg()), Boolean.valueOf(game.zzd()), Boolean.valueOf(game.zzb()), Boolean.valueOf(game.mo2070k0()), game.mo2069h0(), Boolean.valueOf(game.mo2071l1())});
                }

                /* JADX INFO: renamed from: G1 */
                public static String m2077G1(Game game) {
/* 3 */             wc0 wc0Var = new wc0(game);
/* 12 */            wc0Var.m9529d(game.mo2072q(), "ApplicationId");
/* 21 */            wc0Var.m9529d(game.mo2067f(), "DisplayName");
/* 30 */            wc0Var.m9529d(game.mo2063A(), "PrimaryCategory");
/* 39 */            wc0Var.m9529d(game.mo2074y0(), "SecondaryCategory");
/* 48 */            wc0Var.m9529d(game.getDescription(), "Description");
/* 57 */            wc0Var.m9529d(game.mo2064O(), "DeveloperName");
/* 66 */            wc0Var.m9529d(game.mo2066c(), "IconImageUri");
/* 75 */            wc0Var.m9529d(game.getIconImageUrl(), "IconImageUrl");
/* 84 */            wc0Var.m9529d(game.mo2068h(), "HiResImageUri");
/* 93 */            wc0Var.m9529d(game.getHiResImageUrl(), "HiResImageUrl");
/* 102 */           wc0Var.m9529d(game.mo2075y1(), "FeaturedImageUri");
/* 111 */           wc0Var.m9529d(game.getFeaturedImageUrl(), "FeaturedImageUrl");
/* 124 */           wc0Var.m9529d(Boolean.valueOf(game.zze()), "PlayEnabledGame");
/* 137 */           wc0Var.m9529d(Boolean.valueOf(game.zzc()), "InstanceInstalled");
/* 146 */           wc0Var.m9529d(game.zza(), "InstancePackageName");
/* 159 */           wc0Var.m9529d(Integer.valueOf(game.mo2073w0()), "AchievementTotalCount");
/* 172 */           wc0Var.m9529d(Integer.valueOf(game.mo2065Q()), "LeaderboardCount");
/* 185 */           wc0Var.m9529d(Boolean.valueOf(game.mo2070k0()), "AreSnapshotsEnabled");
/* 194 */           wc0Var.m9529d(game.mo2069h0(), "ThemeColor");
/* 207 */           wc0Var.m9529d(Boolean.valueOf(game.mo2071l1()), "HasGamepadSupport");
/* 210 */           return wc0Var.toString();
                }

                /* JADX INFO: renamed from: H1 */
                public static boolean m2078H1(Game game, Object obj) {
/* 3 */             if (!(obj instanceof Game)) {
/* 389 */               return false;
                    }
/* 7 */             if (game == obj) {
/* 387 */               return true;
                    }
/* 11 */            Game game2 = (Game) obj;
                    return de3.m3029k(game2.mo2072q(), game.mo2072q()) && de3.m3029k(game2.mo2067f(), game.mo2067f()) && de3.m3029k(game2.mo2063A(), game.mo2063A()) && de3.m3029k(game2.mo2074y0(), game.mo2074y0()) && de3.m3029k(game2.getDescription(), game.getDescription()) && de3.m3029k(game2.mo2064O(), game.mo2064O()) && de3.m3029k(game2.mo2066c(), game.mo2066c()) && de3.m3029k(game2.mo2068h(), game.mo2068h()) && de3.m3029k(game2.mo2075y1(), game.mo2075y1()) && de3.m3029k(Boolean.valueOf(game2.zze()), Boolean.valueOf(game.zze())) && de3.m3029k(Boolean.valueOf(game2.zzc()), Boolean.valueOf(game.zzc())) && de3.m3029k(game2.zza(), game.zza()) && de3.m3029k(Integer.valueOf(game2.mo2073w0()), Integer.valueOf(game.mo2073w0())) && de3.m3029k(Integer.valueOf(game2.mo2065Q()), Integer.valueOf(game.mo2065Q())) && de3.m3029k(Boolean.valueOf(game2.zzf()), Boolean.valueOf(game.zzf())) && de3.m3029k(Boolean.valueOf(game2.zzg()), Boolean.valueOf(game.zzg())) && de3.m3029k(Boolean.valueOf(game2.zzd()), Boolean.valueOf(game.zzd())) && de3.m3029k(Boolean.valueOf(game2.zzb()), Boolean.valueOf(game.zzb())) && de3.m3029k(Boolean.valueOf(game2.mo2070k0()), Boolean.valueOf(game.mo2070k0())) && de3.m3029k(game2.mo2069h0(), game.mo2069h0()) && de3.m3029k(Boolean.valueOf(game2.mo2071l1()), Boolean.valueOf(game.mo2071l1()));
                }

                @Override // com.google.android.gms.games.Game
                /* JADX INFO: renamed from: A */
                public final String mo2063A() {
/* 1 */             return this.f3921d;
                }

                @Override // com.google.android.gms.games.Game
                /* JADX INFO: renamed from: O */
                public final String mo2064O() {
/* 1 */             return this.f3929i;
                }

                @Override // com.google.android.gms.games.Game
                /* JADX INFO: renamed from: Q */
                public final int mo2065Q() {
/* 1 */             return this.f3916a0;
                }

                @Override // com.google.android.gms.games.Game
                /* JADX INFO: renamed from: c */
                public final Uri mo2066c() {
/* 1 */             return this.f3933v;
                }

                public final boolean equals(Object obj) {
/* 1 */             return m2078H1(this, obj);
                }

                @Override // com.google.android.gms.games.Game
                /* JADX INFO: renamed from: f */
                public final String mo2067f() {
/* 1 */             return this.f3919c;
                }

                @Override // com.google.android.gms.games.Game
                public final String getDescription() {
/* 1 */             return this.f3925f;
                }

                @Override // com.google.android.gms.games.Game
                public final String getFeaturedImageUrl() {
/* 1 */             return this.f3926f0;
                }

                @Override // com.google.android.gms.games.Game
                public final String getHiResImageUrl() {
/* 1 */             return this.f3924e0;
                }

                @Override // com.google.android.gms.games.Game
                public final String getIconImageUrl() {
/* 1 */             return this.f3922d0;
                }

                @Override // com.google.android.gms.games.Game
                /* JADX INFO: renamed from: h */
                public final Uri mo2068h() {
/* 1 */             return this.f3934w;
                }

                @Override // com.google.android.gms.games.Game
                /* JADX INFO: renamed from: h0 */
                public final String mo2069h0() {
/* 1 */             return this.f3931j0;
                }

                public final int hashCode() {
/* 1 */             return m2076F1(this);
                }

                @Override // com.google.android.gms.games.Game
                /* JADX INFO: renamed from: k0 */
                public final boolean mo2070k0() {
/* 1 */             return this.f3930i0;
                }

                @Override // com.google.android.gms.games.Game
                /* JADX INFO: renamed from: l1 */
                public final boolean mo2071l1() {
/* 1 */             return this.f3932k0;
                }

                @Override // com.google.android.gms.games.Game
                /* JADX INFO: renamed from: q */
                public final String mo2072q() {
/* 1 */             return this.f3917b;
                }

                public final String toString() {
/* 1 */             return m2077G1(this);
                }

                @Override // com.google.android.gms.games.Game
                /* JADX INFO: renamed from: w0 */
                public final int mo2073w0() {
/* 1 */             return this.f3915Z;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.f3917b, false);
/* 17 */            w11.m9410T(parcel, 2, this.f3919c, false);
/* 23 */            w11.m9410T(parcel, 3, this.f3921d, false);
/* 29 */            w11.m9410T(parcel, 4, this.f3923e, false);
/* 35 */            w11.m9410T(parcel, 5, this.f3925f, false);
/* 41 */            w11.m9410T(parcel, 6, this.f3929i, false);
/* 47 */            w11.m9409S(parcel, 7, this.f3933v, i, false);
/* 54 */            w11.m9409S(parcel, 8, this.f3934w, i, false);
/* 61 */            w11.m9409S(parcel, 9, this.f3910U, i, false);
/* 66 */            w11.m9420b0(parcel, 10, 4);
/* 71 */            parcel.writeInt(this.f3911V ? 1 : 0);
/* 76 */            w11.m9420b0(parcel, 11, 4);
/* 81 */            parcel.writeInt(this.f3912W ? 1 : 0);
/* 88 */            w11.m9410T(parcel, 12, this.f3913X, false);
/* 93 */            w11.m9420b0(parcel, 13, 4);
/* 98 */            parcel.writeInt(this.f3914Y);
/* 103 */           w11.m9420b0(parcel, 14, 4);
/* 108 */           parcel.writeInt(this.f3915Z);
/* 113 */           w11.m9420b0(parcel, 15, 4);
/* 118 */           parcel.writeInt(this.f3916a0);
/* 123 */           w11.m9420b0(parcel, 16, 4);
/* 128 */           parcel.writeInt(this.f3918b0 ? 1 : 0);
/* 133 */           w11.m9420b0(parcel, 17, 4);
/* 138 */           parcel.writeInt(this.f3920c0 ? 1 : 0);
/* 145 */           w11.m9410T(parcel, 18, this.f3922d0, false);
/* 152 */           w11.m9410T(parcel, 19, this.f3924e0, false);
/* 159 */           w11.m9410T(parcel, 20, this.f3926f0, false);
/* 164 */           w11.m9420b0(parcel, 21, 4);
/* 169 */           parcel.writeInt(this.f3927g0 ? 1 : 0);
/* 174 */           w11.m9420b0(parcel, 22, 4);
/* 179 */           parcel.writeInt(this.f3928h0 ? 1 : 0);
/* 184 */           w11.m9420b0(parcel, 23, 4);
/* 189 */           parcel.writeInt(this.f3930i0 ? 1 : 0);
/* 196 */           w11.m9410T(parcel, 24, this.f3931j0, false);
/* 201 */           w11.m9420b0(parcel, 25, 4);
/* 206 */           parcel.writeInt(this.f3932k0 ? 1 : 0);
/* 209 */           w11.m9428f0(iM9422c0, parcel);
                }

                @Override // com.google.android.gms.games.Game
                /* JADX INFO: renamed from: y0 */
                public final String mo2074y0() {
/* 1 */             return this.f3923e;
                }

                @Override // com.google.android.gms.games.Game
                /* JADX INFO: renamed from: y1 */
                public final Uri mo2075y1() {
/* 1 */             return this.f3910U;
                }

                @Override // com.google.android.gms.games.Game
                public final String zza() {
/* 1 */             return this.f3913X;
                }

                @Override // com.google.android.gms.games.Game
                public final boolean zzb() {
/* 1 */             return this.f3928h0;
                }

                @Override // com.google.android.gms.games.Game
                public final boolean zzc() {
/* 1 */             return this.f3912W;
                }

                @Override // com.google.android.gms.games.Game
                public final boolean zzd() {
/* 1 */             return this.f3927g0;
                }

                @Override // com.google.android.gms.games.Game
                public final boolean zze() {
/* 1 */             return this.f3911V;
                }

                @Override // com.google.android.gms.games.Game
                public final boolean zzf() {
/* 1 */             return this.f3918b0;
                }

                @Override // com.google.android.gms.games.Game
                public final boolean zzg() {
/* 1 */             return this.f3920c0;
                }

/* 151 */       public GameEntity(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Uri uri2, Uri uri3, boolean z, boolean z2, String str7, int i, int i2, int i3, boolean z3, boolean z4, String str8, String str9, String str10, boolean z5, boolean z6, boolean z7, String str11, boolean z8) {
/* 153 */           this.f3917b = str;
                    this.f3919c = str2;
                    this.f3921d = str3;
                    this.f3923e = str4;
                    this.f3925f = str5;
                    this.f3929i = str6;
                    this.f3933v = uri;
                    this.f3922d0 = str8;
                    this.f3934w = uri2;
                    this.f3924e0 = str9;
                    this.f3910U = uri3;
                    this.f3926f0 = str10;
                    this.f3911V = z;
                    this.f3912W = z2;
                    this.f3913X = str7;
                    this.f3914Y = i;
                    this.f3915Z = i2;
                    this.f3916a0 = i3;
                    this.f3918b0 = z3;
                    this.f3920c0 = z4;
                    this.f3927g0 = z5;
                    this.f3928h0 = z6;
                    this.f3930i0 = z7;
                    this.f3931j0 = str11;
                    this.f3932k0 = z8;
                }
            }
