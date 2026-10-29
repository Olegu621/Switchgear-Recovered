            package com.google.android.material.badge;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.Locale;
            import p000.qd3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class BadgeState$State implements Parcelable {
                public static final Parcelable.Creator<BadgeState$State> CREATOR = new qd3(3);

                /* JADX INFO: renamed from: U */
                public int f4419U;

                /* JADX INFO: renamed from: V */
                public Integer f4420V;

                /* JADX INFO: renamed from: X */
                public Integer f4422X;

                /* JADX INFO: renamed from: Y */
                public Integer f4423Y;

                /* JADX INFO: renamed from: Z */
                public Integer f4424Z;

                /* JADX INFO: renamed from: a */
                public int f4425a;

                /* JADX INFO: renamed from: a0 */
                public Integer f4426a0;

                /* JADX INFO: renamed from: b */
                public Integer f4427b;

                /* JADX INFO: renamed from: b0 */
                public Integer f4428b0;

                /* JADX INFO: renamed from: c */
                public Integer f4429c;

                /* JADX INFO: renamed from: c0 */
                public Integer f4430c0;

                /* JADX INFO: renamed from: i */
                public Locale f4434i;

                /* JADX INFO: renamed from: v */
                public CharSequence f4435v;

                /* JADX INFO: renamed from: w */
                public int f4436w;

                /* JADX INFO: renamed from: d */
                public int f4431d = 255;

                /* JADX INFO: renamed from: e */
                public int f4432e = -2;

                /* JADX INFO: renamed from: f */
                public int f4433f = -2;

                /* JADX INFO: renamed from: W */
                public Boolean f4421W = Boolean.TRUE;

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeInt(this.f4425a);
/* 8 */             parcel.writeSerializable(this.f4427b);
/* 13 */            parcel.writeSerializable(this.f4429c);
/* 18 */            parcel.writeInt(this.f4431d);
/* 23 */            parcel.writeInt(this.f4432e);
/* 28 */            parcel.writeInt(this.f4433f);
/* 31 */            CharSequence charSequence = this.f4435v;
/* 41 */            parcel.writeString(charSequence == null ? null : charSequence.toString());
/* 46 */            parcel.writeInt(this.f4436w);
/* 51 */            parcel.writeSerializable(this.f4420V);
/* 56 */            parcel.writeSerializable(this.f4422X);
/* 61 */            parcel.writeSerializable(this.f4423Y);
/* 66 */            parcel.writeSerializable(this.f4424Z);
/* 71 */            parcel.writeSerializable(this.f4426a0);
/* 76 */            parcel.writeSerializable(this.f4428b0);
/* 81 */            parcel.writeSerializable(this.f4430c0);
/* 86 */            parcel.writeSerializable(this.f4421W);
/* 91 */            parcel.writeSerializable(this.f4434i);
                }
            }
