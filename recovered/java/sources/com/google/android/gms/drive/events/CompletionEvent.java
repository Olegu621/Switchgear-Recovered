            package com.google.android.gms.drive.events;

            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.ParcelFileDescriptor;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.drive.DriveId;
            import com.google.android.gms.drive.metadata.internal.MetadataBundle;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Locale;
            import p000.tf3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class CompletionEvent extends AbstractSafeParcelable implements ResourceEvent {
                public static final Parcelable.Creator<CompletionEvent> CREATOR = new tf3(14);

                /* JADX INFO: renamed from: a */
                public final DriveId f3653a;

                /* JADX INFO: renamed from: b */
                public final String f3654b;

                /* JADX INFO: renamed from: c */
                public final ParcelFileDescriptor f3655c;

                /* JADX INFO: renamed from: d */
                public final ParcelFileDescriptor f3656d;

                /* JADX INFO: renamed from: e */
                public final MetadataBundle f3657e;

                /* JADX INFO: renamed from: f */
                public final List f3658f;

                /* JADX INFO: renamed from: i */
                public final int f3659i;

                /* JADX INFO: renamed from: v */
                public final IBinder f3660v;

                public CompletionEvent(DriveId driveId, String str, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, MetadataBundle metadataBundle, ArrayList arrayList, int i, IBinder iBinder) {
/* 4 */             this.f3653a = driveId;
/* 6 */             this.f3654b = str;
/* 8 */             this.f3655c = parcelFileDescriptor;
/* 10 */            this.f3656d = parcelFileDescriptor2;
/* 12 */            this.f3657e = metadataBundle;
/* 14 */            this.f3658f = arrayList;
/* 16 */            this.f3659i = i;
/* 18 */            this.f3660v = iBinder;
                }

                @Override // com.google.android.gms.drive.events.DriveEvent
                public final int getType() {
/* 1 */             return 2;
                }

                public final String toString() {
                    String string;
/* 1 */             List list = this.f3658f;
/* 3 */             if (list == null) {
/* 5 */                 string = "<null>";
                    } else {
/* 10 */                String strJoin = TextUtils.join("','", list);
/* 26 */                StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
/* 31 */                sb.append("'");
/* 34 */                sb.append(strJoin);
/* 37 */                sb.append("'");
/* 40 */                string = sb.toString();
                    }
/* 60 */            return String.format(Locale.US, "CompletionEvent [id=%s, status=%s, trackingTag=%s]", this.f3653a, Integer.valueOf(this.f3659i), string);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             int i2 = i | 1;
/* 5 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 13 */            w11.m9409S(parcel, 2, this.f3653a, i2, false);
/* 19 */            w11.m9410T(parcel, 3, this.f3654b, false);
/* 25 */            w11.m9409S(parcel, 4, this.f3655c, i2, false);
/* 31 */            w11.m9409S(parcel, 5, this.f3656d, i2, false);
/* 37 */            w11.m9409S(parcel, 6, this.f3657e, i2, false);
/* 43 */            w11.m9412V(parcel, this.f3658f, 7);
/* 48 */            w11.m9420b0(parcel, 8, 4);
/* 53 */            parcel.writeInt(this.f3659i);
/* 60 */            w11.m9405O(parcel, 9, this.f3660v);
/* 63 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
