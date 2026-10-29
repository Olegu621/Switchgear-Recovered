            package com.google.android.gms.games.achievement;

            import android.net.Uri;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.games.Player;
            import com.google.android.gms.games.PlayerEntity;
            import com.google.android.gms.games.internal.zzh;
            import java.util.Arrays;
            import p000.C1951n4;
            import p000.de3;
            import p000.kb1;
            import p000.tc3;
            import p000.w11;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 202 */   public final class AchievementEntity extends zzh implements Achievement {
                public static final Parcelable.Creator<AchievementEntity> CREATOR = new tc3(4);

                /* JADX INFO: renamed from: U */
                public final String f3971U;

                /* JADX INFO: renamed from: V */
                public final PlayerEntity f3972V;

                /* JADX INFO: renamed from: W */
                public final int f3973W;

                /* JADX INFO: renamed from: X */
                public final int f3974X;

                /* JADX INFO: renamed from: Y */
                public final String f3975Y;

                /* JADX INFO: renamed from: Z */
                public final long f3976Z;

                /* JADX INFO: renamed from: a */
                public final String f3977a;

                /* JADX INFO: renamed from: a0 */
                public final long f3978a0;

                /* JADX INFO: renamed from: b */
                public final int f3979b;

                /* JADX INFO: renamed from: b0 */
                public final float f3980b0;

                /* JADX INFO: renamed from: c */
                public final String f3981c;

                /* JADX INFO: renamed from: c0 */
                public final String f3982c0;

                /* JADX INFO: renamed from: d */
                public final String f3983d;

                /* JADX INFO: renamed from: e */
                public final Uri f3984e;

                /* JADX INFO: renamed from: f */
                public final String f3985f;

                /* JADX INFO: renamed from: i */
                public final Uri f3986i;

                /* JADX INFO: renamed from: v */
                public final String f3987v;

                /* JADX INFO: renamed from: w */
                public final int f3988w;

                public AchievementEntity(AchievementRef achievementRef) {
/* 6 */             String strM10270j = achievementRef.m10270j("external_achievement_id");
/* 10 */            this.f3977a = strM10270j;
/* 18 */            this.f3979b = achievementRef.m10268d("type");
/* 26 */            this.f3981c = achievementRef.m10270j("name");
/* 30 */            String strM10270j2 = achievementRef.m10270j("description");
/* 34 */            this.f3983d = strM10270j2;
/* 42 */            this.f3984e = achievementRef.m10273w("unlocked_icon_image_uri");
/* 50 */            this.f3985f = achievementRef.m10270j("unlocked_icon_image_url");
/* 58 */            this.f3986i = achievementRef.m10273w("revealed_icon_image_uri");
/* 66 */            this.f3987v = achievementRef.m10270j("revealed_icon_image_url");
/* 68 */            Player playerZzb = achievementRef.zzb();
/* 73 */            if (playerZzb != null) {
/* 80 */                this.f3972V = new PlayerEntity(playerZzb);
                    } else {
/* 83 */                this.f3972V = null;
                    }
/* 91 */            this.f3973W = achievementRef.m10268d("state");
/* 99 */            this.f3976Z = achievementRef.m10269e("last_updated_timestamp");
/* 105 */           this.f3978a0 = achievementRef.mo2096W();
/* 111 */           this.f3980b0 = achievementRef.zza();
/* 119 */           this.f3982c0 = achievementRef.m10270j("external_game_id");
/* 127 */           if (achievementRef.m10268d("type") == 1) {
/* 133 */               this.f3988w = achievementRef.mo2097f1();
/* 144 */               kb1.m6064q(achievementRef.m10268d("type") == 1);
/* 153 */               this.f3971U = achievementRef.m10270j("formatted_total_steps");
/* 159 */               this.f3974X = achievementRef.mo2094D0();
/* 169 */               kb1.m6064q(achievementRef.m10268d("type") == 1);
/* 178 */               this.f3975Y = achievementRef.m10270j("formatted_current_steps");
                    } else {
/* 181 */               this.f3988w = 0;
/* 183 */               this.f3971U = null;
/* 185 */               this.f3974X = 0;
/* 187 */               this.f3975Y = null;
                    }
/* 191 */           if (strM10270j == null) {
/* 200 */               C1951n4.m6859j("null reference");
/* 203 */               throw null;
                    }
/* 193 */           if (strM10270j2 != null) {
/* 195 */               return;
                    }
/* 196 */           C1951n4.m6859j("null reference");
/* 199 */           throw null;
                }

                /* JADX INFO: renamed from: D1 */
                public static int m2099D1(Achievement achievement) {
                    int iMo2094D0;
                    int iMo2097f1;
/* 6 */             if (achievement.getType() == 1) {
/* 8 */                 iMo2094D0 = achievement.mo2094D0();
/* 12 */                iMo2097f1 = achievement.mo2097f1();
                    } else {
/* 17 */                iMo2094D0 = 0;
/* 18 */                iMo2097f1 = 0;
                    }
/* 83 */            return Arrays.hashCode(new Object[]{achievement.mo2098n0(), achievement.zzc(), achievement.getName(), Integer.valueOf(achievement.getType()), achievement.getDescription(), Long.valueOf(achievement.mo2096W()), Integer.valueOf(achievement.getState()), Long.valueOf(achievement.mo2095U0()), achievement.zzb(), Integer.valueOf(iMo2094D0), Integer.valueOf(iMo2097f1)});
                }

                /* JADX INFO: renamed from: E1 */
                public static String m2100E1(Achievement achievement) {
/* 3 */             wc0 wc0Var = new wc0(achievement);
/* 12 */            wc0Var.m9529d(achievement.mo2098n0(), "Id");
/* 21 */            wc0Var.m9529d(achievement.zzc(), "Game Id");
/* 34 */            wc0Var.m9529d(Integer.valueOf(achievement.getType()), "Type");
/* 43 */            wc0Var.m9529d(achievement.getName(), "Name");
/* 52 */            wc0Var.m9529d(achievement.getDescription(), "Description");
/* 61 */            wc0Var.m9529d(achievement.zzb(), "Player");
/* 74 */            wc0Var.m9529d(Integer.valueOf(achievement.getState()), "State");
/* 87 */            wc0Var.m9529d(Float.valueOf(achievement.zza()), "Rarity Percent");
/* 95 */            if (achievement.getType() == 1) {
/* 107 */               wc0Var.m9529d(Integer.valueOf(achievement.mo2094D0()), "CurrentSteps");
/* 120 */               wc0Var.m9529d(Integer.valueOf(achievement.mo2097f1()), "TotalSteps");
                    }
/* 123 */           return wc0Var.toString();
                }

                /* JADX INFO: renamed from: F1 */
                public static boolean m2101F1(Achievement achievement, Object obj) {
/* 3 */             if (!(obj instanceof Achievement)) {
/* 171 */               return false;
                    }
/* 8 */             if (achievement != obj) {
/* 12 */                Achievement achievement2 = (Achievement) obj;
/* 22 */                if (achievement2.getType() != achievement.getType()) {
/* 171 */                   return false;
                        }
/* 30 */                if ((achievement.getType() == 1 && (achievement2.mo2094D0() != achievement.mo2094D0() || achievement2.mo2097f1() != achievement.mo2097f1())) || achievement2.mo2096W() != achievement.mo2096W() || achievement2.getState() != achievement.getState() || achievement2.mo2095U0() != achievement.mo2095U0() || !de3.m3029k(achievement2.mo2098n0(), achievement.mo2098n0()) || !de3.m3029k(achievement2.zzc(), achievement.zzc()) || !de3.m3029k(achievement2.getName(), achievement.getName()) || !de3.m3029k(achievement2.getDescription(), achievement.getDescription()) || !de3.m3029k(achievement2.zzb(), achievement.zzb()) || achievement2.zza() != achievement.zza()) {
/* 171 */                   return false;
                        }
                    }
/* 7 */             return true;
                }

                @Override // com.google.android.gms.games.achievement.Achievement
                /* JADX INFO: renamed from: D0 */
                public final int mo2094D0() {
/* 8 */             kb1.m6064q(this.f3979b == 1);
/* 11 */            return this.f3974X;
                }

                @Override // com.google.android.gms.games.achievement.Achievement
                /* JADX INFO: renamed from: U0 */
                public final long mo2095U0() {
/* 1 */             return this.f3976Z;
                }

                @Override // com.google.android.gms.games.achievement.Achievement
                /* JADX INFO: renamed from: W */
                public final long mo2096W() {
/* 1 */             return this.f3978a0;
                }

                public final boolean equals(Object obj) {
/* 1 */             return m2101F1(this, obj);
                }

                @Override // com.google.android.gms.games.achievement.Achievement
                /* JADX INFO: renamed from: f1 */
                public final int mo2097f1() {
/* 8 */             kb1.m6064q(this.f3979b == 1);
/* 11 */            return this.f3988w;
                }

                @Override // com.google.android.gms.games.achievement.Achievement
                public final String getDescription() {
/* 1 */             return this.f3983d;
                }

                @Override // com.google.android.gms.games.achievement.Achievement
                public final String getName() {
/* 1 */             return this.f3981c;
                }

                @Override // com.google.android.gms.games.achievement.Achievement
                public final int getState() {
/* 1 */             return this.f3973W;
                }

                @Override // com.google.android.gms.games.achievement.Achievement
                public final int getType() {
/* 1 */             return this.f3979b;
                }

                public final int hashCode() {
/* 1 */             return m2099D1(this);
                }

                @Override // com.google.android.gms.games.achievement.Achievement
                /* JADX INFO: renamed from: n0 */
                public final String mo2098n0() {
/* 1 */             return this.f3977a;
                }

                public final String toString() {
/* 1 */             return m2100E1(this);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.f3977a, false);
/* 16 */            w11.m9420b0(parcel, 2, 4);
/* 21 */            parcel.writeInt(this.f3979b);
/* 27 */            w11.m9410T(parcel, 3, this.f3981c, false);
/* 32 */            w11.m9410T(parcel, 4, this.f3983d, false);
/* 38 */            w11.m9409S(parcel, 5, this.f3984e, i, false);
/* 44 */            w11.m9410T(parcel, 6, this.f3985f, false);
/* 50 */            w11.m9409S(parcel, 7, this.f3986i, i, false);
/* 57 */            w11.m9410T(parcel, 8, this.f3987v, false);
/* 62 */            w11.m9420b0(parcel, 9, 4);
/* 67 */            parcel.writeInt(this.f3988w);
/* 74 */            w11.m9410T(parcel, 10, this.f3971U, false);
/* 81 */            w11.m9409S(parcel, 11, this.f3972V, i, false);
/* 86 */            w11.m9420b0(parcel, 12, 4);
/* 91 */            parcel.writeInt(this.f3973W);
/* 96 */            w11.m9420b0(parcel, 13, 4);
/* 101 */           parcel.writeInt(this.f3974X);
/* 108 */           w11.m9410T(parcel, 14, this.f3975Y, false);
/* 113 */           w11.m9420b0(parcel, 15, 8);
/* 118 */           parcel.writeLong(this.f3976Z);
/* 123 */           w11.m9420b0(parcel, 16, 8);
/* 128 */           parcel.writeLong(this.f3978a0);
/* 133 */           w11.m9420b0(parcel, 17, 4);
/* 138 */           parcel.writeFloat(this.f3980b0);
/* 145 */           w11.m9410T(parcel, 18, this.f3982c0, false);
/* 148 */           w11.m9428f0(iM9422c0, parcel);
                }

                @Override // com.google.android.gms.games.achievement.Achievement
                public final float zza() {
/* 1 */             return this.f3980b0;
                }

                @Override // com.google.android.gms.games.achievement.Achievement
                public final Player zzb() {
/* 1 */             return this.f3972V;
                }

                @Override // com.google.android.gms.games.achievement.Achievement
                public final String zzc() {
/* 1 */             return this.f3982c0;
                }

/* 203 */       public AchievementEntity(String str, int i, String str2, String str3, Uri uri, String str4, Uri uri2, String str5, int i2, String str6, PlayerEntity playerEntity, int i3, int i4, String str7, long j, long j2, float f, String str8) {
/* 205 */           this.f3977a = str;
                    this.f3979b = i;
                    this.f3981c = str2;
                    this.f3983d = str3;
                    this.f3984e = uri;
                    this.f3985f = str4;
                    this.f3986i = uri2;
                    this.f3987v = str5;
                    this.f3988w = i2;
                    this.f3971U = str6;
                    this.f3972V = playerEntity;
                    this.f3973W = i3;
                    this.f3974X = i4;
                    this.f3975Y = str7;
                    this.f3976Z = j;
                    this.f3978a0 = j2;
                    this.f3980b0 = f;
                    this.f3982c0 = str8;
                }
            }
