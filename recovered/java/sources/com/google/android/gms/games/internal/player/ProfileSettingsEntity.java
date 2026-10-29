            package com.google.android.gms.games.internal.player;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.games.internal.zzh;
            import java.util.Arrays;
            import p000.de3;
            import p000.p42;
            import p000.tf3;
            import p000.w11;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ProfileSettingsEntity extends zzh implements p42 {
                public static final Parcelable.Creator<ProfileSettingsEntity> CREATOR = new tf3(3);

                /* JADX INFO: renamed from: U */
                public final boolean f4022U;

                /* JADX INFO: renamed from: V */
                public final boolean f4023V;

                /* JADX INFO: renamed from: W */
                public final int f4024W;

                /* JADX INFO: renamed from: X */
                public final int f4025X;

                /* JADX INFO: renamed from: Y */
                public final boolean f4026Y;

                /* JADX INFO: renamed from: a */
                public final Status f4027a;

                /* JADX INFO: renamed from: b */
                public final String f4028b;

                /* JADX INFO: renamed from: c */
                public final boolean f4029c;

                /* JADX INFO: renamed from: d */
                public final boolean f4030d;

                /* JADX INFO: renamed from: e */
                public final boolean f4031e;

                /* JADX INFO: renamed from: f */
                public final StockProfileImageEntity f4032f;

                /* JADX INFO: renamed from: i */
                public final boolean f4033i;

                /* JADX INFO: renamed from: v */
                public final boolean f4034v;

                /* JADX INFO: renamed from: w */
                public final int f4035w;

                public ProfileSettingsEntity(Status status, String str, boolean z, boolean z2, boolean z3, StockProfileImageEntity stockProfileImageEntity, boolean z4, boolean z5, int i, boolean z6, boolean z7, int i2, int i3, boolean z8) {
/* 4 */             this.f4027a = status;
/* 6 */             this.f4028b = str;
/* 8 */             this.f4029c = z;
/* 10 */            this.f4030d = z2;
/* 12 */            this.f4031e = z3;
/* 14 */            this.f4032f = stockProfileImageEntity;
/* 16 */            this.f4033i = z4;
/* 18 */            this.f4034v = z5;
/* 20 */            this.f4035w = i;
/* 22 */            this.f4022U = z6;
/* 24 */            this.f4023V = z7;
/* 26 */            this.f4024W = i2;
/* 28 */            this.f4025X = i3;
/* 30 */            this.f4026Y = z8;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof ProfileSettingsEntity)) {
/* 3 */                 return false;
                    }
/* 8 */             if (this == obj) {
/* 7 */                 return true;
                    }
