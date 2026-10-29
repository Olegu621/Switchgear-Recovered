            package com.google.android.gms.fido.u2f.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.AbstractC0886en;
            import p000.C0819ct;
            import p000.C1951n4;
            import p000.md3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
/* 19 */    public class ChannelIdValue extends AbstractSafeParcelable {
                public static final Parcelable.Creator<ChannelIdValue> CREATOR = new md3(15);

                /* JADX INFO: renamed from: a */
                public final ChannelIdValueType f3864a;

                /* JADX INFO: renamed from: b */
                public final String f3865b;

                /* JADX INFO: renamed from: c */
                public final String f3866c;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum ChannelIdValueType implements Parcelable {
                    /* JADX INFO: Fake field, exist only in values array */
                    ABSENT(0),
                    STRING(1),
                    /* JADX INFO: Fake field, exist only in values array */
                    OBJECT(2);

                    public static final Parcelable.Creator<ChannelIdValueType> CREATOR = new C0328a();

                    /* JADX INFO: renamed from: a */
                    public final int f3869a;

                    ChannelIdValueType(int i) {
/* 4 */                 this.f3869a = i;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
/* 1 */                 return 0;
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 3 */                 parcel.writeInt(this.f3869a);
                    }
                }

                static {
/* 14 */            new ChannelIdValue("unavailable");
/* 21 */            new ChannelIdValue("unused");
                }

                public ChannelIdValue(int i, String str, String str2) {
                    try {
/* 8 */                 this.f3864a = m2060D1(i);
/* 10 */                this.f3865b = str;
/* 12 */                this.f3866c = str2;
                    } catch (C0819ct e) {
/* 16 */                C1951n4.m6863n(e);
/* 20 */                throw null;
                    }
                }

                /* JADX INFO: renamed from: D1 */
                public static ChannelIdValueType m2060D1(int i) throws C0819ct {
/* 7 */             for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
/* 13 */                if (i == channelIdValueType.f3869a) {
/* 15 */                    return channelIdValueType;
                        }
                    }
/* 32 */            throw new C0819ct(AbstractC0886en.m3505i(i, "ChannelIdValueType ", " not supported"));
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof ChannelIdValue)) {
/* 7 */                 return false;
                    }
/* 11 */            ChannelIdValue channelIdValue = (ChannelIdValue) obj;
/* 13 */            ChannelIdValueType channelIdValueType = channelIdValue.f3864a;
/* 15 */            ChannelIdValueType channelIdValueType2 = this.f3864a;
/* 21 */            if (!channelIdValueType2.equals(channelIdValueType)) {
/* 7 */                 return false;
                    }
/* 24 */            int iOrdinal = channelIdValueType2.ordinal();
/* 28 */            if (iOrdinal == 0) {
/* 1 */                 return true;
                    }
/* 30 */            if (iOrdinal == 1) {
/* 49 */                return this.f3865b.equals(channelIdValue.f3865b);
                    }
/* 33 */            if (iOrdinal != 2) {
/* 7 */                 return false;
                    }
/* 40 */            return this.f3866c.equals(channelIdValue.f3866c);
                }

                public final int hashCode() {
                    int i;
                    int iHashCode;
/* 1 */             ChannelIdValueType channelIdValueType = this.f3864a;
/* 7 */             int iHashCode2 = channelIdValueType.hashCode() + 31;
/* 9 */             int iOrdinal = channelIdValueType.ordinal();
/* 14 */            if (iOrdinal == 1) {
/* 30 */                i = iHashCode2 * 31;
/* 34 */                iHashCode = this.f3865b.hashCode();
                    } else {
/* 17 */                if (iOrdinal != 2) {
/* 19 */                    return iHashCode2;
                        }
/* 20 */                i = iHashCode2 * 31;
/* 24 */                iHashCode = this.f3866c.hashCode();
                    }
/* 28 */            return iHashCode + i;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             int i2 = this.f3864a.f3869a;
/* 13 */            w11.m9420b0(parcel, 2, 4);
/* 16 */            parcel.writeInt(i2);
/* 23 */            w11.m9410T(parcel, 3, this.f3865b, false);
/* 28 */            w11.m9410T(parcel, 4, this.f3866c, false);
/* 31 */            w11.m9428f0(iM9422c0, parcel);
                }

/* 20 */        public ChannelIdValue(String str) {
/* 22 */            this.f3865b = str;
/* 23 */            this.f3864a = ChannelIdValueType.STRING;
                    this.f3866c = null;
                }
            }
