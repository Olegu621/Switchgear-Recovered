            package com.google.android.gms.auth.api.accounttransfer;

            import android.app.PendingIntent;
            import android.os.Parcel;
            import android.os.Parcelable;
            import androidx.core.app.NotificationCompat;
            import com.google.android.gms.common.server.response.FastJsonResponse$Field;
            import com.google.android.gms.internal.auth.zzbz;
            import io.sentry.C1697u2;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Map;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            import p000.dr3;
            import p000.f42;
            import p000.fm0;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzw extends zzbz {
                public static final Parcelable.Creator<zzw> CREATOR = new dr3(21);

                /* JADX INFO: renamed from: v */
                public static final HashMap f3268v;

                /* JADX INFO: renamed from: a */
                public final HashSet f3269a;

                /* JADX INFO: renamed from: b */
                public final int f3270b;

                /* JADX INFO: renamed from: c */
                public String f3271c;

                /* JADX INFO: renamed from: d */
                public int f3272d;

                /* JADX INFO: renamed from: e */
                public byte[] f3273e;

                /* JADX INFO: renamed from: f */
                public final PendingIntent f3274f;

                /* JADX INFO: renamed from: i */
                public final DeviceMetaData f3275i;

                static {
/* 12 */            HashMap map = new HashMap();
/* 15 */            f3268v = map;
/* 30 */            map.put("accountType", new FastJsonResponse$Field(7, false, 7, false, "accountType", 2, null));
/* 48 */            map.put(NotificationCompat.CATEGORY_STATUS, new FastJsonResponse$Field(0, false, 0, false, NotificationCompat.CATEGORY_STATUS, 3, null));
/* 66 */            map.put("transferBytes", new FastJsonResponse$Field(8, false, 8, false, "transferBytes", 4, null));
                }

                public zzw(HashSet hashSet, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
/* 4 */             this.f3269a = hashSet;
/* 6 */             this.f3270b = i;
/* 8 */             this.f3271c = str;
/* 10 */            this.f3272d = i2;
/* 12 */            this.f3273e = bArr;
/* 14 */            this.f3274f = pendingIntent;
/* 16 */            this.f3275i = deviceMetaData;
                }

                @Override // p000.wg0
                public final /* synthetic */ Map getFieldMappings() {
/* 1 */             return f3268v;
                }

                @Override // p000.wg0
                public final Object getFieldValue(FastJsonResponse$Field fastJsonResponse$Field) {
/* 1 */             int i = fastJsonResponse$Field.f3581i;
/* 4 */             if (i == 1) {
/* 41 */                return Integer.valueOf(this.f3270b);
                    }
/* 7 */             if (i == 2) {
/* 36 */                return this.f3271c;
                    }
/* 10 */            if (i == 3) {
/* 31 */                return Integer.valueOf(this.f3272d);
                    }
/* 13 */            if (i == 4) {
/* 15 */                return this.f3273e;
                    }
/* 24 */            f42.m3656l(fm0.m3781g(i, "Unknown SafeParcelable id="));
/* 27 */            return null;
                }

                @Override // p000.wg0
                public final boolean isFieldSet(FastJsonResponse$Field fastJsonResponse$Field) {
/* 9 */             return this.f3269a.contains(Integer.valueOf(fastJsonResponse$Field.f3581i));
                }

                @Override // p000.wg0
                public final void setDecodedBytesInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
/* 1 */             int i = fastJsonResponse$Field.f3581i;
/* 4 */             if (i != 4) {
/* 26 */                C1951n4.m6859j(AbstractC0886en.m3505i(i, "Field with id=", " is not known to be an byte array."));
                    } else {
/* 6 */                 this.f3273e = bArr;
/* 14 */                this.f3269a.add(Integer.valueOf(i));
                    }
                }

                @Override // p000.wg0
                public final void setIntegerInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
/* 1 */             int i2 = fastJsonResponse$Field.f3581i;
/* 4 */             if (i2 != 3) {
/* 26 */                C1951n4.m6859j(AbstractC0886en.m3505i(i2, "Field with id=", " is not known to be an int."));
                    } else {
/* 6 */                 this.f3272d = i;
/* 14 */                this.f3269a.add(Integer.valueOf(i2));
                    }
                }

                @Override // p000.wg0
                public final void setStringInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
/* 1 */             int i = fastJsonResponse$Field.f3581i;
/* 4 */             if (i != 2) {
/* 28 */                C1697u2.m5437m("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(i)});
                    } else {
/* 6 */                 this.f3271c = str2;
/* 14 */                this.f3269a.add(Integer.valueOf(i));
                    }
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 12 */            HashSet hashSet = this.f3269a;
/* 19 */            if (hashSet.contains(1)) {
/* 21 */                w11.m9420b0(parcel, 1, 4);
/* 26 */                parcel.writeInt(this.f3270b);
                    }
/* 38 */            if (hashSet.contains(2)) {
/* 42 */                w11.m9410T(parcel, 2, this.f3271c, true);
                    }
/* 54 */            if (hashSet.contains(3)) {
/* 56 */                int i2 = this.f3272d;
/* 58 */                w11.m9420b0(parcel, 3, 4);
/* 61 */                parcel.writeInt(i2);
                    }
/* 72 */            if (hashSet.contains(4)) {
/* 76 */                w11.m9403M(parcel, 4, this.f3273e, true);
                    }
/* 88 */            if (hashSet.contains(5)) {
/* 92 */                w11.m9409S(parcel, 5, this.f3274f, i, true);
                    }
/* 104 */           if (hashSet.contains(6)) {
/* 108 */               w11.m9409S(parcel, 6, this.f3275i, i, true);
                    }
/* 111 */           w11.m9428f0(iM9422c0, parcel);
                }
            }