/* 11 */            ProfileSettingsEntity profileSettingsEntity = (ProfileSettingsEntity) obj;
                    return de3.m3029k(this.f4028b, profileSettingsEntity.f4028b) && de3.m3029k(Boolean.valueOf(this.f4029c), Boolean.valueOf(profileSettingsEntity.f4029c)) && de3.m3029k(Boolean.valueOf(this.f4030d), Boolean.valueOf(profileSettingsEntity.f4030d)) && de3.m3029k(Boolean.valueOf(this.f4031e), Boolean.valueOf(profileSettingsEntity.f4031e)) && de3.m3029k(this.f4027a, profileSettingsEntity.f4027a) && de3.m3029k(this.f4032f, profileSettingsEntity.f4032f) && de3.m3029k(Boolean.valueOf(this.f4033i), Boolean.valueOf(profileSettingsEntity.f4033i)) && de3.m3029k(Boolean.valueOf(this.f4034v), Boolean.valueOf(profileSettingsEntity.f4034v)) && this.f4035w == profileSettingsEntity.f4035w && this.f4022U == profileSettingsEntity.f4022U && this.f4023V == profileSettingsEntity.f4023V && this.f4024W == profileSettingsEntity.f4024W && this.f4025X == profileSettingsEntity.f4025X && this.f4026Y == profileSettingsEntity.f4026Y;
                }

                @Override // p000.p42
                public final Status getStatus() {
/* 1 */             return this.f4027a;
                }

                public final int hashCode() {
/* 77 */            return Arrays.hashCode(new Object[]{this.f4028b, Boolean.valueOf(this.f4029c), Boolean.valueOf(this.f4030d), Boolean.valueOf(this.f4031e), this.f4027a, this.f4032f, Boolean.valueOf(this.f4033i), Boolean.valueOf(this.f4034v), Integer.valueOf(this.f4035w), Boolean.valueOf(this.f4022U), Boolean.valueOf(this.f4023V), Integer.valueOf(this.f4024W), Integer.valueOf(this.f4025X), Boolean.valueOf(this.f4026Y)});
                }

                public final String toString() {
/* 3 */             wc0 wc0Var = new wc0(this);
/* 10 */            wc0Var.m9529d(this.f4028b, "GamerTag");
/* 21 */            wc0Var.m9529d(Boolean.valueOf(this.f4029c), "IsGamerTagExplicitlySet");
/* 32 */            wc0Var.m9529d(Boolean.valueOf(this.f4030d), "IsProfileVisible");
/* 43 */            wc0Var.m9529d(Boolean.valueOf(this.f4031e), "IsVisibilityExplicitlySet");
/* 50 */            wc0Var.m9529d(this.f4027a, "Status");
/* 57 */            wc0Var.m9529d(this.f4032f, "StockProfileImage");
/* 68 */            wc0Var.m9529d(Boolean.valueOf(this.f4033i), "IsProfileDiscoverable");
/* 79 */            wc0Var.m9529d(Boolean.valueOf(this.f4034v), "AutoSignIn");
/* 90 */            wc0Var.m9529d(Integer.valueOf(this.f4035w), "httpErrorCode");
/* 101 */           wc0Var.m9529d(Boolean.valueOf(this.f4022U), "IsSettingsChangesProhibited");
/* 112 */           wc0Var.m9529d(Boolean.valueOf(this.f4023V), "AllowFriendInvites");
/* 123 */           wc0Var.m9529d(Integer.valueOf(this.f4024W), "ProfileVisibility");
/* 134 */           wc0Var.m9529d(Integer.valueOf(this.f4025X), "global_friends_list_visibility");
/* 145 */           wc0Var.m9529d(Boolean.valueOf(this.f4026Y), "always_auto_sign_in");
/* 148 */           return wc0Var.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 1, this.f4027a, i, false);
/* 17 */            w11.m9410T(parcel, 2, this.f4028b, false);
/* 22 */            w11.m9420b0(parcel, 3, 4);
/* 27 */            parcel.writeInt(this.f4029c ? 1 : 0);
/* 30 */            w11.m9420b0(parcel, 4, 4);
/* 35 */            parcel.writeInt(this.f4030d ? 1 : 0);
/* 39 */            w11.m9420b0(parcel, 5, 4);
/* 44 */            parcel.writeInt(this.f4031e ? 1 : 0);
/* 50 */            w11.m9409S(parcel, 6, this.f4032f, i, false);
/* 54 */            w11.m9420b0(parcel, 7, 4);
/* 59 */            parcel.writeInt(this.f4033i ? 1 : 0);
/* 64 */            w11.m9420b0(parcel, 8, 4);
/* 69 */            parcel.writeInt(this.f4034v ? 1 : 0);
/* 74 */            w11.m9420b0(parcel, 9, 4);
/* 79 */            parcel.writeInt(this.f4035w);
/* 84 */            w11.m9420b0(parcel, 10, 4);
/* 89 */            parcel.writeInt(this.f4022U ? 1 : 0);
/* 94 */            w11.m9420b0(parcel, 11, 4);
/* 99 */            parcel.writeInt(this.f4023V ? 1 : 0);
/* 104 */           w11.m9420b0(parcel, 12, 4);
/* 109 */           parcel.writeInt(this.f4024W);
/* 114 */           w11.m9420b0(parcel, 13, 4);
/* 119 */           parcel.writeInt(this.f4025X);
/* 124 */           w11.m9420b0(parcel, 14, 4);
/* 129 */           parcel.writeInt(this.f4026Y ? 1 : 0);
/* 132 */           w11.m9428f0(iM9422c0, parcel);
                }
            }
