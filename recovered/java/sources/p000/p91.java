            package p000;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.usercentrics.sdk.p009v2.location.data.LocationData;
            import com.usercentrics.sdk.p009v2.location.data.LocationDataResponse;
            import com.usercentrics.sdk.p009v2.location.data.UsercentricsLocation;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class p91 {

                /* JADX INFO: renamed from: a */
                public final fv0 f15028a;

                /* JADX INFO: renamed from: b */
                public UsercentricsLocation f15029b;

                public p91(o91 o91Var) {
/* 1 */             o91Var.getClass();
/* 7 */             this.f15028a = o91Var;
/* 14 */            this.f15029b = new UsercentricsLocation();
                }

                /* JADX INFO: renamed from: a */
                public final boolean m7371a() {
                    LocationData locationData;
                    LocationData locationData2;
/* 3 */             o91 o91Var = (o91) this.f15028a;
/* 7 */             od2 od2Var = o91Var.f14678a.f13157a;
/* 9 */             fh2[] fh2VarArr = fh2.f8216a;
/* 11 */            od2Var.getClass();
/* 19 */            String string = od2Var.f14716a.getString("injected_location", null);
/* 23 */            if (string == null) {
/* 25 */                locationData = null;
                    } else {
/* 41 */                locationData = ((LocationDataResponse) b21.f2178a.m1198a(string, LocationDataResponse.Companion.serializer())).f6357a;
                    }
/* 48 */            UsercentricsLocation usercentricsLocation = locationData != null ? locationData.f6356a : null;
/* 49 */            if (usercentricsLocation == null || usercentricsLocation.m2818a()) {
/* 59 */                od2 od2Var2 = o91Var.f14678a.f13157a;
/* 61 */                od2Var2.getClass();
/* 68 */                String string2 = od2Var2.f14716a.getString(FirebaseAnalytics.Param.LOCATION, null);
/* 72 */                if (string2 == null) {
/* 74 */                    locationData2 = null;
                        } else {
/* 90 */                    locationData2 = ((LocationDataResponse) b21.f2178a.m1198a(string2, LocationDataResponse.Companion.serializer())).f6357a;
                        }
/* 94 */                usercentricsLocation = locationData2 != null ? locationData2.f6356a : null;
                    }
/* 97 */            if (usercentricsLocation == null || usercentricsLocation.m2818a()) {
/* 114 */               return false;
                    }
/* 106 */           usercentricsLocation.getClass();
/* 109 */           m7372b(usercentricsLocation);
/* 112 */           return true;
                }

                /* JADX INFO: renamed from: b */
                public final void m7372b(UsercentricsLocation usercentricsLocation) {
/* 1 */             usercentricsLocation.getClass();
/* 8 */             if (usercentricsLocation.m2818a()) {
/* 10 */                return;
                    }
/* 11 */            this.f15029b = usercentricsLocation;
/* 15 */            o91 o91Var = (o91) this.f15028a;
/* 17 */            o91Var.getClass();
/* 20 */            l91 l91Var = o91Var.f14678a;
/* 29 */            LocationDataResponse locationDataResponse = new LocationDataResponse(new LocationData(usercentricsLocation));
/* 32 */            r11 r11Var = b21.f2178a;
/* 46 */            String strM1199b = r11Var.m1199b(jb1.m5766z(r11Var.f2163b, j22.m5668b(LocationDataResponse.class)), locationDataResponse);
/* 50 */            l91Var.getClass();
/* 53 */            od2 od2Var = l91Var.f13157a;
/* 55 */            fh2[] fh2VarArr = fh2.f8216a;
/* 59 */            od2Var.m7138d(FirebaseAnalytics.Param.LOCATION, strM1199b);
                }
            }
