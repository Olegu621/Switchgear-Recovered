            package com.google.android.gms.games.event;

            import android.net.Uri;
            import android.os.Parcel;
            import com.google.android.gms.games.Player;
            import com.google.android.gms.games.PlayerRef;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import p000.z30;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class EventRef extends z30 implements Event {
                @Override // com.google.android.gms.games.event.Event
                /* JADX INFO: renamed from: c */
                public final Uri mo2102c() {
/* 3 */             return m10273w("icon_image_uri");
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // p000.z30
                public final boolean equals(Object obj) {
/* 1 */             return EventEntity.m2108F1(this, obj);
                }

                @Override // com.google.android.gms.games.event.Event
                /* JADX INFO: renamed from: g */
                public final String mo2103g() {
/* 3 */             return m10270j("external_event_id");
                }

                @Override // com.google.android.gms.games.event.Event
                public final String getDescription() {
/* 3 */             return m10270j("description");
                }

                @Override // com.google.android.gms.games.event.Event
                public final String getIconImageUrl() {
/* 3 */             return m10270j("icon_image_url");
                }

                @Override // com.google.android.gms.games.event.Event
                public final String getName() {
/* 3 */             return m10270j("name");
                }

                @Override // com.google.android.gms.games.event.Event
                public final long getValue() {
/* 3 */             return m10269e(FirebaseAnalytics.Param.VALUE);
                }

                @Override // p000.z30
                public final int hashCode() {
/* 1 */             return EventEntity.m2106D1(this);
                }

                @Override // com.google.android.gms.games.event.Event
                public final boolean isVisible() {
/* 3 */             return m10266a("visibility");
                }

                @Override // com.google.android.gms.games.event.Event
                /* JADX INFO: renamed from: p */
                public final Player mo2104p() {
/* 7 */             return new PlayerRef(this.f19921a, this.f19922b);
                }

                @Override // com.google.android.gms.games.event.Event
                /* JADX INFO: renamed from: q1 */
                public final String mo2105q1() {
/* 3 */             return m10270j("formatted_value");
                }

                public final String toString() {
/* 1 */             return EventEntity.m2107E1(this);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 6 */             new EventEntity(this).writeToParcel(parcel, i);
                }
            }
