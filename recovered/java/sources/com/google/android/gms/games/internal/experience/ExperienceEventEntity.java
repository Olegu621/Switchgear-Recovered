            package com.google.android.gms.games.internal.experience;

            import android.net.Uri;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.games.Game;
            import com.google.android.gms.games.GameEntity;
            import com.google.android.gms.games.internal.zzh;
            import java.util.Arrays;
            import p000.de3;
            import p000.tc3;
            import p000.w11;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ExperienceEventEntity extends zzh implements ExperienceEvent {
                public static final Parcelable.Creator<ExperienceEventEntity> CREATOR = new tc3(6);

                /* JADX INFO: renamed from: U */
                public final int f3998U;

                /* JADX INFO: renamed from: V */
                public final int f3999V;

                /* JADX INFO: renamed from: a */
                public final String f4000a;

                /* JADX INFO: renamed from: b */
                public final GameEntity f4001b;

                /* JADX INFO: renamed from: c */
                public final String f4002c;

                /* JADX INFO: renamed from: d */
                public final String f4003d;

                /* JADX INFO: renamed from: e */
                public final String f4004e;

                /* JADX INFO: renamed from: f */
                public final Uri f4005f;

                /* JADX INFO: renamed from: i */
                public final long f4006i;

                /* JADX INFO: renamed from: v */
                public final long f4007v;

                /* JADX INFO: renamed from: w */
                public final long f4008w;

                public ExperienceEventEntity(String str, GameEntity gameEntity, String str2, String str3, String str4, Uri uri, long j, long j2, long j3, int i, int i2) {
/* 4 */             this.f4000a = str;
/* 6 */             this.f4001b = gameEntity;
/* 8 */             this.f4002c = str2;
/* 10 */            this.f4003d = str3;
/* 12 */            this.f4004e = str4;
/* 14 */            this.f4005f = uri;
/* 16 */            this.f4006i = j;
/* 18 */            this.f4007v = j2;
/* 20 */            this.f4008w = j3;
/* 22 */            this.f3998U = i;
/* 24 */            this.f3999V = i2;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof ExperienceEvent)) {
/* 188 */               return false;
                    }
/* 7 */             if (this == obj) {
/* 186 */               return true;
                    }
/* 11 */            ExperienceEvent experienceEvent = (ExperienceEvent) obj;
                    return de3.m3029k(experienceEvent.zzj(), this.f4000a) && de3.m3029k(experienceEvent.zzg(), this.f4001b) && de3.m3029k(experienceEvent.zzi(), this.f4002c) && de3.m3029k(experienceEvent.zzh(), this.f4003d) && de3.m3029k(experienceEvent.getIconImageUrl(), this.f4004e) && de3.m3029k(experienceEvent.zzf(), this.f4005f) && de3.m3029k(Long.valueOf(experienceEvent.zzc()), Long.valueOf(this.f4006i)) && de3.m3029k(Long.valueOf(experienceEvent.zze()), Long.valueOf(this.f4007v)) && de3.m3029k(Long.valueOf(experienceEvent.zzd()), Long.valueOf(this.f4008w)) && de3.m3029k(Integer.valueOf(experienceEvent.zzb()), Integer.valueOf(this.f3998U)) && de3.m3029k(Integer.valueOf(experienceEvent.zza()), Integer.valueOf(this.f3999V));
                }

                @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
                public final String getIconImageUrl() {
/* 1 */             return this.f4004e;
                }

                public final int hashCode() {
/* 47 */            return Arrays.hashCode(new Object[]{this.f4000a, this.f4001b, this.f4002c, this.f4003d, this.f4004e, this.f4005f, Long.valueOf(this.f4006i), Long.valueOf(this.f4007v), Long.valueOf(this.f4008w), Integer.valueOf(this.f3998U), Integer.valueOf(this.f3999V)});
                }

                public final String toString() {
/* 3 */             wc0 wc0Var = new wc0(this);
/* 10 */            wc0Var.m9529d(this.f4000a, "ExperienceId");
/* 17 */            wc0Var.m9529d(this.f4001b, "Game");
/* 24 */            wc0Var.m9529d(this.f4002c, "DisplayTitle");
/* 31 */            wc0Var.m9529d(this.f4003d, "DisplayDescription");
/* 38 */            wc0Var.m9529d(this.f4004e, "IconImageUrl");
/* 45 */            wc0Var.m9529d(this.f4005f, "IconImageUri");
/* 56 */            wc0Var.m9529d(Long.valueOf(this.f4006i), "CreatedTimestamp");
/* 67 */            wc0Var.m9529d(Long.valueOf(this.f4007v), "XpEarned");
/* 78 */            wc0Var.m9529d(Long.valueOf(this.f4008w), "CurrentXp");
/* 89 */            wc0Var.m9529d(Integer.valueOf(this.f3998U), "Type");
/* 100 */           wc0Var.m9529d(Integer.valueOf(this.f3999V), "NewLevel");
/* 103 */           return wc0Var.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.f4000a, false);
/* 17 */            w11.m9409S(parcel, 2, this.f4001b, i, false);
/* 23 */            w11.m9410T(parcel, 3, this.f4002c, false);
/* 29 */            w11.m9410T(parcel, 4, this.f4003d, false);
/* 35 */            w11.m9410T(parcel, 5, this.f4004e, false);
/* 41 */            w11.m9409S(parcel, 6, this.f4005f, i, false);
/* 47 */            w11.m9420b0(parcel, 7, 8);
/* 52 */            parcel.writeLong(this.f4006i);
/* 55 */            w11.m9420b0(parcel, 8, 8);
/* 60 */            parcel.writeLong(this.f4007v);
/* 65 */            w11.m9420b0(parcel, 9, 8);
/* 70 */            parcel.writeLong(this.f4008w);
/* 75 */            w11.m9420b0(parcel, 10, 4);
/* 80 */            parcel.writeInt(this.f3998U);
/* 85 */            w11.m9420b0(parcel, 11, 4);
/* 90 */            parcel.writeInt(this.f3999V);
/* 93 */            w11.m9428f0(iM9422c0, parcel);
                }

                @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
                public final int zza() {
/* 1 */             return this.f3999V;
                }

                @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
                public final int zzb() {
/* 1 */             return this.f3998U;
                }

                @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
                public final long zzc() {
/* 1 */             return this.f4006i;
                }

                @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
                public final long zzd() {
/* 1 */             return this.f4008w;
                }

                @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
                public final long zze() {
/* 1 */             return this.f4007v;
                }

                @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
                public final Uri zzf() {
/* 1 */             return this.f4005f;
                }

                @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
                public final Game zzg() {
/* 1 */             return this.f4001b;
                }

                @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
                public final String zzh() {
/* 1 */             return this.f4003d;
                }

                @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
                public final String zzi() {
/* 1 */             return this.f4002c;
                }

                @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
                public final String zzj() {
/* 1 */             return this.f4000a;
                }
            }
