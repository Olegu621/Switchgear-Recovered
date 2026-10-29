            package com.google.android.gms.games.event;

            import android.net.Uri;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.games.Player;
            import com.google.android.gms.games.PlayerEntity;
            import com.google.android.gms.games.PlayerRef;
            import com.google.android.gms.games.internal.zzh;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.Arrays;
            import p000.de3;
            import p000.tc3;
            import p000.w11;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 80 */    public final class EventEntity extends zzh implements Event {
                public static final Parcelable.Creator<EventEntity> CREATOR = new tc3(5);

                /* JADX INFO: renamed from: a */
                public final String f3989a;

                /* JADX INFO: renamed from: b */
                public final String f3990b;

                /* JADX INFO: renamed from: c */
                public final String f3991c;

                /* JADX INFO: renamed from: d */
                public final Uri f3992d;

                /* JADX INFO: renamed from: e */
                public final String f3993e;

                /* JADX INFO: renamed from: f */
                public final PlayerEntity f3994f;

                /* JADX INFO: renamed from: i */
                public final long f3995i;

                /* JADX INFO: renamed from: v */
                public final String f3996v;

                /* JADX INFO: renamed from: w */
                public final boolean f3997w;

                public EventEntity(EventRef eventRef) {
/* 10 */            this.f3989a = eventRef.m10270j("external_event_id");
/* 18 */            this.f3990b = eventRef.m10270j("name");
/* 26 */            this.f3991c = eventRef.m10270j("description");
/* 34 */            this.f3992d = eventRef.m10273w("icon_image_uri");
/* 42 */            this.f3993e = eventRef.m10270j("icon_image_url");
/* 55 */            this.f3994f = new PlayerEntity((PlayerRef) eventRef.mo2104p());
/* 63 */            this.f3995i = eventRef.m10269e(FirebaseAnalytics.Param.VALUE);
/* 71 */            this.f3996v = eventRef.m10270j("formatted_value");
/* 79 */            this.f3997w = eventRef.m10266a("visibility");
                }

                /* JADX INFO: renamed from: D1 */
                public static int m2106D1(Event event) {
/* 49 */            return Arrays.hashCode(new Object[]{event.mo2103g(), event.getName(), event.getDescription(), event.mo2102c(), event.getIconImageUrl(), event.mo2104p(), Long.valueOf(event.getValue()), event.mo2105q1(), Boolean.valueOf(event.isVisible())});
                }

                /* JADX INFO: renamed from: E1 */
                public static String m2107E1(Event event) {
/* 3 */             wc0 wc0Var = new wc0(event);
/* 12 */            wc0Var.m9529d(event.mo2103g(), "Id");
/* 21 */            wc0Var.m9529d(event.getName(), "Name");
/* 30 */            wc0Var.m9529d(event.getDescription(), "Description");
/* 39 */            wc0Var.m9529d(event.mo2102c(), "IconImageUri");
/* 48 */            wc0Var.m9529d(event.getIconImageUrl(), "IconImageUrl");
/* 57 */            wc0Var.m9529d(event.mo2104p(), "Player");
/* 70 */            wc0Var.m9529d(Long.valueOf(event.getValue()), "Value");
/* 79 */            wc0Var.m9529d(event.mo2105q1(), "FormattedValue");
/* 92 */            wc0Var.m9529d(Boolean.valueOf(event.isVisible()), "isVisible");
/* 95 */            return wc0Var.toString();
                }

                /* JADX INFO: renamed from: F1 */
                public static boolean m2108F1(Event event, Object obj) {
/* 3 */             if (!(obj instanceof Event)) {
/* 157 */               return false;
                    }
/* 7 */             if (event == obj) {
/* 155 */               return true;
                    }
/* 11 */            Event event2 = (Event) obj;
                    return de3.m3029k(event2.mo2103g(), event.mo2103g()) && de3.m3029k(event2.getName(), event.getName()) && de3.m3029k(event2.getDescription(), event.getDescription()) && de3.m3029k(event2.mo2102c(), event.mo2102c()) && de3.m3029k(event2.getIconImageUrl(), event.getIconImageUrl()) && de3.m3029k(event2.mo2104p(), event.mo2104p()) && de3.m3029k(Long.valueOf(event2.getValue()), Long.valueOf(event.getValue())) && de3.m3029k(event2.mo2105q1(), event.mo2105q1()) && de3.m3029k(Boolean.valueOf(event2.isVisible()), Boolean.valueOf(event.isVisible()));
                }

                @Override // com.google.android.gms.games.event.Event
                /* JADX INFO: renamed from: c */
                public final Uri mo2102c() {
/* 1 */             return this.f3992d;
                }

                public final boolean equals(Object obj) {
/* 1 */             return m2108F1(this, obj);
                }

                @Override // com.google.android.gms.games.event.Event
                /* JADX INFO: renamed from: g */
                public final String mo2103g() {
/* 1 */             return this.f3989a;
                }

                @Override // com.google.android.gms.games.event.Event
                public final String getDescription() {
/* 1 */             return this.f3991c;
                }

                @Override // com.google.android.gms.games.event.Event
                public final String getIconImageUrl() {
/* 1 */             return this.f3993e;
                }

                @Override // com.google.android.gms.games.event.Event
                public final String getName() {
/* 1 */             return this.f3990b;
                }

                @Override // com.google.android.gms.games.event.Event
                public final long getValue() {
/* 1 */             return this.f3995i;
                }

                public final int hashCode() {
/* 1 */             return m2106D1(this);
                }

                @Override // com.google.android.gms.games.event.Event
                public final boolean isVisible() {
/* 1 */             return this.f3997w;
                }

                @Override // com.google.android.gms.games.event.Event
                /* JADX INFO: renamed from: p */
                public final Player mo2104p() {
/* 1 */             return this.f3994f;
                }

                @Override // com.google.android.gms.games.event.Event
                /* JADX INFO: renamed from: q1 */
                public final String mo2105q1() {
/* 1 */             return this.f3996v;
                }

                public final String toString() {
/* 1 */             return m2107E1(this);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.f3989a, false);
/* 17 */            w11.m9410T(parcel, 2, this.f3990b, false);
/* 23 */            w11.m9410T(parcel, 3, this.f3991c, false);
/* 29 */            w11.m9409S(parcel, 4, this.f3992d, i, false);
/* 35 */            w11.m9410T(parcel, 5, this.f3993e, false);
/* 41 */            w11.m9409S(parcel, 6, this.f3994f, i, false);
/* 47 */            w11.m9420b0(parcel, 7, 8);
/* 52 */            parcel.writeLong(this.f3995i);
/* 57 */            w11.m9410T(parcel, 8, this.f3996v, false);
/* 62 */            w11.m9420b0(parcel, 9, 4);
/* 67 */            parcel.writeInt(this.f3997w ? 1 : 0);
/* 70 */            w11.m9428f0(iM9422c0, parcel);
                }

/* 81 */        public EventEntity(String str, String str2, String str3, Uri uri, String str4, PlayerEntity playerEntity, long j, String str5, boolean z) {
/* 83 */            this.f3989a = str;
                    this.f3990b = str2;
                    this.f3991c = str3;
                    this.f3992d = uri;
                    this.f3993e = str4;
/* 84 */            this.f3994f = new PlayerEntity(playerEntity);
                    this.f3995i = j;
                    this.f3996v = str5;
                    this.f3997w = z;
                }
            }
